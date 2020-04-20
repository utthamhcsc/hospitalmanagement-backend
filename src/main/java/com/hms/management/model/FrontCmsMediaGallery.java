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
/*    */ @Table(name = "front_cms_media_gallery")
/*    */ public class FrontCmsMediaGallery {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String image;
	/*    */ private String thumbPath;
	/*    */ private String dirPath;
	/*    */ private String imgName;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String thumbName;
	private String createdAt;
	private String fileType;
	private String fileSize;
	private String vidUrl;
	private String vidTitle;

	public void setImage(String image) {
		this.image = image;
	}

	public void setThumbPath(String thumbPath) {
		this.thumbPath = thumbPath;
	}

	public void setDirPath(String dirPath) {
		this.dirPath = dirPath;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public void setThumbName(String thumbName) {
		this.thumbName = thumbName;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public void setVidUrl(String vidUrl) {
		this.vidUrl = vidUrl;
	}

	public void setVidTitle(String vidTitle) {
		this.vidTitle = vidTitle;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof FrontCmsMediaGallery))
			return false;
		FrontCmsMediaGallery other = (FrontCmsMediaGallery) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$image = getImage(), other$image = other.getImage();
		if ((this$image == null) ? (other$image != null) : !this$image.equals(other$image))
			return false;
		Object this$thumbPath = getThumbPath(), other$thumbPath = other.getThumbPath();
		if ((this$thumbPath == null) ? (other$thumbPath != null) : !this$thumbPath.equals(other$thumbPath))
			return false;
		Object this$dirPath = getDirPath(), other$dirPath = other.getDirPath();
		if ((this$dirPath == null) ? (other$dirPath != null) : !this$dirPath.equals(other$dirPath))
			return false;
		Object this$imgName = getImgName(), other$imgName = other.getImgName();
		if ((this$imgName == null) ? (other$imgName != null) : !this$imgName.equals(other$imgName))
			return false;
		Object this$thumbName = getThumbName(), other$thumbName = other.getThumbName();
		if ((this$thumbName == null) ? (other$thumbName != null) : !this$thumbName.equals(other$thumbName))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$fileType = getFileType(), other$fileType = other.getFileType();
		if ((this$fileType == null) ? (other$fileType != null) : !this$fileType.equals(other$fileType))
			return false;
		Object this$fileSize = getFileSize(), other$fileSize = other.getFileSize();
		if ((this$fileSize == null) ? (other$fileSize != null) : !this$fileSize.equals(other$fileSize))
			return false;
		Object this$vidUrl = getVidUrl(), other$vidUrl = other.getVidUrl();
		if ((this$vidUrl == null) ? (other$vidUrl != null) : !this$vidUrl.equals(other$vidUrl))
			return false;
		Object this$vidTitle = getVidTitle(), other$vidTitle = other.getVidTitle();
		return !((this$vidTitle == null) ? (other$vidTitle != null) : !this$vidTitle.equals(other$vidTitle));
	}

	protected boolean canEqual(Object other) {
		return other instanceof FrontCmsMediaGallery;
	}

	
	public String toString() {
		return "FrontCmsMediaGallery(id=" + getId() + ", image=" + getImage() + ", thumbPath=" + getThumbPath()
				+ ", dirPath=" + getDirPath() + ", imgName=" + getImgName() + ", thumbName=" + getThumbName()
				+ ", createdAt=" + getCreatedAt() + ", fileType=" + getFileType() + ", fileSize=" + getFileSize()
				+ ", vidUrl=" + getVidUrl() + ", vidTitle=" + getVidTitle() + ")";
	}

	public FrontCmsMediaGallery(int id, String image, String thumbPath, String dirPath, String imgName,
			String thumbName, String createdAt, String fileType, String fileSize, String vidUrl, String vidTitle) {
		/* 17 */ this.id = id;
		this.image = image;
		this.thumbPath = thumbPath;
		this.dirPath = dirPath;
		this.imgName = imgName;
		this.thumbName = thumbName;
		this.createdAt = createdAt;
		this.fileType = fileType;
		this.fileSize = fileSize;
		this.vidUrl = vidUrl;
		this.vidTitle = vidTitle;
		/*    */ }

	/*    */
	/*    */ public FrontCmsMediaGallery() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getImage() {
		return this.image;
	}

	/* 26 */ public String getThumbPath() {
		return this.thumbPath;
	}

	/* 27 */ public String getDirPath() {
		return this.dirPath;
	}

	/* 28 */ public String getImgName() {
		return this.imgName;
	}

	/* 29 */ public String getThumbName() {
		return this.thumbName;
	}

	/* 30 */ public String getCreatedAt() {
		return this.createdAt;
	}

	/* 31 */ public String getFileType() {
		return this.fileType;
	}

	/* 32 */ public String getFileSize() {
		return this.fileSize;
	}

	/* 33 */ public String getVidUrl() {
		return this.vidUrl;
	}

	public String getVidTitle() {
		/* 34 */ return this.vidTitle;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * FrontCmsMediaGallery.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */