/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*    */ @Table
/*    */ public class Doctor {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String doctorId;
	/*    */ private String phoneNo;
	/*    */ private String firstName;
	/*    */ private String lastName;

	/*    */
	/*    */ public Doctor(int id, String doctorId, String phoneNo, String firstName, String lastName,
			String addressline1, String addressLine2, String qualification, String expenducture, String password,
			String Specilist) {
		/* 13 */ this.id = id;
		this.doctorId = doctorId;
		this.phoneNo = phoneNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressline1 = addressline1;
		this.addressLine2 = addressLine2;
		this.qualification = qualification;
		this.expenducture = expenducture;
		this.password = password;
		this.Specilist = Specilist;
		/*    */ }

	private String addressline1;
	private String addressLine2;
	private String qualification;
	private String expenducture;
	private String password;
	private String Specilist;

	public Doctor() {
	}

	public void setId(int id) {
		/* 15 */ this.id = id;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void setExpenducture(String expenducture) {
		this.expenducture = expenducture;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSpecilist(String Specilist) {
		this.Specilist = Specilist;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Doctor))
			return false;
		Doctor other = (Doctor) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$doctorId = getDoctorId(), other$doctorId = other.getDoctorId();
		if ((this$doctorId == null) ? (other$doctorId != null) : !this$doctorId.equals(other$doctorId))
			return false;
		Object this$phoneNo = getPhoneNo(), other$phoneNo = other.getPhoneNo();
		if ((this$phoneNo == null) ? (other$phoneNo != null) : !this$phoneNo.equals(other$phoneNo))
			return false;
		Object this$firstName = getFirstName(), other$firstName = other.getFirstName();
		if ((this$firstName == null) ? (other$firstName != null) : !this$firstName.equals(other$firstName))
			return false;
		Object this$lastName = getLastName(), other$lastName = other.getLastName();
		if ((this$lastName == null) ? (other$lastName != null) : !this$lastName.equals(other$lastName))
			return false;
		Object this$addressline1 = getAddressline1(), other$addressline1 = other.getAddressline1();
		if ((this$addressline1 == null) ? (other$addressline1 != null) : !this$addressline1.equals(other$addressline1))
			return false;
		Object this$addressLine2 = getAddressLine2(), other$addressLine2 = other.getAddressLine2();
		if ((this$addressLine2 == null) ? (other$addressLine2 != null) : !this$addressLine2.equals(other$addressLine2))
			return false;
		Object this$qualification = getQualification(), other$qualification = other.getQualification();
		if ((this$qualification == null) ? (other$qualification != null)
				: !this$qualification.equals(other$qualification))
			return false;
		Object this$expenducture = getExpenducture(), other$expenducture = other.getExpenducture();
		if ((this$expenducture == null) ? (other$expenducture != null) : !this$expenducture.equals(other$expenducture))
			return false;
		Object this$password = getPassword(), other$password = other.getPassword();
		if ((this$password == null) ? (other$password != null) : !this$password.equals(other$password))
			return false;
		Object this$Specilist = getSpecilist(), other$Specilist = other.getSpecilist();
		return !((this$Specilist == null) ? (other$Specilist != null) : !this$Specilist.equals(other$Specilist));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Doctor;
	}

	
	public String toString() {
		return "Doctor(id=" + getId() + ", doctorId=" + getDoctorId() + ", phoneNo=" + getPhoneNo() + ", firstName="
				+ getFirstName() + ", lastName=" + getLastName() + ", addressline1=" + getAddressline1()
				+ ", addressLine2=" + getAddressLine2() + ", qualification=" + getQualification() + ", expenducture="
				+ getExpenducture() + ", password=" + getPassword() + ", Specilist=" + getSpecilist() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getDoctorId() {
		return this.doctorId;
	}

	/* 24 */ public String getPhoneNo() {
		return this.phoneNo;
	}

	/* 25 */ public String getFirstName() {
		return this.firstName;
	}

	/* 26 */ public String getLastName() {
		return this.lastName;
	}

	/* 27 */ public String getAddressline1() {
		return this.addressline1;
	}

	/* 28 */ public String getAddressLine2() {
		return this.addressLine2;
	}

	/* 29 */ public String getQualification() {
		return this.qualification;
	}

	/* 30 */ public String getExpenducture() {
		return this.expenducture;
	}

	/* 31 */ public String getPassword() {
		return this.password;
	}

	public String getSpecilist() {
		/* 32 */ return this.Specilist;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Doctor.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */