/*    */
package com.hms.management.model;

/*    */
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;

/*    */ import javax.persistence.CascadeType;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
import javax.persistence.JoinColumn;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "consultant_register")
/*    */ public class ConsultantRegister {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String ipdId;

	/*    */
	/* 20 */ public void setId(int id) {
		this.id = id;
	}

	public void setIpdId(String ipdId) {
		this.ipdId = ipdId;
	}

	public void setConsultantInstruction(List<ConsultantInstruction> consultantInstruction) {
		this.consultantInstruction = consultantInstruction;
	}


	protected boolean canEqual(Object other) {
		return other instanceof ConsultantRegister;
	}

	

	public String toString() {
		return "ConsultantRegister(id=" + getId() + ", ipdId=" + getIpdId() + ", consultantInstruction="
				+ getConsultantInstruction() + ")";
	}

	public ConsultantRegister(int id, String ipdId, List<ConsultantInstruction> consultantInstruction) {
		/* 21 */ this.id = id;
		this.ipdId = ipdId;
		this.consultantInstruction = consultantInstruction;
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 29 */ return this.id;
	}

	public String getIpdId() {
		/* 30 */ return this.ipdId;
		/*    */ }

	@OneToMany(targetEntity = ConsultantInstruction.class, cascade = { CascadeType.ALL })
	/*    */ @JoinColumn(name = "mc_fk", referencedColumnName = "id", insertable = true, updatable = true, nullable = false)
	/* 33 */ private List<ConsultantInstruction> consultantInstruction = new ArrayList<>();

	/*    */ public List<ConsultantInstruction> getConsultantInstruction() {
		/* 35 */ return this.consultantInstruction;
		/*    */ }

	/*    */
	/*    */ public ConsultantRegister() {
	}
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * ConsultantRegister.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */