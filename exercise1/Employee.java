package exercise1;
import java.util.Scanner;
public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of employees: ");
		int n=sc.nextInt();
		double[] salary=new double[n];
		double sum=0;
		System.out.println("Enter the salaries: ");
		for(int i=0;i<salary.length;i++) {
			salary[i]=sc.nextDouble();
			sum+=salary[i];
		}
		double max=salary[0];
		double min=salary[0];
		for(int i=1;i<salary.length;i++) {
			if(salary[i]>max)
				max=salary[i];
			if(salary[i]<max)
				min=salary[i];
		}
		System.out.println("Higgest Salary:"+max);
		System.out.println("Lowest Salary: "+min);
		double avg=sum/n;
		System.out.println("Average Salary: "+avg);
		int count=0;
		for(int i=0;i<salary.length;i++) {
			if(avg<salary[i])
				count++;
		}
		System.out.println("Number of employees earning above average: "+count);
		
	}

}
 