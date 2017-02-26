/**
   * file: displayCharacter.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 2, 4.8
   * due date: February 2, 2017

   * 
   * Gets the character from ascii
   * 
   */
import java.util.Scanner;

public class displayCharacter {
	
	public static void main(String args[]){
		//get ASCII number
		Scanner input = new Scanner(System.in);
		System.out.println("Provide a number 0 - 127: ");
		int number = input.nextInt();
		
		//convert to text
		System.out.println((char) number);
	}

}
