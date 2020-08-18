/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc;
import java.util.ArrayList;
import project.User;
/**
 *
 *
 */
public class Doctor extends User {
    public ArrayList<Integer>  faculty;
    public Doctor(String name,String password,String address,String email,ArrayList<Integer> faculty){
        super(name,password);
        this.address=address;
        this.email=email;
        this.faculty=faculty;
    }
    
}
