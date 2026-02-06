package scannerExamples;
import java.util.Scanner;
public class BusTicketBooking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int priceperseat=100;
		System.out.println("Enter number of seats:");
		int seats = sc.nextInt();
		int totalAmount = priceperseat * seats;
		System.out.println("Total ticket price for " + seats + " seats is: Rs. " + totalAmount);
		sc.close();	
	}
}
