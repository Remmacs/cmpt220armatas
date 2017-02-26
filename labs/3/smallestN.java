/**
   * file: smallestN.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 3, 5.12
   * due date: February 23, 2017

   * 
   * This file contains the program to get the smallest n
   * 
   */

public class smallestN {
	public static void main (String args[]){
		//find the smallest N1
		double n = 0; // the smallest value of n
		while (true){
			n++;
			if ((n * n ) >= 12000){
				break;
		
			}
		}
		System.out.println("The smallest value is:" + n);
	}

}
