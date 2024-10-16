import java.util.Scanner;

public class Question2 {
	
	public static int Menu() {
	  Scanner sc = new Scanner(System.in);
	  int choice;
	  System.out.println("Menu card");
	  System.out.println("1.Dosa .........Rs 80");
	  System.out.println("2.Idli..........Rs 60");
	  System.out.println("3.Aamboli.......Rs 110");
	  System.out.println("4.Butter roti...Rs 30");
	  System.out.println("5.Aakha Masoora.Rs 160");
	  System.out.println("6.Masala Paneer.Rs 180");
	  System.out.println("7.Gulab Jamun...Rs 50");
	  System.out.println("8.misal pav.....Rs 100");
	  System.out.println("9.Pav Bhaji.....Rs 80");
	  System.out.println("10.Extra Pav....Rs 20");
	  System.out.println("11.Calculate Bill");
	  System.out.println("12.Exit");
	  
	  System.out.println("Enter your choice");
	  choice=sc.nextInt();
	  return choice;
	}
	
	
public static void main(String[] args) 
   { 
	Scanner sc = new Scanner(System.in);
	 int ch;
	  int total=0;
	  while((ch=Menu())!=13)
	 {    
		  
		  switch(ch)
		  {
		    		     
		     case 1:
		     {
			     System.out.println("Enter the quantity of food");
			    int q=sc.nextInt();
			    total +=q*80;
			 }
		      break;
		     case 2:
		     {
			     System.out.println("Enter the quantity of food");
			    int q=sc.nextInt();
			    total +=q*60;
			 }
		      break;
		     case 3:
		     {
			     System.out.println("Enter the quantity of food");
			    int q=sc.nextInt();
			    total +=q*110;
			 }
		      break;
		     case 4:
		     {
			     System.out.println("Enter the quantity of food");
			    int q=sc.nextInt();
			    total +=q*30;
			 }
		      break;
		     case 5:
		     {
			     System.out.println("Enter the quantity of food");
			    int q=sc.nextInt();
			    total +=q*160;
			 }
		      break;
		     case 6:
		     {
			     System.out.println("Enter the quantity of food");
			    int q=sc.nextInt();
			    total +=q*180;
			 }
		      break;
		     case 7:
		     {
			     System.out.println("Enter the quantity of food");
			    int q=sc.nextInt();
			    total +=q*50;
			 }
		      break;
		     case 8:
		     {
			     System.out.println("Enter the quantity of food");
			    int q=sc.nextInt();
			    total +=q*100;
			 }
		      break;
		     case 9:
		     {
		    	  System.out.println("Enter the quantity of food");
				    int q=sc.nextInt();
				    total +=q*80;
			 }
		     break;
		     case 10:
		     {
		    	  System.out.println("Enter the quantity of food");
				    int q=sc.nextInt();
				    total +=q*20;
			 }
		     break;
		     case 11:
		     {
			     System.out.println("Total amount "+total);
			     System.exit(0);
			 }
		     break;
		     case 12:
		     {
			     System.out.println("Exit ");
			     System.exit(0);
			 }
		     break;
		      
		  }
	  }
	  
	  
  }
}
