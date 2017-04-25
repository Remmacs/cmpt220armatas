/**
   * file: Location.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 6, 9.13
   * date completed: 4/25/2017

   * 
   * This file represents the exercise for location
   *
   */
import java.util.Scanner;

public class locationExercise {
	public static void main(String[] args){
	//make scanner
	Scanner input = new Scanner(System.in);
	//get 2d array from user
	System.out.println("Give me row and column in the array");
	int rows = input.nextInt();
	int columns = input.nextInt();
	
	//making matrix
	double[][] array = new double[rows][columns];
	System.out.println("Enter array");
	for(int i = 0; i< array.length; i++){
		for(int j = 0; j<array[i].length; j++){
			array[i][j] = input.nextDouble();
		}
	}
	Location max = locateLargest(array);
	//print for user
	System.out.println("Location of largest element is" + max.maxValue + " at " + max.row + " and " + max.column);
	
	}
	public static Location locateLargest(double[][] x){
		return new Location(x);
	}
}
