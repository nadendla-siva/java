package com.spring.validation.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.spring.validation.model.InstitutionsModel;

@Controller
public class InstituteController {
	
	public String saveInstitutes(@Valid @ModelAttribute("instForm") InstitutionsModel instModel,BindingResult bindingResult,Map<String, Object> model){
		
		if(bindingResult.hasErrors()){
			return "institutions";
		}
		
		return null;
		
		
		
	}

}
