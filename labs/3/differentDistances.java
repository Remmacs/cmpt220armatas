import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class differentDistances {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		//while (n < 1000){
			
			
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double p = input.nextDouble();
		
		double res =  Math.pow(Math.pow(Math.abs(x1 - x2), p)
				+ Math.pow(Math.abs(y1 - y2),p), 1.0/p);
		
		DecimalFormat df = new DecimalFormat("#.##########");
		df.setRoundingMode(RoundingMode.CEILING);
		
		System.out.print(df.format(res));
		n++;

    //}
	}
}
