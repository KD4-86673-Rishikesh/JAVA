package com.enumm.app.fruits;

import java.util.Scanner;

public class Basketusingenum {

	enum basket {
		EXIT, 
		Add_Mango, 
		Add_Orange,
		Add_Apple, 
		Display_names_of_all_fruits_in_the_basket,
		Display_name_color,
		weigh_taste_of_all_fresh_fruits_in_the_basket, 
		Display_tastes_of_all_stale_fruits_in_the_basket,
		Mark_a_fruit_as_stale,
		Mark_all_sour_fruits_stale;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the number of fruits you want to add :");
		size = sc.nextInt();
		Fruit[] fruits = new Fruit[size];

		basket[] menulist = basket.values();
		int choice = -1;
		int index = 0;

		while (choice != 0) {
			
			for (basket b : menulist) {
				System.out.println(b.ordinal() + " " + b.name());
			}
            choice=sc.nextInt();
			switch (menulist[choice]) {
			case EXIT:{
				  System.out.println("Exit...............");
			}
			case Add_Mango: {
				if (index < size) {
					System.out.println("Enter the name,color ,weight");
					fruits[index++] = new Mango(sc.next(), sc.next(), sc.nextDouble(), true);
				} else
					System.out.println("Basket is full");
				break;

			}
			case Add_Orange: {
				if (index < size) {
					System.out.println("Enter the name,color ,weight");
					fruits[index++] = new Orange(sc.next(), sc.next(), sc.nextDouble(), true);
				} else
					System.out.println("Basket is full");

				break;

			}
			case Add_Apple: {
				if (index < size) {
					System.out.println("Enter the name,color ,weight");
					fruits[index++] = new Apple(sc.next(), sc.next(), sc.nextDouble(), true);
				} else
					System.out.println("Basket is full");

				break;

			}
			case Display_names_of_all_fruits_in_the_basket: {
				for (Fruit fruit : fruits) {

					if (fruit != null)
						System.out.println(fruit.getName());
				}
			}
				break;
			case weigh_taste_of_all_fresh_fruits_in_the_basket: {
				for (Fruit fruit : fruits) {
					if (fruit != null && fruit.isFresh()) {
						System.out.println(fruit);
						System.out.println(fruit.taste());
					}
				}
			}
				break;
			case Display_tastes_of_all_stale_fruits_in_the_basket:
			{
				for (Fruit fruit : fruits) {
					if (!fruit.isFresh()) {
						System.out.println(fruit.taste());
					}
				}
			}
				break;
			case Mark_a_fruit_as_stale: {
				System.out.println("Enter the index of the fruit ");
				int c = sc.nextInt();
				if (c > index)
					System.out.println("Invalid index !!");
				else {
					fruits[c].setFresh(false);
				}
			}
				break;
			case Mark_all_sour_fruits_stale: {
				for (Fruit fruit : fruits)
                {
				  if(!fruit.taste().equals("sour")) 
						fruit.setFresh(false);
				}
			 }break;
			 default:{
				System.out.println("Invalid Choice!!!");
			}

			}
		}

	}

}
