import java.io.*;
public class EmployeeTest{
	
	public static void main(String[] args) {
		Employee empOne = new Employee("RUN00B1");
		Employee empTwo = new Employee("RUN00B2");
		
		empOne.empAge(26);
		empOne.empDesignation("高级程序员");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("菜鸟程序员");
		empTwo.empSalary(500);
		empTwo.printEmployee();
		
	}
}