/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*    */ @Table
/*    */ public class BirthRecord {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private String childName;
	/*    */ private String gender;
	/*    */ private String weight;
	/*    */ private String birthDate;
	/*    */ private String phone;
	/*    */ private String address;

	/*    */
	/*    */ public BirthRecord(int id, String childName, String gender, String weight, String birthDate, String phone,
			String address, String motherName, String ipdOrOpdNo, String fatherName, String childPhoto,
			String motherPhoto, String fatherPhoto, String attachDocument) {
		/* 13 */ this.id = id;
		this.childName = childName;
		this.gender = gender;
		this.weight = weight;
		this.birthDate = birthDate;
		this.phone = phone;
		this.address = address;
		this.motherName = motherName;
		this.ipdOrOpdNo = ipdOrOpdNo;
		this.fatherName = fatherName;
		this.childPhoto = childPhoto;
		this.motherPhoto = motherPhoto;
		this.fatherPhoto = fatherPhoto;
		this.attachDocument = attachDocument;
		/*    */ }

	private String motherName;
	private String ipdOrOpdNo;
	private String fatherName;
	private String childPhoto;
	private String motherPhoto;
	private String fatherPhoto;
	private String attachDocument;

	public BirthRecord() {
	}

	public void setId(int id) {
		/* 15 */ this.id = id;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public void setIpdOrOpdNo(String ipdOrOpdNo) {
		this.ipdOrOpdNo = ipdOrOpdNo;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public void setChildPhoto(String childPhoto) {
		this.childPhoto = childPhoto;
	}

	public void setMotherPhoto(String motherPhoto) {
		this.motherPhoto = motherPhoto;
	}

	public void setFatherPhoto(String fatherPhoto) {
		this.fatherPhoto = fatherPhoto;
	}

	public void setAttachDocument(String attachDocument) {
		this.attachDocument = attachDocument;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof BirthRecord))
			return false;
		BirthRecord other = (BirthRecord) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$childName = getChildName(), other$childName = other.getChildName();
		if ((this$childName == null) ? (other$childName != null) : !this$childName.equals(other$childName))
			return false;
		Object this$gender = getGender(), other$gender = other.getGender();
		if ((this$gender == null) ? (other$gender != null) : !this$gender.equals(other$gender))
			return false;
		Object this$weight = getWeight(), other$weight = other.getWeight();
		if ((this$weight == null) ? (other$weight != null) : !this$weight.equals(other$weight))
			return false;
		Object this$birthDate = getBirthDate(), other$birthDate = other.getBirthDate();
		if ((this$birthDate == null) ? (other$birthDate != null) : !this$birthDate.equals(other$birthDate))
			return false;
		Object this$phone = getPhone(), other$phone = other.getPhone();
		if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		Object this$motherName = getMotherName(), other$motherName = other.getMotherName();
		if ((this$motherName == null) ? (other$motherName != null) : !this$motherName.equals(other$motherName))
			return false;
		Object this$ipdOrOpdNo = getIpdOrOpdNo(), other$ipdOrOpdNo = other.getIpdOrOpdNo();
		if ((this$ipdOrOpdNo == null) ? (other$ipdOrOpdNo != null) : !this$ipdOrOpdNo.equals(other$ipdOrOpdNo))
			return false;
		Object this$fatherName = getFatherName(), other$fatherName = other.getFatherName();
		if ((this$fatherName == null) ? (other$fatherName != null) : !this$fatherName.equals(other$fatherName))
			return false;
		Object this$childPhoto = getChildPhoto(), other$childPhoto = other.getChildPhoto();
		if ((this$childPhoto == null) ? (other$childPhoto != null) : !this$childPhoto.equals(other$childPhoto))
			return false;
		Object this$motherPhoto = getMotherPhoto(), other$motherPhoto = other.getMotherPhoto();
		if ((this$motherPhoto == null) ? (other$motherPhoto != null) : !this$motherPhoto.equals(other$motherPhoto))
			return false;
		Object this$fatherPhoto = getFatherPhoto(), other$fatherPhoto = other.getFatherPhoto();
		if ((this$fatherPhoto == null) ? (other$fatherPhoto != null) : !this$fatherPhoto.equals(other$fatherPhoto))
			return false;
		Object this$attachDocument = getAttachDocument(), other$attachDocument = other.getAttachDocument();
		return !((this$attachDocument == null) ? (other$attachDocument != null)
				: !this$attachDocument.equals(other$attachDocument));
	}

	protected boolean canEqual(Object other) {
		return other instanceof BirthRecord;
	}



	public String toString() {
		return "BirthRecord(id=" + getId() + ", childName=" + getChildName() + ", gender=" + getGender() + ", weight="
				+ getWeight() + ", birthDate=" + getBirthDate() + ", phone=" + getPhone() + ", address=" + getAddress()
				+ ", motherName=" + getMotherName() + ", ipdOrOpdNo=" + getIpdOrOpdNo() + ", fatherName="
				+ getFatherName() + ", childPhoto=" + getChildPhoto() + ", motherPhoto=" + getMotherPhoto()
				+ ", fatherPhoto=" + getFatherPhoto() + ", attachDocument=" + getAttachDocument() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getChildName() {
		return this.childName;
	}

	/* 24 */ public String getGender() {
		return this.gender;
	}

	/* 25 */ public String getWeight() {
		return this.weight;
	}

	/* 26 */ public String getBirthDate() {
		return this.birthDate;
	}

	/* 27 */ public String getPhone() {
		return this.phone;
	}

	/* 28 */ public String getAddress() {
		return this.address;
	}

	/* 29 */ public String getMotherName() {
		return this.motherName;
	}

	/* 30 */ public String getIpdOrOpdNo() {
		return this.ipdOrOpdNo;
	}

	/* 31 */ public String getFatherName() {
		return this.fatherName;
	}

	/* 32 */ public String getChildPhoto() {
		return this.childPhoto;
	}

	/* 33 */ public String getMotherPhoto() {
		return this.motherPhoto;
	}

	/* 34 */ public String getFatherPhoto() {
		return this.fatherPhoto;
	}

	public String getAttachDocument() {
		/* 35 */ return this.attachDocument;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * BirthRecord.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */