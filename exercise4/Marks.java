package exercise4;
import java.util.Scanner;
public class Marks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][] marks=new int[3][4];
		
		System.out.println("Enter marks: ");
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				marks[i][j]=sc.nextInt();
			}
		}
		int max=0;
		int topper=0;
		for(int i=0;i<marks.length;i++) {
			int total=0;
			for(int j=0;j<marks[i].length;j++) {
				total+=marks[i][j];
			}
			int avg=total/marks[i].length;
			System.out.println("Student "+(i+1)+" total marks: "+total);
			System.out.println("Student "+(i+1)+" average marks: "+avg);
			if(total>max) {
				max=total;
				topper=i+1;
			}
			
		}
		System.out.println("Topper Student: "+topper);
		
	}
}
