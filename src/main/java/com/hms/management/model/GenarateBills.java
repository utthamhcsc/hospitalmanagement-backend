/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "GenarateBills")
/*    */ public class GenarateBills {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private int pid;
	private int billNo;
	private String date;
	/*    */ private String medicineCategory;
	/*    */ private String medicineName;
	/*    */ private String batchNo;
	/*    */ private String expireDate;
	/*    */ private String quantity;

	/*    */
	/* 13 */ public void setId(int id) {
		this.id = id;
	}

	private float salePrice;
	private float amount;
	private String hospitalDoctor;
	private String doctorName;
	private String note;
	private float total;
	private float discount;
	private float tax;
	private float netAmount;

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setMedicineCategory(String medicineCategory) {
		this.medicineCategory = medicineCategory;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setHospitalDoctor(String hospitalDoctor) {
		this.hospitalDoctor = hospitalDoctor;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public void setNote(String note) {
		this.note = note;
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

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof GenarateBills))
			return false;
		GenarateBills other = (GenarateBills) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPid() != other.getPid())
			return false;
		if (getBillNo() != other.getBillNo())
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$medicineCategory = getMedicineCategory(), other$medicineCategory = other.getMedicineCategory();
		if ((this$medicineCategory == null) ? (other$medicineCategory != null)
				: !this$medicineCategory.equals(other$medicineCategory))
			return false;
		Object this$medicineName = getMedicineName(), other$medicineName = other.getMedicineName();
		if ((this$medicineName == null) ? (other$medicineName != null) : !this$medicineName.equals(other$medicineName))
			return false;
		Object this$batchNo = getBatchNo(), other$batchNo = other.getBatchNo();
		if ((this$batchNo == null) ? (other$batchNo != null) : !this$batchNo.equals(other$batchNo))
			return false;
		Object this$expireDate = getExpireDate(), other$expireDate = other.getExpireDate();
		if ((this$expireDate == null) ? (other$expireDate != null) : !this$expireDate.equals(other$expireDate))
			return false;
		Object this$quantity = getQuantity(), other$quantity = other.getQuantity();
		if ((this$quantity == null) ? (other$quantity != null) : !this$quantity.equals(other$quantity))
			return false;
		if (Float.compare(getSalePrice(), other.getSalePrice()) != 0)
			return false;
		if (Float.compare(getAmount(), other.getAmount()) != 0)
			return false;
		Object this$hospitalDoctor = getHospitalDoctor(), other$hospitalDoctor = other.getHospitalDoctor();
		if ((this$hospitalDoctor == null) ? (other$hospitalDoctor != null)
				: !this$hospitalDoctor.equals(other$hospitalDoctor))
			return false;
		Object this$doctorName = getDoctorName(), other$doctorName = other.getDoctorName();
		if ((this$doctorName == null) ? (other$doctorName != null) : !this$doctorName.equals(other$doctorName))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		return ((this$note == null) ? (other$note != null) : !this$note.equals(other$note)) ? false
				: ((Float.compare(getTotal(), other.getTotal()) != 0) ? false
						: ((Float.compare(getDiscount(), other.getDiscount()) != 0) ? false
								: ((Float.compare(getTax(), other.getTax()) != 0) ? false
										: (!(Float.compare(getNetAmount(), other.getNetAmount()) != 0)))));
	}

	protected boolean canEqual(Object other) {
		return other instanceof GenarateBills;
	}

	
	public String toString() {
		return "GenarateBills(id=" + getId() + ", pid=" + getPid() + ", billNo=" + getBillNo() + ", date=" + getDate()
				+ ", medicineCategory=" + getMedicineCategory() + ", medicineName=" + getMedicineName() + ", batchNo="
				+ getBatchNo() + ", expireDate=" + getExpireDate() + ", quantity=" + getQuantity() + ", salePrice="
				+ getSalePrice() + ", amount=" + getAmount() + ", hospitalDoctor=" + getHospitalDoctor()
				+ ", doctorName=" + getDoctorName() + ", note=" + getNote() + ", total=" + getTotal() + ", discount="
				+ getDiscount() + ", tax=" + getTax() + ", netAmount=" + getNetAmount() + ")";
	}

	public GenarateBills(int id, int pid, int billNo, String date, String medicineCategory, String medicineName,
			String batchNo, String expireDate, String quantity, float salePrice, float amount, String hospitalDoctor,
			String doctorName, String note, float total, float discount, float tax, float netAmount) {
		/* 14 */ this.id = id;
		this.pid = pid;
		this.billNo = billNo;
		this.date = date;
		this.medicineCategory = medicineCategory;
		this.medicineName = medicineName;
		this.batchNo = batchNo;
		this.expireDate = expireDate;
		this.quantity = quantity;
		this.salePrice = salePrice;
		this.amount = amount;
		this.hospitalDoctor = hospitalDoctor;
		this.doctorName = doctorName;
		this.note = note;
		this.total = total;
		this.discount = discount;
		this.tax = tax;
		this.netAmount = netAmount;
		/*    */ }

	/*    */
	/*    */
	/*    */ public GenarateBills() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 22 */ return this.id;
		/* 23 */ }

	public int getPid() {
		return this.pid;
	}

	/* 24 */ public int getBillNo() {
		return this.billNo;
	}

	/* 25 */ public String getDate() {
		return this.date;
	}

	/* 26 */ public String getMedicineCategory() {
		return this.medicineCategory;
	}

	/* 27 */ public String getMedicineName() {
		return this.medicineName;
	}

	/* 28 */ public String getBatchNo() {
		return this.batchNo;
	}

	/* 29 */ public String getExpireDate() {
		return this.expireDate;
	}

	/* 30 */ public String getQuantity() {
		return this.quantity;
	}

	/* 31 */ public float getSalePrice() {
		return this.salePrice;
	}

	/* 32 */ public float getAmount() {
		return this.amount;
	}

	/* 33 */ public String getHospitalDoctor() {
		return this.hospitalDoctor;
	}

	/* 34 */ public String getDoctorName() {
		return this.doctorName;
	}

	/* 35 */ public String getNote() {
		return this.note;
	}

	/* 36 */ public float getTotal() {
		return this.total;
	}

	/* 37 */ public float getDiscount() {
		return this.discount;
	}

	/* 38 */ public float getTax() {
		return this.tax;
	}

	public float getNetAmount() {
		/* 39 */ return this.netAmount;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * GenarateBills.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */