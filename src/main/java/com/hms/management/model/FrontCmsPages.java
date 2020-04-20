/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "front_cms_pages")
/*    */ public class FrontCmsPages {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String pageType;
	/*    */ private int isHomepage;
	/*    */ private String title;
	/*    */ private String url;
	/*    */ private String type;
	/*    */ private String slug;
	/*    */ private String metaTitle;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String metaDescription;
	private String metaKeyword;
	private String featureImage;
	private String description;
	private String publishDate;
	private int publish;
	private int sidebar;
	private String isActive;
	private String createdAt;

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	public void setIsHomepage(int isHomepage) {
		this.isHomepage = isHomepage;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public void setMetaKeyword(String metaKeyword) {
		this.metaKeyword = metaKeyword;
	}

	public void setFeatureImage(String featureImage) {
		this.featureImage = featureImage;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public void setPublish(int publish) {
		this.publish = publish;
	}

	public void setSidebar(int sidebar) {
		this.sidebar = sidebar;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof FrontCmsPages))
			return false;
		FrontCmsPages other = (FrontCmsPages) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$pageType = getPageType(), other$pageType = other.getPageType();
		if ((this$pageType == null) ? (other$pageType != null) : !this$pageType.equals(other$pageType))
			return false;
		if (getIsHomepage() != other.getIsHomepage())
			return false;
		Object this$title = getTitle(), other$title = other.getTitle();
		if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title))
			return false;
		Object this$url = getUrl(), other$url = other.getUrl();
		if ((this$url == null) ? (other$url != null) : !this$url.equals(other$url))
			return false;
		Object this$type = getType(), other$type = other.getType();
		if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type))
			return false;
		Object this$slug = getSlug(), other$slug = other.getSlug();
		if ((this$slug == null) ? (other$slug != null) : !this$slug.equals(other$slug))
			return false;
		Object this$metaTitle = getMetaTitle(), other$metaTitle = other.getMetaTitle();
		if ((this$metaTitle == null) ? (other$metaTitle != null) : !this$metaTitle.equals(other$metaTitle))
			return false;
		Object this$metaDescription = getMetaDescription(), other$metaDescription = other.getMetaDescription();
		if ((this$metaDescription == null) ? (other$metaDescription != null)
				: !this$metaDescription.equals(other$metaDescription))
			return false;
		Object this$metaKeyword = getMetaKeyword(), other$metaKeyword = other.getMetaKeyword();
		if ((this$metaKeyword == null) ? (other$metaKeyword != null) : !this$metaKeyword.equals(other$metaKeyword))
			return false;
		Object this$featureImage = getFeatureImage(), other$featureImage = other.getFeatureImage();
		if ((this$featureImage == null) ? (other$featureImage != null) : !this$featureImage.equals(other$featureImage))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$publishDate = getPublishDate(), other$publishDate = other.getPublishDate();
		if ((this$publishDate == null) ? (other$publishDate != null) : !this$publishDate.equals(other$publishDate))
			return false;
		if (getPublish() != other.getPublish())
			return false;
		if (getSidebar() != other.getSidebar())
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		if ((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof FrontCmsPages;
	}

	
	public String toString() {
		return "FrontCmsPages(id=" + getId() + ", pageType=" + getPageType() + ", isHomepage=" + getIsHomepage()
				+ ", title=" + getTitle() + ", url=" + getUrl() + ", type=" + getType() + ", slug=" + getSlug()
				+ ", metaTitle=" + getMetaTitle() + ", metaDescription=" + getMetaDescription() + ", metaKeyword="
				+ getMetaKeyword() + ", featureImage=" + getFeatureImage() + ", description=" + getDescription()
				+ ", publishDate=" + getPublishDate() + ", publish=" + getPublish() + ", sidebar=" + getSidebar()
				+ ", isActive=" + getIsActive() + ", createdAt=" + getCreatedAt() + ")";
	}

	public FrontCmsPages(int id, String pageType, int isHomepage, String title, String url, String type, String slug,
			String metaTitle, String metaDescription, String metaKeyword, String featureImage, String description,
			String publishDate, int publish, int sidebar, String isActive, String createdAt) {
		/* 17 */ this.id = id;
		this.pageType = pageType;
		this.isHomepage = isHomepage;
		this.title = title;
		this.url = url;
		this.type = type;
		this.slug = slug;
		this.metaTitle = metaTitle;
		this.metaDescription = metaDescription;
		this.metaKeyword = metaKeyword;
		this.featureImage = featureImage;
		this.description = description;
		this.publishDate = publishDate;
		this.publish = publish;
		this.sidebar = sidebar;
		this.isActive = isActive;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */
	/*    */ public FrontCmsPages() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 25 */ return this.id;
		/* 26 */ }

	public String getPageType() {
		return this.pageType;
	}

	/* 27 */ public int getIsHomepage() {
		return this.isHomepage;
	}

	/* 28 */ public String getTitle() {
		return this.title;
	}

	/* 29 */ public String getUrl() {
		return this.url;
	}

	/* 30 */ public String getType() {
		return this.type;
	}

	/* 31 */ public String getSlug() {
		return this.slug;
	}

	/* 32 */ public String getMetaTitle() {
		return this.metaTitle;
	}

	/* 33 */ public String getMetaDescription() {
		return this.metaDescription;
	}

	/* 34 */ public String getMetaKeyword() {
		return this.metaKeyword;
	}

	/* 35 */ public String getFeatureImage() {
		return this.featureImage;
	}

	/* 36 */ public String getDescription() {
		return this.description;
	}

	/* 37 */ public String getPublishDate() {
		return this.publishDate;
	}

	/* 38 */ public int getPublish() {
		return this.publish;
	}

	/* 39 */ public int getSidebar() {
		return this.sidebar;
	}

	/* 40 */ public String getIsActive() {
		return this.isActive;
	}

	public String getCreatedAt() {
		/* 41 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * FrontCmsPages.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */