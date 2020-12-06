package Constructors;

class Employee{
	int empId;
	String empName;
	// A Default Constructor
	Employee(int e , String en){
		System.out.println ("\nObject Created…… ");
		empId = e;
		empName = en;
	}
}
public class EmployeeTest{
	public static void main(String args[]){
		Employee emp1 = new Employee(123, "Mohan");
		System.out.println ("Emp Id =" + emp1.empId);
		System.out.println ("Emp Name =" + emp1.empName);
		Employee emp2 = new Employee(122,"Ram");
		System.out.println ("Emp Id =" + emp2.empId);
		System.out.println ("Emp Name =" + emp2.empName);
	}
}