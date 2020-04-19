/*    */
package com.hms.management.opd.modal;

/*    */
/*    */ import java.util.ArrayList;
/*    */ import java.util.Date;
/*    */ import java.util.List;

/*    */ import javax.persistence.CascadeType;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.Id;
import javax.persistence.JoinColumn;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "myopdprescription")
/*    */ public class MyOpdPrescription {
	/*    */ @Id
	/*    */ private String opdId;
	/*    */ private String header;
	/*    */ private String footer;
	/*    */ private Date date;

	/*    */
	/* 22 */ public void setOpdId(String opdId) {
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

	public void setCaseHistory(List<MyOpdCaseHistory> caseHistory) {
		this.caseHistory = caseHistory;
	}


	protected boolean canEqual(Object other) {
		return other instanceof MyOpdPrescription;
	}

	

	public String toString() {
		return "MyOpdPrescription(opdId=" + getOpdId() + ", header=" + getHeader() + ", footer=" + getFooter()
				+ ", date=" + getDate() + ", caseHistory=" + getCaseHistory() + ")";
	}

	public MyOpdPrescription(String opdId, String header, String footer, Date date,
			List<MyOpdCaseHistory> caseHistory) {
		/* 23 */ this.opdId = opdId;
		this.header = header;
		this.footer = footer;
		this.date = date;
		this.caseHistory = caseHistory;
		/*    */ }

	/*    */
	/*    */
	/*    */ public String getOpdId() {
		/* 28 */ return this.opdId;
	}

	/* 29 */ public String getHeader() {
		return this.header;
	}

	/* 30 */ public String getFooter() {
		return this.footer;
	}

	/* 31 */ public Date getDate() {
		return this.date;
	}

	@OneToMany(targetEntity = MyOpdCaseHistory.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	/*    */ @JoinColumn(name = "pr_fk", referencedColumnName = "opdId", insertable = true, updatable = true, nullable = false)
	/* 33 */ private List<MyOpdCaseHistory> caseHistory = new ArrayList<>();

	/*    */ public List<MyOpdCaseHistory> getCaseHistory() {
		/* 35 */ return this.caseHistory;
		/*    */ }

	/*    */
	/*    */ public MyOpdPrescription() {
	}
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\modal\
 * MyOpdPrescription.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */