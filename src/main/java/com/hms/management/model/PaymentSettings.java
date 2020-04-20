/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "payment_settings")
/*    */ public class PaymentSettings {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String paymentType;
	/*    */ private String apiUsername;
	/*    */ private String apiSecretKey;
	/*    */ private String salt;
	/*    */ private String apiPublishableKey;
	/*    */ private String apiPassword;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String apiSignature;
	private String apiEmail;
	private String paypalDemo;
	private String accountNo;
	private String isActive;
	private String createdAt;
	private String updatedAt;

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public void setApiUsername(String apiUsername) {
		this.apiUsername = apiUsername;
	}

	public void setApiSecretKey(String apiSecretKey) {
		this.apiSecretKey = apiSecretKey;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public void setApiPublishableKey(String apiPublishableKey) {
		this.apiPublishableKey = apiPublishableKey;
	}

	public void setApiPassword(String apiPassword) {
		this.apiPassword = apiPassword;
	}

	public void setApiSignature(String apiSignature) {
		this.apiSignature = apiSignature;
	}

	public void setApiEmail(String apiEmail) {
		this.apiEmail = apiEmail;
	}

	public void setPaypalDemo(String paypalDemo) {
		this.paypalDemo = paypalDemo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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
		if (!(o instanceof PaymentSettings))
			return false;
		PaymentSettings other = (PaymentSettings) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$paymentType = getPaymentType(), other$paymentType = other.getPaymentType();
		if ((this$paymentType == null) ? (other$paymentType != null) : !this$paymentType.equals(other$paymentType))
			return false;
		Object this$apiUsername = getApiUsername(), other$apiUsername = other.getApiUsername();
		if ((this$apiUsername == null) ? (other$apiUsername != null) : !this$apiUsername.equals(other$apiUsername))
			return false;
		Object this$apiSecretKey = getApiSecretKey(), other$apiSecretKey = other.getApiSecretKey();
		if ((this$apiSecretKey == null) ? (other$apiSecretKey != null) : !this$apiSecretKey.equals(other$apiSecretKey))
			return false;
		Object this$salt = getSalt(), other$salt = other.getSalt();
		if ((this$salt == null) ? (other$salt != null) : !this$salt.equals(other$salt))
			return false;
		Object this$apiPublishableKey = getApiPublishableKey(), other$apiPublishableKey = other.getApiPublishableKey();
		if ((this$apiPublishableKey == null) ? (other$apiPublishableKey != null)
				: !this$apiPublishableKey.equals(other$apiPublishableKey))
			return false;
		Object this$apiPassword = getApiPassword(), other$apiPassword = other.getApiPassword();
		if ((this$apiPassword == null) ? (other$apiPassword != null) : !this$apiPassword.equals(other$apiPassword))
			return false;
		Object this$apiSignature = getApiSignature(), other$apiSignature = other.getApiSignature();
		if ((this$apiSignature == null) ? (other$apiSignature != null) : !this$apiSignature.equals(other$apiSignature))
			return false;
		Object this$apiEmail = getApiEmail(), other$apiEmail = other.getApiEmail();
		if ((this$apiEmail == null) ? (other$apiEmail != null) : !this$apiEmail.equals(other$apiEmail))
			return false;
		Object this$paypalDemo = getPaypalDemo(), other$paypalDemo = other.getPaypalDemo();
		if ((this$paypalDemo == null) ? (other$paypalDemo != null) : !this$paypalDemo.equals(other$paypalDemo))
			return false;
		Object this$accountNo = getAccountNo(), other$accountNo = other.getAccountNo();
		if ((this$accountNo == null) ? (other$accountNo != null) : !this$accountNo.equals(other$accountNo))
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
		return other instanceof PaymentSettings;
	}

	

	public String toString() {
		return "PaymentSettings(id=" + getId() + ", paymentType=" + getPaymentType() + ", apiUsername="
				+ getApiUsername() + ", apiSecretKey=" + getApiSecretKey() + ", salt=" + getSalt()
				+ ", apiPublishableKey=" + getApiPublishableKey() + ", apiPassword=" + getApiPassword()
				+ ", apiSignature=" + getApiSignature() + ", apiEmail=" + getApiEmail() + ", paypalDemo="
				+ getPaypalDemo() + ", accountNo=" + getAccountNo() + ", isActive=" + getIsActive() + ", createdAt="
				+ getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public PaymentSettings(int id, String paymentType, String apiUsername, String apiSecretKey, String salt,
			String apiPublishableKey, String apiPassword, String apiSignature, String apiEmail, String paypalDemo,
			String accountNo, String isActive, String createdAt, String updatedAt) {
		/* 15 */ this.id = id;
		this.paymentType = paymentType;
		this.apiUsername = apiUsername;
		this.apiSecretKey = apiSecretKey;
		this.salt = salt;
		this.apiPublishableKey = apiPublishableKey;
		this.apiPassword = apiPassword;
		this.apiSignature = apiSignature;
		this.apiEmail = apiEmail;
		this.paypalDemo = paypalDemo;
		this.accountNo = accountNo;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public PaymentSettings() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getPaymentType() {
		return this.paymentType;
	}

	/* 24 */ public String getApiUsername() {
		return this.apiUsername;
	}

	/* 25 */ public String getApiSecretKey() {
		return this.apiSecretKey;
	}

	/* 26 */ public String getSalt() {
		return this.salt;
	}

	/* 27 */ public String getApiPublishableKey() {
		return this.apiPublishableKey;
	}

	/* 28 */ public String getApiPassword() {
		return this.apiPassword;
	}

	/* 29 */ public String getApiSignature() {
		return this.apiSignature;
	}

	/* 30 */ public String getApiEmail() {
		return this.apiEmail;
	}

	/* 31 */ public String getPaypalDemo() {
		return this.paypalDemo;
	}

	/* 32 */ public String getAccountNo() {
		return this.accountNo;
	}

	/* 33 */ public String getIsActive() {
		return this.isActive;
	}

	/* 34 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 35 */ return this.updatedAt;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PaymentSettings.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */