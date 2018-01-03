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
    private List<String> goodLetters = new ArrayList<String>();
    private boolean win = false;

    public Hangman(String word) {
        this.word = word;
        this.wordArr = word.split("");
        this.clue = clue;
        this.win = win;
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

    public boolean getWin() {
        return this.win;
    }

//    public List<String> getGoodLetters() {
//
//    }

    public String returnStringClue() {
        getClue();
        getWin();
        String stringClue = "";
        for (String s : this.clue) {
            stringClue += s + " ";
        }

        return stringClue.trim();
    }

    public boolean getWinCondition() {
        getClue();
        getWin();
        String stringClue = "";
        for (String s : this.clue) {
            stringClue += s + " ";
        }
        String answer = "";
        for (String st : this.wordArr) {
            answer += st + " ";
        }
        if (stringClue.equals(answer)) {
            win = true;
        }
        return true;
    }

    public String[] getWordArr() {
        return this.wordArr;
    }

    public void setClue(String guess) {
        getWordArr();
        getClue();
        goodLetters.add(guess);
        this.clue.removeAll(clue);

        for (int i = 0; i < this.wordArr.length; i++) {
            if (goodLetters.contains(wordArr[i])) {
                this.clue.add(wordArr[i]);
            } else {
                this.clue.add("_");
            }
        }

//        for (int i = 0; i < this.wordArr.length; i++) {
//            if (wordArr[i].equals(guess)) {
//                this.clue.add(guess);
//            } else {
//                this.clue.add("_");
//            }
//        }
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
