/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "front_cms_program_photos")
/*    */ public class FrontCmsProgramPhotos {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int programId;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private int mediaGalleryId;
	private String createdAt;

	public void setProgramId(int programId) {
		this.programId = programId;
	}

	public void setMediaGalleryId(int mediaGalleryId) {
		this.mediaGalleryId = mediaGalleryId;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof FrontCmsProgramPhotos))
			return false;
		FrontCmsProgramPhotos other = (FrontCmsProgramPhotos) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getProgramId() != other.getProgramId())
			return false;
		if (getMediaGalleryId() != other.getMediaGalleryId())
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof FrontCmsProgramPhotos;
	}

	

	public String toString() {
		return "FrontCmsProgramPhotos(id=" + getId() + ", programId=" + getProgramId() + ", mediaGalleryId="
				+ getMediaGalleryId() + ", createdAt=" + getCreatedAt() + ")";
	}

	public FrontCmsProgramPhotos(int id, int programId, int mediaGalleryId, String createdAt) {
		/* 17 */ this.id = id;
		this.programId = programId;
		this.mediaGalleryId = mediaGalleryId;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */ public FrontCmsProgramPhotos() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getProgramId() {
		return this.programId;
	}

	/* 26 */ public int getMediaGalleryId() {
		return this.mediaGalleryId;
	}

	public String getCreatedAt() {
		/* 27 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * FrontCmsProgramPhotos.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */