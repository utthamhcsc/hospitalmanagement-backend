package com.hms.management.messaging.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class SendEmail {
	
	public List<String> getMessageList() {
		return messageList;
	}
	public void setMessageList(List<String> messageList) {
		this.messageList = messageList;
	}
	@Id
	 @GeneratedValue
	 private int id;
	 private String title;
	 private String  message;
	 private boolean  sendSms;
	 private boolean sendEmail;
	 @OneToMany(targetEntity = SendEmailTo.class,cascade = CascadeType.ALL)
	 @JoinColumn(name = "mymessageId",referencedColumnName = "id",insertable =true,updatable = true)
	 private List<SendEmailTo> messageTo=new ArrayList<>();
	 @Transient
	 private List<String> messageList=new ArrayList<>();
	 
	@Override
	public String toString() {
		return "SendEmail [id=" + id + ", title=" + title + ", message=" + message + ", sendSms=" + sendSms
				+ ", sendEmail=" + sendEmail + ", messageTo=" + messageTo + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSendSms() {
		return sendSms;
	}
	public void setSendSms(boolean sendSms) {
		this.sendSms = sendSms;
	}
	public boolean isSendEmail() {
		return sendEmail;
	}
	public void setSendEmail(boolean sendEmail) {
		this.sendEmail = sendEmail;
	}
	public List<SendEmailTo> getMessageTo() {
		return messageTo;
	}
	public void setMessageTo(List<SendEmailTo> messageTo) {
		this.messageTo = messageTo;
	}
	
	}
