/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * 
 */
public class User {
    public String username;
    public String password;
    
    public String email;
    public String address;
    
    //constructor
    public User(String name,String password){
        this.username=name;
        this.password=password;
    } 
}
