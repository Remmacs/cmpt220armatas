//Alex Armatas CMPT 220 Tuition Problem!

public class Tuition {
	public static void main (String args[]) {
		// tution = tution * 1.05;
		double tution = 10000;
		double payment = 0;
		for(int i = 0; i < 14; i++){
			tution = tution * 1.05;
			if(i > 9){
				payment += tution;
			}
		}
		System.out.println("The total payment will be" + payment);
	}

}
