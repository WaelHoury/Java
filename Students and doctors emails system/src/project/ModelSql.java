/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import admin.AdminFrame;
import doc.DocFrame;
import student.Student;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import student.StudentFrame;

/**
 *
 * 
 */
public class ModelSql {
    JFrame frame;
    ConnectionSql con = new ConnectionSql();
    public ModelSql(JFrame frame) throws SQLException{
        con.connect();
        this.frame=frame;
    }
    public void getRole(User user) throws SQLException{
        int result = con.getRole(user);
        int fac= con.getFac(user);
        System.out.println("hi" +fac);
        switch (result) {
            case 1:
                {
                    AdminFrame frame = new AdminFrame();
                    frame.setVisible(true);
                    break;
                }
            case 2:
            {   
                DocFrame frame= new DocFrame(user.username);
                frame.setVisible(true);
                break;
                
            }
            case 3:
            {   
                StudentFrame frame= new StudentFrame(fac);
                frame.setVisible(true);
                break;
            }
            default:
                JOptionPane.showMessageDialog(frame,"wrong username or password");
                break;
        }
    }
}
