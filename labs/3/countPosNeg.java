/**
   * file: countPosNeg.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 3, 5.1
   * due date: February 23, 2017

   * 
   * This file contains the program to count positives and negatives
   * then get the number
   */

public class countPosNeg {
	public static void main(String[] args) {
		int[] intArray = {2,2,2,2};
		int count = 0;
		int pos = 0;
		int neg = 0;
		int total = 0;
		
		do{
			total += intArray[count];
			
			if (intArray[count] >= 0){
				pos++;
			}
			else{
				neg++;
			}
			count++;
					
		}while(count < intArray.length);
		double average = total / count;
		System.out.println("Positives: " + pos);
		System.out.println("Negatives: " + neg);
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
	}
}
