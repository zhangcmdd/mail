package com.szu.insight.mail.model;

import java.io.Serializable;

public class Mail implements Serializable{

	/**
	 * serialVersionId
	 */
	private static final long serialVersionUID = 5190386399884825469L;
	
	private Integer id;
	
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
