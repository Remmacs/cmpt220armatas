/**
   * file: locateLargest.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 5, 8.13
   * date completed: 4/18/2017

   * 
   * This file locates the largest element in the double array.
   *
   */
import java.util.Scanner;

public class locateLargest {
	
	public static void main(String[] args){
		//make scanner
		Scanner input = new Scanner(System.in);
		//get array info
		System.out.println("Give me the array row and columns");
		int row = input.nextInt();
		int column = input.nextInt();
		
		//make array with information
		double[][] array = new double[row][column];
		//get the numbers for the array
		System.out.println("Please provide the numbers for the array");
		for(int i = 0; i < array.length; i++){
			for (int x = 0; x < array[i].length; x++){
				array[i][x] = input.nextDouble();
			
		}
		}
		int[] location = findLargest(array);
		System.out.println("Location is at" + location[0] + " , " + location[1] );
		
		
	}
	//creatint finding largest
	public static int[] findLargest(double[][] a){
		int[] first = new int[2];
		first[0] = 0;
		first[1] = 0;
		double max = 0;
		for (int i = 0; i < a.length; i++){
			for (int x = 0; x < a[i].length; x++){
				if(a[i][x]>max){
					first[0] = i;
					first[1] = x;
					max = a[i][x];
				}
			}
		}
		return first;
		
	}

	
	

}
