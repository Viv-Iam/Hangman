import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

@Test
public void doesCharMatch_isGuessCharEqualToAvailChar_true() {
  Hangman hangman = new Hangman();
  assertEquals(true, hangman.doesCharMatch("e"));
}
}
