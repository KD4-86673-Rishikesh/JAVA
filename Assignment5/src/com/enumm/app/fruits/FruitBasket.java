package com.enumm.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static int menu(Scanner sc) {
		System.out.println("MENU:");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4.Display names of all fruits in the basket.");
		System.out.println("5.Display name,color,weight , taste of all fresh fruits , in the basket");
		System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket..");
		System.out.println("Please Enter your Choice!!!");

		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the number of fruits you want to add :");
		size = sc.nextInt();
		Fruit[] fruits = new Fruit[size];
		int choice;
		int index = 0;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1: {
				if(index<size)
				{
				System.out.println("Enter the name,color ,weight");
				fruits[index++] = new Mango(sc.next(), sc.next(), sc.nextDouble(), true);
				}
				else
					System.out.println("Basket is full");
				break;

			}
			case 2: {
			   if(index<size)
			   {
				System.out.println("Enter the name,color ,weight");
				fruits[index++] = new Orange(sc.next(), sc.next(), sc.nextDouble(), true);
			   }
			   else
				   System.out.println("Basket is full");
				   
				break;

			}
			case 3: {
				if(index<size)
				   {
				     System.out.println("Enter the name,color ,weight");
				     fruits[index++] = new Apple(sc.next(), sc.next(), sc.nextDouble(), true);
				   }
				else
					 System.out.println("Basket is full");
					   
				break;

			}
			case 4: {
				for (Fruit fruit : fruits) {

					if (fruit != null)
						System.out.println(fruit.getName());
				}
			}
				break;
			case 5: {
				for (Fruit fruit : fruits) {
					if (fruit != null && fruit.isFresh()) {
						System.out.println(fruit);
						System.out.println(fruit.taste());
					}
				}
			}
				break;
			case 6:
				for (Fruit fruit : fruits) {
					if (!fruit.isFresh()) {
						System.out.println(fruit.taste());
					}
				}
				break;
			case 7: {
				System.out.println("Enter the index of the fruit ");
				int c = sc.nextInt();
				if (c > index)
					System.out.println("Invalid index !!");
				else {
					fruits[c].setFresh(false);
				}
			}
				break;
			case 8: {
				for (Fruit fruit : fruits)

				{
					if (!fruit.taste().equals("sour")) {
						fruit.setFresh(false);
					}

				}
			}

				break;

			}
		}

	}

}
