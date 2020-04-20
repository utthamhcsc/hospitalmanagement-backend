/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*    */ @Table(name = "PurchaseMedician")
/*    */ public class PurchaseMedician {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private String medicianCategory;
	private String medicianName;
	private int batchNo;
	/*    */ private String expireDate;
	/*    */ private float MRP;
	/*    */ private float batchAmount;
	/*    */ private float salePrice;
	/*    */ private String packagingQty;

	/*    */
	/*    */ public PurchaseMedician(int id, String medicianCategory, String medicianName, int batchNo,
			String expireDate, float MRP, float batchAmount, float salePrice, String packagingQty, String quentity,
			String packagingPrice, float amount, float total, float discount, float tax, float netAmount, String note,
			String attachDocument) {
		/* 13 */ this.id = id;
		this.medicianCategory = medicianCategory;
		this.medicianName = medicianName;
		this.batchNo = batchNo;
		this.expireDate = expireDate;
		this.MRP = MRP;
		this.batchAmount = batchAmount;
		this.salePrice = salePrice;
		this.packagingQty = packagingQty;
		this.quentity = quentity;
		this.packagingPrice = packagingPrice;
		this.amount = amount;
		this.total = total;
		this.discount = discount;
		this.tax = tax;
		this.netAmount = netAmount;
		this.note = note;
		this.attachDocument = attachDocument;
		/*    */ }

	private String quentity;
	private String packagingPrice;
	private float amount;
	private float total;
	private float discount;
	private float tax;
	private float netAmount;
	private String note;
	private String attachDocument;

	public PurchaseMedician() {
	}

	public void setId(int id) {
		/* 15 */ this.id = id;
	}

	public void setMedicianCategory(String medicianCategory) {
		this.medicianCategory = medicianCategory;
	}

	public void setMedicianName(String medicianName) {
		this.medicianName = medicianName;
	}

	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public void setMRP(float MRP) {
		this.MRP = MRP;
	}

	public void setBatchAmount(float batchAmount) {
		this.batchAmount = batchAmount;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public void setPackagingQty(String packagingQty) {
		this.packagingQty = packagingQty;
	}

	public void setQuentity(String quentity) {
		this.quentity = quentity;
	}

	public void setPackagingPrice(String packagingPrice) {
		this.packagingPrice = packagingPrice;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public void setNetAmount(float netAmount) {
		this.netAmount = netAmount;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setAttachDocument(String attachDocument) {
		this.attachDocument = attachDocument;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PurchaseMedician))
			return false;
		PurchaseMedician other = (PurchaseMedician) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$medicianCategory = getMedicianCategory(), other$medicianCategory = other.getMedicianCategory();
		if ((this$medicianCategory == null) ? (other$medicianCategory != null)
				: !this$medicianCategory.equals(other$medicianCategory))
			return false;
		Object this$medicianName = getMedicianName(), other$medicianName = other.getMedicianName();
		if ((this$medicianName == null) ? (other$medicianName != null) : !this$medicianName.equals(other$medicianName))
			return false;
		if (getBatchNo() != other.getBatchNo())
			return false;
		Object this$expireDate = getExpireDate(), other$expireDate = other.getExpireDate();
		if ((this$expireDate == null) ? (other$expireDate != null) : !this$expireDate.equals(other$expireDate))
			return false;
		if (Float.compare(getMRP(), other.getMRP()) != 0)
			return false;
		if (Float.compare(getBatchAmount(), other.getBatchAmount()) != 0)
			return false;
		if (Float.compare(getSalePrice(), other.getSalePrice()) != 0)
			return false;
		Object this$packagingQty = getPackagingQty(), other$packagingQty = other.getPackagingQty();
		if ((this$packagingQty == null) ? (other$packagingQty != null) : !this$packagingQty.equals(other$packagingQty))
			return false;
		Object this$quentity = getQuentity(), other$quentity = other.getQuentity();
		if ((this$quentity == null) ? (other$quentity != null) : !this$quentity.equals(other$quentity))
			return false;
		Object this$packagingPrice = getPackagingPrice(), other$packagingPrice = other.getPackagingPrice();
		if ((this$packagingPrice == null) ? (other$packagingPrice != null)
				: !this$packagingPrice.equals(other$packagingPrice))
			return false;
		if (Float.compare(getAmount(), other.getAmount()) != 0)
			return false;
		if (Float.compare(getTotal(), other.getTotal()) != 0)
			return false;
		if (Float.compare(getDiscount(), other.getDiscount()) != 0)
			return false;
		if (Float.compare(getTax(), other.getTax()) != 0)
			return false;
		if (Float.compare(getNetAmount(), other.getNetAmount()) != 0)
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$attachDocument = getAttachDocument(), other$attachDocument = other.getAttachDocument();
		return !((this$attachDocument == null) ? (other$attachDocument != null)
				: !this$attachDocument.equals(other$attachDocument));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PurchaseMedician;
	}


	public String toString() {
		return "PurchaseMedician(id=" + getId() + ", medicianCategory=" + getMedicianCategory() + ", medicianName="
				+ getMedicianName() + ", batchNo=" + getBatchNo() + ", expireDate=" + getExpireDate() + ", MRP="
				+ getMRP() + ", batchAmount=" + getBatchAmount() + ", salePrice=" + getSalePrice() + ", packagingQty="
				+ getPackagingQty() + ", quentity=" + getQuentity() + ", packagingPrice=" + getPackagingPrice()
				+ ", amount=" + getAmount() + ", total=" + getTotal() + ", discount=" + getDiscount() + ", tax="
				+ getTax() + ", netAmount=" + getNetAmount() + ", note=" + getNote() + ", attachDocument="
				+ getAttachDocument() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getMedicianCategory() {
		return this.medicianCategory;
	}

	/* 24 */ public String getMedicianName() {
		return this.medicianName;
	}

	/* 25 */ public int getBatchNo() {
		return this.batchNo;
	}

	/* 26 */ public String getExpireDate() {
		return this.expireDate;
	}

	/* 27 */ public float getMRP() {
		return this.MRP;
	}

	/* 28 */ public float getBatchAmount() {
		return this.batchAmount;
	}

	/* 29 */ public float getSalePrice() {
		return this.salePrice;
	}

	/* 30 */ public String getPackagingQty() {
		return this.packagingQty;
	}

	/* 31 */ public String getQuentity() {
		return this.quentity;
	}

	/* 32 */ public String getPackagingPrice() {
		return this.packagingPrice;
	}

	/* 33 */ public float getAmount() {
		return this.amount;
	}

	/* 34 */ public float getTotal() {
		return this.total;
	}

	/* 35 */ public float getDiscount() {
		return this.discount;
	}

	/* 36 */ public float getTax() {
		return this.tax;
	}

	/* 37 */ public float getNetAmount() {
		return this.netAmount;
	}

	/* 38 */ public String getNote() {
		return this.note;
	}

	public String getAttachDocument() {
		/* 39 */ return this.attachDocument;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PurchaseMedician.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */