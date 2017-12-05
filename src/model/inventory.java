// File: inventory.java
// Author: Thomas E. Bueti
// NetID: tbueti

import java.util.ArrayList;
import java.util.List;

// Inventory Class
public class inventory {

  // Class members
  private List<paperclip> stock;    // All the paperclips in inventory

  // Constructor
  public inventory() {

    // Initialize
    this.stock = new ArrayList<paperclip>();

    // Add some Inventory
    // Red paperclips
    paperclip red_small = new paperclip(color.RED, size.SMALL, 100000);
    paperclip red_medium = new paperclip(color.RED, size.MEDIUM, 100000);
    paperclip red_large = new paperclip(color.RED, size.LARGE, 100000);
    this.stock.add(red_small);
    this.stock.add(red_medium);
    this.stock.add(red_large);

    // Green paperclips
    paperclip green_small = new paperclip(color.GREEN, size.SMALL, 100000);
    paperclip green_medium = new paperclip(color.GREEN, size.MEDIUM, 100000);
    paperclip green_large = new paperclip(color.GREEN, size.LARGE, 100000);
    this.stock.add(green_small);
    this.stock.add(green_medium);
    this.stock.add(green_large);

    // Blue paperclips
    paperclip blue_small = new paperclip(color.BLUE, size.SMALL, 100000);
    paperclip blue_medium = new paperclip(color.BLUE, size.MEDIUM, 100000);
    paperclip blue_large = new paperclip(color.BLUE, size.LARGE, 100000);
    this.stock.add(blue_small);
    this.stock.add(blue_medium);
    this.stock.add(blue_large);

    // Purple paperclips
    paperclip purple_small = new paperclip(color.PURPLE, size.SMALL, 100000);
    paperclip purple_medium = new paperclip(color.PURPLE, size.MEDIUM, 100000);
    paperclip purple_large = new paperclip(color.PURPLE, size.LARGE, 100000);
    this.stock.add(purple_small);
    this.stock.add(purple_medium);
    this.stock.add(purple_large);

    // Gray paperclips
    paperclip gray_small = new paperclip(color.GRAY, size.SMALL, 100000);
    paperclip gray_medium = new paperclip(color.GRAY, size.MEDIUM, 100000);
    paperclip gray_large = new paperclip(color.GRAY, size.LARGE, 100000);
    this.stock.add(gray_small);
    this.stock.add(gray_medium);
    this.stock.add(gray_large);

    // Black paperclips
    paperclip black_small = new paperclip(color.BLACK, size.SMALL, 100000);
    paperclip black_medium = new paperclip(color.BLACK, size.MEDIUM, 100000);
    paperclip black_large = new paperclip(color.BLACK, size.LARGE, 100000);
    this.stock.add(black_small);
    this.stock.add(black_medium);
    this.stock.add(black_large);

    // White paperclips
    paperclip white_small = new paperclip(color.WHITE, size.SMALL, 100000);
    paperclip white_medium = new paperclip(color.WHITE, size.MEDIUM, 100000);
    paperclip white_large = new paperclip(color.WHITE, size.LARGE, 100000);
    this.stock.add(white_small);
    this.stock.add(white_medium);
    this.stock.add(white_large);

    // Cyan paperclips
    paperclip cyan_small = new paperclip(color.CYAN, size.SMALL, 100000);
    paperclip cyan_medium = new paperclip(color.CYAN, size.MEDIUM, 100000);
    paperclip cyan_large = new paperclip(color.CYAN, size.LARGE, 100000);
    this.stock.add(cyan_small);
    this.stock.add(cyan_medium);
    this.stock.add(cyan_large);

    // Pink paperclips
    paperclip pink_small = new paperclip(color.PINK, size.SMALL, 100000);
    paperclip pink_medium = new paperclip(color.PINK, size.MEDIUM, 100000);
    paperclip pink_large = new paperclip(color.PINK, size.LARGE, 100000);
    this.stock.add(pink_small);
    this.stock.add(pink_medium);
    this.stock.add(pink_large);

    // Orange paperclips
    paperclip orange_small = new paperclip(color.ORANGE, size.SMALL, 100000);
    paperclip orange_medium = new paperclip(color.ORANGE, size.MEDIUM, 100000);
    paperclip orange_large = new paperclip(color.ORANGE, size.LARGE, 100000);
    this.stock.add(orange_small);
    this.stock.add(orange_medium);
    this.stock.add(orange_large);

    // Yellow paperclips
    paperclip yellow_small = new paperclip(color.YELLOW, size.SMALL, 100000);
    paperclip yellow_medium = new paperclip(color.YELLOW, size.MEDIUM, 100000);
    paperclip yellow_large = new paperclip(color.YELLOW, size.LARGE, 100000);
    this.stock.add(yellow_small);
    this.stock.add(yellow_medium);
    this.stock.add(yellow_large);

    // Brown paperclips
    paperclip br_small = new paperclip(color.BROWN, size.SMALL, 100000);
    paperclip br_medium = new paperclip(color.BROWN, size.MEDIUM, 100000);
    paperclip br_large = new paperclip(color.BROWN, size.LARGE, 100000);
    this.stock.add(br_small);
    this.stock.add(br_medium);
    this.stock.add(br_large);

    // Burgundy paperclips
    paperclip burg_small = new paperclip(color.BURGUNDY, size.SMALL, 100000);
    paperclip burg_medium = new paperclip(color.BURGUNDY, size.MEDIUM, 100000);
    paperclip burg_large = new paperclip(color.BURGUNDY, size.LARGE, 100000);
    this.stock.add(burg_small);
    this.stock.add(burg_medium);
    this.stock.add(burg_large);
  }

  // Returns the quantity of a particular paperclip
  public int getQty(color c, size s) {

    // Vars
    int i = 0;

    // Loop through our Inventory
    for (i = 0; i < stock.size(); i++) {

      // If we have a match
      if (stock.get(i).getColor() == c && stock.get(i).getSize() == s) {

        return stock.get(i).getQty();
      }
    }

    // If in doubt, we don't have any
    return 0;
  }

  // Returns a paperclip of the required quantity value if the stock
  // contains enough paperclips to satisfy the order. Returns null
  // if the stock does not have enough to satisfy the order.
  public paperclip buy(color c, size s, int qty) {

    // Vars
    paperclip order = null;
    int i = 0;

    // Loop through our Inventory
    for (i = 0; i < stock.size(); i++) {

      // If we have a match
      if (stock.get(i).getColor() == c && stock.get(i).getSize() == s) {

        // Do we have enough in stock?
        if (stock.get(i).getQty() >= qty) {

          // Create the order
          order = new paperclip(c, s, qty);

          // Update the Inventory
          stock.get(i).updateQty(0 - qty);
        } // End if
      }   // End if
    }     // End for

    // Return the desired quantity
    return order;
  }

  // Allows the stock to be refilled in case the customer
  // changes their desired quantity or removes the order
  // from their cart.
  public void addStock(color c, size s, int qty) {

    // Vars
    int i = 0;

    // Loop through our Inventory
    for (i = 0; i < stock.size(); i++) {

      // If we have a match
      if (stock.get(i).getColor() == c && stock.get(i).getSize() == s) {

        // Update the inventory
        stock.get(i).updateQty(qty);
        return;
      } // End if
    }   // End for

    // If we have no record of this type, then create a new paperclip
    this.stock.add(new paperclip(c, s, qty));
  }

}
