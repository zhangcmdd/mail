package com.szu.insight.mail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szu.insight.mail.dao.MailDao;
import com.szu.insight.mail.model.Email;
import com.szu.insight.mail.model.Mail;
import com.szu.insight.mail.tools.Sender;

@Service
public class MailServiceImpl implements MailService{
	
	@Autowired
	private MailDao mailDao;
	
	@Autowired
	private Sender sender;
	
	@Override
	public List getList() {
		return mailDao.get();
	}

	@Override
	public int add(Mail mail) {
		return mailDao.add(mail);
	}

	@Override
	public int del(Integer id) {
		return mailDao.delete(id);
	}

	@Override
	public int edit(Mail mail) {
		return mailDao.update(mail);
	}
	
	public void send(){
		Email email = new Email("476549070@qq.com","标题--邮件测试","正文-邮件测试");
		sender.sendMail(email);
		System.out.println("Success");
	}


}
