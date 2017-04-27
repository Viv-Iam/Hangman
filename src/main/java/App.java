import java.io.Console;

public class App {
  public static void main (String[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to the game Hangman:");
    System.out.println("Kindly guess our mystrey word.");
    System.out.println("Hint it is a three letter word that rhymes with cry");

    String input = myConsole.readLine();
    //  String[] two = new String[3];
    char[] two = new char['a'];
     Hangman hangman = new Hangman("dry", two);

    boolean work = hangman.isAnswer(input);
    System.out.println(work);
  }
}
