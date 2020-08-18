/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class ConnectionSql {
    public Connection con;
    public Connection con1;
    public Connection con2;
    public Connection con3;
    public Connection doc;
    public Connection std;
    public void connect() throws SQLException {
        
        try {
            // TODO code application logic here
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
        
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ua1","system","123");
        con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ua1","system","123");
        con2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ua1","system","123");
        con3=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ua1","system","123");
        doc=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ua1","system","123");
        std=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ua1","system","123");
    }
    public int getRole(User user) throws SQLException{
          Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("select * from p_users");
         
        while(rs.next()){
           if(rs.getString(2).equals(user.username) && rs.getString(3).equals(user.password))
           {
               
                Statement st1=con1.createStatement();
                ResultSet rs1=st1.executeQuery("select * from u_roles");
                while(rs1.next()){
                    if(rs1.getInt(1)==rs.getInt(1)){
                        return rs1.getInt(2);
                    }
                }
              
                
               
           }
        }
       
        return 0;
    }
    public int getFac(User user) throws SQLException{
          Statement st2=con2.createStatement();
         ResultSet rs2=st2.executeQuery("select * from p_users");
         
        while(rs2.next()){
           if(rs2.getString(2).equals(user.username) && rs2.getString(3).equals(user.password))
           {
               
                Statement st3=con3.createStatement();
                ResultSet rs3=st3.executeQuery("select * from faculty");
                while(rs3.next()){
                    if(rs3.getInt(1)==rs2.getInt(1)){
                        return rs3.getInt(2);
                    }
                }
              
                
               
           }
    }
        return 0;
    }
    
    private int getId(int a) throws SQLException{
        
                Statement st1=con.createStatement();
                ResultSet rs1=st1.executeQuery("select * from u_roles");
                System.out.println(rs1.next());
                
        return 0;
    }
   
}
