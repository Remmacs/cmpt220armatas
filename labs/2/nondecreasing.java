/**
   * file: nondecreasing.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 2, 3.8
   * due date: February 2, 2017

   * 
   * This file contains a program that returns 3 integes
   * in non-decreasing order
   */
import java.util.Scanner;

public class nondecreasing {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter 3 integers
		System.out.println("Please give me an integer");
		int integerOne = input.nextInt();
		
		System.out.println("Please give me another integer");
		int integerTwo = input.nextInt();
		
		System.out.println("Please give me another integer");
		int integerThree = input.nextInt();
		
		if (integerOne > integerThree){
			System.out.println(integerThree + " " + integerTwo + " " + integerOne);
			}
		else {
			System.out.println(integerOne + " " + integerTwo + " " + integerThree);
		}
		

	}

}
