import org.junit.*;
import static org.junit.Assert.*;

public class GameTest{
// @Test
// public void computerChooses_shouldBeAString_true() {
//   Game testGame = new Game();
//   String computerChoice =  testGame.computerChooses();
//   assertEquals(true, computerChoice instanceof String);
//   }
@Test
public void isTie_true() {
  Game testGame = new Game();
  String playerOneChoice = "rock";
  String playerTwoChoice = "rock";
  assertEquals(true, testGame.isTie (playerOneChoice, playerTwoChoice));
  }
@Test
public void rockWins_true() {
  Game testGame = new Game();
  String playerOneChoice = "rock";
  String playerTwoChoice = "scissors";
  assertEquals(true, testGame.rockWins (playerOneChoice, playerTwoChoice));
  }
@Test
public void scissorsWin_true() {
  Game testGame = new Game();
  String playerOneChoice = "scissors";
  String playerTwoChoice = "paper";
  assertEquals(true, testGame.scissorsWin (playerOneChoice, playerTwoChoice));
  }
@Test
public void paperWin_true() {
  Game testGame = new Game();
  String playerOneChoice = "paper";
  String playerTwoChoice = "rock";
  assertEquals(true, testGame.paperWin (playerOneChoice, playerTwoChoice));
  }
}
