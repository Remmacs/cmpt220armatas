import java.util.Scanner;

public class sumofnum {

	public static void main(String[] args) {
		// make the scanner
		Scanner input = new Scanner(System.in);
		
		//get user number
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int num = number;
		int sum = 0;
		while (num > 0){
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("The sum of the digits is: "+ sum);
		}

	}


