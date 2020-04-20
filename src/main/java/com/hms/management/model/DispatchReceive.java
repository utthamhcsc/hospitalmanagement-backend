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
/*    */ @Table(name = "dispatch_receive")
/*    */ public class DispatchReceive {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String referenceNo;
	/*    */ private String toTitle;
	/*    */ private String address;
	/*    */ private String note;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String fromTitle;
	private String date;
	private String image;
	private String createdAt;
	private String updatedAt;
	private String type;

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public void setToTitle(String toTitle) {
		this.toTitle = toTitle;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setFromTitle(String fromTitle) {
		this.fromTitle = fromTitle;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof DispatchReceive))
			return false;
		DispatchReceive other = (DispatchReceive) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$referenceNo = getReferenceNo(), other$referenceNo = other.getReferenceNo();
		if ((this$referenceNo == null) ? (other$referenceNo != null) : !this$referenceNo.equals(other$referenceNo))
			return false;
		Object this$toTitle = getToTitle(), other$toTitle = other.getToTitle();
		if ((this$toTitle == null) ? (other$toTitle != null) : !this$toTitle.equals(other$toTitle))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$fromTitle = getFromTitle(), other$fromTitle = other.getFromTitle();
		if ((this$fromTitle == null) ? (other$fromTitle != null) : !this$fromTitle.equals(other$fromTitle))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$image = getImage(), other$image = other.getImage();
		if ((this$image == null) ? (other$image != null) : !this$image.equals(other$image))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		if ((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt))
			return false;
		Object this$type = getType(), other$type = other.getType();
		return !((this$type == null) ? (other$type != null) : !this$type.equals(other$type));
	}

	protected boolean canEqual(Object other) {
		return other instanceof DispatchReceive;
	}

	
	public String toString() {
		return "DispatchReceive(id=" + getId() + ", referenceNo=" + getReferenceNo() + ", toTitle=" + getToTitle()
				+ ", address=" + getAddress() + ", note=" + getNote() + ", fromTitle=" + getFromTitle() + ", date="
				+ getDate() + ", image=" + getImage() + ", createdAt=" + getCreatedAt() + ", updatedAt="
				+ getUpdatedAt() + ", type=" + getType() + ")";
	}

	public DispatchReceive(int id, String referenceNo, String toTitle, String address, String note, String fromTitle,
			String date, String image, String createdAt, String updatedAt, String type) {
		/* 17 */ this.id = id;
		this.referenceNo = referenceNo;
		this.toTitle = toTitle;
		this.address = address;
		this.note = note;
		this.fromTitle = fromTitle;
		this.date = date;
		this.image = image;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.type = type;
		/*    */ }

	/*    */
	/*    */
	/*    */ public DispatchReceive() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 25 */ return this.id;
		/* 26 */ }

	public String getReferenceNo() {
		return this.referenceNo;
	}

	/* 27 */ public String getToTitle() {
		return this.toTitle;
	}

	/* 28 */ public String getAddress() {
		return this.address;
	}

	/* 29 */ public String getNote() {
		return this.note;
	}

	/* 30 */ public String getFromTitle() {
		return this.fromTitle;
	}

	/* 31 */ public String getDate() {
		return this.date;
	}

	/* 32 */ public String getImage() {
		return this.image;
	}

	/* 33 */ public String getCreatedAt() {
		return this.createdAt;
	}

	/* 34 */ public String getUpdatedAt() {
		return this.updatedAt;
	}

	public String getType() {
		/* 35 */ return this.type;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * DispatchReceive.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */