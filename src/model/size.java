// File: size.java
// Author: Thomas E. Bueti
// NetID: tbueti

// Size Class
public enum size {

  SMALL(0.75),
  MEDIUM(1.99),
  LARGE(2.25);

  private final double price;
  size(double p) { this.price = p; }
  public double getPrice() { return this.price; }

}
