package entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ScissorsTests
{
  public PlayedObject scissors;

  @Before
  public void setUp()
  {
    scissors = new Scissors();
  }
  @Test
  public void testInitialisation()
  {
    Assert.assertNotNull(scissors);
  }

  @Test
  public void wonMatch_returnsFalseOpponentNull()
  {
    Assert.assertFalse(scissors.wonMatch(null));
  }

  @Test
  public void wonMatch_returnsFalseOpponentWins()
  {
    PlayedObject rock = new Rock();

    Assert.assertFalse(scissors.wonMatch(rock));
  }

  @Test
  public void wonMatch_returnsFalseTie()
  {
    PlayedObject oppScissors = new Scissors();

    Assert.assertFalse(scissors.wonMatch(oppScissors));
  }

  @Test
  public void wonMatch_returnsTrueIfMatchWon()
  {
    PlayedObject paper = new Paper();

    Assert.assertTrue(this.scissors.wonMatch(paper));
  }
}
