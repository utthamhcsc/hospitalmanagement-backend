/*    */ package com.hms.management.model;
/*    */ 
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "follow_up")
/*    */ public class FollowUp {
/*    */   @Id
/*    */   @GeneratedValue(strategy = GenerationType.AUTO)
/*    */   private int id;
/*    */   private int enquiryId;
/*    */   private String date;
/*    */   
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String nextDate;
	private String response;
	private String note;
	private String followupBy;

	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setNextDate(String nextDate) {
		this.nextDate = nextDate;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setFollowupBy(String followupBy) {
		this.followupBy = followupBy;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof FollowUp))
			return false;
		FollowUp other = (FollowUp) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getEnquiryId() != other.getEnquiryId())
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$nextDate = getNextDate(), other$nextDate = other.getNextDate();
		if ((this$nextDate == null) ? (other$nextDate != null) : !this$nextDate.equals(other$nextDate))
			return false;
		Object this$response = getResponse(), other$response = other.getResponse();
		if ((this$response == null) ? (other$response != null) : !this$response.equals(other$response))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$followupBy = getFollowupBy(), other$followupBy = other.getFollowupBy();
		return !((this$followupBy == null) ? (other$followupBy != null) : !this$followupBy.equals(other$followupBy));
	}

	protected boolean canEqual(Object other) {
		return other instanceof FollowUp;
	}

	
/*    */   public FollowUp() {}
/*    */   
/*    */   public int getId()
/*    */   {
/* 24 */     return this.id;
/* 25 */   } public int getEnquiryId() { return this.enquiryId; }
/* 26 */   public String getDate() { return this.date; }
/* 27 */   public String getNextDate() { return this.nextDate; }
/* 28 */   public String getResponse() { return this.response; }
/* 29 */   public String getNote() { return this.note; } public String getFollowupBy() {
/* 30 */     return this.followupBy;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\FollowUp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */