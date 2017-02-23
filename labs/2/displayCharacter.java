//Alex Armatas CMPT 220 Display Characters
import java.util.Scanner;

public class displayCharacter {
	
	public static void main(String args[]){
		//get ASCII number
		Scanner input = new Scanner(System.in);
		System.out.println("Provide a number 0 - 127: ");
		int number = input.nextInt();
		
		//convert to text
		System.out.println((char) number);
	}

}
