import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/3/18.
 */
public class HangmanTest {
    @Test
    public void Hangman_instantiatesCorrectly() throws Exception {
        Hangman testHangman = new Hangman("apple");
        assertEquals(true, testHangman instanceof Hangman);
    }

    @Test
    public void getWord_getsWord_apple() {
        Hangman testHangman = new Hangman("apple");
        assertEquals("apple", testHangman.getWord());
    }

    @Test
    public void getWordArr_splitWordIntoArray_array() throws Exception {
        Hangman testHangman = new Hangman("apple");
        assertEquals("apple".split(""), testHangman.getWordArr());
    }

    @Test
    public void getGuess_setAndReturnGuess_Character() throws Exception {
        Hangman testHangman = new Hangman("apple");
        testHangman.setGuess("a");
        assertEquals("a", testHangman.getGuess());
    }

    @Test
    public void returnStringClue_setIncorrectClue_dashes() throws Exception {
        Hangman testHangman = new Hangman("apple");
        testHangman.setClue("b");
        assertEquals("_ _ _ _ _", testHangman.returnStringClue());
    }

//    @Test
//    public void newHangman_getClue_dashes() throws Exception {
//        Hangman testHangman = new Hangman("apple");
//        assertEquals("_ _ _ _ _", testHangman.getClue());
//    }
//
//    @Test
//    public void newHangman_trueGuess_a____() throws Exception {
//        Hangman testHangman = new Hangman("apple");
//        testHangman.setGuess("a");
//        assertEquals("a_____", testHangman.getClue());
//    }

}