package entities;

public class Scissors implements PlayedObject
{
  @Override public boolean wonMatch(PlayedObject opponent)
  {
    return opponent instanceof Paper;
  }

  @Override public String toString()
  {
    return "Scissors";
  }
}
