package learntestng;

import org.testng.annotations.Test;

//Read data from other class
public class BringDataFromAnotherClass {
	@Test(dataProvider = "ticketData", dataProviderClass = GetTogether.class)
	public void bookMyFlightTickets(String fromAddress, String toAddress, String noOfTickets) {
		System.out.println("fromAddress is " + fromAddress + " and to address is " + toAddress + " And I need " + noOfTickets + " tickets to be booked.");
	}
}
