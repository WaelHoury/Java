/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc;

import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 *
 */
public class ModelDoctor {
    JFrame frame;
    ControlerDoctor con = new ControlerDoctor();
    public ModelDoctor(JFrame frame) throws SQLException{
        con.connect();
        this.frame=frame;
    }
    
    public void addDoc(Doctor doc) throws SQLException{
       System.out.println("insert into p_users values (user_id.nextval,'"+doc.username+"','"+doc.password+"','"+doc.email+"','"+doc.address+"')");
       System.out.println("insert into u_roles values(user_id.currval,2)");
        con.addDoctor(doc,this.frame);
        
    }
    
}
