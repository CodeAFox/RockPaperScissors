import entities.Paper;
import entities.PlayedObject;
import entities.Rock;
import entities.Scissors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PVETest
{
  private GameMode gameMode;

  @Before
  public void setUp()
  {
    gameMode = new PlayerVSEntity();
  }

  @Test
  public void testInitialisation()
  {
    Assert.assertNotNull(gameMode);
  }

  @Test
  public void randomChoice_probabilityTest()
  {
    int rock = 0;
    int paper = 0;
    int scissors = 0;

    PlayerVSEntity pve = new PlayerVSEntity();

    for (int i = 0; i < 100; i++)
    {
      PlayedObject systemChoice = pve.randomChoice();
      if(systemChoice instanceof Rock)
      {
        rock ++;
      }
      else if (systemChoice instanceof Paper)
      {
        paper ++;
      }
      else if (systemChoice instanceof Scissors)
      {
        scissors ++;
      }
      else {
        System.out.println("Something went wrong");
      }
    }

    Assert.assertTrue(rock > 0);
    Assert.assertTrue(paper > 0);
    Assert.assertTrue(scissors > 0);
  }

  @Test
  public void playAMatch_worksAsExpected()
  {
    int won = 0;
    int lost = 0;

    for (int i = 0; i < 100; i ++)
    {
      if(gameMode.playAMatch(new Rock()))
      {
        won ++;
      }
      else
      {
        lost ++;
      }
    }

    Assert.assertTrue(won > 0);
    Assert.assertTrue(lost > 0);
  }
}
