import entities.Paper;
import entities.PlayedObject;
import entities.Rock;
import entities.Scissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayerVSEntity implements GameMode
{
  private final List<PlayedObject> choices;
  private final Random rand;

  public PlayerVSEntity()
  {
    rand = new Random();
    choices = new ArrayList<>();

    choices.add(new Rock());
    choices.add(new Paper());
    choices.add(new Scissors());
  }
  @Override public boolean playAMatch(PlayedObject player)
  {
    return player.wonMatch(randomChoice());
  }

  public PlayedObject randomChoice()
  {
    return choices.get(rand.nextInt(choices.size()));
  }
}
