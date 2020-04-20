/*    */
package com.hms.management.model;

/*    */
/*    */ import java.util.Date;

/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "ambulance_call")
/*    */ public class AmbulanceCall {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String patienName;
	/*    */ private String contactNo;
	/*    */ private String address;
	/*    */ private String vehicleNo;

	/*    */
	/* 18 */ public void setId(int id) {
		this.id = id;
	}

	private String vehicleModel;
	private String driver;
	private float amount;
	private String date;
	private Date createdAt;
	private Date updatedAt;

	public void setPatienName(String patienName) {
		this.patienName = patienName;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof AmbulanceCall))
			return false;
		AmbulanceCall other = (AmbulanceCall) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$patienName = getPatienName(), other$patienName = other.getPatienName();
		if ((this$patienName == null) ? (other$patienName != null) : !this$patienName.equals(other$patienName))
			return false;
		Object this$contactNo = getContactNo(), other$contactNo = other.getContactNo();
		if ((this$contactNo == null) ? (other$contactNo != null) : !this$contactNo.equals(other$contactNo))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		Object this$vehicleNo = getVehicleNo(), other$vehicleNo = other.getVehicleNo();
		if ((this$vehicleNo == null) ? (other$vehicleNo != null) : !this$vehicleNo.equals(other$vehicleNo))
			return false;
		Object this$vehicleModel = getVehicleModel(), other$vehicleModel = other.getVehicleModel();
		if ((this$vehicleModel == null) ? (other$vehicleModel != null) : !this$vehicleModel.equals(other$vehicleModel))
			return false;
		Object this$driver = getDriver(), other$driver = other.getDriver();
		if ((this$driver == null) ? (other$driver != null) : !this$driver.equals(other$driver))
			return false;
		if (Float.compare(getAmount(), other.getAmount()) != 0)
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof AmbulanceCall;
	}

	public String toString() {
		return "AmbulanceCall(id=" + getId() + ", patienName=" + getPatienName() + ", contactNo=" + getContactNo()
				+ ", address=" + getAddress() + ", vehicleNo=" + getVehicleNo() + ", vehicleModel=" + getVehicleModel()
				+ ", driver=" + getDriver() + ", amount=" + getAmount() + ", date=" + getDate() + ", createdAt="
				+ getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public AmbulanceCall(int id, String patienName, String contactNo, String address, String vehicleNo,
			String vehicleModel, String driver, float amount, String date, Date createdAt, Date updatedAt) {
		/* 19 */ this.id = id;
		this.patienName = patienName;
		this.contactNo = contactNo;
		this.address = address;
		this.vehicleNo = vehicleNo;
		this.vehicleModel = vehicleModel;
		this.driver = driver;
		this.amount = amount;
		this.date = date;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */ public AmbulanceCall() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 28 */ return this.id;
		/* 29 */ }

	public String getPatienName() {
		return this.patienName;
	}

	/* 30 */ public String getContactNo() {
		return this.contactNo;
	}

	/* 31 */ public String getAddress() {
		return this.address;
	}

	/* 32 */ public String getVehicleNo() {
		return this.vehicleNo;
	}

	/* 33 */ public String getVehicleModel() {
		return this.vehicleModel;
	}

	/* 34 */ public String getDriver() {
		return this.driver;
	}

	/* 35 */ public float getAmount() {
		return this.amount;
	}

	/* 36 */ public String getDate() {
		return this.date;
	}

	/* 37 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		/* 38 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * AmbulanceCall.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */