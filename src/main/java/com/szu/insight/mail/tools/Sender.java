package com.szu.insight.mail.tools;

import java.io.File;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Repository;

import com.szu.insight.mail.model.Email;



@Repository
public class Sender {

	@Autowired
	private JavaMailSenderImpl javaMailSenderImpl;
	
	public void sendMail(Email email){
		
		 MimeMessage mail = javaMailSenderImpl.createMimeMessage();
	      try {
	            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
	            
	            helper.setFrom(javaMailSenderImpl.getUsername());
	            helper.setTo(email.getReceiver());
	            helper.setSubject(email.getSubject());
	            helper.setText(email.getContent(),true);
	            helper.setSentDate(new Date());
	           
	            if(email.getCc() != null && email.getCc().length > 0)
	            	helper.setCc(email.getCc());
	          
	            if(email.getBcc() != null && email.getBcc().length > 0)
	            	helper.setBcc(email.getBcc());
	           
	            if(email.getAttachment()!=null){
	            	File file=email.getAttachment();
		            String fileName=file.getName();
		            String extensionName=fileName.substring(fileName.lastIndexOf(".") + 1);
		            helper.addAttachment(email.getSubject()+extensionName, file);
	            }
	            
	        } catch (MessagingException e) {
	            e.printStackTrace();
	        } finally {
	        	
	        }
	      
	     javaMailSenderImpl.send(mail);
	     
	}
	
}
