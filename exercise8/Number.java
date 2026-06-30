package exercise8;
import java.util.Scanner;
public class Number {
	public static void main(String args[]) {
		System.out.print("Enter MobileNumber: ");
		String num=new Scanner(System.in).nextLine();
		StringBuffer sb=new StringBuffer(num);
		for (int i=0; i<6;i++) {
            sb.setCharAt(i, '*');
        }
		System.out.println("Masked MobileNumber: "+sb);
		
	}
}
