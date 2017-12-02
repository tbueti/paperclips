// File: invoice.java
// Author: Thomas E. Bueti
// NetID: tbueti

// Invoice Class
public class invoice implements Comparable<invoice> {

  // Class members
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
    this.purchaseDate = new Date();           // TODO: lookup how to get today's date
    this.total = 0;
  }

  // Adds a paperclip to the order and updates the total
  public boolean addToCart(paperclip p, int numclips) {

    // TODO: Implement this method
  }

  // Removes a paper clip from the order and updates the total
  public boolean removeFromCart(paperclip p) {

    // TODO:Implement this method
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
