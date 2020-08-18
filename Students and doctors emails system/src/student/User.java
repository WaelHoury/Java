/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * 
 */
public class User {
    public String name,matiere,date,subject;
    
    public User(String subject,String name,String matiere,String date){
        this.subject=subject;
        this.name=name;
        this.date=date;
        this.matiere=matiere;
    }
}
