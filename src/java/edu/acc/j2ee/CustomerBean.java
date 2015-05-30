/*
 *UserBean is a class representing the User table in our Database
 *(where each column in the //user table has a corresponding instance 
 *variable with a setter and a getter method).
*/
package edu.acc.j2ee;

public class CustomerBean { 
private String username; 
private String password; 
private String firstName; 
private String lastName; 
public boolean valid; 

public String getFirstName() {
 return firstName;
 } 
public void setFirstName(String newFirstName) { 
firstName = newFirstName; 
} 
public String getLastName() { 
return lastName; 
} 
public void setLastName(String newLastName) { 
lastName = newLastName; 
} 
public String getPassword() { 
return password; 
} 
public void setPassword(String newPassword) { 
password = newPassword; 
}
 public String getUsername() { 
return username;
 } 
public void setUserName(String newUsername) {
 username = newUsername; 
} public boolean isValid() { 
return valid; 
} 
public void setValid(boolean newValid) {
 valid = newValid; 
}	
}