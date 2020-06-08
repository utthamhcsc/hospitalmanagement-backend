package com.hms.management.userlog.modal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
/*    */ @Table(name = "userlog")
/*    */ public class Userlog {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String user;
	/*    */ private String role;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String ipaddress;
	private String userAgent;
	@Temporal(TemporalType.TIMESTAMP)
	private Date loginDatetime;

	public void setUser(String user) {
		this.user = user;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public void setLoginDatetime(Date loginDatetime) {
		this.loginDatetime = loginDatetime;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Userlog))
			return false;
		Userlog other = (Userlog) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$user = getUser(), other$user = other.getUser();
		if ((this$user == null) ? (other$user != null) : !this$user.equals(other$user))
			return false;
		Object this$role = getRole(), other$role = other.getRole();
		if ((this$role == null) ? (other$role != null) : !this$role.equals(other$role))
			return false;
		Object this$ipaddress = getIpaddress(), other$ipaddress = other.getIpaddress();
		if ((this$ipaddress == null) ? (other$ipaddress != null) : !this$ipaddress.equals(other$ipaddress))
			return false;
		Object this$userAgent = getUserAgent(), other$userAgent = other.getUserAgent();
		if ((this$userAgent == null) ? (other$userAgent != null) : !this$userAgent.equals(other$userAgent))
			return false;
		Object this$loginDatetime = getLoginDatetime(), other$loginDatetime = other.getLoginDatetime();
		return !((this$loginDatetime == null) ? (other$loginDatetime != null)
				: !this$loginDatetime.equals(other$loginDatetime));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Userlog;
	}



	public String toString() {
		return "Userlog(id=" + getId() + ", user=" + getUser() + ", role=" + getRole() + ", ipaddress=" + getIpaddress()
				+ ", userAgent=" + getUserAgent() + ", loginDatetime=" + getLoginDatetime() + ")";
	}

	public Userlog(int id, String user, String role, String ipaddress, String userAgent, Date loginDatetime) {
		/* 17 */ this.id = id;
		this.user = user;
		this.role = role;
		this.ipaddress = ipaddress;
		this.userAgent = userAgent;
		this.loginDatetime = loginDatetime;
		/*    */ }

	/*    */
	/*    */ public Userlog() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getUser() {
		return this.user;
	}

	/* 26 */ public String getRole() {
		return this.role;
	}

	/* 27 */ public String getIpaddress() {
		return this.ipaddress;
	}

	/* 28 */ public String getUserAgent() {
		return this.userAgent;
	}

	public Date getLoginDatetime() {
		/* 29 */ return this.loginDatetime;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Userlog.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */