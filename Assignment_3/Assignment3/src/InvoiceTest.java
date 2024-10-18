import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the part number");
		String partNumber=sc.next();
		System.out.println("Enter the part description");
		String partDescription=sc.next();
		System.out.println("Enter the part quantiity");
		int quantity=sc.nextInt();
		System.out.println("Enter the part price");
		double price=sc.nextDouble();
		Invoice i= new Invoice(partNumber,partDescription,quantity,price);
		System.out.println("Amount= "+i.calculateAmount());
	}

}
