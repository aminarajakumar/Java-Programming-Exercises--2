package exercise3;
import java.util.Scanner;
public class Zeroes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				j++;
			}
		}
		System.out.println("Moving zeroes to the end: ");
		for(int num:array)
			System.out.print(num+" ");
	    }
}
