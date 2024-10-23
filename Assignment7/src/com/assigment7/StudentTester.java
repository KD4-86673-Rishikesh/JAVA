package com.assigment7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StudentNameComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class StudentCityComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCity().compareTo(o2.getCity());
	}

}

class StudentmarksComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o2.getMarks(), o1.getMarks());
	}

}

public class StudentTester {

	public static int menu(Scanner sc) {

		System.out.println("0. EXit");
		System.out.println("1 sorted on their city (asc)");
		System.out.println("2 sorted on their on marks (desc)");
		System.out.println("3 sorted on their on name (asc)");
		System.out.println("4 sorted on the rollno");
		return sc.nextInt();

	}

	public static void display(Student[] arr) {
		System.out.println("**********************************************");
		for (Student s : arr) {
			System.out.println(s);
		}
		System.out.println("**********************************************");
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[5];
		students[0] = new Student(5, "Chandu", "solapur", 35);
		students[1] = new Student(1, "rishi", "baramati", 85);
		students[2] = new Student(3, "Alok", "pune", 90);
		students[3] = new Student(4, "Makrand", "kolhapur", 96);
		students[4] = new Student(2, "rushi", "karad", 87);

		Comparator<Student> StudentComparator;
		System.out.println("Before Sorting............");
		display(students);
		int choice;

		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 0: {
				System.out.println("Exit........");

			}
				break;
			case 1: {

				StudentComparator = new StudentCityComparator();
				Arrays.sort(students, StudentComparator);
				display(students);
			}
				break;
			case 2: {

				StudentComparator = new StudentmarksComparator();
				Arrays.sort(students, StudentComparator);
				display(students);
			}
				break;
			case 3: {

				StudentComparator = new StudentNameComparator();
				Arrays.sort(students, StudentComparator);
				display(students);
			}
				break;
			case 4: {
				Arrays.sort(students);
				display(students);
			}
				break;
			default:

			}

		}

	}
}
