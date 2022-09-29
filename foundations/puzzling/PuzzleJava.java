import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {
        Random randMachine = new Random();
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for (int i = 1; i < 11; i++) {
            rolls.add(randMachine.nextInt(20)+1);
        }
        return rolls;
    }

    public String getRandomLetter() {
        Random randMachine = new Random();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabetArray = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabetArray[i] = String.valueOf(alphabet.charAt(i));
        }
        return alphabetArray[randMachine.nextInt(26)];
    }

    public String generatePassword() {
        String password = "";
        
        for (int i = 0; i < 8; i++) {
            password = password +getRandomLetter();
        }

        return password;
    }

    public ArrayList<String> generateNewPasswordSet(int arrLength) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < arrLength; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

}