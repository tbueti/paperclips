// File: invoice.java
// Author: Thomas E. Bueti
// NetID: tbueti

import java.util.Date;

// Invoice Class
public class invoice implements Comparable<invoice> {

  // Class members
  private final int price =
  private String companyName;     // Name of the company
  private String address;         // Where the customer is
  private String ccNum;           // Stored credit card number (totally secure bro)
  private String zip;             // Company zip code
  private String phone;           // Company phone number
  private Date purchaseDate;      // Date the company purcahsed the paperclips
  private List<paperclip> order;  // The customer's order
  private double total;           // How much they owe

  // Constructor
  public invoice(String name, String addr, String cc, String zip, String phone) {

    // Initialize
    this.companyName = name;
    this.address = addr;
    this.ccNum = cc;
    this.zip = zip;
    this.phone = phone;

    // Initialize the order information
    this.order = new ArrayList<paperclip>();
    this.purchaseDate = new Date();
    this.total = 0;
  }

  // Adds a paperclip to the order and updates the total
  public void addToCart(paperclip p) {

    // Update the price first
    this.total += (p.getSize().getPrice() * p.getQty());

    // Add the paperclips to the cart
    // See if we have paperclips that are already like this in the cart
    for (int i = 0; i < this.order.size(); i++) {

      // If we have a match
      if (this.order.get(i).getColor() == p.getColor() && this.order.get(i).getSize() == p.getSize()) {

        // Then just add to the quantity
        this.order.get(i).updateQty(p.getQty());
        return;
      }
    }

    // If we've made it here, then we know that we have no paperclips like this in our Inventory
    // So, just add it.
    this.order.add(p);
  }

  // Removes a paper clip from the order and updates the total
  public void removeFromCart(paperclip p) {

    // Subtract the paperclips to the cart
    // See if we have paperclips that are already like this in the cart
    for (int i = 0; i < this.order.size(); i++) {

      // If we have a match
      if (this.order.get(i).getColor() == p.getColor() && this.order.get(i).getSize() == p.getSize()) {

        // Then just add to the quantity
        this.order.get(i).updateQty(0 - p.getQty());

        // Update the price first
        this.total -= (p.getSize().getPrice() * p.getQty());

        // Did we get rid of all of them?
        if (this.order.get(i).getQty() < 1) {

          this.order.remove(i);
        }
        
        return;
      }
    }
  }

  // Returns the customer order
  public List<paperclip> getCart() {

    return this.order;
  }

  // Returns the total amount owed
  public double getTotal() {

    return this.total;
  }

  // Returns the company Name
  public String getCompanyName() {

    return this.companyName;
  }

  // Returns the company phone number
  public String getPhone() {

    return this.phone;
  }

  // Returns the company address
  public String getAddress() {

    return this.address;
  }

  // Returns the company zip code
  public String getZip() {

    return this.zip;
  }

  // Returns the last 4 digits of the company cc number
  public String getCC() {

    return this.ccNum;
  }

}
