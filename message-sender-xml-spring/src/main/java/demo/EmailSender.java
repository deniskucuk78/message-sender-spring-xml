package demo;

public class EmailSender implements MessageSender {


	public void send(Message msg) {
	
		System.out.println("Votre email est :" + msg);
	}

}
