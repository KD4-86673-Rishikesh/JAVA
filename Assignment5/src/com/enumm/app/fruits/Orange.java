package com.enumm.app.fruits;

public class Orange extends Fruit {

	public Orange(String name,String color, double weight,  boolean isFresh) {
		super(name,weight,color, isFresh);
	}
	@Override
	public String taste() {
		
		 return "sour";
	}

}

