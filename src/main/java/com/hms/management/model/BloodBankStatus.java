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
/*    */ @Table(name = "blood_bank_status")
/*    */ public class BloodBankStatus {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String bloodGroup;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String status;
	private String ceatedAt;
	private String updatedAt;

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setCeatedAt(String ceatedAt) {
		this.ceatedAt = ceatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof BloodBankStatus))
			return false;
		BloodBankStatus other = (BloodBankStatus) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$bloodGroup = getBloodGroup(), other$bloodGroup = other.getBloodGroup();
		if ((this$bloodGroup == null) ? (other$bloodGroup != null) : !this$bloodGroup.equals(other$bloodGroup))
			return false;
		Object this$status = getStatus(), other$status = other.getStatus();
		if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status))
			return false;
		Object this$ceatedAt = getCeatedAt(), other$ceatedAt = other.getCeatedAt();
		if ((this$ceatedAt == null) ? (other$ceatedAt != null) : !this$ceatedAt.equals(other$ceatedAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof BloodBankStatus;
	}


	public String toString() {
		return "BloodBankStatus(id=" + getId() + ", bloodGroup=" + getBloodGroup() + ", status=" + getStatus()
				+ ", ceatedAt=" + getCeatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public BloodBankStatus(int id, String bloodGroup, String status, String ceatedAt, String updatedAt) {
		/* 15 */ this.id = id;
		this.bloodGroup = bloodGroup;
		this.status = status;
		this.ceatedAt = ceatedAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */
	/*    */ public BloodBankStatus() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getBloodGroup() {
		return this.bloodGroup;
	}

	/* 25 */ public String getStatus() {
		return this.status;
	}

	/* 26 */ public String getCeatedAt() {
		return this.ceatedAt;
	}

	public String getUpdatedAt() {
		/* 27 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * BloodBankStatus.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */