package com.hms.management.BloodBank.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BloodStatus {
	@Id
	private String bloodGroup;
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	private int status;
	public BloodStatus(String bloodGroup, int status) {
		super();
		this.bloodGroup = bloodGroup;
		this.status = status;
	}
	public BloodStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

}
