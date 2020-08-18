/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class ControlerStudentMongo {
       MongoClient client = new MongoClient("LocalHost",27017);
          DB db =client.getDB("project");
         DBCollection col = db.getCollection("sis");
          
    public ArrayList<User> userList(int i){
    ArrayList<User> userList = new ArrayList<>();
    User user;
     DBCursor cur = col.find();
     while(cur.hasNext()){
         String s=cur.next().get("matiere").toString();
         String[] words=s.split(",");
         for(String w: words){
                    if(Integer.parseInt(w)== i){
                     user= new User(cur.curr().get("subject").toString(),cur.curr().get("name").toString(),cur.curr().get("matiere").toString(),cur.curr().get("date").toString());
                     userList.add(user);
                    }
                 }
         
         
         
     }
    return userList;
}
    public void GetCirculaire(JTable jTable1,int i){
        ArrayList<User> list = userList(i);
        
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         Object[] row = new Object[3];
         for(int b=list.size()-1;b>=0;b--){
             row[0]=list.get(b).name;
             row[1]=list.get(b).subject;
             row[2]=list.get(b).date;
             model.addRow(row);
         }
           
    }
    public void GetSearch(JTable jTable1,int i,String search,JFrame frame){
        int f=0;
        ArrayList<User> list = userList(i);
        
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setRowCount(0);
         Object[] row = new Object[3];
         for(int b=0;b<list.size();b++){
             if(list.get(b).name.equals(search)||list.get(b).subject.equals(search)){
             row[0]=list.get(b).name;
             row[1]=list.get(b).subject;
             row[2]=list.get(b).date;
             model.addRow(row);
             f++;
             }
            
         }
         if(search.equalsIgnoreCase("")){
             this.GetCirculaire(jTable1, i);
         }else
         if(f==0){
             JOptionPane.showMessageDialog(frame,"no data found");
         }
           
    }
    
   


    Object getText(String date) {
         DBCursor cur = col.find();
    while (cur.hasNext()){
        if(cur.next().get("date").toString().equals(date))
            return cur.curr().get("text");}
     return null;
    
    }
    
    
}
