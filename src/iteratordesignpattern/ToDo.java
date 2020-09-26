package iteratordesignpattern;

import java.util.ArrayList;

/**
 * A ToDo task on a contractor's to do list
 * 
 * @author Nghia Nguyen
 *
 */
public class ToDo {
  private String title;
  private String description;
  private double price;
  private String contact;
  private ArrayList<String> supplies;

  /**
   * Creates a ToDo task for a contractor
   * 
   * @param title - the title of the task
   * @param description - the description of the task
   * @param price - the price for how much that task costs
   * @param contact - the business contact for that task
   * @param supplies - the supplies used for the task
   */
  public ToDo(String title, String description, double price, String contact,
      ArrayList<String> supplies) {
    this.title = title;
    this.description = description;
    this.price = price;
    this.contact = contact;
    this.supplies = supplies;
  }

  /**
   * Gets the price for the task
   * 
   * @return a double with the price of the ToDo task
   */
  public double getPrice() {
    return price;
  }

  /**
   * Gets a String representation of title, description, contact, supply list, and price
   * 
   * @return a String representation of the ToDo task
   */
  public String toString() {
    String ret = "\n*****" + title + "*****" + "\n" + description + "\nBusiness Contact: " + contact
        + "\nSupply List: ";
    for (String supply : supplies) {
      ret += "\n-" + supply;
    }
    ret += "\nPrice: $" + price + "\n";
    return ret;
  }
}
