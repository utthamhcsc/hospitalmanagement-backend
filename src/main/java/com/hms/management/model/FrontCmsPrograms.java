/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "front_cms_programs")
/*    */ public class FrontCmsPrograms {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String type;
	/*    */ private String slug;
	/*    */ private String url;
	/*    */ private String title;
	/*    */ private String date;
	/*    */ private String eventStart;
	/*    */ private String eventEnd;
	/*    */ private String eventVenue;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String description;
	private String isActive;
	private String createdAt;
	private String metaTitle;
	private String metaDescription;
	private String metaKeyword;
	private String featureImage;
	private String publishDate;
	private String publish;
	private int sidebar;

	public void setType(String type) {
		this.type = type;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setEventStart(String eventStart) {
		this.eventStart = eventStart;
	}

	public void setEventEnd(String eventEnd) {
		this.eventEnd = eventEnd;
	}

	public void setEventVenue(String eventVenue) {
		this.eventVenue = eventVenue;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
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

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public void setSidebar(int sidebar) {
		this.sidebar = sidebar;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof FrontCmsPrograms))
			return false;
		FrontCmsPrograms other = (FrontCmsPrograms) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$type = getType(), other$type = other.getType();
		if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type))
			return false;
		Object this$slug = getSlug(), other$slug = other.getSlug();
		if ((this$slug == null) ? (other$slug != null) : !this$slug.equals(other$slug))
			return false;
		Object this$url = getUrl(), other$url = other.getUrl();
		if ((this$url == null) ? (other$url != null) : !this$url.equals(other$url))
			return false;
		Object this$title = getTitle(), other$title = other.getTitle();
		if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$eventStart = getEventStart(), other$eventStart = other.getEventStart();
		if ((this$eventStart == null) ? (other$eventStart != null) : !this$eventStart.equals(other$eventStart))
			return false;
		Object this$eventEnd = getEventEnd(), other$eventEnd = other.getEventEnd();
		if ((this$eventEnd == null) ? (other$eventEnd != null) : !this$eventEnd.equals(other$eventEnd))
			return false;
		Object this$eventVenue = getEventVenue(), other$eventVenue = other.getEventVenue();
		if ((this$eventVenue == null) ? (other$eventVenue != null) : !this$eventVenue.equals(other$eventVenue))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		if ((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
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
		Object this$publishDate = getPublishDate(), other$publishDate = other.getPublishDate();
		if ((this$publishDate == null) ? (other$publishDate != null) : !this$publishDate.equals(other$publishDate))
			return false;
		Object this$publish = getPublish(), other$publish = other.getPublish();
		return ((this$publish == null) ? (other$publish != null) : !this$publish.equals(other$publish)) ? false
				: (!(getSidebar() != other.getSidebar()));
	}

	protected boolean canEqual(Object other) {
		return other instanceof FrontCmsPrograms;
	}

	

	public String toString() {
		return "FrontCmsPrograms(id=" + getId() + ", type=" + getType() + ", slug=" + getSlug() + ", url=" + getUrl()
				+ ", title=" + getTitle() + ", date=" + getDate() + ", eventStart=" + getEventStart() + ", eventEnd="
				+ getEventEnd() + ", eventVenue=" + getEventVenue() + ", description=" + getDescription()
				+ ", isActive=" + getIsActive() + ", createdAt=" + getCreatedAt() + ", metaTitle=" + getMetaTitle()
				+ ", metaDescription=" + getMetaDescription() + ", metaKeyword=" + getMetaKeyword() + ", featureImage="
				+ getFeatureImage() + ", publishDate=" + getPublishDate() + ", publish=" + getPublish() + ", sidebar="
				+ getSidebar() + ")";
	}

	public FrontCmsPrograms(int id, String type, String slug, String url, String title, String date, String eventStart,
			String eventEnd, String eventVenue, String description, String isActive, String createdAt, String metaTitle,
			String metaDescription, String metaKeyword, String featureImage, String publishDate, String publish,
			int sidebar) {
		/* 17 */ this.id = id;
		this.type = type;
		this.slug = slug;
		this.url = url;
		this.title = title;
		this.date = date;
		this.eventStart = eventStart;
		this.eventEnd = eventEnd;
		this.eventVenue = eventVenue;
		this.description = description;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.metaTitle = metaTitle;
		this.metaDescription = metaDescription;
		this.metaKeyword = metaKeyword;
		this.featureImage = featureImage;
		this.publishDate = publishDate;
		this.publish = publish;
		this.sidebar = sidebar;
		/*    */ }

	/*    */
	/*    */ public FrontCmsPrograms() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getType() {
		return this.type;
	}

	/* 26 */ public String getSlug() {
		return this.slug;
	}

	/* 27 */ public String getUrl() {
		return this.url;
	}

	/* 28 */ public String getTitle() {
		return this.title;
	}

	/* 29 */ public String getDate() {
		return this.date;
	}

	/* 30 */ public String getEventStart() {
		return this.eventStart;
	}

	/* 31 */ public String getEventEnd() {
		return this.eventEnd;
	}

	/* 32 */ public String getEventVenue() {
		return this.eventVenue;
	}

	/* 33 */ public String getDescription() {
		return this.description;
	}

	/* 34 */ public String getIsActive() {
		return this.isActive;
	}

	/* 35 */ public String getCreatedAt() {
		return this.createdAt;
	}

	/* 36 */ public String getMetaTitle() {
		return this.metaTitle;
	}

	/* 37 */ public String getMetaDescription() {
		return this.metaDescription;
	}

	/* 38 */ public String getMetaKeyword() {
		return this.metaKeyword;
	}

	/* 39 */ public String getFeatureImage() {
		return this.featureImage;
	}

	/* 40 */ public String getPublishDate() {
		return this.publishDate;
	}

	/* 41 */ public String getPublish() {
		return this.publish;
	}

	public int getSidebar() {
		/* 42 */ return this.sidebar;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * FrontCmsPrograms.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */