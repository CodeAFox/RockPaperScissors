package entities;

public class Paper implements PlayedObject
{
  @Override public boolean wonMatch(PlayedObject opponent)
  {
    return opponent instanceof Rock;
  }

  @Override public String toString()
  {
    return "Paper";
  }
}
