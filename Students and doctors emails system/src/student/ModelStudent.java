/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.sql.SQLException;
import javax.swing.JFrame;
/**
 *
 * 
 */
public class ModelStudent {
     JFrame frame;
    ControlerStudent con = new ControlerStudent();
    public ModelStudent(JFrame frame) throws SQLException{
        con.connect();
        this.frame=frame;
    }
    
    public void addStudent(Student std) throws SQLException{
       System.out.println("insert into p_users values (user_id.nextval,'"+std.username+"','"+std.password+"','"+std.email+"','"+std.address+"')");
       System.out.println("insert into u_roles values(user_id.currval,3)");
        con.addStudent(std,this.frame);
        
    }
}
