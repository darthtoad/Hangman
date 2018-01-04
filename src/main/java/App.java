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
            String word = "";
            boolean something = true;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            while (something) {
                System.out.println("Let's play hangman! Would you like a one player or two player game? Enter 1 for one player, 2 for two players");
                String choice = bufferedReader.readLine();
                if (choice.equals("1")) {
                    something = false;
                    System.out.println("What level of difficulty would you like? Please choose between 1 and 3");
                    String choice2 = bufferedReader.readLine();
                    if (choice2.equals("1")) {
                        String[] arrayOfWords = {"apple", "banana", "almond", "programmer", "mississippi", "spotty"};
                        Random random = new Random();
                        int select = random.nextInt(arrayOfWords.length);
                        word = arrayOfWords[select];
                    } else if (choice2.equals("2")) {
                        String[] arrayOfWords = {"maneater", "penguin", "trampoline", "parachute", "penguin", "quayle"};
                        Random random = new Random();
                        int select = random.nextInt(arrayOfWords.length);
                        word = arrayOfWords[select];
                    } else if (choice2.equals("3")) {
                        String[] arrayOfWords = {"phenomenology", "transcendental", "herpetology", "quadringenarious", "coelacanth", "methaqualone"};
                        Random random = new Random();
                        int select = random.nextInt(arrayOfWords.length);
                        word = arrayOfWords[select];
                    } else {
                        word = "floccinaucinihilipilification";
                    }
                } else if (choice.equals("2")) {
                    something = false;
                    System.out.println("Please write a word");
                    word = bufferedReader.readLine().toLowerCase();
                } else {
                    System.out.println("Please try again");
                }
            }
            Hangman newHangman = new Hangman(word.toLowerCase());
            Object appWin = newHangman.getWin();
            while (appWin == null) {
                System.out.println("Guess a letter!");
                String input = bufferedReader.readLine().toLowerCase();
                if (input.length() > 1) {
                    System.out.println("Please only use one letter. No cheating!");
                } else {
                    newHangman.setClue(input);
                    System.out.println(newHangman.returnStringClue() + "\nNumber of Wrong Guesses Left: " + (7 - newHangman.getLoseNumber()));
                    newHangman.getWinCondition();
                    appWin = newHangman.getWin();
                }
            }
            if (Boolean.valueOf(appWin.toString())) {
                System.out.println("You won!");
            } else {
                System.out.println(String.format("The word is %s", word));
                System.out.println("Sorry, you lost!");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
