package no.hvl.dat110.messages;


/**
 * 
 * @author Magnus
 *
 */
public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required
	String topic;
	
	public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
		this.topic = topic;
	}

	// Constructor, get/set-methods, and toString method
	// as described in the project text
		
}
