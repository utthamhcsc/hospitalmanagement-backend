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

@Entity
@Table
public class MyMessage {
	 @Override
	public String toString() {
		return "MyMessage [id=" + id + ", title=" + title + ", message=" + message + ", publishDate=" + publishDate
				+ ", noticeDate=" + noticeDate + ", messageTo=" + messageTo + "]";
	}
	@Id
	 @GeneratedValue
	 private int id;
	 private String title;
	 private String  message;
	 private String  publishDate;
	 private String noticeDate;
	 @OneToMany(targetEntity = MyMessageTo.class,cascade = CascadeType.ALL)
	 @JoinColumn(name = "mymessageId",referencedColumnName = "id",insertable =true,updatable = true)
	 private List<MyMessageTo> messageTo=new ArrayList<>();
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
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}
	public List<MyMessageTo> getMessageTo() {
		return messageTo;
	}
	public void setMessageTo(List<MyMessageTo> messageTo) {
		this.messageTo = messageTo;
	} 
	 
	}
