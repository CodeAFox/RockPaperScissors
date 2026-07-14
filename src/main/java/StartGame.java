import entities.Paper;
import entities.Rock;
import entities.Scissors;
import gamemodes.GameMode;
import gamemodes.PlayerVSEntity;

import java.util.Scanner;

public class StartGame
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    GameMode pve = new PlayerVSEntity();

    boolean contGame = true;

    System.out.println("Type 'rock', 'paper' or 'scissors' to start a match.\nType 'exit' to exit.");
    do
    {
      String playerChoice = in.nextLine();
      boolean won = false;

      switch (playerChoice)
      {
        case "rock":
          won = pve.playAMatch(new Rock());
          break;
        case "paper":
          won = pve.playAMatch(new Paper());
          break;
        case "scissors":
          won = pve.playAMatch(new Scissors());
          break;
        case "exit":
          contGame = false;
          break;
        default:
          System.out.println("Invalid input, please try again.");
      }

      if(contGame)
      {
        if(won)
        {
          System.out.println("You have won!");
        }
        else
        {
          System.out.println("You have lost.");
        }
      }
    }
    while (contGame);
  }
}
