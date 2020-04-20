
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
/*    */ @Table(name = "email_config")
/*    */ public class EmailConfig {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String emailType;
	/*    */ private String smtpServer;
	/*    */ private String smtpPort;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String smtpUsername;
	private String smtpPassword;
	private String sslTls;
	private String isActive;
	private String createdAt;

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

	public void setSmtpServer(String smtpServer) {
		this.smtpServer = smtpServer;
	}

	public void setSmtpPort(String smtpPort) {
		this.smtpPort = smtpPort;
	}

	public void setSmtpUsername(String smtpUsername) {
		this.smtpUsername = smtpUsername;
	}

	public void setSmtpPassword(String smtpPassword) {
		this.smtpPassword = smtpPassword;
	}

	public void setSslTls(String sslTls) {
		this.sslTls = sslTls;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof EmailConfig))
			return false;
		EmailConfig other = (EmailConfig) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$emailType = getEmailType(), other$emailType = other.getEmailType();
		if ((this$emailType == null) ? (other$emailType != null) : !this$emailType.equals(other$emailType))
			return false;
		Object this$smtpServer = getSmtpServer(), other$smtpServer = other.getSmtpServer();
		if ((this$smtpServer == null) ? (other$smtpServer != null) : !this$smtpServer.equals(other$smtpServer))
			return false;
		Object this$smtpPort = getSmtpPort(), other$smtpPort = other.getSmtpPort();
		if ((this$smtpPort == null) ? (other$smtpPort != null) : !this$smtpPort.equals(other$smtpPort))
			return false;
		Object this$smtpUsername = getSmtpUsername(), other$smtpUsername = other.getSmtpUsername();
		if ((this$smtpUsername == null) ? (other$smtpUsername != null) : !this$smtpUsername.equals(other$smtpUsername))
			return false;
		Object this$smtpPassword = getSmtpPassword(), other$smtpPassword = other.getSmtpPassword();
		if ((this$smtpPassword == null) ? (other$smtpPassword != null) : !this$smtpPassword.equals(other$smtpPassword))
			return false;
		Object this$sslTls = getSslTls(), other$sslTls = other.getSslTls();
		if ((this$sslTls == null) ? (other$sslTls != null) : !this$sslTls.equals(other$sslTls))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		if ((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof EmailConfig;
	}

	

	public String toString() {
		return "EmailConfig(id=" + getId() + ", emailType=" + getEmailType() + ", smtpServer=" + getSmtpServer()
				+ ", smtpPort=" + getSmtpPort() + ", smtpUsername=" + getSmtpUsername() + ", smtpPassword="
				+ getSmtpPassword() + ", sslTls=" + getSslTls() + ", isActive=" + getIsActive() + ", createdAt="
				+ getCreatedAt() + ")";
	}

	public EmailConfig(int id, String emailType, String smtpServer, String smtpPort, String smtpUsername,
			String smtpPassword, String sslTls, String isActive, String createdAt) {
		/* 17 */ this.id = id;
		this.emailType = emailType;
		this.smtpServer = smtpServer;
		this.smtpPort = smtpPort;
		this.smtpUsername = smtpUsername;
		this.smtpPassword = smtpPassword;
		this.sslTls = sslTls;
		this.isActive = isActive;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */
	/*    */ public EmailConfig() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 25 */ return this.id;
		/* 26 */ }

	public String getEmailType() {
		return this.emailType;
	}

	/* 27 */ public String getSmtpServer() {
		return this.smtpServer;
	}

	/* 28 */ public String getSmtpPort() {
		return this.smtpPort;
	}

	/* 29 */ public String getSmtpUsername() {
		return this.smtpUsername;
	}

	/* 30 */ public String getSmtpPassword() {
		return this.smtpPassword;
	}

	/* 31 */ public String getSslTls() {
		return this.sslTls;
	}

	/* 32 */ public String getIsActive() {
		return this.isActive;
	}

	public String getCreatedAt() {
		/* 33 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * EmailConfig.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */