import java.util.Scanner;
public class finalgrade {

	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Start getting values
		System.out.println("Enter your midterm grade: ");
		int midterm = input.nextInt();
		
		System.out.println("Enter your final grade: ");
		int finalterm = input.nextInt();
		
		System.out.println("Enter your project grade total: ");
		int projects = input.nextInt();
		
		System.out.println("Enter your homework and lab grade average: ");
		int labhome = input.nextInt();
		
		int total = midterm + finalterm + projects + labhome;
		
		float finalgrade = total / 4;
		
		System.out.println("Your final grade is: " + finalgrade +"%");
				
		

	}

}
