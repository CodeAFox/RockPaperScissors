package entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RockTest
{
  public PlayedObject rock;

  @Before
  public void setUp()
  {
    rock = new Rock();
  }
  @Test
  public void testInitialisation()
  {
    Assert.assertNotNull(rock);
  }

  @Test
  public void wonMatch_returnsFalseOpponentNull()
  {
    Assert.assertFalse(rock.wonMatch(null));
  }

  @Test
  public void wonMatch_returnsFalseOpponentWins()
  {
    PlayedObject paper = new Paper();

    Assert.assertFalse(rock.wonMatch(paper));
  }

  @Test
  public void wonMatch_returnsFalseTie()
  {
    PlayedObject oppRock = new Rock();

    Assert.assertFalse(rock.wonMatch(oppRock));
  }

  @Test
  public void wonMatch_returnsTrueIfMatchWon()
  {
    PlayedObject scissors = new Scissors();

    Assert.assertTrue(rock.wonMatch(scissors));
  }
}
