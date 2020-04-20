/*    */
package com.hms.management.model;

/*    */
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;

/*    */ import javax.persistence.CascadeType;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;

/*    */
/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "doctorOpdCharge")
/*    */ public class DoctorOpdCharge
/*    */ {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String doctorId;
	/*    */ private String doctorName;
	/*    */ private float standardCharge;
	/*    */ @OneToMany(targetEntity = DoctorCharges.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	/*    */ @JoinColumn(name = "pid", referencedColumnName = "id", insertable = true, updatable = true, nullable = false)
	/*    */ private List<DoctorCharges> organisationCharges;

	/*    */
	/*    */ public DoctorOpdCharge(int id, String doctorId, String doctorName, float standardCharge,
			List<DoctorCharges> organisationCharges) {
		/* 32 */ this.organisationCharges = new ArrayList<>();
		this.id = id;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.standardCharge = standardCharge;
		this.organisationCharges = organisationCharges;
	}

	public DoctorOpdCharge() {
		this.organisationCharges = new ArrayList<>();
	}

	/*    */ public void setId(int id) {
		this.id = id;
	}

	public List<DoctorCharges> getOrganisationCharges() {
		/* 34 */ return this.organisationCharges;
		/*    */ }

	/*    */
	/*    */ public void setDoctorId(String doctorId) {
		/*    */ this.doctorId = doctorId;
		/*    */ }

	/*    */
	/*    */ public void setDoctorName(String doctorName) {
		/*    */ this.doctorName = doctorName;
		/*    */ }

	/*    */
	/*    */ public void setStandardCharge(float standardCharge) {
		/*    */ this.standardCharge = standardCharge;
		/*    */ }

	/*    */
	/*    */ public void setOrganisationCharges(List<DoctorCharges> organisationCharges) {
		/*    */ this.organisationCharges = organisationCharges;
		/*    */ }


	/*    */ protected boolean canEqual(Object other) {
		/*    */ return other instanceof DoctorOpdCharge;
		/*    */ }

	/*    */

	/*    */
	/*    */ public String toString() {
		/*    */ return "DoctorOpdCharge(id=" + getId() + ", doctorId=" + getDoctorId() + ", doctorName="
				+ getDoctorName() + ", standardCharge=" + getStandardCharge() + ", organisationCharges="
				+ getOrganisationCharges() + ")";
		/*    */ }

	/*    */
	/*    */ public int getId() {
		/*    */ return this.id;
		/*    */ }

	/*    */
	/*    */ public String getDoctorId() {
		/*    */ return this.doctorId;
		/*    */ }

	/*    */
	/*    */ public String getDoctorName() {
		/*    */ return this.doctorName;
		/*    */ }

	/*    */
	/*    */ public float getStandardCharge() {
		/*    */ return this.standardCharge;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * DoctorOpdCharge.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */