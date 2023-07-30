import java.util.Scanner;

public class Player {
	int guessNum;
	public int guessingNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player! Guess the number");
		guessNum = sc.nextInt();
		return guessNum;
	}

}
