package com.szu.insight.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.szu.insight.mail"})
public class MailApp 
{
	
    public static void main( String[] args )
    {
    	SpringApplication.run(MailApp.class, args);
    }
    
}
