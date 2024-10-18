import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the firstname");
		String firstName=sc.next();
		System.out.println("Enter the lastName");
		String lastName=sc.next();
		System.out.println("Enter the Salary");
		double salary=sc.nextDouble();
	    Employee e1=new Employee(firstName,lastName,salary);
	    System.out.println("Yearly Salary "+e1.calculateSalary());
	 
	   
	    System.out.println("Enter the firstname");
		String firstName1=sc.next();
		System.out.println("Enter the lastName");
		String lastName1=sc.next();
		System.out.println("Enter the Salary");
		double salary1=sc.nextDouble();
	    Employee e2=new Employee(firstName1,lastName1,salary1);
	    e2.setSalary(salary1);
	    System.out.println("Yearly Salary After raise of 10% "+e2.calculateSalary());
	    
	    
	}

}
