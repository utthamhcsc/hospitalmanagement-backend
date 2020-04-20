/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "front_cms_settings")
/*    */ public class FrontCmsSettings {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private String theme;
	/*    */ private int isActiveRtl;
	/*    */ private int isActiveFrontCms;
	/*    */ private int isActiveSidebar;
	/*    */ private String logo;
	/*    */ private String contactUsEmail;
	/*    */ private String complainFormEmail;
	/*    */ private String sidebarOptions;
	/*    */ private String fbUrl;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String twitterUrl;
	private String youtubeUrl;
	private String googlePlus;
	private String instagramUrl;
	private String pinterestUrl;
	private String linkedinUrl;
	private String googleAnalytics;
	private String footerText;
	private String favIcon;
	private String createdAt;

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public void setIsActiveRtl(int isActiveRtl) {
		this.isActiveRtl = isActiveRtl;
	}

	public void setIsActiveFrontCms(int isActiveFrontCms) {
		this.isActiveFrontCms = isActiveFrontCms;
	}

	public void setIsActiveSidebar(int isActiveSidebar) {
		this.isActiveSidebar = isActiveSidebar;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setContactUsEmail(String contactUsEmail) {
		this.contactUsEmail = contactUsEmail;
	}

	public void setComplainFormEmail(String complainFormEmail) {
		this.complainFormEmail = complainFormEmail;
	}

	public void setSidebarOptions(String sidebarOptions) {
		this.sidebarOptions = sidebarOptions;
	}

	public void setFbUrl(String fbUrl) {
		this.fbUrl = fbUrl;
	}

	public void setTwitterUrl(String twitterUrl) {
		this.twitterUrl = twitterUrl;
	}

	public void setYoutubeUrl(String youtubeUrl) {
		this.youtubeUrl = youtubeUrl;
	}

	public void setGooglePlus(String googlePlus) {
		this.googlePlus = googlePlus;
	}

	public void setInstagramUrl(String instagramUrl) {
		this.instagramUrl = instagramUrl;
	}

	public void setPinterestUrl(String pinterestUrl) {
		this.pinterestUrl = pinterestUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public void setGoogleAnalytics(String googleAnalytics) {
		this.googleAnalytics = googleAnalytics;
	}

	public void setFooterText(String footerText) {
		this.footerText = footerText;
	}

	public void setFavIcon(String favIcon) {
		this.favIcon = favIcon;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof FrontCmsSettings))
			return false;
		FrontCmsSettings other = (FrontCmsSettings) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$theme = getTheme(), other$theme = other.getTheme();
		if ((this$theme == null) ? (other$theme != null) : !this$theme.equals(other$theme))
			return false;
		if (getIsActiveRtl() != other.getIsActiveRtl())
			return false;
		if (getIsActiveFrontCms() != other.getIsActiveFrontCms())
			return false;
		if (getIsActiveSidebar() != other.getIsActiveSidebar())
			return false;
		Object this$logo = getLogo(), other$logo = other.getLogo();
		if ((this$logo == null) ? (other$logo != null) : !this$logo.equals(other$logo))
			return false;
		Object this$contactUsEmail = getContactUsEmail(), other$contactUsEmail = other.getContactUsEmail();
		if ((this$contactUsEmail == null) ? (other$contactUsEmail != null)
				: !this$contactUsEmail.equals(other$contactUsEmail))
			return false;
		Object this$complainFormEmail = getComplainFormEmail(), other$complainFormEmail = other.getComplainFormEmail();
		if ((this$complainFormEmail == null) ? (other$complainFormEmail != null)
				: !this$complainFormEmail.equals(other$complainFormEmail))
			return false;
		Object this$sidebarOptions = getSidebarOptions(), other$sidebarOptions = other.getSidebarOptions();
		if ((this$sidebarOptions == null) ? (other$sidebarOptions != null)
				: !this$sidebarOptions.equals(other$sidebarOptions))
			return false;
		Object this$fbUrl = getFbUrl(), other$fbUrl = other.getFbUrl();
		if ((this$fbUrl == null) ? (other$fbUrl != null) : !this$fbUrl.equals(other$fbUrl))
			return false;
		Object this$twitterUrl = getTwitterUrl(), other$twitterUrl = other.getTwitterUrl();
		if ((this$twitterUrl == null) ? (other$twitterUrl != null) : !this$twitterUrl.equals(other$twitterUrl))
			return false;
		Object this$youtubeUrl = getYoutubeUrl(), other$youtubeUrl = other.getYoutubeUrl();
		if ((this$youtubeUrl == null) ? (other$youtubeUrl != null) : !this$youtubeUrl.equals(other$youtubeUrl))
			return false;
		Object this$googlePlus = getGooglePlus(), other$googlePlus = other.getGooglePlus();
		if ((this$googlePlus == null) ? (other$googlePlus != null) : !this$googlePlus.equals(other$googlePlus))
			return false;
		Object this$instagramUrl = getInstagramUrl(), other$instagramUrl = other.getInstagramUrl();
		if ((this$instagramUrl == null) ? (other$instagramUrl != null) : !this$instagramUrl.equals(other$instagramUrl))
			return false;
		Object this$pinterestUrl = getPinterestUrl(), other$pinterestUrl = other.getPinterestUrl();
		if ((this$pinterestUrl == null) ? (other$pinterestUrl != null) : !this$pinterestUrl.equals(other$pinterestUrl))
			return false;
		Object this$linkedinUrl = getLinkedinUrl(), other$linkedinUrl = other.getLinkedinUrl();
		if ((this$linkedinUrl == null) ? (other$linkedinUrl != null) : !this$linkedinUrl.equals(other$linkedinUrl))
			return false;
		Object this$googleAnalytics = getGoogleAnalytics(), other$googleAnalytics = other.getGoogleAnalytics();
		if ((this$googleAnalytics == null) ? (other$googleAnalytics != null)
				: !this$googleAnalytics.equals(other$googleAnalytics))
			return false;
		Object this$footerText = getFooterText(), other$footerText = other.getFooterText();
		if ((this$footerText == null) ? (other$footerText != null) : !this$footerText.equals(other$footerText))
			return false;
		Object this$favIcon = getFavIcon(), other$favIcon = other.getFavIcon();
		if ((this$favIcon == null) ? (other$favIcon != null) : !this$favIcon.equals(other$favIcon))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof FrontCmsSettings;
	}

	
	public String toString() {
		return "FrontCmsSettings(id=" + getId() + ", theme=" + getTheme() + ", isActiveRtl=" + getIsActiveRtl()
				+ ", isActiveFrontCms=" + getIsActiveFrontCms() + ", isActiveSidebar=" + getIsActiveSidebar()
				+ ", logo=" + getLogo() + ", contactUsEmail=" + getContactUsEmail() + ", complainFormEmail="
				+ getComplainFormEmail() + ", sidebarOptions=" + getSidebarOptions() + ", fbUrl=" + getFbUrl()
				+ ", twitterUrl=" + getTwitterUrl() + ", youtubeUrl=" + getYoutubeUrl() + ", googlePlus="
				+ getGooglePlus() + ", instagramUrl=" + getInstagramUrl() + ", pinterestUrl=" + getPinterestUrl()
				+ ", linkedinUrl=" + getLinkedinUrl() + ", googleAnalytics=" + getGoogleAnalytics() + ", footerText="
				+ getFooterText() + ", favIcon=" + getFavIcon() + ", createdAt=" + getCreatedAt() + ")";
	}

	public FrontCmsSettings(int id, String theme, int isActiveRtl, int isActiveFrontCms, int isActiveSidebar,
			String logo, String contactUsEmail, String complainFormEmail, String sidebarOptions, String fbUrl,
			String twitterUrl, String youtubeUrl, String googlePlus, String instagramUrl, String pinterestUrl,
			String linkedinUrl, String googleAnalytics, String footerText, String favIcon, String createdAt) {
		/* 17 */ this.id = id;
		this.theme = theme;
		this.isActiveRtl = isActiveRtl;
		this.isActiveFrontCms = isActiveFrontCms;
		this.isActiveSidebar = isActiveSidebar;
		this.logo = logo;
		this.contactUsEmail = contactUsEmail;
		this.complainFormEmail = complainFormEmail;
		this.sidebarOptions = sidebarOptions;
		this.fbUrl = fbUrl;
		this.twitterUrl = twitterUrl;
		this.youtubeUrl = youtubeUrl;
		this.googlePlus = googlePlus;
		this.instagramUrl = instagramUrl;
		this.pinterestUrl = pinterestUrl;
		this.linkedinUrl = linkedinUrl;
		this.googleAnalytics = googleAnalytics;
		this.footerText = footerText;
		this.favIcon = favIcon;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */ public FrontCmsSettings() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getTheme() {
		return this.theme;
	}

	/* 26 */ public int getIsActiveRtl() {
		return this.isActiveRtl;
	}

	/* 27 */ public int getIsActiveFrontCms() {
		return this.isActiveFrontCms;
	}

	/* 28 */ public int getIsActiveSidebar() {
		return this.isActiveSidebar;
	}

	/* 29 */ public String getLogo() {
		return this.logo;
	}

	/* 30 */ public String getContactUsEmail() {
		return this.contactUsEmail;
	}

	/* 31 */ public String getComplainFormEmail() {
		return this.complainFormEmail;
	}

	/* 32 */ public String getSidebarOptions() {
		return this.sidebarOptions;
	}

	/* 33 */ public String getFbUrl() {
		return this.fbUrl;
	}

	/* 34 */ public String getTwitterUrl() {
		return this.twitterUrl;
	}

	/* 35 */ public String getYoutubeUrl() {
		return this.youtubeUrl;
	}

	/* 36 */ public String getGooglePlus() {
		return this.googlePlus;
	}

	/* 37 */ public String getInstagramUrl() {
		return this.instagramUrl;
	}

	/* 38 */ public String getPinterestUrl() {
		return this.pinterestUrl;
	}

	/* 39 */ public String getLinkedinUrl() {
		return this.linkedinUrl;
	}

	/* 40 */ public String getGoogleAnalytics() {
		return this.googleAnalytics;
	}

	/* 41 */ public String getFooterText() {
		return this.footerText;
	}

	/* 42 */ public String getFavIcon() {
		return this.favIcon;
	}

	public String getCreatedAt() {
		/* 43 */ return this.createdAt;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * FrontCmsSettings.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */