package exercise9;

class Employees {
int EmployeeId;
String EmployeeName;
String Department;
double Salary;
public Employees(int EmployeeId,String EmployeeName,String Department,double Salary) {
	this.EmployeeId=EmployeeId;
	this.EmployeeName=EmployeeName;
	this.Department=Department;
	this.Salary=Salary;
}
public void displayEmployee() {
	System.out.print("EmployeeId: "+EmployeeId+"\nEmployeeName: "+EmployeeName+"\nDepartment: "+Department+"\nSalary: "+Salary);
}
}
class Employee{
	public static void main(String args[]) {
		Employees emp=new Employees(101,"Amina","Software Development",25000);
		emp.displayEmployee();
	}
	
}
