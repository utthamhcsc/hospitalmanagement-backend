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
/*    */ @Table(name = "front_cms_menus")
/*    */ public class FrontCmsMenus {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String menu;
	/*    */ private String slug;
	/*    */ private String description;
	/*    */ private int opeNewTab;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String extUrl;
	private String extUrlLink;
	private int publish;
	private String contentType;
	private String isActive;
	private String created_at;

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setOpeNewTab(int opeNewTab) {
		this.opeNewTab = opeNewTab;
	}

	public void setExtUrl(String extUrl) {
		this.extUrl = extUrl;
	}

	public void setExtUrlLink(String extUrlLink) {
		this.extUrlLink = extUrlLink;
	}

	public void setPublish(int publish) {
		this.publish = publish;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof FrontCmsMenus))
			return false;
		FrontCmsMenus other = (FrontCmsMenus) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$menu = getMenu(), other$menu = other.getMenu();
		if ((this$menu == null) ? (other$menu != null) : !this$menu.equals(other$menu))
			return false;
		Object this$slug = getSlug(), other$slug = other.getSlug();
		if ((this$slug == null) ? (other$slug != null) : !this$slug.equals(other$slug))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		if (getOpeNewTab() != other.getOpeNewTab())
			return false;
		Object this$extUrl = getExtUrl(), other$extUrl = other.getExtUrl();
		if ((this$extUrl == null) ? (other$extUrl != null) : !this$extUrl.equals(other$extUrl))
			return false;
		Object this$extUrlLink = getExtUrlLink(), other$extUrlLink = other.getExtUrlLink();
		if ((this$extUrlLink == null) ? (other$extUrlLink != null) : !this$extUrlLink.equals(other$extUrlLink))
			return false;
		if (getPublish() != other.getPublish())
			return false;
		Object this$contentType = getContentType(), other$contentType = other.getContentType();
		if ((this$contentType == null) ? (other$contentType != null) : !this$contentType.equals(other$contentType))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		if ((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive))
			return false;
		Object this$created_at = getCreated_at(), other$created_at = other.getCreated_at();
		return !((this$created_at == null) ? (other$created_at != null) : !this$created_at.equals(other$created_at));
	}

	protected boolean canEqual(Object other) {
		return other instanceof FrontCmsMenus;
	}
	public String toString() {
		return "FrontCmsMenus(id=" + getId() + ", menu=" + getMenu() + ", slug=" + getSlug() + ", description="
				+ getDescription() + ", opeNewTab=" + getOpeNewTab() + ", extUrl=" + getExtUrl() + ", extUrlLink="
				+ getExtUrlLink() + ", publish=" + getPublish() + ", contentType=" + getContentType() + ", isActive="
				+ getIsActive() + ", created_at=" + getCreated_at() + ")";
	}

	public FrontCmsMenus(int id, String menu, String slug, String description, int opeNewTab, String extUrl,
			String extUrlLink, int publish, String contentType, String isActive, String created_at) {
		/* 17 */ this.id = id;
		this.menu = menu;
		this.slug = slug;
		this.description = description;
		this.opeNewTab = opeNewTab;
		this.extUrl = extUrl;
		this.extUrlLink = extUrlLink;
		this.publish = publish;
		this.contentType = contentType;
		this.isActive = isActive;
		this.created_at = created_at;
		/*    */ }

	/*    */
	/*    */ public FrontCmsMenus() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getMenu() {
		return this.menu;
	}

	/* 26 */ public String getSlug() {
		return this.slug;
	}

	/* 27 */ public String getDescription() {
		return this.description;
	}

	/* 28 */ public int getOpeNewTab() {
		return this.opeNewTab;
	}

	/* 29 */ public String getExtUrl() {
		return this.extUrl;
	}

	/* 30 */ public String getExtUrlLink() {
		return this.extUrlLink;
	}

	/* 31 */ public int getPublish() {
		return this.publish;
	}

	/* 32 */ public String getContentType() {
		return this.contentType;
	}

	/* 33 */ public String getIsActive() {
		return this.isActive;
	}

	public String getCreated_at() {
		/* 34 */ return this.created_at;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * FrontCmsMenus.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */