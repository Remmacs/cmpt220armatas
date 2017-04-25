/**
   * file: Rectangle.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 6, 9.1
   * date completed: 4/25/2017

   * 
   * This file represents the exercise portion of 9.1
   *
   */
public class exerciseExamples {
	public static void main(String[] args){
		//make the two rectangles
		Rectangle rectangle1 = new Rectangle(4,40);
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		
		System.out.println("rectangle 1");
		System.out.println("Width, Height, Area, Perimeter");
		System.out.println(rectangle1.width + " " + rectangle1.height + " "
				+ rectangle1.getArea() + " " + rectangle1.getPerimeter());
		
		System.out.println("rectangle 2");
		System.out.println("Width, Height, Area, Perimeter");
		System.out.println(rectangle2.width + " " + rectangle2.height + " "
				+ rectangle2.getArea() + " " + rectangle2.getPerimeter());
		

	}

}
