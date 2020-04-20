/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "charges")
/*    */ public class Charges {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String opdId;
	/*    */ private String chargeType;
	/*    */ private String chargeCategory;
	/*    */ private String description;

	/*    */
	/* 17 */ public void setId(int id) {
		this.id = id;
	}

	private String code;
	private String standardCharge;
	private String date;
	private String appliedCharge;
	private String tpaCharge;
	private String status;

	public void setOpdId(String opdId) {
		this.opdId = opdId;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public void setChargeCategory(String chargeCategory) {
		this.chargeCategory = chargeCategory;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setStandardCharge(String standardCharge) {
		this.standardCharge = standardCharge;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setAppliedCharge(String appliedCharge) {
		this.appliedCharge = appliedCharge;
	}

	public void setTpaCharge(String tpaCharge) {
		this.tpaCharge = tpaCharge;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Charges))
			return false;
		Charges other = (Charges) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$opdId = getOpdId(), other$opdId = other.getOpdId();
		if ((this$opdId == null) ? (other$opdId != null) : !this$opdId.equals(other$opdId))
			return false;
		Object this$chargeType = getChargeType(), other$chargeType = other.getChargeType();
		if ((this$chargeType == null) ? (other$chargeType != null) : !this$chargeType.equals(other$chargeType))
			return false;
		Object this$chargeCategory = getChargeCategory(), other$chargeCategory = other.getChargeCategory();
		if ((this$chargeCategory == null) ? (other$chargeCategory != null)
				: !this$chargeCategory.equals(other$chargeCategory))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$code = getCode(), other$code = other.getCode();
		if ((this$code == null) ? (other$code != null) : !this$code.equals(other$code))
			return false;
		Object this$standardCharge = getStandardCharge(), other$standardCharge = other.getStandardCharge();
		if ((this$standardCharge == null) ? (other$standardCharge != null)
				: !this$standardCharge.equals(other$standardCharge))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$appliedCharge = getAppliedCharge(), other$appliedCharge = other.getAppliedCharge();
		if ((this$appliedCharge == null) ? (other$appliedCharge != null)
				: !this$appliedCharge.equals(other$appliedCharge))
			return false;
		Object this$tpaCharge = getTpaCharge(), other$tpaCharge = other.getTpaCharge();
		if ((this$tpaCharge == null) ? (other$tpaCharge != null) : !this$tpaCharge.equals(other$tpaCharge))
			return false;
		Object this$status = getStatus(), other$status = other.getStatus();
		return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Charges;
	}


	public String toString() {
		return "Charges(id=" + getId() + ", opdId=" + getOpdId() + ", chargeType=" + getChargeType()
				+ ", chargeCategory=" + getChargeCategory() + ", description=" + getDescription() + ", code="
				+ getCode() + ", standardCharge=" + getStandardCharge() + ", date=" + getDate() + ", appliedCharge="
				+ getAppliedCharge() + ", tpaCharge=" + getTpaCharge() + ", status=" + getStatus() + ")";
	}

	public Charges(int id, String opdId, String chargeType, String chargeCategory, String description, String code,
			String standardCharge, String date, String appliedCharge, String tpaCharge, String status) {
		/* 18 */ this.id = id;
		this.opdId = opdId;
		this.chargeType = chargeType;
		this.chargeCategory = chargeCategory;
		this.description = description;
		this.code = code;
		this.standardCharge = standardCharge;
		this.date = date;
		this.appliedCharge = appliedCharge;
		this.tpaCharge = tpaCharge;
		this.status = status;
		/*    */ }

	/*    */
	/*    */ public Charges() {
	}

	/*    */
	/*    */ public int getId() {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getOpdId() {
		return this.opdId;
	}

	/* 26 */ public String getChargeType() {
		return this.chargeType;
	}

	/* 27 */ public String getChargeCategory() {
		return this.chargeCategory;
	}

	/* 28 */ public String getDescription() {
		return this.description;
	}

	/* 29 */ public String getCode() {
		return this.code;
	}

	/* 30 */ public String getStandardCharge() {
		return this.standardCharge;
	}

	/* 31 */ public String getDate() {
		return this.date;
	}

	/* 32 */ public String getAppliedCharge() {
		return this.appliedCharge;
	}

	/* 33 */ public String getTpaCharge() {
		return this.tpaCharge;
	}

	public String getStatus() {
		/* 34 */ return this.status;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Charges.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */