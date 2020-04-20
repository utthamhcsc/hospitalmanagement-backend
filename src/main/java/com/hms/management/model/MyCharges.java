/*    */
package com.hms.management.model;

/*    */
/*    */ import java.util.List;

/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
import javax.persistence.Table;
/*    */ import javax.persistence.Transient;

/*    */
/*    */ @Entity
/*    */ @Table(name = "mycharges")
/*    */ public class MyCharges {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int chargeTypeId;
	/*    */ private int chargeCategoryId;

	/*    */
	/* 18 */ public void setId(int id) {
		this.id = id;
	}

	private String description;
	private String code;
	private Float standardCharge;
	@Transient
	List<OrganisationsCharges> tpaCharges;

	public void setChargeTypeId(int chargeTypeId) {
		this.chargeTypeId = chargeTypeId;
	}

	public void setChargeCategoryId(int chargeCategoryId) {
		this.chargeCategoryId = chargeCategoryId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setStandardCharge(Float standardCharge) {
		this.standardCharge = standardCharge;
	}

	public void setTpaCharges(List<OrganisationsCharges> tpaCharges) {
		this.tpaCharges = tpaCharges;
	}


	protected boolean canEqual(Object other) {
		return other instanceof MyCharges;
	}


	public String toString() {
		return "MyCharges(id=" + getId() + ", chargeTypeId=" + getChargeTypeId() + ", chargeCategoryId="
				+ getChargeCategoryId() + ", description=" + getDescription() + ", code=" + getCode()
				+ ", standardCharge=" + getStandardCharge() + ", tpaCharges=" + getTpaCharges() + ")";
	}

	public MyCharges(int id, int chargeTypeId, int chargeCategoryId, String description, String code,
			Float standardCharge, List<OrganisationsCharges> tpaCharges) {
		/* 19 */ this.id = id;
		this.chargeTypeId = chargeTypeId;
		this.chargeCategoryId = chargeCategoryId;
		this.description = description;
		this.code = code;
		this.standardCharge = standardCharge;
		this.tpaCharges = tpaCharges;
		/*    */ }

	/*    */
	/*    */ public MyCharges() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 26 */ return this.id;
		/* 27 */ }

	public int getChargeTypeId() {
		return this.chargeTypeId;
	}

	public int getChargeCategoryId() {
		/* 28 */ return this.chargeCategoryId;
		/*    */ }

	/* 30 */ public String getDescription() {
		return this.description;
	}

	/* 31 */ public String getCode() {
		return this.code;
	}

	public Float getStandardCharge() {
		/* 32 */ return this.standardCharge;
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */ public List<OrganisationsCharges> getTpaCharges() {
		/* 38 */ return this.tpaCharges;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\MyCharges.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */