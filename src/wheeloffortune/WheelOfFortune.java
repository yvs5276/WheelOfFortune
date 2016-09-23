/*
* CMPSC 261, Section 1
* Fall 2016
* Instructor: Phil O'Connell
* Student: Yunnwei Swei
* ID: yvs5276
*/
package wheeloffortune;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Phil O'Connell <pxo4@psu.edu>
 */
public class WheelOfFortune {

  private static final Scanner _keyboard = new Scanner(System.in);
  public static String Answer ="T H E  Q U I C K  B R O W N  F O X  J U M P S  O V E R  T H E  L A Z Y  D O G"; //answers to the puzzle
  
  public static String Question = Answer.replaceAll("T H E","_ _ _");//replacing the char with _s


  private static final List<String> _menuChoices = Arrays.asList(
      "1. Spin the wheel",
      "2. Buy a vowel",
      "3. Solve the puzzle",
      "4. Quit the game",
      "", // 5
      "", // 6
      "", // 7
      "8. Toggle puzzle reveal", // 8
      "9. Test letter input"
  );

  private static final int _quitChoiceNumber = 4;
  

  private static boolean isValidMenuChoice(int choice) {
    if (choice < 1 || choice > _menuChoices.size()) {
      return false;
    }

    int index = choice - 1;
    String menuText = _menuChoices.get(index);

    return !menuText.equals("");
  }

  private static char inputLetter() {
    char letter = ' ';
    boolean finished = false;

    while (!finished) {
      System.out.print("Enter a letter: ");

      String line = _keyboard.nextLine();
      if (line.length() != 1) {
        System.out.println("Enter just one letter");
      } else {
        letter = line.charAt(0);
        if (!Character.isLetter(letter)) {
          System.out.println("That is not a letter");
        } else {
          finished = true;
        }
      }
    }

    return letter;
  }

  private static void gameMenu() {
    int choice = 0;
    String line = "";
    boolean quit = false;

    while (!quit) {
      System.out.println("======================\n=  Wheel Of Fortune  =\n=====================\n" +"'"+ Question+"'\n");
      for (String menuChoice : _menuChoices) {
        if (!menuChoice.equals("")) {
          System.out.println(menuChoice);
        }
      }
      System.out.print("Enter choice: ");
      line = _keyboard.nextLine();
      try {
        choice = Integer.parseInt(line);
      } catch (NumberFormatException nfe) {
        System.out.println("Invalid input");
        continue;
       
      }

      if (!isValidMenuChoice(choice)) {
        System.out.println("Not a menu choice");
        continue;
      }


      System.out.println("You chose: " + _menuChoices.get(choice - 1));
      switch (choice) {
        case _quitChoiceNumber:
          quit = true;
          break;
        case 1: System.out.println("You earned: "+ number "\nGuess Letter");//guess letter?
            String letter = keyboard.nextLine();
            if letter = [];
        
        case 3:
            
        case 9:
          System.out.println("Your letter is: " + inputLetter());
          break;
      }
    }
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    gameMenu();
  }
    private ArrayList<String> lista;

}
