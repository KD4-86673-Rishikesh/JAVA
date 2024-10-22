package com.question2;

import java.util.Scanner;

public class ReverseString {

	public static void Reversestr(String S)
	{
		  int n=S.length()-1;
		  String ans ="";
		  for(int i=n;i>=0;i--)
		  {
			  char c=S.charAt(i);
			  ans=ans+c;
			  
		  }
		  System.out.println("Original String : "+S);
		  System.out.println("Reversed String : "+ans);
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the String line");
		  String line=sc.next();
		 // Reversestr(line);
		  
		  StringBuffer sf1= new StringBuffer(line);
		  StringBuffer reverseline=sf1.reverse();
		  
		  System.out.println("The revered string is "+reverseline);
		  
		  

	}

}
