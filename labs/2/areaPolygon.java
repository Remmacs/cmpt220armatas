/**
   * file: areaPolygon.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 2, 4.3
   * due date: February 2, 2017

   * 
   * This file contains the program to get the area of a polygon
   * 
   */
import java.util.Scanner;

public class areaPolygon {
	
	public static void main(String args[]){
		//get number of sides
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		double sides = input.nextDouble();
		
		//get length of sides
		System.out.print("Enter the length of the side: ");
		double length = input.nextDouble();
		
		//find area
		double area = ((sides * Math.pow(length, 2) ) / (4 * Math.tan(Math.PI/sides)) );
		
		System.out.println("The area of the polygon is: " + area);
	}
	

}
