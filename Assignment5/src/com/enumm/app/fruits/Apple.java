package com.enumm.app.fruits;

public class Apple extends Fruit{

	public Apple(String name,String color, double weight,  boolean isFresh) {
		super(name,weight,color, isFresh);
	}

	@Override
	public String taste() {
		
		return "sweet n sour";
	}

}

