/*    */
package com.hms.management.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "blood_issue")
/*    */ public class BloodIssue {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String dateOfIssue;
	/*    */ private String recieveTo;
	/*    */ private String bloodGroup;
	/*    */ private String gender;
	/*    */ private String doctor;
	/*    */ private String institution;
	/*    */ private String technician;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private float amount;
	private String donorName;
	private String lot;
	private String bagNo;
	private String remark;
	private String billNo;
	private String action;
	private Date createdAt;
	private Date updatedAt;

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public void setRecieveTo(String recieveTo) {
		this.recieveTo = recieveTo;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public void setTechnician(String technician) {
		this.technician = technician;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public void setBagNo(String bagNo) {
		this.bagNo = bagNo;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof BloodIssue))
			return false;
		BloodIssue other = (BloodIssue) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$dateOfIssue = getDateOfIssue(), other$dateOfIssue = other.getDateOfIssue();
		if ((this$dateOfIssue == null) ? (other$dateOfIssue != null) : !this$dateOfIssue.equals(other$dateOfIssue))
			return false;
		Object this$recieveTo = getRecieveTo(), other$recieveTo = other.getRecieveTo();
		if ((this$recieveTo == null) ? (other$recieveTo != null) : !this$recieveTo.equals(other$recieveTo))
			return false;
		Object this$bloodGroup = getBloodGroup(), other$bloodGroup = other.getBloodGroup();
		if ((this$bloodGroup == null) ? (other$bloodGroup != null) : !this$bloodGroup.equals(other$bloodGroup))
			return false;
		Object this$gender = getGender(), other$gender = other.getGender();
		if ((this$gender == null) ? (other$gender != null) : !this$gender.equals(other$gender))
			return false;
		Object this$doctor = getDoctor(), other$doctor = other.getDoctor();
		if ((this$doctor == null) ? (other$doctor != null) : !this$doctor.equals(other$doctor))
			return false;
		Object this$institution = getInstitution(), other$institution = other.getInstitution();
		if ((this$institution == null) ? (other$institution != null) : !this$institution.equals(other$institution))
			return false;
		Object this$technician = getTechnician(), other$technician = other.getTechnician();
		if ((this$technician == null) ? (other$technician != null) : !this$technician.equals(other$technician))
			return false;
		if (Float.compare(getAmount(), other.getAmount()) != 0)
			return false;
		Object this$donorName = getDonorName(), other$donorName = other.getDonorName();
		if ((this$donorName == null) ? (other$donorName != null) : !this$donorName.equals(other$donorName))
			return false;
		Object this$lot = getLot(), other$lot = other.getLot();
		if ((this$lot == null) ? (other$lot != null) : !this$lot.equals(other$lot))
			return false;
		Object this$bagNo = getBagNo(), other$bagNo = other.getBagNo();
		if ((this$bagNo == null) ? (other$bagNo != null) : !this$bagNo.equals(other$bagNo))
			return false;
		Object this$remark = getRemark(), other$remark = other.getRemark();
		if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark))
			return false;
		Object this$billNo = getBillNo(), other$billNo = other.getBillNo();
		if ((this$billNo == null) ? (other$billNo != null) : !this$billNo.equals(other$billNo))
			return false;
		Object this$action = getAction(), other$action = other.getAction();
		if ((this$action == null) ? (other$action != null) : !this$action.equals(other$action))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof BloodIssue;
	}


	public String toString() {
		return "BloodIssue(id=" + getId() + ", dateOfIssue=" + getDateOfIssue() + ", recieveTo=" + getRecieveTo()
				+ ", bloodGroup=" + getBloodGroup() + ", gender=" + getGender() + ", doctor=" + getDoctor()
				+ ", institution=" + getInstitution() + ", technician=" + getTechnician() + ", amount=" + getAmount()
				+ ", donorName=" + getDonorName() + ", lot=" + getLot() + ", bagNo=" + getBagNo() + ", remark="
				+ getRemark() + ", billNo=" + getBillNo() + ", action=" + getAction() + ", createdAt=" + getCreatedAt()
				+ ", updatedAt=" + getUpdatedAt() + ")";
	}

	public BloodIssue(int id, String dateOfIssue, String recieveTo, String bloodGroup, String gender, String doctor,
			String institution, String technician, float amount, String donorName, String lot, String bagNo,
			String remark, String billNo, String action, Date createdAt, Date updatedAt) {
		/* 17 */ this.id = id;
		this.dateOfIssue = dateOfIssue;
		this.recieveTo = recieveTo;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.doctor = doctor;
		this.institution = institution;
		this.technician = technician;
		this.amount = amount;
		this.donorName = donorName;
		this.lot = lot;
		this.bagNo = bagNo;
		this.remark = remark;
		this.billNo = billNo;
		this.action = action;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */
	/*    */ public BloodIssue() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 25 */ return this.id;
		/* 26 */ }

	public String getDateOfIssue() {
		return this.dateOfIssue;
	}

	/* 27 */ public String getRecieveTo() {
		return this.recieveTo;
	}

	/* 28 */ public String getBloodGroup() {
		return this.bloodGroup;
	}

	/* 29 */ public String getGender() {
		return this.gender;
	}

	/* 30 */ public String getDoctor() {
		return this.doctor;
	}

	/* 31 */ public String getInstitution() {
		return this.institution;
	}

	/* 32 */ public String getTechnician() {
		return this.technician;
	}

	/* 33 */ public float getAmount() {
		return this.amount;
	}

	/* 34 */ public String getDonorName() {
		return this.donorName;
	}

	/* 35 */ public String getLot() {
		return this.lot;
	}

	/* 36 */ public String getBagNo() {
		return this.bagNo;
	}

	/* 37 */ public String getRemark() {
		return this.remark;
	}

	/* 38 */ public String getBillNo() {
		return this.billNo;
	}

	/* 39 */ public String getAction() {
		return this.action;
	}

	/* 40 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		/* 41 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\BloodIssue
 * .class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */