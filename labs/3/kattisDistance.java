//Alex Armatas CMPT 220 Kattis Integers
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;


public class kattisDistance {

	public static void main(String[] args) {
		//create scanner
		Scanner scan = new Scanner(System.in);
		//System.out.print("Enter the x1 ");
		double x1 = scan.nextDouble();
		
		//System.out.print("Enter the y1 ");
		double y1 = scan.nextDouble();
		
		//System.out.print("Enter the x2 ");
		double x2 = scan.nextDouble();
		
		//System.out.print("Enter the y2 ");
		double y2 = scan.nextDouble();
		
		//System.out.print("Enter P" );
		double p = scan.nextDouble();
		
		//start calculations
		double partOne = (x1 - x2);
		double partTwo = (y1 - y2);
		
		double partOneAbs = Math.abs(partOne);
		double partTwoAbs = Math.abs(partTwo);
		
		double partOneExp = (double) Math.pow(partOneAbs, p);
		double partTwoExp = (double) Math.pow(partTwoAbs, p);
		
		double twoParts = (partOneExp + partTwoExp);
		
		double exponentOne = ( 1 / p );
		
		double distance = (double) Math.pow(twoParts, exponentOne);
		
		
		System.out.print(distance);
		
		
				
		
		// TODO Auto-generated method stub

	}

}
