package learntestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//Read the data with in the same class
public class GetTogether {
	@Test(dataProvider = "ticketData")
	public void bookMyFlightTickets
	(String fromAddress, String toAddress, String noOfTickets) {
		System.out.println
("fromAddress is " + fromAddress + " and to address is " + toAddress + " And I need " + noOfTickets + " tickets to be booked.");
	}
	@DataProvider
	public Object[][] ticketData() {
		Object[][] obj=new Object[4][3];
		
		obj[0][0] = "Delhi";
		obj[0][1] = "Bengaluru";
		obj[0][2] = "10";
		
		obj[1][0] = "Hyderabad";
		obj[1][1] = "Bengaluru";
		obj[1][2] = "5";
		
		obj[2][0] = "Chennai";
		obj[2][1] = "Bengaluru";
		obj[2][2] = "3";
		
		obj[3][0] = "Mumbai";
		obj[3][1] = "Bengaluru";
		obj[3][2] = "24";
		
		return obj;
		
	}
}
