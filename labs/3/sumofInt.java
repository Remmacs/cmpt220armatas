//Alex Armatas CMPT 220 Sum of Integers

public class sumofInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// % 10
		// / 10
		int theNumber = 456;
		int count = 0;
		int total = 0;
		int intLength = (int) Math.log10(theNumber) + 1;;
		
		int[] digitArray = new int[intLength];
		for(int i = 0; i < intLength; i++){
			digitArray[count] = theNumber % 10;
			theNumber = theNumber / 10;
			count++;
		}
		// Now loop through the array and add them together
		for(int a = 0; a < digitArray.length; a++){
			total = total + digitArray[a];
		}
		System.out.println(total);

	}

}
