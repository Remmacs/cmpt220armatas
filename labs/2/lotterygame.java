import java.util.Random;
import java.util.Scanner;

public class lotterygame {

	public static void main(String[] args) {
		// Generate a lottery number
		Random random = new Random();
		int lottery = random.nextInt(900) + 100;

		//prompt user for a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		int matchNum = 0;
		
		//get digits from lottery
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery / 10 % 10;
		int lotteryDigit3 = lottery % 10;
		
		//get digits from guess
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess / 10 % 10;
		int guessDigit3 = guess % 10;
		
		
		System.out.println("The lottery number is " + lottery);
		
		//check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else{
			if(lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3)
				matchNum++;
			if(lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3)
				matchNum++;
			if(lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3)
				matchNum++;
			
			System.out.println(matchNum);
			if(matchNum == 3){
				System.out.println("$3000");
			}else if(matchNum > 1){
				System.out.println("$1000");
			}
		}

		

	}

}
