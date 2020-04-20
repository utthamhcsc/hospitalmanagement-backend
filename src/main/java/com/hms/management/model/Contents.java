/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "contents")
/*    */ public class Contents {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String title;
	/*    */ private String type;
	/*    */ private String isPublic;
	/*    */ private int classId;
	/*    */ private int clsSecId;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String file;
	private int createdBy;
	private String note;
	private String isActive;
	private String createdAt;
	private String updatedAt;
	private String date;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public void setClsSecId(int clsSecId) {
		this.clsSecId = clsSecId;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Contents))
			return false;
		Contents other = (Contents) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$title = getTitle(), other$title = other.getTitle();
		if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title))
			return false;
		Object this$type = getType(), other$type = other.getType();
		if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type))
			return false;
		Object this$isPublic = getIsPublic(), other$isPublic = other.getIsPublic();
		if ((this$isPublic == null) ? (other$isPublic != null) : !this$isPublic.equals(other$isPublic))
			return false;
		if (getClassId() != other.getClassId())
			return false;
		if (getClsSecId() != other.getClsSecId())
			return false;
		Object this$file = getFile(), other$file = other.getFile();
		if ((this$file == null) ? (other$file != null) : !this$file.equals(other$file))
			return false;
		if (getCreatedBy() != other.getCreatedBy())
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		if ((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		if ((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		return !((this$date == null) ? (other$date != null) : !this$date.equals(other$date));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Contents;
	}


	public String toString() {
		return "Contents(id=" + getId() + ", title=" + getTitle() + ", type=" + getType() + ", isPublic="
				+ getIsPublic() + ", classId=" + getClassId() + ", clsSecId=" + getClsSecId() + ", file=" + getFile()
				+ ", createdBy=" + getCreatedBy() + ", note=" + getNote() + ", isActive=" + getIsActive()
				+ ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ", date=" + getDate() + ")";
	}

	public Contents(int id, String title, String type, String isPublic, int classId, int clsSecId, String file,
			int createdBy, String note, String isActive, String createdAt, String updatedAt, String date) {
		/* 17 */ this.id = id;
		this.title = title;
		this.type = type;
		this.isPublic = isPublic;
		this.classId = classId;
		this.clsSecId = clsSecId;
		this.file = file;
		this.createdBy = createdBy;
		this.note = note;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.date = date;
		/*    */ }

	/*    */
	/*    */
	/*    */ public Contents() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 25 */ return this.id;
		/* 26 */ }

	public String getTitle() {
		return this.title;
	}

	/* 27 */ public String getType() {
		return this.type;
	}

	/* 28 */ public String getIsPublic() {
		return this.isPublic;
	}

	/* 29 */ public int getClassId() {
		return this.classId;
	}

	/* 30 */ public int getClsSecId() {
		return this.clsSecId;
	}

	/* 31 */ public String getFile() {
		return this.file;
	}

	/* 32 */ public int getCreatedBy() {
		return this.createdBy;
	}

	/* 33 */ public String getNote() {
		return this.note;
	}

	/* 34 */ public String getIsActive() {
		return this.isActive;
	}

	/* 35 */ public String getCreatedAt() {
		return this.createdAt;
	}

	/* 36 */ public String getUpdatedAt() {
		return this.updatedAt;
	}

	public String getDate() {
		/* 37 */ return this.date;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Contents.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */