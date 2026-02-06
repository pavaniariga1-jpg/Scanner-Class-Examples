package scannerExamples;
import java.util.Scanner;
public class LoginSystem {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String Username="adminer";
		String Password="@9864";
		System.out.println("Enter Username");
		String User=sc.next();
		System.out.println("Enter Password");
		String pass=sc.next();
		if (User.equals(Username) && pass.equals(Password)) {
			System.out.println("Login Successfull");
		} else if(!User.equals(Username)) {
			System.out.println("You're not Adminer");	
		} else {
			System.out.println("Invalid Password");
		}
		sc.close();
	}
}
