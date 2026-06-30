package exercise2;
import java.util.Scanner;
public class Element {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		int secondMax=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>secondMax && arr[i]<max)
				secondMax=arr[i];
		}
		System.out.println("Second largest element: "+secondMax);
		
		
	}
}
