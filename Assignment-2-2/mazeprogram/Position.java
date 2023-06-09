package mazeprogram;

/**
 *  @author Lewis and Chase
 *
 *  Represents a single position in a maze of characters.
 */

public class Position
{
  /** x coordinate */
  private int x;
  /** y coordinate */
  private int y;


  // THIS IS THE EXTRA instance variable
  private Position previous; 

  /**
   * Constructs a position and sets the x & y coordinates to 0,0.
   */
  Position()
  {
    x = 0;
    y = 0;
    previous = null;
  }

  public void setPrevious(Position previous) //****
  {
    this.previous = previous;
  }

  public Position getPrevious() //****
  {
    return previous;
  }

  /**
   * Returns the x-coordinate value of this position.
   * @return int the x-coordinate of this position
   */
  public int getx()
  {
    return x;
  }

  /**
   * Returns the y-coordinate value of this position.
   * @return int the y-coordinate of this position
   */
  public int gety()
  {
    return y;
  }

  /**
   * Sets the value of the current position's x-coordinate.
   * @param a value of x-coordinate
   */
  public void setx(int a)
  {
    x = a;
  }

  /**
  * Sets the value of the current position's x-coordinate.
  * @param a value of y-coordinate
  */
  public void sety(int a)
  {
    y = a;
  }

  public String toString()
  {

    String str = "(";
    str += x + " , ";
    str += y;
    str += ")";

    return str;
  }
}