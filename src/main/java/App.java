/**
 * Created by Guest on 1/3/18.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Let's play hangman!");
            String[] arrayOfWords = {"apple", "banana", "almond", "programmer", "penguin", "quayle"};
            Random random = new Random();
            int select = random.nextInt(arrayOfWords.length);
            String word = arrayOfWords[select];

            Hangman newHangman = new Hangman(word);
            Object appWin = newHangman.getWin();
            while (appWin == null) {
                System.out.println("Guess a letter!");
                String input = bufferedReader.readLine();
                if (input.length() > 1) {
                    System.out.println("Please only use one letter. No cheating!");
                } else {
                    newHangman.setClue(input);
                    System.out.println(newHangman.returnStringClue());
                    newHangman.getWinCondition();
                    appWin = newHangman.getWin();
                }
            }
            if (Boolean.valueOf(appWin.toString())) {
                System.out.println("You won!");
            } else {
                System.out.println("Sorry, you lost!");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
