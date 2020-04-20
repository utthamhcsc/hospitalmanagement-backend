
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
/*    */ @Table(name = "print_setting")
/*    */ public class PrintSetting {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String printHeader;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String printFooter;
	private String settingFor;
	private String isActive;

	public void setPrintHeader(String printHeader) {
		this.printHeader = printHeader;
	}

	public void setPrintFooter(String printFooter) {
		this.printFooter = printFooter;
	}

	public void setSettingFor(String settingFor) {
		this.settingFor = settingFor;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PrintSetting))
			return false;
		PrintSetting other = (PrintSetting) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$printHeader = getPrintHeader(), other$printHeader = other.getPrintHeader();
		if ((this$printHeader == null) ? (other$printHeader != null) : !this$printHeader.equals(other$printHeader))
			return false;
		Object this$printFooter = getPrintFooter(), other$printFooter = other.getPrintFooter();
		if ((this$printFooter == null) ? (other$printFooter != null) : !this$printFooter.equals(other$printFooter))
			return false;
		Object this$settingFor = getSettingFor(), other$settingFor = other.getSettingFor();
		if ((this$settingFor == null) ? (other$settingFor != null) : !this$settingFor.equals(other$settingFor))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		return !((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PrintSetting;
	}

	

	public String toString() {
		return "PrintSetting(id=" + getId() + ", printHeader=" + getPrintHeader() + ", printFooter=" + getPrintFooter()
				+ ", settingFor=" + getSettingFor() + ", isActive=" + getIsActive() + ")";
	}

	public PrintSetting(int id, String printHeader, String printFooter, String settingFor, String isActive) {
		/* 15 */ this.id = id;
		this.printHeader = printHeader;
		this.printFooter = printFooter;
		this.settingFor = settingFor;
		this.isActive = isActive;
		/*    */ }

	/*    */
	/*    */ public PrintSetting() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getPrintHeader() {
		return this.printHeader;
	}

	/* 24 */ public String getPrintFooter() {
		return this.printFooter;
	}

	/* 25 */ public String getSettingFor() {
		return this.settingFor;
	}

	public String getIsActive() {
		/* 26 */ return this.isActive;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PrintSetting.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */