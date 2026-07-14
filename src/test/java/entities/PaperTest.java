package entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PaperTest
{
  public PlayedObject paper;

  @Before
  public void setUp()
  {
    paper = new Paper();
  }
  @Test
  public void testInitialisation()
  {
    Assert.assertNotNull(paper);
  }

  @Test
  public void wonMatch_returnsFalseOpponentNull()
  {
    Assert.assertFalse(paper.wonMatch(null));
  }

  @Test
  public void wonMatch_returnsFalseOpponentWins()
  {
    PlayedObject scissors = new Scissors();

    Assert.assertFalse(this.paper.wonMatch(scissors));
  }

  @Test
  public void wonMatch_returnsFalseTie()
  {
    PlayedObject oppPaper = new Paper();

    Assert.assertFalse(paper.wonMatch(oppPaper));
  }

  @Test
  public void wonMatch_returnsTrueIfMatchWon()
  {
    PlayedObject rock = new Rock();

    Assert.assertTrue(paper.wonMatch(rock));
  }
}
