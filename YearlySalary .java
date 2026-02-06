package scannerExamples;
import java.util.Scanner;
public class YearlySalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee monthly salary:");
        double monthlySalary = sc.nextDouble();

        double yearlySalary = monthlySalary * 12;

        System.out.println("Total salary per year: Rs. " + yearlySalary);

        sc.close();
	}
}
