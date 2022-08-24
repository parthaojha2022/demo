package com.viteos.itg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	

	 
	
	//static Logger logger = Logger.getLogger(LoginController.class.getName());
	
	 Logger logger = LoggerFactory.getLogger(LoginController.class); 
	
	
	
	@RequestMapping(value = "/logging", method = RequestMethod.GET)
	public String getLoginPage(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Inside getLoginPage method... - info ");
		//logger.debug("exit getLoginPage - debug");
		//logger.error("exit getLoginPage - error");
		System.out.println("inside getLogin");
		return "abc";
		
	}
	
	

}