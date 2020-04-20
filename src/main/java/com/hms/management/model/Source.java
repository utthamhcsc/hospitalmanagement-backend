
/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "source")
/*    */ public class Source {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String source;
	private String description;

	public void setSource(String source) {
		this.source = source;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Source))
			return false;
		Source other = (Source) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$source = getSource(), other$source = other.getSource();
		if ((this$source == null) ? (other$source != null) : !this$source.equals(other$source))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		return !((this$description == null) ? (other$description != null)
				: !this$description.equals(other$description));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Source;
	}



	public String toString() {
		return "Source(id=" + getId() + ", source=" + getSource() + ", description=" + getDescription() + ")";
	}

	public Source(int id, String source, String description) {
		/* 15 */ this.id = id;
		this.source = source;
		this.description = description;
		/*    */ }

	/*    */
	/*    */ public Source() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getSource() {
		return this.source;
	}

	public String getDescription() {
		/* 23 */ return this.description;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Source.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */