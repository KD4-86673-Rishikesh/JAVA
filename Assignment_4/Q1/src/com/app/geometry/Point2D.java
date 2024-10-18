package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	int x;
	int y;
	public Point2D() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Point2D(int x, int y) 
	{
		super();
		this.x = x;
		this.y = y;
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X coordinate");
		x=sc.nextInt();
		System.out.println("Enter the value of Y coordinate");
		y=sc.nextInt();
	}
	public boolean isEqual(Point2D p2)
	{
		if(this.x== p2.x && this.y == p2.y)
		{
			System.out.println("Both points are Equal");
			this.getDetails();
			p2.getDetails();
			return true;
			
		}
		else 
		
		return false;
	}
	public void calculateDistance(Point2D p2)
	{
		double distance=Math.sqrt(Math.pow(p2.x - this.x, 2) + Math.pow(p2.y - this.y, 2));
		System.out.println("Distance ="+distance);
		
			
			
		}
	
	
	public String getDetails()
	{
		return("x axis  =  "+x+"y axis  =  "+y);
	}
	
	

}
