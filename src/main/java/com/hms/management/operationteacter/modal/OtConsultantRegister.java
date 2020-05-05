package com.hms.management.operationteacter.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class OtConsultantRegister {
	
	@Id
	@GeneratedValue
	private int id;
	private String appliedDate;
	private String instruction;
	private String doctorId;
	private String instructionDate;
	private int otid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppliedDate() {
		return appliedDate;
	}
	public void setAppliedDate(String appliedDate) {
		this.appliedDate = appliedDate;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getInstructionDate() {
		return instructionDate;
	}
	public void setInstructionDate(String instructionDate) {
		this.instructionDate = instructionDate;
	}
	public int getOtid() {
		return otid;
	}
	public void setOtid(int otid) {
		this.otid = otid;
	}
	public OtConsultantRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OtConsultantRegister(int id, String appliedDate, String instruction, String doctorId, String instructionDate,
			int otid) {
		super();
		this.id = id;
		this.appliedDate = appliedDate;
		this.instruction = instruction;
		this.doctorId = doctorId;
		this.instructionDate = instructionDate;
		this.otid = otid;
	}
	
	

}
