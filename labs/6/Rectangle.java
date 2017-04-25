/**
   * file: Rectangle.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 6, 9.1
   * date completed: 4/25/2017

   * 
   * This file represents the rectangle
   *
   */
public class Rectangle {
	//double data fields created
	double width;
	double height;
	//no arg rectangle constructor
	Rectangle(){
		width=1;
		height=1;
	}
	//construct with specifications
	Rectangle(double newWidth, double newHeight){
		width=newWidth;
		height=newHeight;
	}
	//get area, returns area
	double getArea(){
		return (width * height);
	}
	//get perimeter returns perimeter
	double getPerimeter(){
		return (2 * (width + height));
	}
	
	

}
