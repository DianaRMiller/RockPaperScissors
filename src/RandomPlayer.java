import java.util.Random;

public class RandomPlayer extends Player {

	@Override
	public String generateRoshambo() {
		
		String result = "";	
		Random random = new Random();
		
		int number = random.nextInt(3);
		
		switch(number){
		case 0:
			result = "rock";
			break;
		case 1:
			result = "paper";
			break;
		case 2:
			result = "scissors";
			break;
		}
		
		return result;
		
	}

}
