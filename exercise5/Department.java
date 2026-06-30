package exercise5;

public class Department {
	public static void main(String[] args) {
		int[][] departments = new int[3][];
		departments[0] = new int[]{101, 102, 103};
		departments[1] = new int[]{201, 202};
		departments[2] = new int[]{301, 302, 303, 304};
		
		int totalEmployees=0;
		for(int i=0;i<departments.length;i++) {
			int count=departments[i].length;
			System.out.println("Department "+(i+1)+" Employee Count: "+count);
			totalEmployees+=count;
		}
		System.out.println("Total Employees: "+totalEmployees);
	}
}
