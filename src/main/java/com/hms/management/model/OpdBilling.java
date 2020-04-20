/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "opd_billing")
/*    */ public class OpdBilling {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int patientId;
	/*    */ private int discount;
	/*    */ private float totalCharges;
	/*    */ private String otherCharge;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String date;
	private float tax;
	private float grossTotal;
	private float netAmount;
	private float totalAmount;
	private String status;

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public void setTotalCharges(float totalCharges) {
		this.totalCharges = totalCharges;
	}

	public void setOtherCharge(String otherCharge) {
		this.otherCharge = otherCharge;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public void setGrossTotal(float grossTotal) {
		this.grossTotal = grossTotal;
	}

	public void setNetAmount(float netAmount) {
		this.netAmount = netAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof OpdBilling))
			return false;
		OpdBilling other = (OpdBilling) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPatientId() != other.getPatientId())
			return false;
		if (getDiscount() != other.getDiscount())
			return false;
		if (Float.compare(getTotalCharges(), other.getTotalCharges()) != 0)
			return false;
		Object this$otherCharge = getOtherCharge(), other$otherCharge = other.getOtherCharge();
		if ((this$otherCharge == null) ? (other$otherCharge != null) : !this$otherCharge.equals(other$otherCharge))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		if (Float.compare(getTax(), other.getTax()) != 0)
			return false;
		if (Float.compare(getGrossTotal(), other.getGrossTotal()) != 0)
			return false;
		if (Float.compare(getNetAmount(), other.getNetAmount()) != 0)
			return false;
		if (Float.compare(getTotalAmount(), other.getTotalAmount()) != 0)
			return false;
		Object this$status = getStatus(), other$status = other.getStatus();
		return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status));
	}

	protected boolean canEqual(Object other) {
		return other instanceof OpdBilling;
	}

	public String toString() {
		return "OpdBilling(id=" + getId() + ", patientId=" + getPatientId() + ", discount=" + getDiscount()
				+ ", totalCharges=" + getTotalCharges() + ", otherCharge=" + getOtherCharge() + ", date=" + getDate()
				+ ", tax=" + getTax() + ", grossTotal=" + getGrossTotal() + ", netAmount=" + getNetAmount()
				+ ", totalAmount=" + getTotalAmount() + ", status=" + getStatus() + ")";
	}

	public OpdBilling(int id, int patientId, int discount, float totalCharges, String otherCharge, String date,
			float tax, float grossTotal, float netAmount, float totalAmount, String status) {
		/* 15 */ this.id = id;
		this.patientId = patientId;
		this.discount = discount;
		this.totalCharges = totalCharges;
		this.otherCharge = otherCharge;
		this.date = date;
		this.tax = tax;
		this.grossTotal = grossTotal;
		this.netAmount = netAmount;
		this.totalAmount = totalAmount;
		this.status = status;
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */ public OpdBilling() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getPatientId() {
		return this.patientId;
	}

	/* 26 */ public int getDiscount() {
		return this.discount;
	}

	/* 27 */ public float getTotalCharges() {
		return this.totalCharges;
	}

	/* 28 */ public String getOtherCharge() {
		return this.otherCharge;
	}

	/* 29 */ public String getDate() {
		return this.date;
	}

	/* 30 */ public float getTax() {
		return this.tax;
	}

	/* 31 */ public float getGrossTotal() {
		return this.grossTotal;
	}

	/* 32 */ public float getNetAmount() {
		return this.netAmount;
	}

	/* 33 */ public float getTotalAmount() {
		return this.totalAmount;
	}

	public String getStatus() {
		/* 34 */ return this.status;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\OpdBilling
 * .class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */