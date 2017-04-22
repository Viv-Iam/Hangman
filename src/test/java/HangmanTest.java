import org.junit.*;//import JUnit testing library
import static org.junit.Assert.*;//import JUnit's assertion libr

public class HangmanTest {

@Test
public void doesCharMatch_isGuessCharEqualToAvailChar_true() {
  Hangman hangman = new Hangman();
  assertEquals(true, hangman.doesCharMatch("e"));
}
}
