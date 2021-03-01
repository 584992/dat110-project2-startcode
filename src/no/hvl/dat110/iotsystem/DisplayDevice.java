package no.hvl.dat110.iotsystem;

import no.hvl.dat110.broker.Broker;
import no.hvl.dat110.broker.Dispatcher;
import no.hvl.dat110.broker.Storage;
import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

/**
 * 
 * @author vilde
 *
 */
public class DisplayDevice {
	
	/**
	 * It connects to the same broker as the sensor device, creates 
	 * a 'temperature topic', subscribes to this topic and then recieves
	 * the same number of messages as the sensor device is sending on
	 * the topic. Then -> disconnect
	 */
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		// create a client object and use it to
		Client client = null;
				
		// - connect to the broker

		
		// - create the temperature topic on the broker
		
		// - subscribe to the topic
		// - receive messages on the topic
		// - unsubscribe from the topic
		// - disconnect from the broker
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
		throw new UnsupportedOperationException(TODO.method());
		
	}
}
