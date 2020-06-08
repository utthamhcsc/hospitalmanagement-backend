package com.hms.management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailSender {
	
	

		@Autowired
	    private static JavaMailSender javaMailSender;

public 	void sendEmail() {

	        SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo("utthamhmanju@gmail.com");

	        msg.setSubject("Hospital management");
	        msg.setText("Hello World \n Spring Boot Email");
	     
	        javaMailSender.send(msg);

	    }
  
  public static boolean sendMail(String from, String password, String message,String to ){
	  SimpleMailMessage msg = new SimpleMailMessage();
      msg.setTo(to);

      msg.setSubject("Hospital management");
      msg.setText(message);
   
      javaMailSender.send(msg);
//	 String host="smtp.gmail.com";
//	 Properties props= System.getProperties();
//	 props.put("mail.smtp.host", host);
//	 props.put("mail.smtp.user", from);
//	 props.put("mail.smtp.password", password);
//	 props.put("mail.smtp.port", 587);
//	 props.put("mail.smtp.starttls.enable", "true");
//	 props.put("mail.smtp.auth", "true");
//	 
//	 Authenticator auth = new Authenticator() {
//     public PasswordAuthentication getPasswordAuthentication() {
//             return new PasswordAuthentication(from, password);
//         }     
//     };
//	Session session=Session.getDefaultInstance(props, auth);
//	//session.setDebug(debug);	
//	MimeMessage msg = new MimeMessage(session);
//	try    
//	{
//		msg.setFrom(new InternetAddress(from));
//			InternetAddress[] toAddress= new InternetAddress[to.length()];
//		for(int i=0;i<to.length();i++){
//			toAddress[i]= new InternetAddress(to);
//		}
//		for(int i=0;i<toAddress.length;i++){
//			  msg.addRecipient(RecipientType.TO, toAddress[i]);
//		}
//		    msg.setSubject("mail using java");
//		    msg.setText(message);
//		    Transport transport= session.getTransport("smtp");
//			transport.connect(from,password);
//			transport.sendMessage(msg, msg.getAllRecipients());
//			transport.close();
//		    return true;
//	 }
//		    catch(MessagingException me){
//			me.printStackTrace();
//		}
	    return false;
	}
  public static boolean sendMailToGroup(String title,String message,List<String> to ){
	  SimpleMailMessage msg = new SimpleMailMessage();
      msg.setTo((String[]) to.toArray());

      msg.setSubject("Hospital management");
      msg.setText(message);
   
      javaMailSender.send(msg);
//		 String host="smtp.gmail.com";
//		 String from="revanhj1993@gmail.com";
//		 String password="sunday14031993";
//		 Properties props= System.getProperties();
//		 props.put("mail.smtp.host", host);
//		 props.put("mail.smtp.user", from);
//		 props.put("mail.smtp.password", password);
//		 props.put("mail.smtp.port", 587);
//		 props.put("mail.smtp.starttls.enable", "true");
//		 props.put("mail.smtp.auth", "true");
//		 
//		 Authenticator auth = new Authenticator() {
//	     public PasswordAuthentication getPasswordAuthentication() {
//	             return new PasswordAuthentication(from, password);
//	         }     
//	     };
//		Session session=Session.getDefaultInstance(props, auth);
//		//session.setDebug(debug);	
//		MimeMessage msg = new MimeMessage(session);
//		try    
//		{
//			msg.setFrom(new InternetAddress(from));
//				InternetAddress[] toAddress= new InternetAddress[to.size()];
//			for(int i=0;i<to.size();i++){
//				toAddress[i]= new InternetAddress(to.get(i));
//				 msg.addRecipient(RecipientType.TO, toAddress[i]);
//			}
//			
//			    msg.setSubject(title);
//			    msg.setText(message);
//			    Transport transport= session.getTransport("smtp");
//				transport.connect(from,password);
//				transport.sendMessage(msg, msg.getAllRecipients());
//				transport.close();
//			    return true;
//		 }
//			    catch(MessagingException me){
//				me.printStackTrace();
//			}
			    return false;
		}
public static void main(String[] args) {
	String to[]= {"utthamcsc@gmail.com","manjumadesh1993@gmail.com"};
	//System.out.println(EmailSender.sendMailToGroup("revanhj1993@gmail.com", "sunday14031993", "hello",to));
	EmailSender es=new EmailSender();
	   try {

           es.sendEmail();
           //sendEmailWithAttachment();

       } catch (Exception e) {
           e.printStackTrace();
       } 

}
	}