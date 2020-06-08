package com.hms.management.calander.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CalenderEvent {
	
	@Id
	@GeneratedValue
	private int id;
	 private String start;
     private String end;
     private String description;
    private String title;
   private String  backgroundColor;
    private String status;
    private String userId;
	@Override
	public String toString() {
		return "CalenderEvent [id=" + id + ", start=" + start + ", end=" + end + ", description=" + description
				+ ", title=" + title + ", backgroundColor=" + backgroundColor + ", status=" + status + ", userId="
				+ userId + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
