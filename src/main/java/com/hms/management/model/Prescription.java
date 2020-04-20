/*    */
package com.hms.management.model;

/*    */
/*    */ import java.util.ArrayList;
/*    */ import java.util.Date;
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
/*    */ @Table(name = "prescription")
/*    */ public class Prescription {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String opdId;

	/*    */
	/* 21 */ public void setId(int id) {
		this.id = id;
	}

	private String header;
	private String footer;
	private Date date;

	public void setOpdId(String opdId) {
		this.opdId = opdId;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setCaseHistory(List<CaseHistory> caseHistory) {
		this.caseHistory = caseHistory;
	}



	protected boolean canEqual(Object other) {
		return other instanceof Prescription;
	}

	
	public String toString() {
		return "Prescription(id=" + getId() + ", opdId=" + getOpdId() + ", header=" + getHeader() + ", footer="
				+ getFooter() + ", date=" + getDate() + ", caseHistory=" + getCaseHistory() + ")";
	}

	public Prescription(int id, String opdId, String header, String footer, Date date, List<CaseHistory> caseHistory) {
		/* 22 */ this.id = id;
		this.opdId = opdId;
		this.header = header;
		this.footer = footer;
		this.date = date;
		this.caseHistory = caseHistory;
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 30 */ return this.id;
		/* 31 */ }

	public String getOpdId() {
		return this.opdId;
	}

	/* 32 */ public String getHeader() {
		return this.header;
	}

	/* 33 */ public String getFooter() {
		return this.footer;
	}

	/* 34 */ public Date getDate() {
		return this.date;
	}

	@OneToMany(targetEntity = CaseHistory.class, cascade = { CascadeType.ALL })
	/*    */ @JoinColumn(name = "pr_fk", referencedColumnName = "id", insertable = true, updatable = true, nullable = false)
	/* 36 */ private List<CaseHistory> caseHistory = new ArrayList<>();

	/*    */ public List<CaseHistory> getCaseHistory() {
		/* 38 */ return this.caseHistory;
		/*    */ }

	/*    */
	/*    */ public Prescription() {
	}
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * Prescription.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */