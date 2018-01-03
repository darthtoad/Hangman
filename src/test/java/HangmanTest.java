import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/3/18.
 */
public class HangmanTest {
    @Test
    public void newHangman_instantiatesCorrectly() throws Exception {
        Hangman testHangman = new Hangman("apple");
        assertEquals(true, testHangman instanceof Hangman);
    }

    @Test
    public void newHangman_getsWord_apple() {
        Hangman testHangman = new Hangman("apple");
        assertEquals("apple", testHangman.getWord());
    }

    @Test
    public void newHangman_splitWordIntoArray_array() throws Exception {
        Hangman testHangman = new Hangman("apple");
        assertEquals("apple".split(""), testHangman.getWordArr());
    }

    @Test
    public void newHangman_setGuess_char() throws Exception {
        Hangman testHangman = new Hangman("apple");
        testHangman.setGuess('a');
        assertEquals('a', testHangman.getGuess());
    }

    @Test
    public void newHangman_trueGuess_a____() throws Exception {
        Hangman testHangman = new Hangman("apple");
        testHangman.setGuess('a');
        assertEquals('a_____', testHangman.getClue());
    }

}