package com.hms.management.BirthDeath.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Table
@Entity
public class MyBirthRecord {
	@Id
	@GeneratedValue
	private int id;
	  private String childName;
	  private String gender;
	  private int weight;
	//  private String childPhotoFile;
	  private String childPhoto;
	  @Temporal(TemporalType.DATE)
	  private Date birthDate;
	  private String phone;
	  private String address;
	  private String motherName;
	  private String ipdopdNo;
	//  private String motherPhotoFile;
	  private String motherPhoto;
	  private String fatherName;
	 // private String fatherPhotoFile;
	  private String fatherPhoto;
	  private String report;
	//  private String file;
	  private String attachDocument;
	  private String responsibility;
	  
	public MyBirthRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyBirthRecord(int id, String childName, String gender, int weight, String childPhoto, Date birthDate,
			String phone, String address, String motherName, String ipdopdNo, String motherPhoto, String fatherName,
			String fatherPhoto, String report, String attachDocument, String responsibility) {
		super();
		this.id = id;
		this.childName = childName;
		this.gender = gender;
		this.weight = weight;
		this.childPhoto = childPhoto;
		this.birthDate = birthDate;
		this.phone = phone;
		this.address = address;
		this.motherName = motherName;
		this.ipdopdNo = ipdopdNo;
		this.motherPhoto = motherPhoto;
		this.fatherName = fatherName;
		this.fatherPhoto = fatherPhoto;
		this.report = report;
		this.attachDocument = attachDocument;
		this.responsibility = responsibility;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getChildPhoto() {
		return childPhoto;
	}
	public void setChildPhoto(String childPhoto) {
		this.childPhoto = childPhoto;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getIpdopdNo() {
		return ipdopdNo;
	}
	public void setIpdopdNo(String ipdopdNo) {
		this.ipdopdNo = ipdopdNo;
	}
	public String getMotherPhoto() {
		return motherPhoto;
	}
	public void setMotherPhoto(String motherPhoto) {
		this.motherPhoto = motherPhoto;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getFatherPhoto() {
		return fatherPhoto;
	}
	public void setFatherPhoto(String fatherPhoto) {
		this.fatherPhoto = fatherPhoto;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public String getAttachDocument() {
		return attachDocument;
	}
	public void setAttachDocument(String attachDocument) {
		this.attachDocument = attachDocument;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
}
