package com.szu.insight.mail.service;

import java.util.List;

import com.szu.insight.mail.model.Mail;

public interface MailService {

	public List getList();
	
	public int add(Mail mail);
	
	public int del(Integer id);
	
	public int edit(Mail mail);
	
	public void send();
}
