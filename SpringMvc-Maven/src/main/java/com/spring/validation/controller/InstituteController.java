package com.spring.validation.controller;

import java.util.Map;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.validation.entity.InstEntity;
import com.spring.validation.model.InstitutionsModel;
import com.spring.validation.service.InstService;

@Controller
@SessionAttributes
public class InstituteController {
	
	@Autowired
	private InstService instService;

	public void setInstService(InstService instService) {
		this.instService = instService;
	}

	Logger logger=Logger.getLogger(InstituteController.class);
	
	@RequestMapping(value="/saveInst",method=RequestMethod.GET)
	public String collegesData(Map<String, Object> model){
		InstitutionsModel instModel=new InstitutionsModel();
         model.put("instForm", instModel);
		return "saveInst";
	}
	
	@RequestMapping(value="/saveInst", method=RequestMethod.POST)
	public String saveInstitutes(@Valid @ModelAttribute("instForm") InstitutionsModel instForm,BindingResult bindingResult,Map<String, Object> model){
		
		if(bindingResult.hasErrors()){
			return "saveInst";
		}
		InstEntity instEntity=new InstEntity();
		instEntity.setName(instForm.getName());
		instEntity.setDescription(instForm.getDescription());
		instEntity.setState(instForm.getState());
		instEntity.setAnchor(instForm.getAnchor());
		instEntity.setCity(instForm.getCity());
		
		instService.saveInst(instEntity);
		return "saveInst";
	}

}
