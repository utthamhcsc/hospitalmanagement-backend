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
/*    */ @Table(name = "organisation")
/*    */ public class Organisation {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String organisationName;
	/*    */ private String code;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String contactNo;
	private String address;
	private String contactPersonName;
	private String contactPersonPhone;

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Organisation))
			return false;
		Organisation other = (Organisation) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$organisationName = getOrganisationName(), other$organisationName = other.getOrganisationName();
		if ((this$organisationName == null) ? (other$organisationName != null)
				: !this$organisationName.equals(other$organisationName))
			return false;
		Object this$code = getCode(), other$code = other.getCode();
		if ((this$code == null) ? (other$code != null) : !this$code.equals(other$code))
			return false;
		Object this$contactNo = getContactNo(), other$contactNo = other.getContactNo();
		if ((this$contactNo == null) ? (other$contactNo != null) : !this$contactNo.equals(other$contactNo))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		Object this$contactPersonName = getContactPersonName(), other$contactPersonName = other.getContactPersonName();
		if ((this$contactPersonName == null) ? (other$contactPersonName != null)
				: !this$contactPersonName.equals(other$contactPersonName))
			return false;
		Object this$contactPersonPhone = getContactPersonPhone(),
				other$contactPersonPhone = other.getContactPersonPhone();
		return !((this$contactPersonPhone == null) ? (other$contactPersonPhone != null)
				: !this$contactPersonPhone.equals(other$contactPersonPhone));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Organisation;
	}

	

	public String toString() {
		return "Organisation(id=" + getId() + ", organisationName=" + getOrganisationName() + ", code=" + getCode()
				+ ", contactNo=" + getContactNo() + ", address=" + getAddress() + ", contactPersonName="
				+ getContactPersonName() + ", contactPersonPhone=" + getContactPersonPhone() + ")";
	}

	public Organisation(int id, String organisationName, String code, String contactNo, String address,
			String contactPersonName, String contactPersonPhone) {
		/* 15 */ this.id = id;
		this.organisationName = organisationName;
		this.code = code;
		this.contactNo = contactNo;
		this.address = address;
		this.contactPersonName = contactPersonName;
		this.contactPersonPhone = contactPersonPhone;
		/*    */ }

	/*    */
	/*    */ public Organisation() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getOrganisationName() {
		return this.organisationName;
	}

	/* 23 */ public String getCode() {
		return this.code;
	}

	/* 24 */ public String getContactNo() {
		return this.contactNo;
	}

	/* 25 */ public String getAddress() {
		return this.address;
	}

	/* 26 */ public String getContactPersonName() {
		return this.contactPersonName;
	}

	public String getContactPersonPhone() {
		/* 27 */ return this.contactPersonPhone;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * Organisation.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */