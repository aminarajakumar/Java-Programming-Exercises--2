package exercise7;
import java.util.Scanner;
public class Count {
	public static void main(String args[]) {
		System.out.print("Enter summary of resume: ");
		String summary=new Scanner(System.in).nextLine();
		int count=1;
		for(int i=0;i<summary.length();i++) {
			if(summary.charAt(i)==' ')
				count++;
		}
		System.out.println("Words count: "+count);
	}
}
