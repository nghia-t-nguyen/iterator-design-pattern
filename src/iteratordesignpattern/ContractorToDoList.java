package iteratordesignpattern;

import java.util.ArrayList;

/**
 * A contractor's to do list for his day-to-day tasks
 * 
 * @author Nghia Nguyen
 *
 */
public class ContractorToDoList {
  static final int DEFAULT_MAX = 2;
  private String address;
  private ToDo[] todos;
  private int count = 0;

  /**
   * Creates a contractor's to do list
   * 
   * @param address - the address for the project
   */
  public ContractorToDoList(String address) {
    this.address = address;
    todos = new ToDo[DEFAULT_MAX];
  }

  /**
   * Adds a ToDo task to the contractor's to do list
   * 
   * @param title - the title of the task
   * @param description - the description of the task
   * @param price - the price for how much that task costs
   * @param contact - the business contact for that task
   * @param supplies - the supplies used for the task
   */
  public void addToDo(String title, String description, double price, String contact,
      ArrayList<String> supplies) {
    ToDo todo = new ToDo(title, description, price, contact, supplies);
    if (count + 1 == todos.length) {
      todos = growArray(todos);
    }
    todos[count] = todo;
    count++;
  }

  /**
   * Creates an iterator to iterate over the contractor's to do list
   * 
   * @return a ToDoIterator for the contractor's to do list
   */
  public ToDoIterator createIterator() {
    return new ToDoIterator(todos);
  }

  /**
   * Gets the address for the project
   * 
   * @return a String with the address for the project
   */
  public String getAddress() {
    return address;
  }

  /**
   * Gets the total cost for the project
   * 
   * @return a double with the total for the project cost
   */
  public double getTotalCost() {
    double cost = 0;
    for (int i = 0; i < count; i++) {
      cost += todos[i].getPrice();
    }
    return cost;
  }

  /**
   * Resizes the ToDo array when it runs out of space
   * 
   * @param todos - the ToDo array that needs to be resized
   * @return an array of twice the size with the same data
   */
  private ToDo[] growArray(ToDo[] todos) {
    ToDo[] ret = new ToDo[todos.length * 2];
    for (int i = 0; i < todos.length; i++) {
      ret[i] = todos[i];
    }
    return ret;
  }
}
