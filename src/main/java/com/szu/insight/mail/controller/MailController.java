package com.szu.insight.mail.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.szu.insight.mail.model.Mail;
import com.szu.insight.mail.service.MailService;

@Controller
@RequestMapping("mail")
public class MailController {
	
	@Autowired
	private MailService mailService;
	
	@RequestMapping("get")
	@ResponseBody
	public List get(){
		return mailService.getList();
	}
	
	@RequestMapping("add")
	@ResponseBody
	public int add(@RequestBody Mail mail){
		return mailService.add(mail);
	}
	
	@RequestMapping("edit")
	@ResponseBody
	public int edit(@RequestBody Mail mail){
		return mailService.edit(mail);
	}
	
	@RequestMapping("{id}/del")
	@ResponseBody
	public int del(@PathVariable Integer id){
		return mailService.del(id);
	}
	
	@RequestMapping("send")
	@ResponseBody
	public void send(){
		mailService.send();
	}
}
