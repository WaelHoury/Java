/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import project.User;
/**
 *
 * 
 */
public class Student extends User {
    public int faculty;
    public Student(String name,String password,String address,String email,int faculty){
        super(name,password);
        this.address=address;
        this.email=email;
        this.faculty=faculty;
    }
    
    
}
