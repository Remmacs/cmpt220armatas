/**
   * file: conversionCF.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 4, 6.9
   * due date: March 9th, 2017

   * 
   * This file contains the program to convert C to f and F to C
   *
   */
public class conversionCF {
	
	//convert from celsius to fahrenheit
	public static double celsiusToFahrenheit(double celsius){
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	
	//convert from fahrenheit to celsius
	public static double fahrenheitToCelsius(double fahrenheit){
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}

	public static void main(String[] args) {
		double celsius = 40.0;
		for (celsius = 40.0 ; celsius >= 31.0 ; celsius-- ){
			System.out.println(celsius + " " + celsiusToFahrenheit(celsius));
			
		}
		double fahrenheit = 120.0;
		for (fahrenheit = 120.0; fahrenheit >= 30.0 ; fahrenheit--){
			System.out.println(fahrenheit + " " + fahrenheitToCelsius(fahrenheit));
		}
		
		
	}

}
