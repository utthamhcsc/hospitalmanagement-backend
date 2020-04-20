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
/*    */ @Table(name = "front_cms_page_contents")
/*    */ public class FrontCmsPageContents {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int pageId;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String contentType;
	private String createdAt;

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof FrontCmsPageContents))
			return false;
		FrontCmsPageContents other = (FrontCmsPageContents) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPageId() != other.getPageId())
			return false;
		Object this$contentType = getContentType(), other$contentType = other.getContentType();
		if ((this$contentType == null) ? (other$contentType != null) : !this$contentType.equals(other$contentType))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof FrontCmsPageContents;
	}


	public String toString() {
		return "FrontCmsPageContents(id=" + getId() + ", pageId=" + getPageId() + ", contentType=" + getContentType()
				+ ", createdAt=" + getCreatedAt() + ")";
	}

	public FrontCmsPageContents(int id, int pageId, String contentType, String createdAt) {
		/* 17 */ this.id = id;
		this.pageId = pageId;
		this.contentType = contentType;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */ public FrontCmsPageContents() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getPageId() {
		return this.pageId;
	}

	/* 26 */ public String getContentType() {
		return this.contentType;
	}

	public String getCreatedAt() {
		/* 27 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * FrontCmsPageContents.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */