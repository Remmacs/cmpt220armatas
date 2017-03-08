/**
   * file: smallestElement.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 4, 7.9
   * due date: March 9th, 2017

   * 
   * This file contains the program to find the smallest element.
   *
   */
import java.util.Scanner;
public class smallestElement {
	
	public static double min(double[] array){
		double min = array[0];
		for (int i = 1; i < array.length; i++){
			if (array[i] < min){
				min = array[i];
			
			}
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println("Please enter 10 numbers separated by spaces");
		//create scanner
		Scanner input = new Scanner(System.in);
		String result = input.nextLine();
		
		String[] element = result.split(" ");
		double[] actualEle = new double[element.length];
		for(int i = 0; i < element.length; i++){
			actualEle[i] = Double.parseDouble(element[i]);
		}
		System.out.println(min(actualEle));
		

	}

}
