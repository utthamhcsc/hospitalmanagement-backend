/*    */
package com.hms.management.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Table
/*    */ @Entity(name = "TpaManagement")
/*    */ public class TpaManagement {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String name;
	/*    */ private String code;
	/*    */ private String phone;

	/*    */
	/*    */ public TpaManagement(int id, String name, String code, String phone, String address,
			String contactPersonName, String contactpersonPhone, Date createdAt, Date updatedAt) {
		/* 14 */ this.id = id;
		this.name = name;
		this.code = code;
		this.phone = phone;
		this.address = address;
		this.contactPersonName = contactPersonName;
		this.contactpersonPhone = contactpersonPhone;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	private String address;
	private String contactPersonName;
	private String contactpersonPhone;
	private Date createdAt;
	private Date updatedAt;

	public TpaManagement() {
	}

	public void setId(int id) {
		/* 16 */ this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public void setContactpersonPhone(String contactpersonPhone) {
		this.contactpersonPhone = contactpersonPhone;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof TpaManagement))
			return false;
		TpaManagement other = (TpaManagement) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$code = getCode(), other$code = other.getCode();
		if ((this$code == null) ? (other$code != null) : !this$code.equals(other$code))
			return false;
		Object this$phone = getPhone(), other$phone = other.getPhone();
		if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		Object this$contactPersonName = getContactPersonName(), other$contactPersonName = other.getContactPersonName();
		if ((this$contactPersonName == null) ? (other$contactPersonName != null)
				: !this$contactPersonName.equals(other$contactPersonName))
			return false;
		Object this$contactpersonPhone = getContactpersonPhone(),
				other$contactpersonPhone = other.getContactpersonPhone();
		if ((this$contactpersonPhone == null) ? (other$contactpersonPhone != null)
				: !this$contactpersonPhone.equals(other$contactpersonPhone))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof TpaManagement;
	}

	

	public String toString() {
		return "TpaManagement(id=" + getId() + ", name=" + getName() + ", code=" + getCode() + ", phone=" + getPhone()
				+ ", address=" + getAddress() + ", contactPersonName=" + getContactPersonName()
				+ ", contactpersonPhone=" + getContactpersonPhone() + ", createdAt=" + getCreatedAt() + ", updatedAt="
				+ getUpdatedAt() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getName() {
		return this.name;
	}

	/* 25 */ public String getCode() {
		return this.code;
	}

	/* 26 */ public String getPhone() {
		return this.phone;
	}

	/* 27 */ public String getAddress() {
		return this.address;
	}

	/* 28 */ public String getContactPersonName() {
		return this.contactPersonName;
	}

	/* 29 */ public String getContactpersonPhone() {
		return this.contactpersonPhone;
	}

	/* 30 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		/* 31 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * TpaManagement.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */