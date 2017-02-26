/**
   * file: sumofInt.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 3, 6.2
   * due date: February 23, 2017

   * 
   * This file contains the program to get the sum of integers
   * 
   */

public class sumofInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// % 10
		// / 10
		int theNumber = 456;
		int count = 0;
		int total = 0;
		int intLength = (int) Math.log10(theNumber) + 1;;
		
		int[] digitArray = new int[intLength];
		for(int i = 0; i < intLength; i++){
			digitArray[count] = theNumber % 10;
			theNumber = theNumber / 10;
			count++;
		}
		// Now loop through the array and add them together
		for(int a = 0; a < digitArray.length; a++){
			total = total + digitArray[a];
		}
		System.out.println(total);

	}

}
