package com.hms.management.BloodBank.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class DonateBlood {
	
	@Id
	@GeneratedValue
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date donateDate;
	private String lot;
	private float quantity;
	private String bagNo;
	private String institution;
	private String bloodGroup;
	private int donareId;
	private String status;
	public DonateBlood(int id, Date donateDate, String lot, float quantity, String bagNo, String institution,
			int donareId, String status) {
		super();
		this.id = id;
		this.donateDate = donateDate;
		this.lot = lot;
		this.quantity = quantity;
		this.bagNo = bagNo;
		this.institution = institution;
		this.donareId = donareId;
		this.status = status;
	}
	public DonateBlood() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDonateDate() {
		return donateDate;
	}
	public void setDonateDate(Date donateDate) {
		this.donateDate = donateDate;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getBagNo() {
		return bagNo;
	}
	public void setBagNo(String bagNo) {
		this.bagNo = bagNo;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public int getDonareId() {
		return donareId;
	}
	public void setDonareId(int donareId) {
		this.donareId = donareId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}	

}
