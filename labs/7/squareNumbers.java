/**
   * file: Location.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 7, 10.17
   * date completed: 4/30/2017

   * 
   * This file gets the first ten square numbers greater than long.max value.
   *
   */

import java.math.BigInteger;

public class squareNumbers {
	public static void main(String[] args){
		Double aDouble = Math.sqrt((double)Long.MAX_VALUE);
		Long firstSquareRoot = aDouble.longValue();
		BigInteger bigInteger = new BigInteger(firstSquareRoot.toString()).add(BigInteger.ONE);
		System.out.println(Long.MAX_VALUE);
		for(int i=0; i<9; i++){
			System.out.println(bigInteger.multiply(bigInteger).toString());
			bigInteger = bigInteger.add(BigInteger.ONE);
		}
	}

}
