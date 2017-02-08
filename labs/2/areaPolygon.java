import java.util.Scanner;

public class areaPolygon {
	
	public static void main(String args[]){
		//get number of sides
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		double sides = input.nextDouble();
		
		//get length of sides
		System.out.print("Enter the length of the side: ");
		double length = input.nextDouble();
		
		//find area
		double area = ((sides * Math.pow(length, 2) ) / (4 * Math.tan(Math.PI/sides)) );
		
		System.out.println("The area of the polygon is: " + area);
	}
	

}
