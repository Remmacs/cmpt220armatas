//Alex Armatas CMPT 220 Vehicle Plate!
import java.util.Random;

public class vehiclePlate {
	public static void main(String[] args) {
		//create a random letter generator
		int letterOne = (int)(Math.random() * (90-65) + 65);
		int letterTwo = (int)(Math.random() * (90-65) + 65);
		int letterThree = (int)(Math.random() * (90-65) + 65);
		
		int numberOne = (int)(Math.random() * 10);
		int numberTwo = (int)(Math.random() * 10);
		int numberThree = (int)(Math.random()* 10);
		int numberFour = (int)(Math.random() * 10);
		
		//change them into numbers
		char one = (char) letterOne;
		char two = (char) letterTwo;
		char three = (char) letterThree;
		
		
		//make letters uppercase and combine numbers
		System.out.println("The License plate is: " + one + two + three
				+ numberOne + numberTwo + numberThree + numberFour);
		
		
		
	}

}
