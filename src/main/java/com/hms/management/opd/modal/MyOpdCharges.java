/*    */
package com.hms.management.opd.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*    */ @Table(name = "myopdcharges")
/*    */ public class MyOpdCharges {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String opdId;
	/*    */ private String chargeType;
	/*    */ private String chargeCategory;
	/*    */ private String description;

	/*    */
	/*    */ public MyOpdCharges(int id, String opdId, String chargeType, String chargeCategory, String description,
			String code, float standardCharge, String date, String status, float tpaCharge, float appliedCharge) {
		/* 12 */ this.id = id;
		this.opdId = opdId;
		this.chargeType = chargeType;
		this.chargeCategory = chargeCategory;
		this.description = description;
		this.code = code;
		this.standardCharge = standardCharge;
		this.date = date;
		this.status = status;
		this.tpaCharge = tpaCharge;
		this.appliedCharge = appliedCharge;
		/*    */ }

	private String code;
	private float standardCharge;
	private String date;
	private String status;
	private float tpaCharge;
	private float appliedCharge;

	public MyOpdCharges() {
	}

	/*    */ public void setId(int id) {
		/* 15 */ this.id = id;
	}

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

	public void setStandardCharge(float standardCharge) {
		this.standardCharge = standardCharge;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTpaCharge(float tpaCharge) {
		this.tpaCharge = tpaCharge;
	}

	public void setAppliedCharge(float appliedCharge) {
		this.appliedCharge = appliedCharge;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof MyOpdCharges))
			return false;
		MyOpdCharges other = (MyOpdCharges) o;
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
		if (Float.compare(getStandardCharge(), other.getStandardCharge()) != 0)
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$status = getStatus(), other$status = other.getStatus();
		return ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) ? false
				: ((Float.compare(getTpaCharge(), other.getTpaCharge()) != 0) ? false
						: (!(Float.compare(getAppliedCharge(), other.getAppliedCharge()) != 0)));
	}

	protected boolean canEqual(Object other) {
		return other instanceof MyOpdCharges;
	}

	

	public String toString() {
		return "MyOpdCharges(id=" + getId() + ", opdId=" + getOpdId() + ", chargeType=" + getChargeType()
				+ ", chargeCategory=" + getChargeCategory() + ", description=" + getDescription() + ", code="
				+ getCode() + ", standardCharge=" + getStandardCharge() + ", date=" + getDate() + ", status="
				+ getStatus() + ", tpaCharge=" + getTpaCharge() + ", appliedCharge=" + getAppliedCharge() + ")";
	}

	/*    */
	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 20 */ return this.id;
		/* 21 */ }

	public String getOpdId() {
		return this.opdId;
	}

	/* 22 */ public String getChargeType() {
		return this.chargeType;
	}

	/* 23 */ public String getChargeCategory() {
		return this.chargeCategory;
	}

	/* 24 */ public String getDescription() {
		return this.description;
	}

	/* 25 */ public String getCode() {
		return this.code;
	}

	/* 26 */ public float getStandardCharge() {
		return this.standardCharge;
	}

	/* 27 */ public String getDate() {
		return this.date;
	}

	/* 28 */ public String getStatus() {
		return this.status;
	}

	/* 29 */ public float getTpaCharge() {
		return this.tpaCharge;
	}

	public float getAppliedCharge() {
		/* 30 */ return this.appliedCharge;
		/*    */ }
}

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\modal\
 * MyOpdCharges.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */