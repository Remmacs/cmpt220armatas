//Alex Armatas CMPT 220 Inverse Integers
import java.util.Scanner;


public class inverseInt {

	public static void main(String[] args) {
		// create scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in an integer");
		int theNumber = scan.nextInt();
		int placeholder = theNumber;
		int count = 0;
		int total = 0;
		int intLength = (int) Math.log10(theNumber) + 1;;
		
		String[] digitArray = new String[intLength];
		for(int i = 0; i < intLength; i++){
			digitArray[count] = theNumber % 10+"";
			theNumber = theNumber / 10;
			count++;
		}
		
		String newDigit = "";
		for(int a = 0; a < digitArray.length; a++){
			newDigit += digitArray[a]; 
		}
		int reverseAsInt = Integer.parseInt(newDigit);
		if(reverseAsInt == placeholder){
			System.out.println("isPalindrome");
		}
		else{
			System.out.println("Not Palidrome");
		}

	}

}
