/*    */
package com.hms.management.model;

/*    */
/*    */ import java.util.Date;

import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "blood_donor")
/*    */ public class BloodDonor {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String donorName;
	/*    */ private String age;
	/*    */ private String month;
	/*    */ private String bloodGroup;

	/*    */
	/* 17 */ public void setId(int id) {
		this.id = id;
	}

	private String gender;
	private String address;
	private String contactNo;
	private Date createdAt;
	private Date updatedAt;

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
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
		if (!(o instanceof BloodDonor))
			return false;
		BloodDonor other = (BloodDonor) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$donorName = getDonorName(), other$donorName = other.getDonorName();
		if ((this$donorName == null) ? (other$donorName != null) : !this$donorName.equals(other$donorName))
			return false;
		Object this$age = getAge(), other$age = other.getAge();
		if ((this$age == null) ? (other$age != null) : !this$age.equals(other$age))
			return false;
		Object this$month = getMonth(), other$month = other.getMonth();
		if ((this$month == null) ? (other$month != null) : !this$month.equals(other$month))
			return false;
		Object this$bloodGroup = getBloodGroup(), other$bloodGroup = other.getBloodGroup();
		if ((this$bloodGroup == null) ? (other$bloodGroup != null) : !this$bloodGroup.equals(other$bloodGroup))
			return false;
		Object this$gender = getGender(), other$gender = other.getGender();
		if ((this$gender == null) ? (other$gender != null) : !this$gender.equals(other$gender))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		Object this$contactNo = getContactNo(), other$contactNo = other.getContactNo();
		if ((this$contactNo == null) ? (other$contactNo != null) : !this$contactNo.equals(other$contactNo))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof BloodDonor;
	}


	public String toString() {
		return "BloodDonor(id=" + getId() + ", donorName=" + getDonorName() + ", age=" + getAge() + ", month="
				+ getMonth() + ", bloodGroup=" + getBloodGroup() + ", gender=" + getGender() + ", address="
				+ getAddress() + ", contactNo=" + getContactNo() + ", createdAt=" + getCreatedAt() + ", updatedAt="
				+ getUpdatedAt() + ")";
	}

	public BloodDonor(int id, String donorName, String age, String month, String bloodGroup, String gender,
			String address, String contactNo, Date createdAt, Date updatedAt) {
		/* 18 */ this.id = id;
		this.donorName = donorName;
		this.age = age;
		this.month = month;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.address = address;
		this.contactNo = contactNo;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */
	/*    */ public BloodDonor() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 26 */ return this.id;
		/* 27 */ }

	public String getDonorName() {
		return this.donorName;
	}

	/* 28 */ public String getAge() {
		return this.age;
	}

	/* 29 */ public String getMonth() {
		return this.month;
	}

	/* 30 */ public String getBloodGroup() {
		return this.bloodGroup;
	}

	/* 31 */ public String getGender() {
		return this.gender;
	}

	/* 32 */ public String getAddress() {
		return this.address;
	}

	/* 33 */ public String getContactNo() {
		return this.contactNo;
	}

	/* 34 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		/* 35 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\BloodDonor
 * .class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */