/*    */
package com.hms.management.model;

import javax.persistence.Entity;
/*    */
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "ConsultantInstruction")
/*    */ public class ConsultantInstruction {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String appliedDate;
	/*    */ private String doctorId;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String doctorName;
	private String instruction;
	private String instructionDate;

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

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ConsultantInstruction))
			return false;
		ConsultantInstruction other = (ConsultantInstruction) o;
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
		return !((this$instructionDate == null) ? (other$instructionDate != null)
				: !this$instructionDate.equals(other$instructionDate));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ConsultantInstruction;
	}
	public String toString() {
		return "ConsultantInstruction(id=" + getId() + ", appliedDate=" + getAppliedDate() + ", doctorId="
				+ getDoctorId() + ", doctorName=" + getDoctorName() + ", instruction=" + getInstruction()
				+ ", instructionDate=" + getInstructionDate() + ")";
	}

	public ConsultantInstruction(int id, String appliedDate, String doctorId, String doctorName, String instruction,
			String instructionDate) {
		/* 15 */ this.id = id;
		this.appliedDate = appliedDate;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.instruction = instruction;
		this.instructionDate = instructionDate;
		/*    */ }

	/*    */
	/*    */
	/*    */ public ConsultantInstruction() {
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

	public String getInstructionDate() {
		/* 28 */ return this.instructionDate;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * ConsultantInstruction.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */