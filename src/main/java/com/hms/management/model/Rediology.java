/*    */
package com.hms.management.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "Rediology")
/*    */ public class Rediology {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String testName;
	/*    */ private String shortName;
	/*    */ private String testType;
	/*    */ private String Code;
	/*    */ private String categoryName;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String subCategory;
	private String reportDays;
	private String chargeCategory;
	private String standardCharge;
	private Date createdAt;
	private Date updatedAt;

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public void setCode(String Code) {
		this.Code = Code;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public void setReportDays(String reportDays) {
		this.reportDays = reportDays;
	}

	public void setChargeCategory(String chargeCategory) {
		this.chargeCategory = chargeCategory;
	}

	public void setStandardCharge(String standardCharge) {
		this.standardCharge = standardCharge;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Rediology))
			return false;
		Rediology other = (Rediology) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$testName = getTestName(), other$testName = other.getTestName();
		if ((this$testName == null) ? (other$testName != null) : !this$testName.equals(other$testName))
			return false;
		Object this$shortName = getShortName(), other$shortName = other.getShortName();
		if ((this$shortName == null) ? (other$shortName != null) : !this$shortName.equals(other$shortName))
			return false;
		Object this$testType = getTestType(), other$testType = other.getTestType();
		if ((this$testType == null) ? (other$testType != null) : !this$testType.equals(other$testType))
			return false;
		Object this$Code = getCode(), other$Code = other.getCode();
		if ((this$Code == null) ? (other$Code != null) : !this$Code.equals(other$Code))
			return false;
		Object this$categoryName = getCategoryName(), other$categoryName = other.getCategoryName();
		if ((this$categoryName == null) ? (other$categoryName != null) : !this$categoryName.equals(other$categoryName))
			return false;
		Object this$subCategory = getSubCategory(), other$subCategory = other.getSubCategory();
		if ((this$subCategory == null) ? (other$subCategory != null) : !this$subCategory.equals(other$subCategory))
			return false;
		Object this$reportDays = getReportDays(), other$reportDays = other.getReportDays();
		if ((this$reportDays == null) ? (other$reportDays != null) : !this$reportDays.equals(other$reportDays))
			return false;
		Object this$chargeCategory = getChargeCategory(), other$chargeCategory = other.getChargeCategory();
		if ((this$chargeCategory == null) ? (other$chargeCategory != null)
				: !this$chargeCategory.equals(other$chargeCategory))
			return false;
		Object this$standardCharge = getStandardCharge(), other$standardCharge = other.getStandardCharge();
		if ((this$standardCharge == null) ? (other$standardCharge != null)
				: !this$standardCharge.equals(other$standardCharge))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Rediology;
	}

	

	public String toString() {
		return "Rediology(id=" + getId() + ", testName=" + getTestName() + ", shortName=" + getShortName()
				+ ", testType=" + getTestType() + ", Code=" + getCode() + ", categoryName=" + getCategoryName()
				+ ", subCategory=" + getSubCategory() + ", reportDays=" + getReportDays() + ", chargeCategory="
				+ getChargeCategory() + ", standardCharge=" + getStandardCharge() + ", createdAt=" + getCreatedAt()
				+ ", updatedAt=" + getUpdatedAt() + ")";
	}

	public Rediology(int id, String testName, String shortName, String testType, String Code, String categoryName,
			String subCategory, String reportDays, String chargeCategory, String standardCharge, Date createdAt,
			Date updatedAt) {
		/* 17 */ this.id = id;
		this.testName = testName;
		this.shortName = shortName;
		this.testType = testType;
		this.Code = Code;
		this.categoryName = categoryName;
		this.subCategory = subCategory;
		this.reportDays = reportDays;
		this.chargeCategory = chargeCategory;
		this.standardCharge = standardCharge;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */ public Rediology() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 26 */ return this.id;
		/* 27 */ }

	public String getTestName() {
		return this.testName;
	}

	/* 28 */ public String getShortName() {
		return this.shortName;
	}

	/* 29 */ public String getTestType() {
		return this.testType;
	}

	/* 30 */ public String getCode() {
		return this.Code;
	}

	/* 31 */ public String getCategoryName() {
		return this.categoryName;
	}

	/* 32 */ public String getSubCategory() {
		return this.subCategory;
	}

	/* 33 */ public String getReportDays() {
		return this.reportDays;
	}

	/* 34 */ public String getChargeCategory() {
		return this.chargeCategory;
	}

	/* 35 */ public String getStandardCharge() {
		return this.standardCharge;
	}

	/* 36 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		/* 37 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Rediology.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */