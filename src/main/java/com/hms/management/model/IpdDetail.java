
/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*    */ @Entity
/*    */ public class IpdDetail {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private String height;
	private String weight;
	private String bp;
	private String ipdNo;
	/*    */ private String room;
	/*    */ private String bed;
	/*    */ private String bedGroup;
	/*    */ private String bedNo;
	/*    */ private String caseType;

	/*    */
	/* 12 */ public void setId(int id) {
		this.id = id;
	}

	private String casualty;
	private String symptoms;
	private String knownAllergies;
	private String refference;
	private String consultantDoctor;
	private String creditsLimit;
	private String amount;
	private String tax;
	private String paymentMode;
	private String date;

	public void setHeight(String height) {
		this.height = height;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public void setIpdNo(String ipdNo) {
		this.ipdNo = ipdNo;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public void setBed(String bed) {
		this.bed = bed;
	}

	public void setBedGroup(String bedGroup) {
		this.bedGroup = bedGroup;
	}

	public void setBedNo(String bedNo) {
		this.bedNo = bedNo;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public void setCasualty(String casualty) {
		this.casualty = casualty;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public void setKnownAllergies(String knownAllergies) {
		this.knownAllergies = knownAllergies;
	}

	public void setRefference(String refference) {
		this.refference = refference;
	}

	public void setConsultantDoctor(String consultantDoctor) {
		this.consultantDoctor = consultantDoctor;
	}

	public void setCreditsLimit(String creditsLimit) {
		this.creditsLimit = creditsLimit;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof IpdDetail))
			return false;
		IpdDetail other = (IpdDetail) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$height = getHeight(), other$height = other.getHeight();
		if ((this$height == null) ? (other$height != null) : !this$height.equals(other$height))
			return false;
		Object this$weight = getWeight(), other$weight = other.getWeight();
		if ((this$weight == null) ? (other$weight != null) : !this$weight.equals(other$weight))
			return false;
		Object this$bp = getBp(), other$bp = other.getBp();
		if ((this$bp == null) ? (other$bp != null) : !this$bp.equals(other$bp))
			return false;
		Object this$ipdNo = getIpdNo(), other$ipdNo = other.getIpdNo();
		if ((this$ipdNo == null) ? (other$ipdNo != null) : !this$ipdNo.equals(other$ipdNo))
			return false;
		Object this$room = getRoom(), other$room = other.getRoom();
		if ((this$room == null) ? (other$room != null) : !this$room.equals(other$room))
			return false;
		Object this$bed = getBed(), other$bed = other.getBed();
		if ((this$bed == null) ? (other$bed != null) : !this$bed.equals(other$bed))
			return false;
		Object this$bedGroup = getBedGroup(), other$bedGroup = other.getBedGroup();
		if ((this$bedGroup == null) ? (other$bedGroup != null) : !this$bedGroup.equals(other$bedGroup))
			return false;
		Object this$bedNo = getBedNo(), other$bedNo = other.getBedNo();
		if ((this$bedNo == null) ? (other$bedNo != null) : !this$bedNo.equals(other$bedNo))
			return false;
		Object this$caseType = getCaseType(), other$caseType = other.getCaseType();
		if ((this$caseType == null) ? (other$caseType != null) : !this$caseType.equals(other$caseType))
			return false;
		Object this$casualty = getCasualty(), other$casualty = other.getCasualty();
		if ((this$casualty == null) ? (other$casualty != null) : !this$casualty.equals(other$casualty))
			return false;
		Object this$symptoms = getSymptoms(), other$symptoms = other.getSymptoms();
		if ((this$symptoms == null) ? (other$symptoms != null) : !this$symptoms.equals(other$symptoms))
			return false;
		Object this$knownAllergies = getKnownAllergies(), other$knownAllergies = other.getKnownAllergies();
		if ((this$knownAllergies == null) ? (other$knownAllergies != null)
				: !this$knownAllergies.equals(other$knownAllergies))
			return false;
		Object this$refference = getRefference(), other$refference = other.getRefference();
		if ((this$refference == null) ? (other$refference != null) : !this$refference.equals(other$refference))
			return false;
		Object this$consultantDoctor = getConsultantDoctor(), other$consultantDoctor = other.getConsultantDoctor();
		if ((this$consultantDoctor == null) ? (other$consultantDoctor != null)
				: !this$consultantDoctor.equals(other$consultantDoctor))
			return false;
		Object this$creditsLimit = getCreditsLimit(), other$creditsLimit = other.getCreditsLimit();
		if ((this$creditsLimit == null) ? (other$creditsLimit != null) : !this$creditsLimit.equals(other$creditsLimit))
			return false;
		Object this$amount = getAmount(), other$amount = other.getAmount();
		if ((this$amount == null) ? (other$amount != null) : !this$amount.equals(other$amount))
			return false;
		Object this$tax = getTax(), other$tax = other.getTax();
		if ((this$tax == null) ? (other$tax != null) : !this$tax.equals(other$tax))
			return false;
		Object this$paymentMode = getPaymentMode(), other$paymentMode = other.getPaymentMode();
		if ((this$paymentMode == null) ? (other$paymentMode != null) : !this$paymentMode.equals(other$paymentMode))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		return !((this$date == null) ? (other$date != null) : !this$date.equals(other$date));
	}

	protected boolean canEqual(Object other) {
		return other instanceof IpdDetail;
	}


	public String toString() {
		return "IpdDetail(id=" + getId() + ", height=" + getHeight() + ", weight=" + getWeight() + ", bp=" + getBp()
				+ ", ipdNo=" + getIpdNo() + ", room=" + getRoom() + ", bed=" + getBed() + ", bedGroup=" + getBedGroup()
				+ ", bedNo=" + getBedNo() + ", caseType=" + getCaseType() + ", casualty=" + getCasualty()
				+ ", symptoms=" + getSymptoms() + ", knownAllergies=" + getKnownAllergies() + ", refference="
				+ getRefference() + ", consultantDoctor=" + getConsultantDoctor() + ", creditsLimit="
				+ getCreditsLimit() + ", amount=" + getAmount() + ", tax=" + getTax() + ", paymentMode="
				+ getPaymentMode() + ", date=" + getDate() + ")";
	}

	public IpdDetail(int id, String height, String weight, String bp, String ipdNo, String room, String bed,
			String bedGroup, String bedNo, String caseType, String casualty, String symptoms, String knownAllergies,
			String refference, String consultantDoctor, String creditsLimit, String amount, String tax,
			String paymentMode, String date) {
		/* 13 */ this.id = id;
		this.height = height;
		this.weight = weight;
		this.bp = bp;
		this.ipdNo = ipdNo;
		this.room = room;
		this.bed = bed;
		this.bedGroup = bedGroup;
		this.bedNo = bedNo;
		this.caseType = caseType;
		this.casualty = casualty;
		this.symptoms = symptoms;
		this.knownAllergies = knownAllergies;
		this.refference = refference;
		this.consultantDoctor = consultantDoctor;
		this.creditsLimit = creditsLimit;
		this.amount = amount;
		this.tax = tax;
		this.paymentMode = paymentMode;
		this.date = date;
		/*    */ }

	/*    */
	/*    */ public IpdDetail() {
	}

	/*    */
	/*    */ public int getId() {
		/* 19 */ return this.id;
		/* 20 */ }

	public String getHeight() {
		return this.height;
	}

	/* 21 */ public String getWeight() {
		return this.weight;
	}

	/* 22 */ public String getBp() {
		return this.bp;
	}

	/* 23 */ public String getIpdNo() {
		return this.ipdNo;
	}

	/* 24 */ public String getRoom() {
		return this.room;
	}

	/* 25 */ public String getBed() {
		return this.bed;
	}

	/* 26 */ public String getBedGroup() {
		return this.bedGroup;
	}

	/* 27 */ public String getBedNo() {
		return this.bedNo;
	}

	/* 28 */ public String getCaseType() {
		return this.caseType;
	}

	/* 29 */ public String getCasualty() {
		return this.casualty;
	}

	/* 30 */ public String getSymptoms() {
		return this.symptoms;
	}

	/* 31 */ public String getKnownAllergies() {
		return this.knownAllergies;
	}

	/* 32 */ public String getRefference() {
		return this.refference;
	}

	/* 33 */ public String getConsultantDoctor() {
		return this.consultantDoctor;
	}

	/* 34 */ public String getCreditsLimit() {
		return this.creditsLimit;
	}

	/* 35 */ public String getAmount() {
		return this.amount;
	}

	/* 36 */ public String getTax() {
		return this.tax;
	}

	/* 37 */ public String getPaymentMode() {
		return this.paymentMode;
	}

	public String getDate() {
		/* 38 */ return this.date;
		/*    */ }
}

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\IpdDetail.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */