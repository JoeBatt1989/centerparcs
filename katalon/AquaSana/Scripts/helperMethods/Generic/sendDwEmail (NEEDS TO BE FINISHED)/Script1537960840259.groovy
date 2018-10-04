import javax.mail.Message
import javax.mail.Session
import javax.mail.Transport
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage
import internal.GlobalVariable as GlobalVariable

private void runScript() {
	
	java.lang.String MAILER_HOST = "smtp.gmail.com"
	java.lang.String MAILER_USER = "centerparcsauto@gmail.com" 
	java.lang.String MAILER_PASS = "P455word123" 
	int MAILER_PORT = 465
	
	Properties properties = System.getProperties()
	properties.put("mail.smtp.host", MAILER_HOST);
	properties.put("mail.smtp.user", MAILER_USER);
	properties.put("mail.smtp.password", MAILER_PASS);
	properties.put("mail.smtp.port", MAILER_PORT);
	properties.put("mail.smtp.socketFactory.port", MAILER_PORT);
	properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	
	Session session = Session.getDefaultInstance(properties)

	MimeMessage message = new MimeMessage(session)
	message.setFrom("no.reply@example.org")
	message.setRecipient(Message.RecipientType.TO, new InternetAddress("joe.batt@centerparcs.co.uk"))
	message.setSubject("Data Warehouse Check")
	message.setText("Would you check the following details in DW after 24 hours please?" 
		+"\r\n"
		+"\r\n Username: cpsit.tester1+" + GlobalVariable.guestEmailAddress +"@gmail.com" 
		+"\r\n Email Preferences: " + GlobalVariable.emailComms
		+"\r\n Post Preferences: " + GlobalVariable.postComms
		+"\r\n SMS Preferences: " + GlobalVariable.smsComms)

	Transport transport = session.getTransport("smtp")
	transport.connect(MAILER_HOST, MAILER_PORT, MAILER_USER, MAILER_PASS)
	transport.sendMessage(message, message.getAllRecipients())
	transport.close()
}

runScript()