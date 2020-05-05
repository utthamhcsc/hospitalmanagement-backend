package com.hms.management.BloodBank.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BloodDonar {
	
	@Id
	@GeneratedValue
	private int id;
	private String donarName;
	private int agemonth;
	private int ageyear;
	private String bloodGroup;
	private String Gender;
	private String contact;
	private String address;
	private String fatherName;
	public BloodDonar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BloodDonar(int id, String donarName, int agemonth, int ageyear, String bloodGroup, String gender,
			String contact, String address, String fatherName) {
		super();
		this.id = id;
		this.donarName = donarName;
		this.agemonth = agemonth;
		this.ageyear = ageyear;
		this.bloodGroup = bloodGroup;
		Gender = gender;
		this.contact = contact;
		this.address = address;
		this.fatherName = fatherName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDonarName() {
		return donarName;
	}
	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}
	public int getAgemonth() {
		return agemonth;
	}
	public void setAgemonth(int agemonth) {
		this.agemonth = agemonth;
	}
	public int getAgeyear() {
		return ageyear;
	}
	public void setAgeyear(int ageyear) {
		this.ageyear = ageyear;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

}
