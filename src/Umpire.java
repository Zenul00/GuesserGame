
public class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuess() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessingNumber();		
	}
	
	public void collectNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessingNumber();
		numFromPlayer2 = p2.guessingNumber();
		numFromPlayer3 = p3.guessingNumber();		
	}
	
	public void compare() {
		if(numFromGuesser == numFromPlayer1) {
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All Won");
			}
			else if(numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and Player 2, Won the game");
			}
			else {
				System.out.println("Player 1, Won the game");				
			}
			
		}
		else if(numFromGuesser == numFromPlayer2){
			if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and Player 3, Won the game");
			}
			else {
				System.out.println("Player 2, Won the game");				
			}
						
		}
		else if(numFromGuesser == numFromPlayer3){
			System.out.println("Player 3, Won the game");			
		}
		else {
			System.out.println("Try again!!!");
		}		
	}
}
