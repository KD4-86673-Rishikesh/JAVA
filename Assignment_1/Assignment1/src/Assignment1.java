import java.util.Scanner;

class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
          Scanner sc = new Scanner(System.in);
          double number1=0;
          double number2=0;
          boolean status = true;
          System.out.println("Enter the value 1");
          
          if(sc.hasNextDouble())
          {
        	 if(sc.hasNextInt())
        	 {
        		 System.out.println("Please enter floating interger");
        		 status=false;
        	 }
        	 else
        	 {
        	    number1=sc.nextDouble();
        	 }
          }
          else
          {
        	  System.out.println("PLease enter double number");
        	  status=false;
          }
          
          if(status)
          {
        	  System.out.println("Enter the 2 nd value");
             if(sc.hasNextDouble())
             {
        	       if(sc.hasNextInt())
        	      {
        		      System.out.println("Please enter floating interger");
        	      }
        	      else
        	      {
        	          number2=sc.nextDouble();
        	          System.out.println("Avarage :"+((number1+number2)/2));
        	       }
             }
             else
             {
           	  System.out.println("PLease enter double number");
             }
          }
          
        	     
	}

}
