import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzle {
    public static void main(String[] args) {
        
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
		String randomLetter = generator.getRandomLetter();
		System.out.println(randomLetter);

		String randomPassword = generator.generatePassword();
		System.out.println(randomPassword);

		ArrayList<String> randomPasswordSet = generator.generateNewPasswordSet(8);
		System.out.println(randomPasswordSet);
	}
}
