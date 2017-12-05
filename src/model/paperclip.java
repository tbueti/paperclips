// File: paperclip.java
// Author: Thomas Bueti
// NetID: tbueti

// Paperclip Class
public class paperclip {

  // Class members
  private color theColor;    // Enumeration of the color
  private size theSize;      // Enumeration of the Size
  private int quantity;             // Number of paperclips available of this type

  // Constructor
  public paperclip(color c, size s, int qty) {

    // Initialize
    this.theColor = c;
    this.theSize = s;
    this.quantity = qty;
  }

  // Returns the quantity of the paperclips available
  public int getQty() {

    return this.quantity;
  }

  // Returns the color of the paperclips
  public color getColor() {

    return this.theColor;
  }

  // Returns the size of the paperclips
  public size getSize() {

    return this.theSize;
  }

  // Updates the quantity of the paperclips
  public void updateQty(int amount) {

    this.quantity += amount;
  }
}
