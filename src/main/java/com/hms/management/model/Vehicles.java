/*    */
package com.hms.management.model;

import javax.persistence.Entity;
/*    */
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "vehicles")
/*    */ public class Vehicles {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String vehicleNo;
	/*    */ private String vehicleModel;
	/*    */ private String manufactureYear;
	/*    */ private String vehicleType;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String driverName;
	private String driverLicence;
	private String driverContact;
	private String note;
	private String createdAt;

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public void setManufactureYear(String manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setDriverLicence(String driverLicence) {
		this.driverLicence = driverLicence;
	}

	public void setDriverContact(String driverContact) {
		this.driverContact = driverContact;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Vehicles))
			return false;
		Vehicles other = (Vehicles) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$vehicleNo = getVehicleNo(), other$vehicleNo = other.getVehicleNo();
		if ((this$vehicleNo == null) ? (other$vehicleNo != null) : !this$vehicleNo.equals(other$vehicleNo))
			return false;
		Object this$vehicleModel = getVehicleModel(), other$vehicleModel = other.getVehicleModel();
		if ((this$vehicleModel == null) ? (other$vehicleModel != null) : !this$vehicleModel.equals(other$vehicleModel))
			return false;
		Object this$manufactureYear = getManufactureYear(), other$manufactureYear = other.getManufactureYear();
		if ((this$manufactureYear == null) ? (other$manufactureYear != null)
				: !this$manufactureYear.equals(other$manufactureYear))
			return false;
		Object this$vehicleType = getVehicleType(), other$vehicleType = other.getVehicleType();
		if ((this$vehicleType == null) ? (other$vehicleType != null) : !this$vehicleType.equals(other$vehicleType))
			return false;
		Object this$driverName = getDriverName(), other$driverName = other.getDriverName();
		if ((this$driverName == null) ? (other$driverName != null) : !this$driverName.equals(other$driverName))
			return false;
		Object this$driverLicence = getDriverLicence(), other$driverLicence = other.getDriverLicence();
		if ((this$driverLicence == null) ? (other$driverLicence != null)
				: !this$driverLicence.equals(other$driverLicence))
			return false;
		Object this$driverContact = getDriverContact(), other$driverContact = other.getDriverContact();
		if ((this$driverContact == null) ? (other$driverContact != null)
				: !this$driverContact.equals(other$driverContact))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Vehicles;
	}



	public String toString() {
		return "Vehicles(id=" + getId() + ", vehicleNo=" + getVehicleNo() + ", vehicleModel=" + getVehicleModel()
				+ ", manufactureYear=" + getManufactureYear() + ", vehicleType=" + getVehicleType() + ", driverName="
				+ getDriverName() + ", driverLicence=" + getDriverLicence() + ", driverContact=" + getDriverContact()
				+ ", note=" + getNote() + ", createdAt=" + getCreatedAt() + ")";
	}

	public Vehicles(int id, String vehicleNo, String vehicleModel, String manufactureYear, String vehicleType,
			String driverName, String driverLicence, String driverContact, String note, String createdAt) {
		/* 17 */ this.id = id;
		this.vehicleNo = vehicleNo;
		this.vehicleModel = vehicleModel;
		this.manufactureYear = manufactureYear;
		this.vehicleType = vehicleType;
		this.driverName = driverName;
		this.driverLicence = driverLicence;
		this.driverContact = driverContact;
		this.note = note;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */
	/*    */ public Vehicles() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 25 */ return this.id;
		/* 26 */ }

	public String getVehicleNo() {
		return this.vehicleNo;
	}

	/* 27 */ public String getVehicleModel() {
		return this.vehicleModel;
	}

	/* 28 */ public String getManufactureYear() {
		return this.manufactureYear;
	}

	/* 29 */ public String getVehicleType() {
		return this.vehicleType;
	}

	/* 30 */ public String getDriverName() {
		return this.driverName;
	}

	/* 31 */ public String getDriverLicence() {
		return this.driverLicence;
	}

	/* 32 */ public String getDriverContact() {
		return this.driverContact;
	}

	/* 33 */ public String getNote() {
		return this.note;
	}

	public String getCreatedAt() {
		/* 34 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Vehicles.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */