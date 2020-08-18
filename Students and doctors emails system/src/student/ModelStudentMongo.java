/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * 
 */
public class ModelStudentMongo {
    ControlerStudentMongo con= new ControlerStudentMongo();
    
    public void getSis(JTable jTable1, int i){
        con.GetCirculaire(jTable1, i);
    }
    public void getSearch(JTable jTable1, int i,String search,JFrame frame){
        con.GetSearch(jTable1, i,search,frame);
    }

    Object getText(String date) {
       return con.getText(date);
    }
    
}
