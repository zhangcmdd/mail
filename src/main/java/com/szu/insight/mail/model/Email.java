package com.szu.insight.mail.model;

import java.io.File;
import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class Email implements Serializable{

	/**
	 * serializable
	 */
	private static final long serialVersionUID = 5851253074573027910L;

	/**
	 * 接受人
	 */
	private String receiver;
	
	
	/**
	 * 主题 
	 */
	private String subject;
	
	/**
	 * 正文
	 */
	private String content;
	
	/**
	 * 抄送人列表
	 */
	private String[] cc;
	
	/**
	 * 附件
	 */
	private File attachment;
	
	private String[] bcc;

	public Email(){
		
	}
	
	public Email(String receiver , String subject , String content){
		this.receiver = receiver;
		this.subject = subject;
		this.content = content;
	}
	
	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String[] getCc() {
		return cc;
	}

	public void setCc(String[] cc) {
		this.cc = cc;
	}

	public File getAttachment() {
		return attachment;
	}

	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}

	public String[] getBcc() {
		return bcc;
	}

	public void setBcc(String[] bcc) {
		this.bcc = bcc;
	}
	
	
	
	
}
