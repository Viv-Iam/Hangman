// import org.junit.*;//import JUnit testing library
// import static org.junit.Assert.*;//import JUnit's assertion library
//
// public class HangmanTest {
// //annotation=> informs compiler that JUnit will be responsible for running this code
// @Test
// //all JUnit tests must be public void
// //doesCharMatch name methode this spec tests
// //isGuessCharEqualToAvailChar description behaviour spec tests
// //true output expecting for input we provide
// public void doesCharMatch_isGuessCharEqualToAvailChar_true() {
// //Hangman => class hangman => object
//   Hangman hangman = new Hangman();
// //assertEquals method instructs JUnit to compare two arguments
// //Checking whether hangman.doesCharMatch("e") successfully returns true
//   assertEquals(true, hangman.doesCharMatch("e"));
// }
//
// @Test
// public void doesCharMatch_isGuessCharEqualToAvailChar_false() {
//   Hangman hangman = new Hangman();
//   assertEquals(false, hangman.doesCharMatch("f"));
// }
//
// @Test
// public void isCharGuessed_isCharEqualGussedChar_true() {
//   Hangman hangman = new Hangman();
//   assertEquals(true, hangman.isCharGuessed("c"));
// }
//
// @Test
// public void isCharGuessed_isCharEqualGussedChar_false() {
//   Hangman hangman = new Hangman();
//   assertEquals(false, hangman.isCharGuessed("d"));
// }
// }

import org.junit.*;//import JUnit testing library
import static org.junit.Assert.*;//import JUnit's assertion library

public class HangmanTest {
  //annotation=> informs compiler that JUnit will be responsible for running this code
  //testing whether we can create a new instance of Hangman class
  @Test
  public void newHangman_createsInstance() {
  //Creating a Hangman called hangman
  String[] two = {"a", "b", "c"};
  Hangman hangman = new Hangman("dry", two);
  //passing two arguments if returns true then hangman is an instance of Hangman
  assertEquals(true, hangman instanceof Hangman);
}
//Confirm getAnswer() getter method is functioning
@Test
public void newHangman_getsAnswer_() {
  String[] two = {"a", "b", "c"};
  Hangman hangman = new Hangman("dry", two);
  assertEquals("dry", hangman.getAnswer());
}
//Confirm getGuessedLetters() getter method is functioning
@Test
public void newHangman_getsGuessedLetters_() {
  String[] two = {"a", "b", "c"};
  Hangman hangman = new Hangman("dry", two);
  assertEquals(two, hangman.getGuessedLetters());
}
//Make sure program identifies input matches mAnswer is true
@Test
public void isAnswer_whenAnswer_true() {
  String[] two = {"a", "b", "c"};
  Hangman hangman = new Hangman ("dry", two);
  assertEquals(true, hangman.isAnswer("dry"));
}
//Make sure program identifies input does not match mAnswer is false
@Test
public void isAnswer_whenAnswer_false() {
  String[] two = {"a", "b", "c"};
  Hangman hangman = new Hangman ("dry", two);
  assertEquals(false, hangman.isAnswer("hoow"));
}



}
