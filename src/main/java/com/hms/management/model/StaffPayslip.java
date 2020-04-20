/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "staff_payslip")
/*    */ public class StaffPayslip {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int staffId;
	/*    */ private int basic;
	/*    */ private int totalAllowance;
	/*    */ private int totalDeduction;
	/*    */ private int leaveDeduction;
	/*    */ private String tax;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private float netSalary;
	private String status;
	private String month;
	private String year;
	private String paymentMode;
	private String paymentDate;
	private String remark;

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public void setTotalAllowance(int totalAllowance) {
		this.totalAllowance = totalAllowance;
	}

	public void setTotalDeduction(int totalDeduction) {
		this.totalDeduction = totalDeduction;
	}

	public void setLeaveDeduction(int leaveDeduction) {
		this.leaveDeduction = leaveDeduction;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof StaffPayslip))
			return false;
		StaffPayslip other = (StaffPayslip) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getStaffId() != other.getStaffId())
			return false;
		if (getBasic() != other.getBasic())
			return false;
		if (getTotalAllowance() != other.getTotalAllowance())
			return false;
		if (getTotalDeduction() != other.getTotalDeduction())
			return false;
		if (getLeaveDeduction() != other.getLeaveDeduction())
			return false;
		Object this$tax = getTax(), other$tax = other.getTax();
		if ((this$tax == null) ? (other$tax != null) : !this$tax.equals(other$tax))
			return false;
		if (Float.compare(getNetSalary(), other.getNetSalary()) != 0)
			return false;
		Object this$status = getStatus(), other$status = other.getStatus();
		if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status))
			return false;
		Object this$month = getMonth(), other$month = other.getMonth();
		if ((this$month == null) ? (other$month != null) : !this$month.equals(other$month))
			return false;
		Object this$year = getYear(), other$year = other.getYear();
		if ((this$year == null) ? (other$year != null) : !this$year.equals(other$year))
			return false;
		Object this$paymentMode = getPaymentMode(), other$paymentMode = other.getPaymentMode();
		if ((this$paymentMode == null) ? (other$paymentMode != null) : !this$paymentMode.equals(other$paymentMode))
			return false;
		Object this$paymentDate = getPaymentDate(), other$paymentDate = other.getPaymentDate();
		if ((this$paymentDate == null) ? (other$paymentDate != null) : !this$paymentDate.equals(other$paymentDate))
			return false;
		Object this$remark = getRemark(), other$remark = other.getRemark();
		return !((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark));
	}

	protected boolean canEqual(Object other) {
		return other instanceof StaffPayslip;
	}

	

	public String toString() {
		return "StaffPayslip(id=" + getId() + ", staffId=" + getStaffId() + ", basic=" + getBasic()
				+ ", totalAllowance=" + getTotalAllowance() + ", totalDeduction=" + getTotalDeduction()
				+ ", leaveDeduction=" + getLeaveDeduction() + ", tax=" + getTax() + ", netSalary=" + getNetSalary()
				+ ", status=" + getStatus() + ", month=" + getMonth() + ", year=" + getYear() + ", paymentMode="
				+ getPaymentMode() + ", paymentDate=" + getPaymentDate() + ", remark=" + getRemark() + ")";
	}

	public StaffPayslip(int id, int staffId, int basic, int totalAllowance, int totalDeduction, int leaveDeduction,
			String tax, float netSalary, String status, String month, String year, String paymentMode,
			String paymentDate, String remark) {
		/* 17 */ this.id = id;
		this.staffId = staffId;
		this.basic = basic;
		this.totalAllowance = totalAllowance;
		this.totalDeduction = totalDeduction;
		this.leaveDeduction = leaveDeduction;
		this.tax = tax;
		this.netSalary = netSalary;
		this.status = status;
		this.month = month;
		this.year = year;
		this.paymentMode = paymentMode;
		this.paymentDate = paymentDate;
		this.remark = remark;
		/*    */ }

	/*    */
	/*    */
	/*    */ public StaffPayslip() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 25 */ return this.id;
		/* 26 */ }

	public int getStaffId() {
		return this.staffId;
	}

	/* 27 */ public int getBasic() {
		return this.basic;
	}

	/* 28 */ public int getTotalAllowance() {
		return this.totalAllowance;
	}

	/* 29 */ public int getTotalDeduction() {
		return this.totalDeduction;
	}

	/* 30 */ public int getLeaveDeduction() {
		return this.leaveDeduction;
	}

	/* 31 */ public String getTax() {
		return this.tax;
	}

	/* 32 */ public float getNetSalary() {
		return this.netSalary;
	}

	/* 33 */ public String getStatus() {
		return this.status;
	}

	/* 34 */ public String getMonth() {
		return this.month;
	}

	/* 35 */ public String getYear() {
		return this.year;
	}

	/* 36 */ public String getPaymentMode() {
		return this.paymentMode;
	}

	/* 37 */ public String getPaymentDate() {
		return this.paymentDate;
	}

	public String getRemark() {
		/* 38 */ return this.remark;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * StaffPayslip.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */