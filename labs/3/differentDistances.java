import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class differentDistances {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		double x1 = 0;
		double y1 = 0;
		double x2 =0;
		double y2 = 0;
		double p = 0;
		double res = 0;
		while (n < 1000){
			
			
		x1 = input.nextDouble();
		if (x1 == 0){
			break;
		}
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		p = input.nextDouble();
		
		res =  Math.pow(Math.pow(Math.abs(x1 - x2), p)
				+ Math.pow(Math.abs(y1 - y2),p), 1.0/p);
		
		DecimalFormat df = new DecimalFormat("#.##########");
		df.setRoundingMode(RoundingMode.CEILING);
		
		System.out.print(df.format(res));
		n++;

    }
	}
}
