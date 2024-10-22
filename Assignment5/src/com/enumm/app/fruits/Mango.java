package com.enumm.app.fruits;

public class Mango extends Fruit {

	public Mango(String name,String color, double weight,  boolean isFresh) {
		super(name,weight,color, isFresh);
	}

	@Override
	public String taste() {
		
		return "sweet";
	}

}
