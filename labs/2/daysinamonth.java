import java.util.Scanner;

public class daysinamonth {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		// Get user input for month
		System.out.print("Please give me the number of a month: ");
		int month = input.nextInt();
		
		System.out.print("Please give me a year: ");
		int year = input.nextInt();
		
		//if statement for feb every 4 years year % 4 = 0 
		switch (month){
		case 1: System.out.println("January " + year + " had 31 days"); break;
		case 2: if (year % 4 == 0){
			System.out.println("February " + year + " had 29 days"); break;
		}
		else
			System.out.println("February " + year + " had 28 days"); break;
		case 3: System.out.println("March " + year + " had 31 days"); break;
		case 4: System.out.println("April " + year + " had 30 days"); break;
		case 5: System.out.println("May " + year + " had 31 days"); break;
		case 6: System.out.println("June " + year + " had 30 days"); break;
		case 7: System.out.println("July " + year + " had 31 days"); break;
		case 8: System.out.println("August " + year + " had 31 days"); break;
		case 9: System.out.println("September " + year + " had 30 days"); break;
		case 10: System.out.println("October " + year + " had 31 days"); break;
		case 11: System.out.println("November " + year + " had 30 days"); break;
		case 12: System.out.println("December " + year + " had 31 days"); break;
		}
			
		

	}

}
