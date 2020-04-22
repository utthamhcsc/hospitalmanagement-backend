/*    */ package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "Patient")
/*    */ public class Patient {
/*    */   @Id
/*    */   @GeneratedValue(strategy = GenerationType.AUTO)
/*    */   private int id;
/*    */   private int pid;
/*    */   private String admissiondate;
/*    */   private String patientname;
/*    */   private String age;
/*    */   private String month;
	/*    */ private String image;
/*    */   private String mobilenumber;
/*    */   private String emil;
/*    */   private String dateOfbirth;
/*    */   private String maritalstatus;
/*    */   
	/* 21 */ public void setId(int id) {
		this.id = id;
	}

	private String bloodgroup;
	private String guardianaddress;
	private String guardianemail;
	private String isactive;
	private String patienttype;
	private String creditlimit;
	private String organisation;
	private String oldpatient;
	private String createdat;
	private String updatedat;
	private String disableat;
	private String note;

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setAdmissiondate(String admissiondate) {
		this.admissiondate = admissiondate;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public void setEmil(String emil) {
		this.emil = emil;
	}

	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public void setGuardianaddress(String guardianaddress) {
		this.guardianaddress = guardianaddress;
	}

	public void setGuardianemail(String guardianemail) {
		this.guardianemail = guardianemail;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public void setPatienttype(String patienttype) {
		this.patienttype = patienttype;
	}

	public void setCreditlimit(String creditlimit) {
		this.creditlimit = creditlimit;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public void setOldpatient(String oldpatient) {
		this.oldpatient = oldpatient;
	}

	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}

	public void setUpdatedat(String updatedat) {
		this.updatedat = updatedat;
	}

	public void setDisableat(String disableat) {
		this.disableat = disableat;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Patient))
			return false;
		Patient other = (Patient) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPid() != other.getPid())
			return false;
		Object this$admissiondate = getAdmissiondate(), other$admissiondate = other.getAdmissiondate();
		if ((this$admissiondate == null) ? (other$admissiondate != null)
				: !this$admissiondate.equals(other$admissiondate))
			return false;
		Object this$patientname = getPatientname(), other$patientname = other.getPatientname();
		if ((this$patientname == null) ? (other$patientname != null) : !this$patientname.equals(other$patientname))
			return false;
		Object this$age = getAge(), other$age = other.getAge();
		if ((this$age == null) ? (other$age != null) : !this$age.equals(other$age))
			return false;
		Object this$month = getMonth(), other$month = other.getMonth();
		if ((this$month == null) ? (other$month != null) : !this$month.equals(other$month))
			return false;
		Object this$image = getImage(), other$image = other.getImage();
		if ((this$image == null) ? (other$image != null) : !this$image.equals(other$image))
			return false;
		Object this$mobilenumber = getMobilenumber(), other$mobilenumber = other.getMobilenumber();
		if ((this$mobilenumber == null) ? (other$mobilenumber != null) : !this$mobilenumber.equals(other$mobilenumber))
			return false;
		Object this$emil = getEmil(), other$emil = other.getEmil();
		if ((this$emil == null) ? (other$emil != null) : !this$emil.equals(other$emil))
			return false;
		Object this$dateOfbirth = getDateOfbirth(), other$dateOfbirth = other.getDateOfbirth();
		if ((this$dateOfbirth == null) ? (other$dateOfbirth != null) : !this$dateOfbirth.equals(other$dateOfbirth))
			return false;
		Object this$maritalstatus = getMaritalstatus(), other$maritalstatus = other.getMaritalstatus();
		if ((this$maritalstatus == null) ? (other$maritalstatus != null)
				: !this$maritalstatus.equals(other$maritalstatus))
			return false;
		Object this$bloodgroup = getBloodgroup(), other$bloodgroup = other.getBloodgroup();
		if ((this$bloodgroup == null) ? (other$bloodgroup != null) : !this$bloodgroup.equals(other$bloodgroup))
			return false;
		Object this$guardianaddress = getGuardianaddress(), other$guardianaddress = other.getGuardianaddress();
		if ((this$guardianaddress == null) ? (other$guardianaddress != null)
				: !this$guardianaddress.equals(other$guardianaddress))
			return false;
		Object this$guardianemail = getGuardianemail(), other$guardianemail = other.getGuardianemail();
		if ((this$guardianemail == null) ? (other$guardianemail != null)
				: !this$guardianemail.equals(other$guardianemail))
			return false;
		Object this$isactive = getIsactive(), other$isactive = other.getIsactive();
		if ((this$isactive == null) ? (other$isactive != null) : !this$isactive.equals(other$isactive))
			return false;
		Object this$patienttype = getPatienttype(), other$patienttype = other.getPatienttype();
		if ((this$patienttype == null) ? (other$patienttype != null) : !this$patienttype.equals(other$patienttype))
			return false;
		Object this$creditlimit = getCreditlimit(), other$creditlimit = other.getCreditlimit();
		if ((this$creditlimit == null) ? (other$creditlimit != null) : !this$creditlimit.equals(other$creditlimit))
			return false;
		Object this$organisation = getOrganisation(), other$organisation = other.getOrganisation();
		if ((this$organisation == null) ? (other$organisation != null) : !this$organisation.equals(other$organisation))
			return false;
		Object this$oldpatient = getOldpatient(), other$oldpatient = other.getOldpatient();
		if ((this$oldpatient == null) ? (other$oldpatient != null) : !this$oldpatient.equals(other$oldpatient))
			return false;
		Object this$createdat = getCreatedat(), other$createdat = other.getCreatedat();
		if ((this$createdat == null) ? (other$createdat != null) : !this$createdat.equals(other$createdat))
			return false;
		Object this$updatedat = getUpdatedat(), other$updatedat = other.getUpdatedat();
		if ((this$updatedat == null) ? (other$updatedat != null) : !this$updatedat.equals(other$updatedat))
			return false;
		Object this$disableat = getDisableat(), other$disableat = other.getDisableat();
		if ((this$disableat == null) ? (other$disableat != null) : !this$disableat.equals(other$disableat))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		return !((this$note == null) ? (other$note != null) : !this$note.equals(other$note));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Patient;
	}

/*    */   
/*    */   public Patient() {}
/*    */   
/*    */   public int getId()
/*    */   {
/* 29 */     return this.id;
/* 30 */   } public int getPid() { return this.pid; }
/* 31 */   public String getAdmissiondate() { return this.admissiondate; }
/* 32 */   public String getPatientname() { return this.patientname; }
/* 33 */   public String getAge() { return this.age; }
/* 34 */   public String getMonth() { return this.month; }
/* 35 */   public String getImage() { return this.image; }
/* 36 */   public String getMobilenumber() { return this.mobilenumber; }
/* 37 */   public String getEmil() { return this.emil; }
/* 38 */   public String getDateOfbirth() { return this.dateOfbirth; }
/* 39 */   public String getMaritalstatus() { return this.maritalstatus; }
/* 40 */   public String getBloodgroup() { return this.bloodgroup; }
/* 41 */   public String getGuardianaddress() { return this.guardianaddress; }
/* 42 */   public String getGuardianemail() { return this.guardianemail; }
/* 43 */   public String getIsactive() { return this.isactive; }
/* 44 */   public String getPatienttype() { return this.patienttype; }
/* 45 */   public String getCreditlimit() { return this.creditlimit; }
/* 46 */   public String getOrganisation() { return this.organisation; }
/* 47 */   public String getOldpatient() { return this.oldpatient; }
/* 48 */   public String getCreatedat() { return this.createdat; }
/* 49 */   public String getUpdatedat() { return this.updatedat; }
/* 50 */   public String getDisableat() { return this.disableat; } public String getNote() {
/* 51 */     return this.note;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Patient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */