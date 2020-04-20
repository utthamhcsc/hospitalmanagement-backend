/*    */
package com.hms.management.model;

/*    */
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;

/*    */ import javax.persistence.CascadeType;
/*    */ import javax.persistence.Entity;
import javax.persistence.FetchType;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
import javax.persistence.JoinColumn;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "setting_charges")
/*    */ public class Setting_Charges {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String chargeType;
	/*    */ private String chargeCategory;

	/*    */
	/* 21 */ public void setId(int id) {
		this.id = id;
	}

	private String code;
	private String standardCharge;
	private String description;

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
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

	public void setDescription(String description) {
		this.description = description;
	}

	public void setOrganisationCharges(List<OrganisationsCharges> organisationCharges) {
		this.organisationCharges = organisationCharges;
	}

	protected boolean canEqual(Object other) {
		return other instanceof Setting_Charges;
	}

	

	public String toString() {
		return "Setting_Charges(id=" + getId() + ", chargeType=" + getChargeType() + ", chargeCategory="
				+ getChargeCategory() + ", code=" + getCode() + ", standardCharge=" + getStandardCharge()
				+ ", description=" + getDescription() + ", organisationCharges=" + getOrganisationCharges() + ")";
	}

	public Setting_Charges(int id, String chargeType, String chargeCategory, String code, String standardCharge,
			String description, List<OrganisationsCharges> organisationCharges) {
		/* 22 */ this.id = id;
		this.chargeType = chargeType;
		this.chargeCategory = chargeCategory;
		this.code = code;
		this.standardCharge = standardCharge;
		this.description = description;
		this.organisationCharges = organisationCharges;
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 29 */ return this.id;
		/* 30 */ }

	public String getChargeType() {
		return this.chargeType;
	}

	/* 31 */ public String getChargeCategory() {
		return this.chargeCategory;
	}

	/* 32 */ public String getCode() {
		return this.code;
	}

	/* 33 */ public String getStandardCharge() {
		return this.standardCharge;
	}

	/* 34 */ public String getDescription() {
		return this.description;
	}

	@OneToMany(targetEntity = OrganisationsCharges.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "pid", referencedColumnName = "id", insertable = true, updatable = true, nullable = false)
	/* 35 */ private List<OrganisationsCharges> organisationCharges = new ArrayList<>();

	/*    */ public List<OrganisationsCharges> getOrganisationCharges() {
		/* 37 */ return this.organisationCharges;
		/*    */ }

	/*    */
	/*    */ public Setting_Charges() {
	}
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * Setting_Charges.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */