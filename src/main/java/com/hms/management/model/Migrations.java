/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "migrations")
/*    */ public class Migrations {
	/*    */ @Id
	/*    */ private int version;

	/*    */
	/* 12 */ public void setVersion(int version) {
		this.version = version;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Migrations))
			return false;
		Migrations other = (Migrations) o;
		return !other.canEqual(this) ? false : (!(getVersion() != other.getVersion()));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Migrations;
	}

	
	public String toString() {
		return "Migrations(version=" + getVersion() + ")";
	}

	public Migrations(int version) {
		/* 13 */ this.version = version;
		/*    */ }

	/*    */
	/*    */ public Migrations() {
	}

	/*    */
	/*    */ public int getVersion() {
		/* 19 */ return this.version;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Migrations
 * .class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */