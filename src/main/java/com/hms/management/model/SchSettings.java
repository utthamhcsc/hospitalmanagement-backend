/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "sch_settings")
/*    */ public class SchSettings {
	@Id
	/*    */ private int id;
	private String name;
	private String email;
	private String phone;
	private String address;
	private int langId;
	/*    */ private String diseCode;
	/*    */ private String dateFormat;
	/*    */ private String timeFormat;
	/*    */ private String currency;
	/*    */ private String currencySymbol;
	/*    */ private String isRtl;
	/*    */ private String timezone;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private int sessionId;
	private String startMonth;
	private String image;
	private String miniLogo;
	private String theme;
	private String creditLimit;
	private String opdRecordMonth;
	private String isActive;
	private String createdAt;
	private String updatedAt;
	private String cronSecretKey;
	private int feeDueDays;
	private String classTeacher;

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLangId(int langId) {
		this.langId = langId;
	}

	public void setDiseCode(String diseCode) {
		this.diseCode = diseCode;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setCurrencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
	}

	public void setIsRtl(String isRtl) {
		this.isRtl = isRtl;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setMiniLogo(String miniLogo) {
		this.miniLogo = miniLogo;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public void setOpdRecordMonth(String opdRecordMonth) {
		this.opdRecordMonth = opdRecordMonth;
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

	public void setCronSecretKey(String cronSecretKey) {
		this.cronSecretKey = cronSecretKey;
	}

	public void setFeeDueDays(int feeDueDays) {
		this.feeDueDays = feeDueDays;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof SchSettings))
			return false;
		SchSettings other = (SchSettings) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$email = getEmail(), other$email = other.getEmail();
		if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email))
			return false;
		Object this$phone = getPhone(), other$phone = other.getPhone();
		if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		if (getLangId() != other.getLangId())
			return false;
		Object this$diseCode = getDiseCode(), other$diseCode = other.getDiseCode();
		if ((this$diseCode == null) ? (other$diseCode != null) : !this$diseCode.equals(other$diseCode))
			return false;
		Object this$dateFormat = getDateFormat(), other$dateFormat = other.getDateFormat();
		if ((this$dateFormat == null) ? (other$dateFormat != null) : !this$dateFormat.equals(other$dateFormat))
			return false;
		Object this$timeFormat = getTimeFormat(), other$timeFormat = other.getTimeFormat();
		if ((this$timeFormat == null) ? (other$timeFormat != null) : !this$timeFormat.equals(other$timeFormat))
			return false;
		Object this$currency = getCurrency(), other$currency = other.getCurrency();
		if ((this$currency == null) ? (other$currency != null) : !this$currency.equals(other$currency))
			return false;
		Object this$currencySymbol = getCurrencySymbol(), other$currencySymbol = other.getCurrencySymbol();
		if ((this$currencySymbol == null) ? (other$currencySymbol != null)
				: !this$currencySymbol.equals(other$currencySymbol))
			return false;
		Object this$isRtl = getIsRtl(), other$isRtl = other.getIsRtl();
		if ((this$isRtl == null) ? (other$isRtl != null) : !this$isRtl.equals(other$isRtl))
			return false;
		Object this$timezone = getTimezone(), other$timezone = other.getTimezone();
		if ((this$timezone == null) ? (other$timezone != null) : !this$timezone.equals(other$timezone))
			return false;
		if (getSessionId() != other.getSessionId())
			return false;
		Object this$startMonth = getStartMonth(), other$startMonth = other.getStartMonth();
		if ((this$startMonth == null) ? (other$startMonth != null) : !this$startMonth.equals(other$startMonth))
			return false;
		Object this$image = getImage(), other$image = other.getImage();
		if ((this$image == null) ? (other$image != null) : !this$image.equals(other$image))
			return false;
		Object this$miniLogo = getMiniLogo(), other$miniLogo = other.getMiniLogo();
		if ((this$miniLogo == null) ? (other$miniLogo != null) : !this$miniLogo.equals(other$miniLogo))
			return false;
		Object this$theme = getTheme(), other$theme = other.getTheme();
		if ((this$theme == null) ? (other$theme != null) : !this$theme.equals(other$theme))
			return false;
		Object this$creditLimit = getCreditLimit(), other$creditLimit = other.getCreditLimit();
		if ((this$creditLimit == null) ? (other$creditLimit != null) : !this$creditLimit.equals(other$creditLimit))
			return false;
		Object this$opdRecordMonth = getOpdRecordMonth(), other$opdRecordMonth = other.getOpdRecordMonth();
		if ((this$opdRecordMonth == null) ? (other$opdRecordMonth != null)
				: !this$opdRecordMonth.equals(other$opdRecordMonth))
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
		Object this$cronSecretKey = getCronSecretKey(), other$cronSecretKey = other.getCronSecretKey();
		if ((this$cronSecretKey == null) ? (other$cronSecretKey != null)
				: !this$cronSecretKey.equals(other$cronSecretKey))
			return false;
		if (getFeeDueDays() != other.getFeeDueDays())
			return false;
		Object this$classTeacher = getClassTeacher(), other$classTeacher = other.getClassTeacher();
		return !((this$classTeacher == null) ? (other$classTeacher != null)
				: !this$classTeacher.equals(other$classTeacher));
	}

	protected boolean canEqual(Object other) {
		return other instanceof SchSettings;
	}

	

	public String toString() {
		return "SchSettings(id=" + getId() + ", name=" + getName() + ", email=" + getEmail() + ", phone=" + getPhone()
				+ ", address=" + getAddress() + ", langId=" + getLangId() + ", diseCode=" + getDiseCode()
				+ ", dateFormat=" + getDateFormat() + ", timeFormat=" + getTimeFormat() + ", currency=" + getCurrency()
				+ ", currencySymbol=" + getCurrencySymbol() + ", isRtl=" + getIsRtl() + ", timezone=" + getTimezone()
				+ ", sessionId=" + getSessionId() + ", startMonth=" + getStartMonth() + ", image=" + getImage()
				+ ", miniLogo=" + getMiniLogo() + ", theme=" + getTheme() + ", creditLimit=" + getCreditLimit()
				+ ", opdRecordMonth=" + getOpdRecordMonth() + ", isActive=" + getIsActive() + ", createdAt="
				+ getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ", cronSecretKey=" + getCronSecretKey()
				+ ", feeDueDays=" + getFeeDueDays() + ", classTeacher=" + getClassTeacher() + ")";
	}

	public SchSettings(int id, String name, String email, String phone, String address, int langId, String diseCode,
			String dateFormat, String timeFormat, String currency, String currencySymbol, String isRtl, String timezone,
			int sessionId, String startMonth, String image, String miniLogo, String theme, String creditLimit,
			String opdRecordMonth, String isActive, String createdAt, String updatedAt, String cronSecretKey,
			int feeDueDays, String classTeacher) {
		/* 15 */ this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.langId = langId;
		this.diseCode = diseCode;
		this.dateFormat = dateFormat;
		this.timeFormat = timeFormat;
		this.currency = currency;
		this.currencySymbol = currencySymbol;
		this.isRtl = isRtl;
		this.timezone = timezone;
		this.sessionId = sessionId;
		this.startMonth = startMonth;
		this.image = image;
		this.miniLogo = miniLogo;
		this.theme = theme;
		this.creditLimit = creditLimit;
		this.opdRecordMonth = opdRecordMonth;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.cronSecretKey = cronSecretKey;
		this.feeDueDays = feeDueDays;
		this.classTeacher = classTeacher;
		/*    */ }

	/*    */
	/*    */ public SchSettings() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getName() {
		return this.name;
	}

	/* 23 */ public String getEmail() {
		return this.email;
	}

	/* 24 */ public String getPhone() {
		return this.phone;
	}

	/* 25 */ public String getAddress() {
		return this.address;
	}

	/* 26 */ public int getLangId() {
		return this.langId;
	}

	/* 27 */ public String getDiseCode() {
		return this.diseCode;
	}

	/* 28 */ public String getDateFormat() {
		return this.dateFormat;
	}

	/* 29 */ public String getTimeFormat() {
		return this.timeFormat;
	}

	/* 30 */ public String getCurrency() {
		return this.currency;
	}

	/* 31 */ public String getCurrencySymbol() {
		return this.currencySymbol;
	}

	/* 32 */ public String getIsRtl() {
		return this.isRtl;
	}

	/* 33 */ public String getTimezone() {
		return this.timezone;
	}

	/* 34 */ public int getSessionId() {
		return this.sessionId;
	}

	/* 35 */ public String getStartMonth() {
		return this.startMonth;
	}

	/* 36 */ public String getImage() {
		return this.image;
	}

	/* 37 */ public String getMiniLogo() {
		return this.miniLogo;
	}

	/* 38 */ public String getTheme() {
		return this.theme;
	}

	/* 39 */ public String getCreditLimit() {
		return this.creditLimit;
	}

	/* 40 */ public String getOpdRecordMonth() {
		return this.opdRecordMonth;
	}

	/* 41 */ public String getIsActive() {
		return this.isActive;
	}

	/* 42 */ public String getCreatedAt() {
		return this.createdAt;
	}

	/* 43 */ public String getUpdatedAt() {
		return this.updatedAt;
	}

	/* 44 */ public String getCronSecretKey() {
		return this.cronSecretKey;
	}

	/* 45 */ public int getFeeDueDays() {
		return this.feeDueDays;
	}

	public String getClassTeacher() {
		/* 46 */ return this.classTeacher;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * SchSettings.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */