/*    */
package com.hms.management.model;

import javax.persistence.Entity;
/*    */
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "payslip_allowance")
/*    */ public class PayslipAllowance {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int payslipId;
	/*    */ private String allowanceType;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private int amount;
	private int staffId;
	private String calType;

	public void setPayslipId(int payslipId) {
		this.payslipId = payslipId;
	}

	public void setAllowanceType(String allowanceType) {
		this.allowanceType = allowanceType;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public void setCalType(String calType) {
		this.calType = calType;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PayslipAllowance))
			return false;
		PayslipAllowance other = (PayslipAllowance) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPayslipId() != other.getPayslipId())
			return false;
		Object this$allowanceType = getAllowanceType(), other$allowanceType = other.getAllowanceType();
		if ((this$allowanceType == null) ? (other$allowanceType != null)
				: !this$allowanceType.equals(other$allowanceType))
			return false;
		if (getAmount() != other.getAmount())
			return false;
		if (getStaffId() != other.getStaffId())
			return false;
		Object this$calType = getCalType(), other$calType = other.getCalType();
		return !((this$calType == null) ? (other$calType != null) : !this$calType.equals(other$calType));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PayslipAllowance;
	}

	
	public String toString() {
		return "PayslipAllowance(id=" + getId() + ", payslipId=" + getPayslipId() + ", allowanceType="
				+ getAllowanceType() + ", amount=" + getAmount() + ", staffId=" + getStaffId() + ", calType="
				+ getCalType() + ")";
	}

	public PayslipAllowance(int id, int payslipId, String allowanceType, int amount, int staffId, String calType) {
		/* 15 */ this.id = id;
		this.payslipId = payslipId;
		this.allowanceType = allowanceType;
		this.amount = amount;
		this.staffId = staffId;
		this.calType = calType;
		/*    */ }

	/*    */
	/*    */ public PayslipAllowance() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public int getPayslipId() {
		return this.payslipId;
	}

	/* 24 */ public String getAllowanceType() {
		return this.allowanceType;
	}

	/* 25 */ public int getAmount() {
		return this.amount;
	}

	/* 26 */ public int getStaffId() {
		return this.staffId;
	}

	public String getCalType() {
		/* 27 */ return this.calType;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PayslipAllowance.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */