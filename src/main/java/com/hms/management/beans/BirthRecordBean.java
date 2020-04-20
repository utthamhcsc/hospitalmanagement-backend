/*    */
package com.hms.management.beans;

import org.springframework.web.multipart.MultipartFile;

/*    */ public class BirthRecordBean {
	private int id;
	private String childName;
	private String gender;
	/*    */ private String weight;
	/*    */ private String birthDate;
	/*    */ private String phone;
	/*    */ private String address;

	/*    */
	/* 8 */ public void setId(int id) {
		this.id = id;
	}

	private String motherName;
	private String ipdOrOpdNo;
	private String fatherName;
	private MultipartFile childPhoto;
	private MultipartFile motherPhoto;
	private MultipartFile fatherPhoto;
	private MultipartFile attachDocument;

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

	public void setChildPhoto(MultipartFile childPhoto) {
		this.childPhoto = childPhoto;
	}

	public void setMotherPhoto(MultipartFile motherPhoto) {
		this.motherPhoto = motherPhoto;
	}

	public void setFatherPhoto(MultipartFile fatherPhoto) {
		this.fatherPhoto = fatherPhoto;
	}

	public void setAttachDocument(MultipartFile attachDocument) {
		this.attachDocument = attachDocument;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof BirthRecordBean))
			return false;
		BirthRecordBean other = (BirthRecordBean) o;
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
		return other instanceof BirthRecordBean;
	}


	public String toString() {
		return "BirthRecordBean(id=" + getId() + ", childName=" + getChildName() + ", gender=" + getGender()
				+ ", weight=" + getWeight() + ", birthDate=" + getBirthDate() + ", phone=" + getPhone() + ", address="
				+ getAddress() + ", motherName=" + getMotherName() + ", ipdOrOpdNo=" + getIpdOrOpdNo() + ", fatherName="
				+ getFatherName() + ", childPhoto=" + getChildPhoto() + ", motherPhoto=" + getMotherPhoto()
				+ ", fatherPhoto=" + getFatherPhoto() + ", attachDocument=" + getAttachDocument() + ")";
	}

	/*    */
	/*    */
	/* 11 */ public int getId() {
		return this.id;
	}

	/* 12 */ public String getChildName() {
		return this.childName;
	}

	/* 13 */ public String getGender() {
		return this.gender;
	}

	/* 14 */ public String getWeight() {
		return this.weight;
	}

	/* 15 */ public String getBirthDate() {
		return this.birthDate;
	}

	/* 16 */ public String getPhone() {
		return this.phone;
	}

	/* 17 */ public String getAddress() {
		return this.address;
	}

	/* 18 */ public String getMotherName() {
		return this.motherName;
	}

	/* 19 */ public String getIpdOrOpdNo() {
		return this.ipdOrOpdNo;
	}

	/* 20 */ public String getFatherName() {
		return this.fatherName;
	}

	/* 21 */ public MultipartFile getChildPhoto() {
		return this.childPhoto;
	}

	/* 22 */ public MultipartFile getMotherPhoto() {
		return this.motherPhoto;
	}

	/* 23 */ public MultipartFile getFatherPhoto() {
		return this.fatherPhoto;
	}

	public MultipartFile getAttachDocument() {
		/* 24 */ return this.attachDocument;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\
 * BirthRecordBean.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */