/**
 * Created by Guest on 1/3/18.
 */
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Hangman {
    private String word;
    private String[] wordArr;
    private String guess;
    private List<String> clue = new ArrayList<String>();

    public Hangman(String word) {
        this.word = word;
        this.wordArr = word.split("");
        this.clue = clue;
    }

    public String getGuess() {
        return this.guess;
    }

    public String getWord() {
        return this.word;
    }

    public List<String> getClue() {
        return this.clue;
    }

    public String returnStringClue() {
        getClue();
        String stringClue = "";
        for (String s : this.clue){
            stringClue += s + " ";
        }
        return stringClue.trim();
    }

    public String[] getWordArr() {
        return this.wordArr;
    }

    public void setClue(String guess) {
        getWordArr();
        getClue();
        for (int i = 0; i < this.wordArr.length; i++) {
            if (wordArr[i] == guess) {
                this.clue.add(guess);
            } else {
                this.clue.add("_");
            }
        }
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }



//    public void setWord(String[] gameArray) {
//        Random randomInt = new Random();
//        int newRandom = randomInt.nextInt(gameArray.length);
//        this.word = gameArray[newRandom];
//    }
}
