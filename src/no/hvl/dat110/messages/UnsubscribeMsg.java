package no.hvl.dat110.messages;

/**
 * 
 * @author Emma
 *
 */
public class UnsubscribeMsg extends Message {
	
	//  sent by the client in order to unsubscribe from a topic

	// message sent from client to unsubscribe on a topic

	// Implement object variables - a topic is required

	String topic;

	// Constructor, get/set-methods, and toString method
	public UnsubscribeMsg(String topic, String user) {
		super(MessageType.UNSUBSCRIBE, user);
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	@Override
	public String toString() {
		return "Message [type=" + super.getType() + ", topic=" + topic +", user=" + super.getUser() + "]";
	};


}
