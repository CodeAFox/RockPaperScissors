package entities;

public class Rock implements PlayedObject
{
  @Override public boolean wonMatch(PlayedObject opponent)
  {
    return opponent instanceof Scissors;
  }
}
