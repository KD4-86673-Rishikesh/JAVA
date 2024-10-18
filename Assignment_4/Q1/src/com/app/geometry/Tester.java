package com.app.geometry;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1=new Point2D();
		p1.accept();
	
		
		Point2D p2=new Point2D();
		p2.accept();
		
		
		if(p1.isEqual(p2))
				{
			System.out.println(p1.getDetails());
			System.out.println(p2.getDetails());
				}
		else
		{
			System.out.println("Points are not equal");
			
			
			
		}
		
		p1.calculateDistance(p2);
		
		
		
		
		

	}

}
