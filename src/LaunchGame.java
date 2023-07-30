
public class LaunchGame {

	public static void main(String[] args) {
		
		System.out.println("Game Started");
		Umpire u = new Umpire();
		u.collectNumFromGuess();
		u.collectNumFromPlayer();
		u.compare();

	}

}
