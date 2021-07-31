package com.hms.management;

import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailSender {
	
	


  
  public static boolean sendMail(String from, String password, String message,String to ){

	  String host="smtp.gmail.com";
	final String	 from1="modicumhospital@gmail.com";
	final String	 password1="modicum@22";
	 Properties props= System.getProperties();
	 props.put("mail.smtp.host", host);
	 props.put("mail.smtp.user", from1);
	 props.put("mail.smtp.password", password1);
	 props.put("mail.smtp.port", 587);
	 props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	 props.put("mail.smtp.starttls.enable", "true");
	 props.put("mail.smtp.auth", "true");
	 
	 Authenticator auth = new Authenticator() {
	     public PasswordAuthentication getPasswordAuthentication() {
	             return new PasswordAuthentication(from1, password1);
	         }     
	     };
	Session session=Session.getDefaultInstance(props, auth);
//	session.setDebug(debug);	
	MimeMessage msg = new MimeMessage(session);
	try    
	{
		msg.setFrom(new InternetAddress(from1));
			InternetAddress[] toAddress= new InternetAddress[to.length()];
		for(int i=0;i<to.length();i++){
			toAddress[i]= new InternetAddress(to);
		}
		for(int i=0;i<toAddress.length;i++){
			  msg.addRecipient(RecipientType.TO, toAddress[i]);
		}
		    msg.setSubject("mail using java");
		    msg.setText(message);
		    Transport transport= session.getTransport("smtp");
			transport.connect(from1,password1);
		transport.sendMessage(msg, msg.getAllRecipients());
		transport.close();
	    return true;
		}		    catch(MessagingException me){
		me.printStackTrace();
	}
	    return false;
	}
  public static boolean sendMailToGroup(String title,String message,List<String> to ){

    //  javaMailSender.send(msg);
		 String host="smtp.gmail.com";
		 String from="modicumhospital@gmail.com";
		 String password="modicum@22";
		 Properties props= System.getProperties();
		 props.put("mail.smtp.host", host);
		 props.put("mail.smtp.user", from);
		 props.put("mail.smtp.password", password);
		 props.put("mail.smtp.port", 587);
		 props.put("mail.smtp.starttls.enable", "true");
		 props.put("mail.smtp.auth", "true");
		 
		 Authenticator auth = new Authenticator() {
	     public PasswordAuthentication getPasswordAuthentication() {
	             return new PasswordAuthentication(from, password);
	         }     
	     };
		Session session=Session.getDefaultInstance(props, auth);
		//session.setDebug(debug);	
		MimeMessage msg = new MimeMessage(session);
		try    
		{
			msg.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress= new InternetAddress[to.size()];
			for(int i=0;i<to.size();i++){
				toAddress[i]= new InternetAddress(to.get(i));
				 msg.addRecipient(RecipientType.TO, toAddress[i]);
			}
			
			    msg.setSubject(title);
			    msg.setText(message);
			    Transport transport= session.getTransport("smtp");
				transport.connect(from,password);
				transport.sendMessage(msg, msg.getAllRecipients());
				transport.close();
			    return true;
		 }
			    catch(MessagingException me){
				me.printStackTrace();
			}
			    return false;
		}
public static void main(String[] args) {


}
	}