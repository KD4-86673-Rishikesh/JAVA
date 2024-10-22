package com.exception;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		
		try
		{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the String line");
		  String line=sc.next();
		  if(line.length()>80)
			     throw new ExceptionLineTooLong("The string is too long");
		  else
			     System.out.println("The length of line is "+line.length());
        }
		catch(ExceptionLineTooLong e)
		{
			System.out.println(e.getMessage());
		}
	}

}
