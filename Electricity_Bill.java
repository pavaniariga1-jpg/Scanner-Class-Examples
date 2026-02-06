package scannerExamples;
import java.util.Scanner;
public class Electricity_Bill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units Consumed:");
		int units=sc.nextInt();
		int bill;
		if (units<=100) {
			bill = units*200;
		} else {
			bill = units*500;
		}
		System.out.println("Electricity Bill=RS"+bill);
		sc.close();
	}	
}
