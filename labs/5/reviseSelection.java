/**
   * file: reviseSelection.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 5, 7.20
   * date completed: 4/5/2017

   * 
   * This file swaps the largest number and swaps it with the last
   *
   */

import java.util.Scanner;

public class reviseSelection {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		//array of 10
		
		System.out.println("10 numbers please: ");
		for(int i = 0; i <numbers.length; i++)
			numbers[i] = input.nextDouble();
		//gets our array numbers
		
		selectionSort(numbers);
		
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i] + " ");
		}
	}
	
	public static void selectionSort(double[] list){
		for (int i = list.length - 1; i>= 0 ; i--){
			double currentMax = list[i];
			int currentMaxIndex = i;
			
			for (int j = i - 1; j >= 0; j--){
				if(currentMax < list[j]){
						currentMax = list[j];
						currentMaxIndex = j;
					
				}
			}
			if (currentMaxIndex != i){
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}

}
