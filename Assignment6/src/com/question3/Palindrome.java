package com.question3;

import java.util.Scanner;

public class Palindrome {

	public static void checkPalindrome(String S)
	{
		  int r=S.length()-1;
		  int l=0;
		  boolean flag=true;
		  while(l<r)
		  {
			 if(S.charAt(l)!=S.charAt(r))
				   flag=false;
			 l++;
			 r--;
		  }
		  if(flag)
		  {
			  System.out.println("The given strings are palindrome");
		  }
		  else
		  {
			  System.out.println("The given strings are not palindrome");
		  }
		  
		  
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the String line");
		  String line=sc.next();
		  
		  
		  StringBuffer sf1= new StringBuffer(line);
		  sf1.reverse();
		  String s2 = sf1.toString();
		  
		  if(line.equals(s2))
			  System.out.println("The string is palindrome");
		  else
		       System.out.println("The string is not palindrome ");
			      
		  //System.out.println(sf1);
		  
//		  StringBuffer reverseline=new StringBuffer(line).reverse();
//		  if(sf1.toString().equals(reverseline.toString()))
//				  System.out.println("The string is palindrome");
//		  else
//			    System.out.println("The string is not palindrome ");
		 
		  //checkPalindrome(line);
		  

	}

}
