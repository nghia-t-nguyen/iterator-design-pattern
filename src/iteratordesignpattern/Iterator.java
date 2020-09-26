package iteratordesignpattern;

/**
 * Iterator interface to define the method of an iterator
 * 
 * @author Nghia Nguyen
 *
 */
public interface Iterator {
  /**
   * Checks whether to see if the iterator can move to the next position
   * 
   * @return a boolean whether or not there is more to iterate
   */
  public boolean hasNext();

  /**
   * Moves the iterator one space over
   * 
   * @return the Object at the current position before the iterator is moved
   */
  public Object next();
}
