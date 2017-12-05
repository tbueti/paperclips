// File: user.java
// Author: Thomas Bueti
// NetID: tbueti

// User Class
public class user {

  // Class members
  private String username;
  private String password;
  private userType auth;

  // Constructor
  public user(String name, String password, userType t) {

    // Initialize
    this.username = name;
    this.password = password;
    this.userType = t;
  }


}
