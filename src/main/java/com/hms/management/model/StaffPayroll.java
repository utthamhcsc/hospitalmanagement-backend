/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "staff_payroll")
/*    */ public class StaffPayroll {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int basicSalary;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String payScale;
	private String grade;
	private String isActive;

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public void setPayScale(String payScale) {
		this.payScale = payScale;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof StaffPayroll))
			return false;
		StaffPayroll other = (StaffPayroll) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getBasicSalary() != other.getBasicSalary())
			return false;
		Object this$payScale = getPayScale(), other$payScale = other.getPayScale();
		if ((this$payScale == null) ? (other$payScale != null) : !this$payScale.equals(other$payScale))
			return false;
		Object this$grade = getGrade(), other$grade = other.getGrade();
		if ((this$grade == null) ? (other$grade != null) : !this$grade.equals(other$grade))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		return !((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive));
	}

	protected boolean canEqual(Object other) {
		return other instanceof StaffPayroll;
	}

	
	public String toString() {
		return "StaffPayroll(id=" + getId() + ", basicSalary=" + getBasicSalary() + ", payScale=" + getPayScale()
				+ ", grade=" + getGrade() + ", isActive=" + getIsActive() + ")";
	}

	public StaffPayroll(int id, int basicSalary, String payScale, String grade, String isActive) {
		/* 15 */ this.id = id;
		this.basicSalary = basicSalary;
		this.payScale = payScale;
		this.grade = grade;
		this.isActive = isActive;
		/*    */ }

	/*    */
	/*    */ public StaffPayroll() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public int getBasicSalary() {
		return this.basicSalary;
	}

	/* 24 */ public String getPayScale() {
		return this.payScale;
	}

	/* 25 */ public String getGrade() {
		return this.grade;
	}

	public String getIsActive() {
		/* 26 */ return this.isActive;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * StaffPayroll.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */