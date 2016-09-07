import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();
    Game newGame = new Game();
    System.out.println("Player one please enter rock, paper or scissors ");
    String playerOneChoice = c.readLine();
    System.out.println("Player two please enter rock, paper or scissors ");
    String playerTwoChoice = c.readLine();
    if(newGame.rockWins(playerOneChoice, playerTwoChoice)&&!newGame.isTie(playerOneChoice, playerTwoChoice)) {
      System.out.println("Rock wins!!!");
    } else if(newGame.scissorsWin(playerOneChoice, playerTwoChoice)&&!newGame.isTie(playerOneChoice, playerTwoChoice)) {
      System.out.println("Scissors wins!!!");
    } else if(newGame.paperWin(playerOneChoice, playerTwoChoice)&&!newGame.isTie(playerOneChoice, playerTwoChoice)) {
      System.out.println("Paper wins!!!");
    }
  }
}
