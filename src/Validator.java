import java.util.Scanner;

public class Validator {
	
	private static Scanner userInput = new Scanner(System.in);
	
	public static String validateForContinue(String prompt, String input) {

		while (!input.matches("[ynYN]")) {
			System.out.println("That is not a valid input.");
			System.out.print(prompt);
			input = userInput.nextLine();
		}
		return input;
	}
	
	
	public static String validateOpponentChoice(String prompt, String input) {
		
		while (!input.matches("[jsJS]")) {
			System.out.println("That is not a valid input.");
			System.out.print(prompt);
			input = userInput.nextLine();
		}
		return input;
	}
	
	public static String validatePlay(String prompt, String input) {
		
		while (!input.matches("[rpsRPS]")) {
			System.out.println("That is not a valid input.");
			System.out.print(prompt);
			input = userInput.nextLine();
		}
		return input;
	}
	
	
	
	

}
