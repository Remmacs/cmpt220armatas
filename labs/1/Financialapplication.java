import java.util.Scanner; // Scanner will let us get input


public class Financialapplication {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter total bill: ");
		float firstTotal = input.nextInt();
		
		System.out.println("Enter gratuity rate: ");
		float gratuity = input.nextInt();
		
		//Get the total add gratuity
		float total =firstTotal +(firstTotal * gratuity)/ 100;
		
		float totalGratuity = total - firstTotal;
		
		System.out.println("The gratuity is $" + totalGratuity + "and total is $"+ total);
				
			
	}

}
