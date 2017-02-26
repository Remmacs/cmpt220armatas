/**
   * file: Tuition.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 3, 5.7
   * due date: February 23, 2017

   * 
   * This file contains the program to get the total tuition
   * 
   */

public class Tuition {
	public static void main (String args[]) {
		// tution = tution * 1.05;
		double tution = 10000;
		double payment = 0;
		for(int i = 0; i < 14; i++){
			tution = tution * 1.05;
			if(i > 9){
				payment += tution;
			}
		}
		System.out.println("The total payment will be" + payment);
	}

}
