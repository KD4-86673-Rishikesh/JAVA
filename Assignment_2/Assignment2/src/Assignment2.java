import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.println("Given Number :"+n);
		System.out.println("Binary Equivalent :"+Integer.toBinaryString(n));
		System.out.println("Ocatal Equivalent :"+Integer.toOctalString(n));
		System.out.println("Hexadecimal Equivalent :"+Integer.toHexString(n));


	}

}
