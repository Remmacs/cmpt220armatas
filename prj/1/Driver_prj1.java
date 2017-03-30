import java.util.Scanner;
import java.util.Arrays;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);//why professor rivas thinks its wrong
    int vFirstlength, vSecondlength;
    
    vFirstlength = input.nextInt();
    vSecondlength = input.nextInt();
    
    double[] vFirst = new double[vFirstlength];
    double[] vSecond = new double[vSecondlength];
    
    
    //get the array as a string then convert to double
    for (int i = 0; i < vFirstlength; i++){
    	vFirst[i] = input.nextDouble();
    }
    for (int i=0; i< vSecondlength; i++){
    	vSecond[i] = input.nextDouble();
    }
    
    double[] vResult = convolveVectors(vFirst, vSecond);
    System.out.println(Arrays.toString(vResult));
    
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    int idx = 0;
    int shift = 0;
    for (idx = 0; idx < vResult.length; idx++)
    	//for loop that tests every number and finds the positive.
    	for(shift = 0; shift < vSecond.length; shift++)
    		if (((idx - shift) >= 0) && (idx-shift) < vSecond.length)
    			vResult[idx] += (vFirst[idx - shift] * vSecond[shift]);
    		
    	
    return vResult;
  }
  

}