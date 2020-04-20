/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "front_cms_menu_items")
/*    */ public class FrontCmsMenuItems {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int menuId;
	/*    */ private String menu;
	/*    */ private int pageId;
	/*    */ private int parentId;
	/*    */ private String extUrl;
	/*    */ private int openNewTab;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String extUrlLink;
	private String slug;
	private int weight;
	private int publish;
	private String description;
	private String isActive;
	private String createdAt;

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public void setExtUrl(String extUrl) {
		this.extUrl = extUrl;
	}

	public void setOpenNewTab(int openNewTab) {
		this.openNewTab = openNewTab;
	}

	public void setExtUrlLink(String extUrlLink) {
		this.extUrlLink = extUrlLink;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setPublish(int publish) {
		this.publish = publish;
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

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof FrontCmsMenuItems))
			return false;
		FrontCmsMenuItems other = (FrontCmsMenuItems) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getMenuId() != other.getMenuId())
			return false;
		Object this$menu = getMenu(), other$menu = other.getMenu();
		if ((this$menu == null) ? (other$menu != null) : !this$menu.equals(other$menu))
			return false;
		if (getPageId() != other.getPageId())
			return false;
		if (getParentId() != other.getParentId())
			return false;
		Object this$extUrl = getExtUrl(), other$extUrl = other.getExtUrl();
		if ((this$extUrl == null) ? (other$extUrl != null) : !this$extUrl.equals(other$extUrl))
			return false;
		if (getOpenNewTab() != other.getOpenNewTab())
			return false;
		Object this$extUrlLink = getExtUrlLink(), other$extUrlLink = other.getExtUrlLink();
		if ((this$extUrlLink == null) ? (other$extUrlLink != null) : !this$extUrlLink.equals(other$extUrlLink))
			return false;
		Object this$slug = getSlug(), other$slug = other.getSlug();
		if ((this$slug == null) ? (other$slug != null) : !this$slug.equals(other$slug))
			return false;
		if (getWeight() != other.getWeight())
			return false;
		if (getPublish() != other.getPublish())
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		if ((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof FrontCmsMenuItems;
	}

	
	public String toString() {
		return "FrontCmsMenuItems(id=" + getId() + ", menuId=" + getMenuId() + ", menu=" + getMenu() + ", pageId="
				+ getPageId() + ", parentId=" + getParentId() + ", extUrl=" + getExtUrl() + ", openNewTab="
				+ getOpenNewTab() + ", extUrlLink=" + getExtUrlLink() + ", slug=" + getSlug() + ", weight="
				+ getWeight() + ", publish=" + getPublish() + ", description=" + getDescription() + ", isActive="
				+ getIsActive() + ", createdAt=" + getCreatedAt() + ")";
	}

	public FrontCmsMenuItems(int id, int menuId, String menu, int pageId, int parentId, String extUrl, int openNewTab,
			String extUrlLink, String slug, int weight, int publish, String description, String isActive,
			String createdAt) {
		/* 17 */ this.id = id;
		this.menuId = menuId;
		this.menu = menu;
		this.pageId = pageId;
		this.parentId = parentId;
		this.extUrl = extUrl;
		this.openNewTab = openNewTab;
		this.extUrlLink = extUrlLink;
		this.slug = slug;
		this.weight = weight;
		this.publish = publish;
		this.description = description;
		this.isActive = isActive;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */ public FrontCmsMenuItems() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getMenuId() {
		return this.menuId;
	}

	/* 26 */ public String getMenu() {
		return this.menu;
	}

	/* 27 */ public int getPageId() {
		return this.pageId;
	}

	/* 28 */ public int getParentId() {
		return this.parentId;
	}

	/* 29 */ public String getExtUrl() {
		return this.extUrl;
	}

	/* 30 */ public int getOpenNewTab() {
		return this.openNewTab;
	}

	/* 31 */ public String getExtUrlLink() {
		return this.extUrlLink;
	}

	/* 32 */ public String getSlug() {
		return this.slug;
	}

	/* 33 */ public int getWeight() {
		return this.weight;
	}

	/* 34 */ public int getPublish() {
		return this.publish;
	}

	/* 35 */ public String getDescription() {
		return this.description;
	}

	/* 36 */ public String getIsActive() {
		return this.isActive;
	}

	public String getCreatedAt() {
		/* 37 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * FrontCmsMenuItems.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */