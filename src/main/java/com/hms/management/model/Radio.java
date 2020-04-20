/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "radio")
/*    */ public class Radio {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String testName;
	/*    */ private String shortName;
	/*    */ private String testType;
	/*    */ private String radiologyCategoryId;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String subCategory;
	private String reportDays;
	private int chargeId;
	private String createdAt;
	private String updatedAt;

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public void setRadiologyCategoryId(String radiologyCategoryId) {
		this.radiologyCategoryId = radiologyCategoryId;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public void setReportDays(String reportDays) {
		this.reportDays = reportDays;
	}

	public void setChargeId(int chargeId) {
		this.chargeId = chargeId;
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
		if (!(o instanceof Radio))
			return false;
		Radio other = (Radio) o;
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
		Object this$radiologyCategoryId = getRadiologyCategoryId(),
				other$radiologyCategoryId = other.getRadiologyCategoryId();
		if ((this$radiologyCategoryId == null) ? (other$radiologyCategoryId != null)
				: !this$radiologyCategoryId.equals(other$radiologyCategoryId))
			return false;
		Object this$subCategory = getSubCategory(), other$subCategory = other.getSubCategory();
		if ((this$subCategory == null) ? (other$subCategory != null) : !this$subCategory.equals(other$subCategory))
			return false;
		Object this$reportDays = getReportDays(), other$reportDays = other.getReportDays();
		if ((this$reportDays == null) ? (other$reportDays != null) : !this$reportDays.equals(other$reportDays))
			return false;
		if (getChargeId() != other.getChargeId())
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Radio;
	}

	

	public String toString() {
		return "Radio(id=" + getId() + ", testName=" + getTestName() + ", shortName=" + getShortName() + ", testType="
				+ getTestType() + ", radiologyCategoryId=" + getRadiologyCategoryId() + ", subCategory="
				+ getSubCategory() + ", reportDays=" + getReportDays() + ", chargeId=" + getChargeId() + ", createdAt="
				+ getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public Radio(int id, String testName, String shortName, String testType, String radiologyCategoryId,
			String subCategory, String reportDays, int chargeId, String createdAt, String updatedAt) {
		/* 15 */ this.id = id;
		this.testName = testName;
		this.shortName = shortName;
		this.testType = testType;
		this.radiologyCategoryId = radiologyCategoryId;
		this.subCategory = subCategory;
		this.reportDays = reportDays;
		this.chargeId = chargeId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public Radio() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getTestName() {
		return this.testName;
	}

	/* 24 */ public String getShortName() {
		return this.shortName;
	}

	/* 25 */ public String getTestType() {
		return this.testType;
	}

	/* 26 */ public String getRadiologyCategoryId() {
		return this.radiologyCategoryId;
	}

	/* 27 */ public String getSubCategory() {
		return this.subCategory;
	}

	/* 28 */ public String getReportDays() {
		return this.reportDays;
	}

	/* 29 */ public int getChargeId() {
		return this.chargeId;
	}

	/* 30 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 31 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Radio.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */