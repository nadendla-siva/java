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

import com.spring.validation.entity.RegisterEntity;
import com.spring.validation.model.Register;
import com.spring.validation.model.User;
import com.spring.validation.service.RegisterService;
 
/**
 *
 * @author SRK
 *
 */
@Controller
@SessionAttributes
public class LoginController {
	
	Logger logger=Logger.getLogger(LoginController.class);
	
	@Autowired
	private RegisterService registerService;
	
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
	@RequestMapping(value = "/tiles-layout", method = RequestMethod.GET)
    public String tilesLayout(Map<String, Object> model) {
		User user = new User();
        model.put("userForm", user);
        Register register=new Register();
    	model.put("registerForm", register);
        return "tilesLayout";
    }
	
	
	/*@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String viewLogin(Map<String, Object> model) {
		logger.debug("LoginForm page displaying");
        User user = new User();
        model.put("userForm", user);
        return "LoginForm";
    }*/
 
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(@Valid @ModelAttribute("userForm") User userForm,BindingResult result, Map<String, Object> model) {
 
    	logger.debug("Login Validation checkup....");
        if (result.hasErrors()) {
            return "login";
        }
        RegisterEntity registerEntity=registerService.getLogin(userForm.getEmail());
         String name=registerEntity.getName();
         String email=registerEntity.getEmail();
         String contactNumber=registerEntity.getContactNumber();
         String city=registerEntity.getCity();
         String pass=registerEntity.getPassword();
        if(userForm.getPassword().equals(pass)){
        	return "LoginSuccess";
        }
        else{
        	return "login";
        }
        
    }
    
    /*@RequestMapping(value="/register",method=RequestMethod.GET)
    public String viewRegister(Map<String,Object> model){
    	logger.debug("Registration Form Displaying");
    	Register register=new Register();
    	model.put("registerForm", register);
    	return "RegisterForm";
    	
    }*/
    
    @RequestMapping(value="/register",method=RequestMethod.POST)
    public String doRegister(@Valid @ModelAttribute("registerForm") Register registerForm,BindingResult result,Map<String, Object> model){
    	logger.debug("Registartion Page Validations");
    	if(result.hasErrors()){
    		return "register";
    	}
    	
    	RegisterEntity registerEntity=new RegisterEntity();
    	registerEntity.setName(registerForm.getName());
    	registerEntity.setEmail(registerForm.getEmail());
    	registerEntity.setContactNumber(registerForm.getContactNumber());
    	registerEntity.setCity(registerForm.getCity());
    	registerEntity.setEducationInterest(registerForm.getEducationInterest());
    	registerEntity.setHighestQualification(registerForm.getHighestQualification());
    	registerEntity.setModeOfDegree(registerForm.getModeOfDegree());
    	logger.debug("Before Calling RegisterService Class");
    	registerService.insert(registerEntity);
    	return "register";
    	
    	}
    	
    }
