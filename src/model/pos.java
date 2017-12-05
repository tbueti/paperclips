import java.util.ArrayList;
import java.util.List;

// File: pos.java
// Author: Thomas E. Bueti
// NetID: tbueti

// Point of Sale Class
public class pos {

  // Class members
  private List<user> users;         // Contains a list of all authorized users
  private List<invoice> invoices;   // Contains a list of all customer invoices
  private inventory stock;          // Contains the inventory of paperclips
  private user activeUser;          // Contains a reference to the current user

  // Constructor
  public pos() {

    // Initialize
    users = new ArrayList<user>();
    invoices = new ArrayList<invoice>();
    this.stock = new inventory();
    activeUser = null;

    // Add some users
    this.addUser("Helen", "1234", userType.MANAGER);
    this.addUser("Thomas", "test12", userType.EMPLOYEE);
    this.addUser("Allen", "test", userType.EMPLOYEE);
    this.addUser("Adam", "a1234", userType.EMPLOYEE);
  }

  // Adds a given user to the list of users
  // Can only be done by the manager
  public void addUser(String username, String password, userType auth) {

    // Create a new employee
    user emp = new user(username, password, auth);

    // Add the user to the list of users
    this.users.add(emp);
  }

  // Adds an invoice to the list of invoices
  public void addInvoice(invoice i) {

    // Add the invoice to the list of invoices
    this.invoices.add(i);
  }

  // Authenticates a user and sets the active user
  // to the authenticated user
  public boolean authenticate(String username, String password) {

    // Find the user by username
    user desiredUser = null;
    boolean result = false;

    // Search
    for (int i = 0; i < this.users.size(); i++) {

      // If we find the user
      if (this.users.get(i).getUsername().equals(username)) {

        // Set the user
        desiredUser = this.users.get(i);
      }
    }

    // Did we find the user? Let's authenticate
    if (desiredUser != null && desiredUser.getPassword().equals(password)) {

      this.activeUser = desiredUser;
      result = true;
    }

    // Indicate whether authentication was successful
    return result;
  }

  // Adds an item to an invoice
  public boolean addPaperclipToInvoice(invoice i, color c, size s, int qty) {

    // Vars
    paperclip toBuy = null;

    // Are we in stock?
    if ((toBuy = this.stock.buy(c, s, qty)) != null) {

      // Add to our cart
      i.addToCart(toBuy);
      return true;
    }

    return false;
  }

  // Removes an item from the cart
  public boolean removePaperclipFromInvoice(invoice i, color c, size s, int qty) {

    // Vars
    paperclip toReturn = new paperclip(c, s, qty);

    // Did we successfully remove it from the cart?
    if (i.removeFromCart(toReturn)) {

      // Restock our inventory
      this.stock.addStock(c, s, qty);
      return true;
    }

    return false;
  }

  // Returns the list of invoices
  public List<invoice> getInvoices() {

    return this.invoices;
  }

  // Returns the current active users
  public user getCurrentUser() {

    return this.activeUser;
  }

  // Returns the current inventory
  public inventory getInventory() {

    return this.stock;
  }

  // Logs the user out
  public void logout() {

    this.activeUser = null;
  }


}
