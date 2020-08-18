/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import project.ConnectionSql;
/**
 *
 *
 */
public class ControlerDoctor extends ConnectionSql{
   
   
    

    public void addDoctor(Doctor doctor,JFrame frame) {
       
       try {
            Statement stmt=this.doc.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
      ResultSet.CONCUR_UPDATABLE);
            String insertStmt1="insert into p_users values (u_id.nextval,'"+doctor.username+"','"+doctor.password+"','"+doctor.email+"','"+doctor.address+"')";
            String insertStmt2="insert into u_roles values(u_id.currval,2)";
            this.doc.setAutoCommit(false);
            stmt.addBatch(insertStmt1);
            stmt.addBatch(insertStmt2);
             for(int a : doctor.faculty){
            stmt.addBatch("insert into faculty values (u_id.currval,"+a+")");
        }
             
           
             stmt.executeBatch();
             this.doc.commit();
            JOptionPane.showMessageDialog(frame,"user added succesfully");
            
            
            stmt.close();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(frame,"user not added");
            Logger.getLogger(ControlerDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
         
           
    }
   


    
}
