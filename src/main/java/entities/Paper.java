package entities;

public class Paper implements PlayedObject
{
  @Override public boolean wonMatch(PlayedObject opponent)
  {
    return opponent instanceof Rock;
  }
}
