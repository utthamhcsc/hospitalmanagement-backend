/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "item_supplier")
/*    */ public class ItemSupplier {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String itemSupplier;
	/*    */ private String phone;
	/*    */ private String email;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String address;
	private String contactPersonName;
	private String contactPersonPhone;
	private String contactPersonEmail;
	private String description;

	public void setItemSupplier(String itemSupplier) {
		this.itemSupplier = itemSupplier;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}

	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ItemSupplier))
			return false;
		ItemSupplier other = (ItemSupplier) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$itemSupplier = getItemSupplier(), other$itemSupplier = other.getItemSupplier();
		if ((this$itemSupplier == null) ? (other$itemSupplier != null) : !this$itemSupplier.equals(other$itemSupplier))
			return false;
		Object this$phone = getPhone(), other$phone = other.getPhone();
		if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
			return false;
		Object this$email = getEmail(), other$email = other.getEmail();
		if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		Object this$contactPersonName = getContactPersonName(), other$contactPersonName = other.getContactPersonName();
		if ((this$contactPersonName == null) ? (other$contactPersonName != null)
				: !this$contactPersonName.equals(other$contactPersonName))
			return false;
		Object this$contactPersonPhone = getContactPersonPhone(),
				other$contactPersonPhone = other.getContactPersonPhone();
		if ((this$contactPersonPhone == null) ? (other$contactPersonPhone != null)
				: !this$contactPersonPhone.equals(other$contactPersonPhone))
			return false;
		Object this$contactPersonEmail = getContactPersonEmail(),
				other$contactPersonEmail = other.getContactPersonEmail();
		if ((this$contactPersonEmail == null) ? (other$contactPersonEmail != null)
				: !this$contactPersonEmail.equals(other$contactPersonEmail))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		return !((this$description == null) ? (other$description != null)
				: !this$description.equals(other$description));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ItemSupplier;
	}


	public String toString() {
		return "ItemSupplier(id=" + getId() + ", itemSupplier=" + getItemSupplier() + ", phone=" + getPhone()
				+ ", email=" + getEmail() + ", address=" + getAddress() + ", contactPersonName="
				+ getContactPersonName() + ", contactPersonPhone=" + getContactPersonPhone() + ", contactPersonEmail="
				+ getContactPersonEmail() + ", description=" + getDescription() + ")";
	}

	public ItemSupplier(int id, String itemSupplier, String phone, String email, String address,
			String contactPersonName, String contactPersonPhone, String contactPersonEmail, String description) {
		/* 15 */ this.id = id;
		this.itemSupplier = itemSupplier;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.contactPersonName = contactPersonName;
		this.contactPersonPhone = contactPersonPhone;
		this.contactPersonEmail = contactPersonEmail;
		this.description = description;
		/*    */ }

	/*    */
	/*    */ public ItemSupplier() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getItemSupplier() {
		return this.itemSupplier;
	}

	/* 23 */ public String getPhone() {
		return this.phone;
	}

	/* 24 */ public String getEmail() {
		return this.email;
	}

	/* 25 */ public String getAddress() {
		return this.address;
	}

	/* 26 */ public String getContactPersonName() {
		return this.contactPersonName;
	}

	/* 27 */ public String getContactPersonPhone() {
		return this.contactPersonPhone;
	}

	/* 28 */ public String getContactPersonEmail() {
		return this.contactPersonEmail;
	}

	public String getDescription() {
		/* 29 */ return this.description;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * ItemSupplier.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */