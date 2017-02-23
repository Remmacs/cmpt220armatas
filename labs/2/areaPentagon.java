//Alex Armatas CMPT 220 Area of Pentagon!
import java.util.Scanner;
import java.text.DecimalFormat;

public class areaPentagon {
	
	public static void main(String[] args){
		//set up a decimal formatter
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		//get user input for length of r
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from the center to a vertex: ");
		float r = input.nextFloat();
		
	    // calculate what s is
		double s = (float)(2 * (r) * Math.sin(Math.PI / 5));
		
		//calculate the area
		double Area = (float) (( 5 * Math.pow (s, 2))/ (4 * Math.tan(Math.PI / 5)));
		
		
		//print the area to the second decimal point
		System.out.println("The area of the pentagon is: " + numberFormat.format(Area));
	}

}
