import java.util.Scanner;

/**
 * This program lets the user play rock paper scissors with the computer.
 * 
 * @author Nick P-A
 * @since 2020/3/4
 * @version 1.0
 */
 
 
public class Rockpaperscissors {
  static String userGuess;
  static int computerGuess;
  static String repeat;
  
  /**
  * This class lets the user play rock paper scissors with the computer.
  */
  
  public static void main(String[] args) {
    
    generateandguess();
    
  }
  
  
  
  public static void generateandguess() {
    
    compare();
  }
  
  
  /**
  * This class compares the users guess to the computers.
  */
  
  
  public static void compare() {
       
       
    double randomDouble = Math.random();
    randomDouble = randomDouble * 3 + 1;
    int computerGuess = (int) randomDouble;
    
    Scanner userInput = new Scanner(System.in);
    System.out.print("rock, paper, scissors!: ");
    userGuess = userInput.nextLine();
       
       
    if (userGuess.equals("rock") && computerGuess == 1) {
      System.out.println("you chose rock, the computer also chose rock, its a draw.");
      System.out.println("would you like to play again?: ");
      repeat = userInput.nextLine();
    }
    
    if (userGuess.equals("rock") && computerGuess == 2) {
      System.out.println("you chose rock, the computer chose scissors, you win.");
      System.out.println("would you like to play again?: ");
      repeat = userInput.nextLine();
    }
    
    if (userGuess.equals("rock") && computerGuess == 3) {
      System.out.println("you chose rock, the computer chose paper, you lose.");
      System.out.println("would you like to play again?: ");
      repeat = userInput.nextLine();
    }
    
    if (userGuess.equals("paper") && computerGuess == 1) {
      System.out.println("you chose paper, the computer chose rock, you win.");
      System.out.println("would you like to play again?: ");
      repeat = userInput.nextLine();
    }
    
    if (userGuess.equals("paper") && computerGuess == 2) {
      System.out.println("you chose paper, the computer also chose paper, its a draw.");
      System.out.println("would you like to play again?: ");
      repeat = userInput.nextLine();
    }
    
    if (userGuess.equals("paper") && computerGuess == 3) {
      System.out.println("you chose paper, the computer chose scissors, you lose.");
      System.out.println("would you like to play again?: ");
      repeat = userInput.nextLine();
    }
    
    if (userGuess.equals("scissors") && computerGuess == 1) {
      System.out.println("you chose scissors, the computer chose rock, you lose.");
      System.out.println("would you like to play again?: ");
      repeat = userInput.nextLine();
    }
    
    if (userGuess.equals("scissors") && computerGuess == 2) {
      System.out.println("you chose scissors, the computer chose paper, you win.");
      System.out.println("would you like to play again?: ");
      repeat = userInput.nextLine();
    }
    
    if (userGuess.equals("scissors") && computerGuess == 3) {
      System.out.println("you chose scissors, the computer also chose scissors, its a draw.");
      System.out.println("would you like to play again?: ");
      repeat = userInput.nextLine();
    } else { 
      System.out.println("please enter rock paper or scissors: ");
      userGuess = userInput.nextLine();
      compare();
    }
    if (repeat.equals("yes")) {
      generateandguess();
    }
    if (repeat.equals("no")) {
      System.out.println("Goodbye.");
    
    }
  }
}