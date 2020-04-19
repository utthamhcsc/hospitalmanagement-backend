/*    */
package com.hms.management.ipd.modal;

/*    */
/*    */ import java.util.ArrayList;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import javax.persistence.CascadeType;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "myIpdprescription")
/*    */ public class MyIpdPrescription {
	/*    */ @Id
	/*    */ @GeneratedValue
	/*    */ private int id;
	/*    */ private String ipdId;

	/*    */
	/* 23 */ public void setId(int id) {
		this.id = id;
	}

	private String header;
	private String footer;
	private Date date;

	public void setIpdId(String ipdId) {
		this.ipdId = ipdId;
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

	public void setCaseHistory(List<MyIpdCaseHistory> caseHistory) {
		this.caseHistory = caseHistory;
	}

	protected boolean canEqual(Object other) {
		return other instanceof MyIpdPrescription;
	}

	public String toString() {
		return "MyIpdPrescription(id=" + getId() + ", ipdId=" + getIpdId() + ", header=" + getHeader() + ", footer="
				+ getFooter() + ", date=" + getDate() + ", caseHistory=" + getCaseHistory() + ")";
	}

	public MyIpdPrescription(int id, String ipdId, String header, String footer, Date date,
			List<MyIpdCaseHistory> caseHistory) {
		/* 24 */ this.id = id;
		this.ipdId = ipdId;
		this.header = header;
		this.footer = footer;
		this.date = date;
		this.caseHistory = caseHistory;
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 30 */ return this.id;
		/* 31 */ }

	public String getIpdId() {
		return this.ipdId;
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

	@OneToMany(targetEntity = MyIpdCaseHistory.class, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	/*    */ @JoinColumn(name = "pr_fk", referencedColumnName = "id", insertable = true, updatable = true, nullable = false)
	/* 36 */ private List<MyIpdCaseHistory> caseHistory = new ArrayList<>();

	/*    */ public List<MyIpdCaseHistory> getCaseHistory() {
		/* 38 */ return this.caseHistory;
		/*    */ }

	/*    */
	/*    */ public MyIpdPrescription() {
	}
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\modal\
 * MyIpdPrescription.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */