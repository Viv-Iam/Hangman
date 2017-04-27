import org.junit.*;//import JUnit testing library
import static org.junit.Assert.*;//import JUnit's assertion library

public class HangmanTest {
  //annotation=> informs compiler that JUnit will be responsible for running this code
  //testing whether we can create a new instance of Hangman class
  @Test
  public void newHangman_createsInstance() {
  //Creating a Hangman called hangman
  char[] two = new char['a'];
  Hangman hangman = new Hangman("dry", two);
  //passing two arguments if returns true then hangman is an instance of Hangman
  assertEquals(true, hangman instanceof Hangman);
}
//Confirm getAnswer() getter method is functioning
@Test
public void newHangman_getsAnswer_() {
  char[] two = new char['a'];
  Hangman hangman = new Hangman("dry", two);
  assertEquals("dry", hangman.getAnswer());
}
//Confirm getGuessedLetters() getter method is functioning
@Test
public void newHangman_getsGuessedLetters_() {
  char[] two = new char['a'];
  Hangman hangman = new Hangman("dry", two);
  assertEquals(two, hangman.getGuessedLetters());
}
//Make sure program identifies input matches mAnswer is true
@Test
public void isAnswer_whenAnswer_true() {
  char[] two = new char['a'];
  Hangman hangman = new Hangman ("dry", two);
  assertEquals(true, hangman.isAnswer("dry"));
}
//Make sure program identifies input does not match mAnswer is false
@Test
public void isAnswer_whenAnswer_false() {
  char[] two = new char['a'];
  Hangman hangman = new Hangman ("dry", two);
  assertEquals(false, hangman.isAnswer("hoow"));
}



}
