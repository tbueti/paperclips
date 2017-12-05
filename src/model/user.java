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
    this.auth = t;
  }

  // Returns the name of the user
  public String getUsername() {

    return this.username;
  }

  // Returns the password of the user (soooo secure bro)
  public String getPassword() {

    return this.password;
  }

  // Returns the type of employee the user is
  public userType getType() {

    return this.auth;
  }
}
