import static spark.Spark.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    Game newGame = new Game();
    String[] rps = {"rock","paper","scissors"};

    get("/", (request, response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/input.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/rps", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      int player1 = Integer.parseInt(request.queryParams("player_1"));
      String playerOneChoice = rps[player1];
      int player2 = Integer.parseInt(request.queryParams("player_2"));
      String playerTwoChoice = rps[player2];

      if(newGame.rockWins(playerOneChoice, playerTwoChoice)&&!newGame.isTie(playerOneChoice, playerTwoChoice)) {
        model.put("whoWon", "Rock wins!!!");
      } else if(newGame.scissorsWin(playerOneChoice, playerTwoChoice)&&!newGame.isTie(playerOneChoice, playerTwoChoice)) {
        model.put("whoWon", "Scissors wins!!!");
      } else if(newGame.paperWin(playerOneChoice, playerTwoChoice)&&!newGame.isTie(playerOneChoice, playerTwoChoice)) {
        model.put("whoWon", "Paper wins!!!");
      }
      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }
}
