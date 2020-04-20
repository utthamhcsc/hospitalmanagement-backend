
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
/*    */ @Table(name = "PatientAddress")
/*    */ public class PatientAddress {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String adressLine;
	/*    */ private String adressLine2;

	/*    */
	/* 15 */ public void setId(int id) {
		this.id = id;
	}

	private String taluk;
	private String district;
	private String state;
	private String pincode;

	public void setAdressLine(String adressLine) {
		this.adressLine = adressLine;
	}

	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PatientAddress))
			return false;
		PatientAddress other = (PatientAddress) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$adressLine = getAdressLine(), other$adressLine = other.getAdressLine();
		if ((this$adressLine == null) ? (other$adressLine != null) : !this$adressLine.equals(other$adressLine))
			return false;
		Object this$adressLine2 = getAdressLine2(), other$adressLine2 = other.getAdressLine2();
		if ((this$adressLine2 == null) ? (other$adressLine2 != null) : !this$adressLine2.equals(other$adressLine2))
			return false;
		Object this$taluk = getTaluk(), other$taluk = other.getTaluk();
		if ((this$taluk == null) ? (other$taluk != null) : !this$taluk.equals(other$taluk))
			return false;
		Object this$district = getDistrict(), other$district = other.getDistrict();
		if ((this$district == null) ? (other$district != null) : !this$district.equals(other$district))
			return false;
		Object this$state = getState(), other$state = other.getState();
		if ((this$state == null) ? (other$state != null) : !this$state.equals(other$state))
			return false;
		Object this$pincode = getPincode(), other$pincode = other.getPincode();
		return !((this$pincode == null) ? (other$pincode != null) : !this$pincode.equals(other$pincode));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PatientAddress;
	}


	public String toString() {
		return "PatientAddress(id=" + getId() + ", adressLine=" + getAdressLine() + ", adressLine2=" + getAdressLine2()
				+ ", taluk=" + getTaluk() + ", district=" + getDistrict() + ", state=" + getState() + ", pincode="
				+ getPincode() + ")";
	}

	public PatientAddress(int id, String adressLine, String adressLine2, String taluk, String district, String state,
			String pincode) {
		/* 16 */ this.id = id;
		this.adressLine = adressLine;
		this.adressLine2 = adressLine2;
		this.taluk = taluk;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		/*    */ }

	/*    */
	/*    */ public PatientAddress() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getAdressLine() {
		return this.adressLine;
	}

	/* 25 */ public String getAdressLine2() {
		return this.adressLine2;
	}

	/* 26 */ public String getTaluk() {
		return this.taluk;
	}

	/* 27 */ public String getDistrict() {
		return this.district;
	}

	/* 28 */ public String getState() {
		return this.state;
	}

	public String getPincode() {
		/* 29 */ return this.pincode;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PatientAddress.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */