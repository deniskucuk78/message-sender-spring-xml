package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMessageSender {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		EmailSender eS = ctx.getBean(EmailSender.class);
		
		Message msg = ctx.getBean(Message.class);
		
		
		eS.send(msg);

	}

}
