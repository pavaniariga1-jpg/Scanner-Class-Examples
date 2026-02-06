import java.util.Scanner;
public class WaterTankLevel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter water level percentage(0 to 100):");
		int level=sc.nextInt();
		if (level<0 || level>100) {
			System.out.println("Invalid water level");
		} else if (level<30) {
			System.out.println("Water Level:Low");
		} else if (level<=70) {
			System.out.println("Water Level:Medium");
		} else {
			System.out.println("Water Level:High");
		}
		sc.close();	
	}
}
