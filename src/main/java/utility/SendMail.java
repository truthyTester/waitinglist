//package utility;
//
//import java.util.Properties;
//
//public class SendMail {
//    final String username = "YourEmail";
//    final String password = "YourPassword";
//
//    Properties props = new Properties();
//    props.put("mail.smtp.auth", "true");
//    props.put("mail.smtp.starttls.enable", "true");
//    props.put("mail.smtp.host", "mail.google.com");
//    props.put("mail.smtp.port", "25");
//    props.put("java.net.preferIPv4Stack", "true");
//
//    Session session = Session.getInstance(props,
//            new javax.mail.Authenticator() {
//                protected PasswordAuthentication getPasswordAuthentication() {
//                    return new PasswordAuthentication(username, password);
//                }
//            });
//
//    try {
//
//        Message message = new MimeMessage(session);
//        message.setFrom(new InternetAddress("YourEmail"));
//        message.setRecipients(Message.RecipientType.TO,
//                InternetAddress.parse("Emailid to which you want to send Report"));
//        message.setSubject("Email Subject");
//
//
//
//        BodyPart messageBodyPart1 = new MimeBodyPart();
//        messageBodyPart1.setText("Body text);
//
////4) create new MimeBodyPart object and set DataHandler object to this object
//                MimeBodyPart messageBodyPart2 = new MimeBodyPart();
//
//        String filename = "File path if you want to attach in mail";//change accordingly
//        DataSource source = new FileDataSource(filename);
//        messageBodyPart2.setDataHandler(new DataHandler(source));
//        messageBodyPart2.setFileName(filename);
//
//
////5) create Multipart object and add MimeBodyPart objects to this object
//        Multipart multipart = new MimeMultipart();
//        multipart.addBodyPart(messageBodyPart1);
//        multipart.addBodyPart(messageBodyPart2);
//
////6) set the multiplart object to the message object
//        message.setContent(multipart );
//        Transport.send(message);
//
//        System.out.println("Mail Sent Successfully");
//
//    } catch (MessagingException e) {
//        throw new RuntimeException(e);
//    }
//}
