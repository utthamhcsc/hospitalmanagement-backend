/*    */ package com.hms.management.ipd.modal;
import javax.persistence.Entity;
/*    */ 
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "ipd_consutant_register")
/*    */ public class MyIpdConsultantInstructionRegister {
/*    */   @Id
/*    */   @GeneratedValue(strategy = GenerationType.AUTO)
/*    */   private int id;
/*    */   private String appliedDate;
/*    */   private String doctorId;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String doctorName;
	private String instruction;
	private String instructionDate;
	private String ipdId;

	public void setAppliedDate(String appliedDate) {
		this.appliedDate = appliedDate;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public void setInstructionDate(String instructionDate) {
		this.instructionDate = instructionDate;
	}

	public void setIpdId(String ipdId) {
		this.ipdId = ipdId;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof MyIpdConsultantInstructionRegister))
			return false;
		MyIpdConsultantInstructionRegister other = (MyIpdConsultantInstructionRegister) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$appliedDate = getAppliedDate(), other$appliedDate = other.getAppliedDate();
		if ((this$appliedDate == null) ? (other$appliedDate != null) : !this$appliedDate.equals(other$appliedDate))
			return false;
		Object this$doctorId = getDoctorId(), other$doctorId = other.getDoctorId();
		if ((this$doctorId == null) ? (other$doctorId != null) : !this$doctorId.equals(other$doctorId))
			return false;
		Object this$doctorName = getDoctorName(), other$doctorName = other.getDoctorName();
		if ((this$doctorName == null) ? (other$doctorName != null) : !this$doctorName.equals(other$doctorName))
			return false;
		Object this$instruction = getInstruction(), other$instruction = other.getInstruction();
		if ((this$instruction == null) ? (other$instruction != null) : !this$instruction.equals(other$instruction))
			return false;
		Object this$instructionDate = getInstructionDate(), other$instructionDate = other.getInstructionDate();
		if ((this$instructionDate == null) ? (other$instructionDate != null)
				: !this$instructionDate.equals(other$instructionDate))
			return false;
		Object this$ipdId = getIpdId(), other$ipdId = other.getIpdId();
		return !((this$ipdId == null) ? (other$ipdId != null) : !this$ipdId.equals(other$ipdId));
	}

	protected boolean canEqual(Object other) {
		return other instanceof MyIpdConsultantInstructionRegister;
	}

	

	public String toString() {
		return "MyIpdConsultantInstructionRegister(id=" + getId() + ", appliedDate=" + getAppliedDate() + ", doctorId="
				+ getDoctorId() + ", doctorName=" + getDoctorName() + ", instruction=" + getInstruction()
				+ ", instructionDate=" + getInstructionDate() + ", ipdId=" + getIpdId() + ")";
	}

	public MyIpdConsultantInstructionRegister(int id, String appliedDate, String doctorId, String doctorName,
			String instruction, String instructionDate, String ipdId) {
		/* 15 */ this.id = id;
		this.appliedDate = appliedDate;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.instruction = instruction;
		this.instructionDate = instructionDate;
		this.ipdId = ipdId;
		/*    */ }

	/*    */
	/*    */
	/*    */ public MyIpdConsultantInstructionRegister() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getAppliedDate() {
		return this.appliedDate;
	}

	/* 25 */ public String getDoctorId() {
		return this.doctorId;
	}

	/* 26 */ public String getDoctorName() {
		return this.doctorName;
	}

	/* 27 */ public String getInstruction() {
		return this.instruction;
	}

	/* 28 */ public String getInstructionDate() {
		return this.instructionDate;
	}

	public String getIpdId() {
		/* 29 */ return this.ipdId;
		/*    */ }
	/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\modal\MyIpdConsultantInstructionRegister.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */