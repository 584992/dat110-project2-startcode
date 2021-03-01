package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

/**
 * 
 * @author Regine
 *
 */
public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();
		

		// TODO - start

		// create a client object and use it to
		Client client = new Client("bruker", Common.BROKERHOST, Common.BROKERPORT );
		// - connect to the broker
		client.connect();
		// - publish the temperature(s)
		int temp = sn.read();
		client.publish(Common.TEMPTOPIC, String.valueOf(temp));
		// - disconnect from the broker
		client.disconnect();

		// TODO - end

		System.out.println("Temperature device stopping ... ");


	}
}
