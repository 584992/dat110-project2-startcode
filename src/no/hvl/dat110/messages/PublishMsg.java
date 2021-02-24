package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

/**
 * 
 * @author Emma
 *
 */
public class PublishMsg extends Message {

	// message sent from client to create publish a message on a topic

	// Implement object variables - a topic and a message is required

	String message;

	String topic;

	// Constructor, get/set-methods, and toString method

	public PublishMsg(String message, String topic, String user) {
		super(MessageType.PUBLISH, user);
		this.message = message;
		this.topic = topic;
	}

	public String getMessage() {
		return message;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [type=" + super.getType() + ", topic=" + topic + ", message=" + message + ", user="
				+ super.getUser() + "]";
	};

}
