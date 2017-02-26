/**
   * file: largestN.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 3, 5.13
   * due date: February 23, 2017

   * 
   * This file contains the program to get the largest N
   * 
   */

public class largestN {
	public static void main (String args[]){
		//find the largest n for the power of 3
		double n = 0; 
		while (true){
			n++;
			if ((n * n * n) >= 12000){
				break;
			}
		}
		n = n - 1;
		System.out.println("The largest is: " + n);
	}

}
