public class Game{
  public boolean isTie(String choice1, String choice2){
    return choice1.equals(choice2);
  }


  public Boolean rockWins(String choice1, String choice2){
    boolean results = false;
    if (((choice1.equals("rock"))&&(choice2.equals("scissors")))||((choice2.equals("rock"))&&(choice1.equals("scissors")))) {
      results = true;
    } else {
      results = false;
    }
    return results;
  }
  public Boolean scissorsWin(String choice1, String choice2){
    boolean results = false;
    if (((choice1.equals("scissors"))&&(choice2.equals("paper")))||((choice2.equals("scissors"))&&(choice1.equals("paper")))) {
      results = true;
    } else {
      results = false;
    }
    return results;
  }
  public Boolean paperWin(String choice1, String choice2){
    boolean results = false;
    if (((choice1.equals("paper"))&&(choice2.equals("rock")))||((choice2.equals("paper"))&&(choice1.equals("rock")))) {
      results = true;
    } else {
      results = false;
    }
    return results;
  }
}
