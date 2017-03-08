/**
   * file: bubbleSort.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 4, 7.18
   * due date: March 9th, 2017

   * 
   * This file contains the program that sorts numbers with a bubble sort.
   *
   */
import java.util.Scanner;
public class bubbleSort {
	public static double[] sort(double[] array){
		boolean sorted = false;
		while (sorted == false) {
			sorted = true;
			for (int j = 1; j < array.length; j++){
				if(array[j] > array[j - 1]){
					double temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
					sorted = false;
					
				}
			}
		}
		return array;
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
		actualEle = sort(actualEle);
		for(int i = 0; i < actualEle.length; i++){
			System.out.println(actualEle[i]);
		}

	}

}
