/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*    */ @Table(name = "BillSummery")
/*    */ public class BillSummery {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String opdId;
	/*    */ private float consultantCharge;
	/*    */ private float totalCharge;
	/*    */ private float otherCharge;
	/*    */ private float discount;

	/*    */
	/*    */ public BillSummery(int id, String opdId, float consultantCharge, float totalCharge, float otherCharge,
			float discount, float discountpercentage, float taxpercentage, float tax, float grosstotal,
			float totalPayment, float netPayableAmount) {
		/* 13 */ this.id = id;
		this.opdId = opdId;
		this.consultantCharge = consultantCharge;
		this.totalCharge = totalCharge;
		this.otherCharge = otherCharge;
		this.discount = discount;
		this.discountpercentage = discountpercentage;
		this.taxpercentage = taxpercentage;
		this.tax = tax;
		this.grosstotal = grosstotal;
		this.totalPayment = totalPayment;
		this.netPayableAmount = netPayableAmount;
		/*    */ }

	private float discountpercentage;
	private float taxpercentage;
	private float tax;
	private float grosstotal;
	private float totalPayment;
	private float netPayableAmount;

	public BillSummery() {
	}

	public void setId(int id) {
		/* 15 */ this.id = id;
	}

	public void setOpdId(String opdId) {
		this.opdId = opdId;
	}

	public void setConsultantCharge(float consultantCharge) {
		this.consultantCharge = consultantCharge;
	}

	public void setTotalCharge(float totalCharge) {
		this.totalCharge = totalCharge;
	}

	public void setOtherCharge(float otherCharge) {
		this.otherCharge = otherCharge;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public void setDiscountpercentage(float discountpercentage) {
		this.discountpercentage = discountpercentage;
	}

	public void setTaxpercentage(float taxpercentage) {
		this.taxpercentage = taxpercentage;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public void setGrosstotal(float grosstotal) {
		this.grosstotal = grosstotal;
	}

	public void setTotalPayment(float totalPayment) {
		this.totalPayment = totalPayment;
	}

	public void setNetPayableAmount(float netPayableAmount) {
		this.netPayableAmount = netPayableAmount;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof BillSummery))
			return false;
		BillSummery other = (BillSummery) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$opdId = getOpdId(), other$opdId = other.getOpdId();
		return ((this$opdId == null) ? (other$opdId != null) : !this$opdId.equals(other$opdId)) ? false
				: ((Float.compare(getConsultantCharge(), other.getConsultantCharge()) != 0) ? false
						: ((Float.compare(getTotalCharge(), other.getTotalCharge()) != 0) ? false
								: ((Float.compare(getOtherCharge(), other.getOtherCharge()) != 0) ? false
										: ((Float.compare(getDiscount(), other.getDiscount()) != 0) ? false
												: ((Float.compare(getDiscountpercentage(),
														other.getDiscountpercentage()) != 0)
																? false
																: ((Float.compare(getTaxpercentage(),
																		other.getTaxpercentage()) != 0)
																				? false
																				: ((Float.compare(getTax(),
																						other.getTax()) != 0)
																								? false
																								: ((Float.compare(
																										getGrosstotal(),
																										other.getGrosstotal()) != 0)
																												? false
																												: ((Float
																														.compare(
																																getTotalPayment(),
																																other.getTotalPayment()) != 0)
																																		? false
																																		: (!(Float
																																				.compare(
																																						getNetPayableAmount(),
																																						other.getNetPayableAmount()) != 0)))))))))));
	}

	protected boolean canEqual(Object other) {
		return other instanceof BillSummery;
	}


	public String toString() {
		return "BillSummery(id=" + getId() + ", opdId=" + getOpdId() + ", consultantCharge=" + getConsultantCharge()
				+ ", totalCharge=" + getTotalCharge() + ", otherCharge=" + getOtherCharge() + ", discount="
				+ getDiscount() + ", discountpercentage=" + getDiscountpercentage() + ", taxpercentage="
				+ getTaxpercentage() + ", tax=" + getTax() + ", grosstotal=" + getGrosstotal() + ", totalPayment="
				+ getTotalPayment() + ", netPayableAmount=" + getNetPayableAmount() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getOpdId() {
		return this.opdId;
	}

	/* 24 */ public float getConsultantCharge() {
		return this.consultantCharge;
	}

	/* 25 */ public float getTotalCharge() {
		return this.totalCharge;
	}

	/* 26 */ public float getOtherCharge() {
		return this.otherCharge;
	}

	/* 27 */ public float getDiscount() {
		return this.discount;
	}

	/* 28 */ public float getDiscountpercentage() {
		return this.discountpercentage;
	}

	/* 29 */ public float getTaxpercentage() {
		return this.taxpercentage;
	}

	/* 30 */ public float getTax() {
		return this.tax;
	}

	/* 31 */ public float getGrosstotal() {
		return this.grosstotal;
	}

	/* 32 */ public float getTotalPayment() {
		return this.totalPayment;
	}

	public float getNetPayableAmount() {
		/* 33 */ return this.netPayableAmount;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * BillSummery.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */