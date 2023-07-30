import java.util.Scanner;

public class Guesser {
	
	int guessNum;
	
	public int guessingNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser! Guess the number");
		guessNum = sc.nextInt();
		return guessNum;		
	}

}
