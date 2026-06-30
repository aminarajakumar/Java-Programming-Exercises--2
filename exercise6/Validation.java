package exercise6;
import java.util.Scanner;
public class Validation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email: ");
		String email=sc.nextLine();
		if(email.endsWith("@company.com"))
			System.out.println("Valid Company Email");
		else
			System.out.println("Invalid Company Email");

	
	}
}
