/**
 * Created by Guest on 1/3/18.
 */
import java.util.Random;

public class Hangman {
    private String word;
    private String[] wordArr;
    private char guess;

    public Hangman(String word) {
        this.word = word;
        this.wordArr = word.split("");
    }

    public char getGuess() {
        return this.guess;
    }

    public String getWord() {
        return this.word;
    }

    public String[] getWordArr() {
        return this.wordArr;
    }

    public String getClue() {
        if (this.wordArr)
    }

    public void setGuess(char guess) {
        this.guess = guess;
    }



//    public void setWord(String[] gameArray) {
//        Random randomInt = new Random();
//        int newRandom = randomInt.nextInt(gameArray.length);
//        this.word = gameArray[newRandom];
//    }
}
