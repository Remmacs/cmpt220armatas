//Alex Armatas CMPT 220 Non Decreasing!!
import java.util.Scanner;

public class nondecreasing {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter 3 integers
		System.out.println("Please give me an integer");
		int integerOne = input.nextInt();
		
		System.out.println("Please give me another integer");
		int integerTwo = input.nextInt();
		
		System.out.println("Please give me another integer");
		int integerThree = input.nextInt();
		
		if (integerOne > integerThree){
			System.out.println(integerThree + " " + integerTwo + " " + integerOne);
			}
		else {
			System.out.println(integerOne + " " + integerTwo + " " + integerThree);
		}
		

	}

}
