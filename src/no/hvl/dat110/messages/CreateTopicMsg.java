package no.hvl.dat110.messages;

/**
 * 
 * @author Emma
 *Sent by the client in order to have the broker create a topic.
 *A topic is to be identified by means of a String
 */
public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	
	// Implement object variables - a topic is required
	String topic;
	
	// Constructor, get/set-methods, and toString method
	public CreateTopicMsg(String topic, String user) {
		super(MessageType.CREATETOPIC, user);
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
