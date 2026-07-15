/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day22.discussion;

public class User {
    
     int id;
     String name;
     String email;
     String password;
     String userRole;
    
    // alt + insert

    // parameterized constructor
    public User(String name, String email, String password, String userRole) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
    }
    
    public String getRoleInfo() {
        return "User " + name + ", User Role: " + userRole;
    }
  
    
    
    
}
