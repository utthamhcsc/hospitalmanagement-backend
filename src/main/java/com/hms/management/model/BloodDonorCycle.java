
/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "blood_donor_cycle")
/*    */ public class BloodDonorCycle {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int bloodDonorId;
	/*    */ private String institution;
	/*    */ private String lot;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String bagNo;
	private String quantity;
	private String donateDate;
	private String createdAt;
	private String updatedAt;

	public void setBloodDonorId(int bloodDonorId) {
		this.bloodDonorId = bloodDonorId;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public void setBagNo(String bagNo) {
		this.bagNo = bagNo;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void setDonateDate(String donateDate) {
		this.donateDate = donateDate;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof BloodDonorCycle))
			return false;
		BloodDonorCycle other = (BloodDonorCycle) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getBloodDonorId() != other.getBloodDonorId())
			return false;
		Object this$institution = getInstitution(), other$institution = other.getInstitution();
		if ((this$institution == null) ? (other$institution != null) : !this$institution.equals(other$institution))
			return false;
		Object this$lot = getLot(), other$lot = other.getLot();
		if ((this$lot == null) ? (other$lot != null) : !this$lot.equals(other$lot))
			return false;
		Object this$bagNo = getBagNo(), other$bagNo = other.getBagNo();
		if ((this$bagNo == null) ? (other$bagNo != null) : !this$bagNo.equals(other$bagNo))
			return false;
		Object this$quantity = getQuantity(), other$quantity = other.getQuantity();
		if ((this$quantity == null) ? (other$quantity != null) : !this$quantity.equals(other$quantity))
			return false;
		Object this$donateDate = getDonateDate(), other$donateDate = other.getDonateDate();
		if ((this$donateDate == null) ? (other$donateDate != null) : !this$donateDate.equals(other$donateDate))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof BloodDonorCycle;
	}


	public String toString() {
		return "BloodDonorCycle(id=" + getId() + ", bloodDonorId=" + getBloodDonorId() + ", institution="
				+ getInstitution() + ", lot=" + getLot() + ", bagNo=" + getBagNo() + ", quantity=" + getQuantity()
				+ ", donateDate=" + getDonateDate() + ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt()
				+ ")";
	}

	public BloodDonorCycle(int id, int bloodDonorId, String institution, String lot, String bagNo, String quantity,
			String donateDate, String createdAt, String updatedAt) {
		/* 17 */ this.id = id;
		this.bloodDonorId = bloodDonorId;
		this.institution = institution;
		this.lot = lot;
		this.bagNo = bagNo;
		this.quantity = quantity;
		this.donateDate = donateDate;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */
	/*    */ public BloodDonorCycle() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 25 */ return this.id;
		/* 26 */ }

	public int getBloodDonorId() {
		return this.bloodDonorId;
	}

	/* 27 */ public String getInstitution() {
		return this.institution;
	}

	/* 28 */ public String getLot() {
		return this.lot;
	}

	/* 29 */ public String getBagNo() {
		return this.bagNo;
	}

	/* 30 */ public String getQuantity() {
		return this.quantity;
	}

	/* 31 */ public String getDonateDate() {
		return this.donateDate;
	}

	/* 32 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 33 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * BloodDonorCycle.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */