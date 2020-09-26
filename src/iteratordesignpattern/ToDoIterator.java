package iteratordesignpattern;

/**
 * An iterator for the ToDo class
 * 
 * @author Nghia Nguyen
 *
 */
public class ToDoIterator implements Iterator {
  private ToDo[] todos;
  private int position = 0;

  /**
   * Creates an iterator foro the ToDo class
   * 
   * @param todos - the ToDo array that needs to be iterated
   */
  public ToDoIterator(ToDo[] todos) {
    this.todos = todos;
  }

  /**
   * Checks whether or not the array can move to next position
   * 
   * @return a boolean whether or not the ToDo array has more to iterate
   */
  public boolean hasNext() {
    if (position >= todos.length || todos[position] == null) {
      return false;
    } else {
      return true;
    }
  }

  /**
   * Moves the iterator one spot over
   * 
   * @return the ToDo at the iterator's position before it is moved
   */
  public ToDo next() {
    ToDo todo = todos[position];
    position++;
    return todo;
  }
}
