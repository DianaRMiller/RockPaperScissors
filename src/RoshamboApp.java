import java.util.Scanner;

public class RoshamboApp {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		RandomPlayer opponent1 = new RandomPlayer();
		RockPlayer opponent2 = new RockPlayer();
		HumanPlayer player = new HumanPlayer();
		
		opponent1.setName("The Sharks");
		opponent2.setName("The Jets");
		
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.print("Please enter your name: ");
		String playerName = scan.nextLine();
		player.setName(playerName);
		
		System.out.print("Would you like to play against " + opponent2.getName() + " or " + opponent1.getName() + " (j/s)?: ");
		String oppChoice = scan.nextLine();  
		oppChoice = Validator.validateOpponentChoice("Would you like to play against " + opponent2.getName() + " or " + opponent1.getName() + " (j/s)?: ", oppChoice);
		String oppName = "";
		String playAgain = "";
		
		int playerWins = 0 , drawTotal = 0, opponentWins = 0;
		
		do {
			String oppResult = "";
			if (oppChoice.equalsIgnoreCase("j")) {
				oppName = opponent2.getName();
				opponent2.setRoshamboValue(opponent2.generateRoshambo());
				oppResult = opponent2.getRoshamboValue();
				
			}
			else if (oppChoice.equalsIgnoreCase("s")) {
				oppName = opponent1.getName();
				opponent1.setRoshamboValue(opponent1.generateRoshambo());
				oppResult = opponent1.getRoshamboValue();
			}
	
			player.setRoshamboValue(player.generateRoshambo());
			
			System.out.println(player.getName() + ": " + player.getRoshamboValue());
			System.out.println(oppName + ": " + oppResult);
			
			switch (player.getRoshamboValue()){
			case "rock":
				if (oppResult.equalsIgnoreCase("rock")) {
					System.out.println("Draw!");
					drawTotal++;
				}
				else if (oppResult.equalsIgnoreCase("scissors")) {
					System.out.println(player.getName() + " wins!");
					playerWins++;
				}
				else {
					System.out.println(oppName + " wins!");
					opponentWins++;
				}
				break;	
			case "paper":
				if (oppResult.equalsIgnoreCase("paper")) {
					System.out.println("Draw!");
					drawTotal++;
				}
				else if (oppResult.equalsIgnoreCase("rock")) {
					System.out.println(player.getName() + " wins!");
					playerWins++;
				}
				else {
					System.out.println(oppName + " wins!");
					opponentWins++;
				}
				break;
			case "scissors":
				if (oppResult.equalsIgnoreCase("scissors")) {
					System.out.println("Draw!");
					drawTotal++;
				}
				else if (oppResult.equalsIgnoreCase("paper")) {
					System.out.println(player.getName() + " wins!");
					playerWins++;
				}
				else {
					System.out.println(oppName + " wins!");
					opponentWins++;
				}
				break;
			}
			System.out.print("Play again? (y/n): ");
			playAgain = scan.nextLine();  
			playAgain = Validator.validateForContinue("Play again? (y/n): ", playAgain);
		}
		while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Here are the results of your match:");
		System.out.println("Wins: " + playerWins + "  Losses: " + opponentWins + "  Ties: " + drawTotal);
		System.out.println("Thank you for playing!");
	}

}
