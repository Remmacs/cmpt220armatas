/**
   * file: Location.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 6, 9.13
   * date completed: 4/25/2017

   * 
   * This file represents the location for 9.13
   *
   */
public class Location {
	//create the data
	int row;
	int column;
	double maxValue;
	//create the two-dimensional array
	Location(double[][] x){
		maxValue = x[0][0];
		row = 0;
		column = 0;
		for (int i = 0; i< x.length; i++){
			for (int j = 0; j < x[i].length; j++){
				if (x[i][j]>maxValue){
					maxValue=x[i][j];
					row = i;
					column = j;
				}
			}
		}
	}

}
