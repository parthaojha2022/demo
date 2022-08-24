package com.viteos.itg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan
@SpringBootApplication
public class ITGCoreApplication extends SpringBootServletInitializer {
	
	//static Logger logger = Logger.getLogger(ITGCoreApplication.class.getName());
	
    public static void main( String[] args ) {
        
        SpringApplication.run(ITGCoreApplication.class, args);
    }
    
   
}