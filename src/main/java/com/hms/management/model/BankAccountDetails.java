/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "BankAccountDetails")
/*    */ public class BankAccountDetails {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String accountTitle;
	/*    */ private String bankName;

	/*    */
	/*    */ public BankAccountDetails(int id, String accountTitle, String bankName, String bankBranchName,
			String accountNumber, String ifscCode) {
		/* 13 */ this.id = id;
		this.accountTitle = accountTitle;
		this.bankName = bankName;
		this.bankBranchName = bankBranchName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		/*    */ }

	private String bankBranchName;
	private String accountNumber;
	private String ifscCode;

	public BankAccountDetails() {
	}

	public void setId(int id) {
		/* 15 */ this.id = id;
	}

	public void setAccountTitle(String accountTitle) {
		this.accountTitle = accountTitle;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof BankAccountDetails))
			return false;
		BankAccountDetails other = (BankAccountDetails) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$accountTitle = getAccountTitle(), other$accountTitle = other.getAccountTitle();
		if ((this$accountTitle == null) ? (other$accountTitle != null) : !this$accountTitle.equals(other$accountTitle))
			return false;
		Object this$bankName = getBankName(), other$bankName = other.getBankName();
		if ((this$bankName == null) ? (other$bankName != null) : !this$bankName.equals(other$bankName))
			return false;
		Object this$bankBranchName = getBankBranchName(), other$bankBranchName = other.getBankBranchName();
		if ((this$bankBranchName == null) ? (other$bankBranchName != null)
				: !this$bankBranchName.equals(other$bankBranchName))
			return false;
		Object this$accountNumber = getAccountNumber(), other$accountNumber = other.getAccountNumber();
		if ((this$accountNumber == null) ? (other$accountNumber != null)
				: !this$accountNumber.equals(other$accountNumber))
			return false;
		Object this$ifscCode = getIfscCode(), other$ifscCode = other.getIfscCode();
		return !((this$ifscCode == null) ? (other$ifscCode != null) : !this$ifscCode.equals(other$ifscCode));
	}

	protected boolean canEqual(Object other) {
		return other instanceof BankAccountDetails;
	}


	public String toString() {
		return "BankAccountDetails(id=" + getId() + ", accountTitle=" + getAccountTitle() + ", bankName="
				+ getBankName() + ", bankBranchName=" + getBankBranchName() + ", accountNumber=" + getAccountNumber()
				+ ", ifscCode=" + getIfscCode() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getAccountTitle() {
		return this.accountTitle;
	}

	/* 24 */ public String getBankName() {
		return this.bankName;
	}

	/* 25 */ public String getBankBranchName() {
		return this.bankBranchName;
	}

	/* 26 */ public String getAccountNumber() {
		return this.accountNumber;
	}

	public String getIfscCode() {
		/* 27 */ return this.ifscCode;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * BankAccountDetails.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */