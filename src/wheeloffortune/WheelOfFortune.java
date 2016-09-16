/*
* CMPSC 261, Section 1
* Fall 2016
* Instructor: Phil O'Connell
* Student: Yunnwei Swei
* ID: yvs5276
*/
package wheeloffortune;
import java.util.Scanner;

public class WheelOfFortune {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      String main;
      String letter;
      Scanner sc = new Scanner(System.in); 
      
      System.out.println("\nPress1. Spin the Wheel \nPress2. Buy a Vowel"
              + "\nPress3. Solve the Puzzle\nPress4. Quit Game\nPress5. QA Tester");
      main = sc.next();
      
      while ((main != "0")){
          if("1".equals(main)){
            main = "Spinthe Wheel";
            System.out.println(main);
            System.out.println("Choose a letter");
            letter = sc.next();
            if(letter.matches("[A-Z]")){
                  
                  System.out.println("Your input: "+ letter);
                  main();     
                  
              }
              else{
                  System.out.println("Invalid Input. Sorry, try again");
                  main();
                  
              }
          }
          
          if("2".equals(main)){
             main = "Vowel Bought";
             System.out.println(main);
             main();
          }
           if("3".equals(main)){
             main = "Solve Puzzle";
             System.out.println(main);
             main();
          }         
           if("4".equals(main)){
             main = "Quit Game";
             System.out.println(main);
             System.exit(0);
          }
           if("5".equals(main)){
             main = "QA Test Mode";
             System.out.println(main);
             main();
          }
      }
  }
  
}
