package com.szu.insight.mail.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.szu.insight.mail.model.Mail;

@Repository
public class MailDao extends BaseDao{

	@Override
	public String getMapperNamespace() {
		// TODO Auto-generated method stub
		return Mail.class.getName();
	}

	public List get(){
		return selectList("select");
	}
	
	public int update(Mail mail){
		return update("update",mail);
	}
	
	public int add(Mail mail){
		return insert("insert",mail);
	}
	
	public int delete(Integer id){
		return delete("delete",id);
	}
	
}
