/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "ot_consultant_register")
/*    */ public class OtConsultantRegister {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int patientId;
	/*    */ private String date;

	/*    */
	/* 17 */ public void setId(int id) {
		this.id = id;
	}

	private String insDate;
	private String insTime;
	private String instruction;
	private int consDoctor;

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setInsDate(String insDate) {
		this.insDate = insDate;
	}

	public void setInsTime(String insTime) {
		this.insTime = insTime;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public void setConsDoctor(int consDoctor) {
		this.consDoctor = consDoctor;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof OtConsultantRegister))
			return false;
		OtConsultantRegister other = (OtConsultantRegister) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPatientId() != other.getPatientId())
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$insDate = getInsDate(), other$insDate = other.getInsDate();
		if ((this$insDate == null) ? (other$insDate != null) : !this$insDate.equals(other$insDate))
			return false;
		Object this$insTime = getInsTime(), other$insTime = other.getInsTime();
		if ((this$insTime == null) ? (other$insTime != null) : !this$insTime.equals(other$insTime))
			return false;
		Object this$instruction = getInstruction(), other$instruction = other.getInstruction();
		return ((this$instruction == null) ? (other$instruction != null) : !this$instruction.equals(other$instruction))
				? false
				: (!(getConsDoctor() != other.getConsDoctor()));
	}

	protected boolean canEqual(Object other) {
		return other instanceof OtConsultantRegister;
	}


	public String toString() {
		return "OtConsultantRegister(id=" + getId() + ", patientId=" + getPatientId() + ", date=" + getDate()
				+ ", insDate=" + getInsDate() + ", insTime=" + getInsTime() + ", instruction=" + getInstruction()
				+ ", consDoctor=" + getConsDoctor() + ")";
	}

	public OtConsultantRegister(int id, int patientId, String date, String insDate, String insTime, String instruction,
			int consDoctor) {
		/* 18 */ this.id = id;
		this.patientId = patientId;
		this.date = date;
		this.insDate = insDate;
		this.insTime = insTime;
		this.instruction = instruction;
		this.consDoctor = consDoctor;
		/*    */ }

	/*    */
	/*    */ public OtConsultantRegister() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 25 */ return this.id;
		/* 26 */ }

	public int getPatientId() {
		return this.patientId;
	}

	/* 27 */ public String getDate() {
		return this.date;
	}

	/* 28 */ public String getInsDate() {
		return this.insDate;
	}

	/* 29 */ public String getInsTime() {
		return this.insTime;
	}

	/* 30 */ public String getInstruction() {
		return this.instruction;
	}

	public int getConsDoctor() {
		/* 31 */ return this.consDoctor;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * OtConsultantRegister.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */