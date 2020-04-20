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
/*    */ @Table(name = "pathology")
/*    */ public class Pathology {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String patientId;
	/*    */ private String testName;
	/*    */ private String shortName;
	/*    */ private String testType;
	/*    */ private String categoryName;
	/*    */ private String unit;

	/*    */
	/* 17 */ public void setId(int id) {
		this.id = id;
	}

	private String subCategory;
	private String reportDays;
	private String method;
	private String chargeCategory;
	private String code;
	private String standardCharge;
	private Date createdAt;
	private Date updatedAt;

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public void setReportDays(String reportDays) {
		this.reportDays = reportDays;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void setChargeCategory(String chargeCategory) {
		this.chargeCategory = chargeCategory;
	}

	public void setCode(String code) {
		this.code = code;
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
		if (!(o instanceof Pathology))
			return false;
		Pathology other = (Pathology) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$patientId = getPatientId(), other$patientId = other.getPatientId();
		if ((this$patientId == null) ? (other$patientId != null) : !this$patientId.equals(other$patientId))
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
		Object this$categoryName = getCategoryName(), other$categoryName = other.getCategoryName();
		if ((this$categoryName == null) ? (other$categoryName != null) : !this$categoryName.equals(other$categoryName))
			return false;
		Object this$unit = getUnit(), other$unit = other.getUnit();
		if ((this$unit == null) ? (other$unit != null) : !this$unit.equals(other$unit))
			return false;
		Object this$subCategory = getSubCategory(), other$subCategory = other.getSubCategory();
		if ((this$subCategory == null) ? (other$subCategory != null) : !this$subCategory.equals(other$subCategory))
			return false;
		Object this$reportDays = getReportDays(), other$reportDays = other.getReportDays();
		if ((this$reportDays == null) ? (other$reportDays != null) : !this$reportDays.equals(other$reportDays))
			return false;
		Object this$method = getMethod(), other$method = other.getMethod();
		if ((this$method == null) ? (other$method != null) : !this$method.equals(other$method))
			return false;
		Object this$chargeCategory = getChargeCategory(), other$chargeCategory = other.getChargeCategory();
		if ((this$chargeCategory == null) ? (other$chargeCategory != null)
				: !this$chargeCategory.equals(other$chargeCategory))
			return false;
		Object this$code = getCode(), other$code = other.getCode();
		if ((this$code == null) ? (other$code != null) : !this$code.equals(other$code))
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
		return other instanceof Pathology;
	}

	

	public String toString() {
		return "Pathology(id=" + getId() + ", patientId=" + getPatientId() + ", testName=" + getTestName()
				+ ", shortName=" + getShortName() + ", testType=" + getTestType() + ", categoryName="
				+ getCategoryName() + ", unit=" + getUnit() + ", subCategory=" + getSubCategory() + ", reportDays="
				+ getReportDays() + ", method=" + getMethod() + ", chargeCategory=" + getChargeCategory() + ", code="
				+ getCode() + ", standardCharge=" + getStandardCharge() + ", createdAt=" + getCreatedAt()
				+ ", updatedAt=" + getUpdatedAt() + ")";
	}

	public Pathology(int id, String patientId, String testName, String shortName, String testType, String categoryName,
			String unit, String subCategory, String reportDays, String method, String chargeCategory, String code,
			String standardCharge, Date createdAt, Date updatedAt) {
		/* 18 */ this.id = id;
		this.patientId = patientId;
		this.testName = testName;
		this.shortName = shortName;
		this.testType = testType;
		this.categoryName = categoryName;
		this.unit = unit;
		this.subCategory = subCategory;
		this.reportDays = reportDays;
		this.method = method;
		this.chargeCategory = chargeCategory;
		this.code = code;
		this.standardCharge = standardCharge;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public Pathology() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 25 */ return this.id;
		/* 26 */ }

	public String getPatientId() {
		return this.patientId;
	}

	/* 27 */ public String getTestName() {
		return this.testName;
	}

	/* 28 */ public String getShortName() {
		return this.shortName;
	}

	/* 29 */ public String getTestType() {
		return this.testType;
	}

	/* 30 */ public String getCategoryName() {
		return this.categoryName;
	}

	/* 31 */ public String getUnit() {
		return this.unit;
	}

	/* 32 */ public String getSubCategory() {
		return this.subCategory;
	}

	/* 33 */ public String getReportDays() {
		return this.reportDays;
	}

	/* 34 */ public String getMethod() {
		return this.method;
	}

	/* 35 */ public String getChargeCategory() {
		return this.chargeCategory;
	}

	/* 36 */ public String getCode() {
		return this.code;
	}

	/* 37 */ public String getStandardCharge() {
		return this.standardCharge;
	}

	/* 38 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		/* 39 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Pathology.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */