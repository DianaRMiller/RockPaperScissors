import java.util.Scanner;

public class HumanPlayer extends Player {

	Scanner scan = new Scanner(System.in);
	String name;
	@Override
	public String generateRoshambo() {

		
		System.out.print("Rock, paper, or scissors? (R/P/S): ");
		
		String choice = scan.nextLine(); 
		choice = Validator.validatePlay("Rock, paper, or scissors? (R/P/S): ", choice);
		switch (choice) {
		case "R": case "r":
			choice = "rock";
			break;
		case "P": case "p":
			choice = "paper";
			break;
		case "S": case "s":
			choice = "scissors";
			break;
		
		}
		return choice;
		
	}

	
}
