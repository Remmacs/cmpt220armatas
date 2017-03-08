/**
   * file: countStrings.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 4, 6.20
   * due date: March 9th, 2017

   * 
   * This file contains the program to count the letters in a string
   *
   */
import java.util.Scanner;
public class countStrings {
	
	//create the method
	public static int countLetters(String s){
		char[] letters = s.toCharArray();
		int sum = 0;
		for (int i = 0 ; i < letters.length; i++){ 
			if (letters[i] != ' '){
				sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Please type something");
		String result = input.nextLine();
		System.out.print(countLetters(result));

	}

}
