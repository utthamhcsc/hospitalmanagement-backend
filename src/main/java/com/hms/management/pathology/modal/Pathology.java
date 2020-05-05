
package com.hms.management.pathology.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "pathology")
public class Pathology {

	@Id
	@GeneratedValue
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public int getReportDays() {
		return reportDays;
	}
	public void setReportDays(int reportDays) {
		this.reportDays = reportDays;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getChargeCategory() {
		return chargeCategory;
	}
	public void setChargeCategory(String chargeCategory) {
		this.chargeCategory = chargeCategory;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public float getStandardCharge() {
		return standardCharge;
	}
	public void setStandardCharge(float standardCharge) {
		this.standardCharge = standardCharge;
	}
	public Pathology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pathology(int id, String testName, String shortName, String testType, int category, int unit,
			String subCategory, int reportDays, String method, String chargeCategory, String code,
			float standardCharge) {
		super();
		this.id = id;
		this.testName = testName;
		this.shortName = shortName;
		this.testType = testType;
		this.category = category;
		this.unit = unit;
		this.subCategory = subCategory;
		this.reportDays = reportDays;
		this.method = method;
		this.chargeCategory = chargeCategory;
		this.code = code;
		this.standardCharge = standardCharge;
	}
	private String testName;
	private String shortName;
	private String testType;
	private int category;
	private int unit;
	private String subCategory;
	private int reportDays;
	private String method;
	private String chargeCategory;
	private String code;
	private float standardCharge;
	
	

}
