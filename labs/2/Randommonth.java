/**
   * file: randomMonth.java
   * author: Alex Armatas
   * course: CMPT 220
   * assignment: Lab 2, 3.4
   * due date: February 2, 2017

   * 
   * This file contains a program that gets a random month
   * 
   */

public class randomMonth {

	public static void main(String[] args) {
		
		int random = 1 + (int)(Math.random() * 12);
		
		//if statements that print depending on the random number.
		if (random == 1)
			System.out.println("The month is January"); 
		if (random == 2)
			System.out.println("The month is February"); 
		if (random == 3)
			System.out.println("The month is March");
		if (random == 4)
			System.out.println("The month is April");
		if (random == 5)
			System.out.println("The month is May");
		if (random == 6)
			System.out.println("The month is June");
		if (random == 7)
			System.out.println("The month is July");
		if (random == 8)
			System.out.println("The month is August");
		if (random == 9)
			System.out.println("The month is September");
		if (random == 10)
			System.out.println("The month is October");
		if (random == 11)
			System.out.println("The month is November");
		if (random == 12)
			System.out.println("The month is December");
		
		
		

	}

}
