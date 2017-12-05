// File: paperclip.java
// Author: Thomas Bueti
// NetID: tbueti

// Paperclip Class
public class paperclip {

  // Class members
  private paperclip-color color;    // Enumeration of the color
  private paperclip-size size;      // Enumeration of the Size
  private int quantity;             // Number of paperclips available of this type

  // Constructor
  public paperclip(paperclip-color c, paperclip-size s, int qty) {

    // Initialize
    this.color = c;
    this.size = s;
    this.quantity = qty;
  }

  // Returns the quantity of the paperclips available
  public int getQty() {

    return this.quantity;
  }

  // Returns the color of the paperclips
  public paperclip-color getColor() {

    return this.color;
  }

  // Returns the size of the paperclips
  public paperclip-size getSize() {

    return this.size;
  }

  // Updates the quantity of the paperclips
  public void updateQty(int amount) {

    this.quantity += amount;
  }
}
