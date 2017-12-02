// File: pos.java
// Author: Thomas E. Bueti
// NetID: tbueti

// Point of Sale Class
public class pos implements Serialiazable {

  // Class members
  private List<user> users;         // Contains a list of all authorized users
  private List<invoice> invoices;   // Contains a list of all customer invoices
  private inventory stock;          // Contains the inventory of paperclips
  private user activeUser;          // Contains a reference to the current user

  // Constructor
  public pos() {

    // Initialize
    users = new ArrayList<user>();
    invoices = new ArrayList<user>();
    stock = new stock();
    activeUser = null;
  }

  // Adds a given user to the list of users
  // Can only be done by the manager
  public void addUser(username, password) {

    // TODO: Implement this method
  }

  // Adds a new paperclip to the inventory
  public void addPaperClip(paperclip toAdd) {

    // TODO: Implement this method
  }

  // Adds an invoice to the list of invoices
  public void addInvoice(invoice i) {

    // TODO: Implement this method
  }

  // Authenticates a user and sets the active user
  // to the authenticated user
  public void authenticate(String username, String password) {

    // TODO: Implement this method
  }


}
