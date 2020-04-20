/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*    */ @Table
/*    */ public class Recieption {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private String id;
	/*    */ private String phoneNo;
	/*    */ private String firstName;
	/*    */ private String lastName;

	/*    */
	/*    */ public Recieption(String id, String phoneNo, String firstName, String lastName, String addressline1,
			String addressLine2, String qualification, String expenducture, String password) {
		/* 12 */ this.id = id;
		this.phoneNo = phoneNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressline1 = addressline1;
		this.addressLine2 = addressLine2;
		this.qualification = qualification;
		this.expenducture = expenducture;
		this.password = password;
		/*    */ }

	private String addressline1;
	private String addressLine2;
	private String qualification;
	private String expenducture;
	private String password;

	public Recieption() {
	}

	public void setId(String id) {
		/* 14 */ this.id = id;
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

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Recieption))
			return false;
		Recieption other = (Recieption) o;
		if (!other.canEqual(this))
			return false;
		Object this$id = getId(), other$id = other.getId();
		if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id))
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
		return !((this$password == null) ? (other$password != null) : !this$password.equals(other$password));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Recieption;
	}


	public String toString() {
		return "Recieption(id=" + getId() + ", phoneNo=" + getPhoneNo() + ", firstName=" + getFirstName()
				+ ", lastName=" + getLastName() + ", addressline1=" + getAddressline1() + ", addressLine2="
				+ getAddressLine2() + ", qualification=" + getQualification() + ", expenducture=" + getExpenducture()
				+ ", password=" + getPassword() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public String getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getPhoneNo() {
		return this.phoneNo;
	}

	/* 23 */ public String getFirstName() {
		return this.firstName;
	}

	/* 24 */ public String getLastName() {
		return this.lastName;
	}

	/* 25 */ public String getAddressline1() {
		return this.addressline1;
	}

	/* 26 */ public String getAddressLine2() {
		return this.addressLine2;
	}

	/* 27 */ public String getQualification() {
		return this.qualification;
	}

	/* 28 */ public String getExpenducture() {
		return this.expenducture;
	}

	public String getPassword() {
		/* 29 */ return this.password;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Recieption
 * .class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */