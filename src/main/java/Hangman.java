 public class Hangman {
   private String mAnswer;
   private String[] mGuessedLetters;
// public boolean doesCharMatch(String letter) {
//   return letter == "e";
// }
// public boolean isCharGuessed(String letter) {
//   return letter == "c";
// }
public Hangman(String answer, String[] guessedLetters) {
mAnswer = answer;
mGuessedLetters = guessedLetters;
}
public String getAnswer() {
  return mAnswer;
}
public String[] getGuessedLetters() {
  return mGuessedLetters;
}
public boolean isAnswer(String input) {
  return mAnswer == input;
}
 }
