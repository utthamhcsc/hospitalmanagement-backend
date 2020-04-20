
/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "languages")
/*    */ public class Languages {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String language;
	/*    */ private String shortCode;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String isDeleted;
	private String isActive;
	private String createdAt;
	private String updatedAt;

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
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

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Languages))
			return false;
		Languages other = (Languages) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$language = getLanguage(), other$language = other.getLanguage();
		if ((this$language == null) ? (other$language != null) : !this$language.equals(other$language))
			return false;
		Object this$shortCode = getShortCode(), other$shortCode = other.getShortCode();
		if ((this$shortCode == null) ? (other$shortCode != null) : !this$shortCode.equals(other$shortCode))
			return false;
		Object this$isDeleted = getIsDeleted(), other$isDeleted = other.getIsDeleted();
		if ((this$isDeleted == null) ? (other$isDeleted != null) : !this$isDeleted.equals(other$isDeleted))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		if ((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Languages;
	}


	public String toString() {
		return "Languages(id=" + getId() + ", language=" + getLanguage() + ", shortCode=" + getShortCode()
				+ ", isDeleted=" + getIsDeleted() + ", isActive=" + getIsActive() + ", createdAt=" + getCreatedAt()
				+ ", updatedAt=" + getUpdatedAt() + ")";
	}

	public Languages(int id, String language, String shortCode, String isDeleted, String isActive, String createdAt,
			String updatedAt) {
		/* 17 */ this.id = id;
		this.language = language;
		this.shortCode = shortCode;
		this.isDeleted = isDeleted;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public Languages() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getLanguage() {
		return this.language;
	}

	/* 26 */ public String getShortCode() {
		return this.shortCode;
	}

	/* 27 */ public String getIsDeleted() {
		return this.isDeleted;
	}

	/* 28 */ public String getIsActive() {
		return this.isActive;
	}

	/* 29 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 30 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Languages.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */