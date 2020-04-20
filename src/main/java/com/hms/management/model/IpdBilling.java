/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "ipd_billing")
/*    */ public class IpdBilling {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String patientId;
	/*    */ private float discount;
	/*    */ private float otherCharge;
	/*    */ private String date;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private float tax;
	private float grossTotal;
	private float netAmount;
	private float totalAmount;
	private String generatedBy;
	private String status;

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public void setOtherCharge(float otherCharge) {
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

	public void setGeneratedBy(String generatedBy) {
		this.generatedBy = generatedBy;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof IpdBilling))
			return false;
		IpdBilling other = (IpdBilling) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$patientId = getPatientId(), other$patientId = other.getPatientId();
		if ((this$patientId == null) ? (other$patientId != null) : !this$patientId.equals(other$patientId))
			return false;
		if (Float.compare(getDiscount(), other.getDiscount()) != 0)
			return false;
		if (Float.compare(getOtherCharge(), other.getOtherCharge()) != 0)
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
		Object this$generatedBy = getGeneratedBy(), other$generatedBy = other.getGeneratedBy();
		if ((this$generatedBy == null) ? (other$generatedBy != null) : !this$generatedBy.equals(other$generatedBy))
			return false;
		Object this$status = getStatus(), other$status = other.getStatus();
		return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status));
	}

	protected boolean canEqual(Object other) {
		return other instanceof IpdBilling;
	}


	public String toString() {
		return "IpdBilling(id=" + getId() + ", patientId=" + getPatientId() + ", discount=" + getDiscount()
				+ ", otherCharge=" + getOtherCharge() + ", date=" + getDate() + ", tax=" + getTax() + ", grossTotal="
				+ getGrossTotal() + ", netAmount=" + getNetAmount() + ", totalAmount=" + getTotalAmount()
				+ ", generatedBy=" + getGeneratedBy() + ", status=" + getStatus() + ")";
	}

	public IpdBilling(int id, String patientId, float discount, float otherCharge, String date, float tax,
			float grossTotal, float netAmount, float totalAmount, String generatedBy, String status) {
		/* 15 */ this.id = id;
		this.patientId = patientId;
		this.discount = discount;
		this.otherCharge = otherCharge;
		this.date = date;
		this.tax = tax;
		this.grossTotal = grossTotal;
		this.netAmount = netAmount;
		this.totalAmount = totalAmount;
		this.generatedBy = generatedBy;
		this.status = status;
		/*    */ }

	/*    */
	/*    */ public IpdBilling() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getPatientId() {
		return this.patientId;
	}

	/* 24 */ public float getDiscount() {
		return this.discount;
	}

	/* 25 */ public float getOtherCharge() {
		return this.otherCharge;
	}

	/* 26 */ public String getDate() {
		return this.date;
	}

	/* 27 */ public float getTax() {
		return this.tax;
	}

	/* 28 */ public float getGrossTotal() {
		return this.grossTotal;
	}

	/* 29 */ public float getNetAmount() {
		return this.netAmount;
	}

	/* 30 */ public float getTotalAmount() {
		return this.totalAmount;
	}

	/* 31 */ public String getGeneratedBy() {
		return this.generatedBy;
	}

	public String getStatus() {
		/* 32 */ return this.status;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\IpdBilling
 * .class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */