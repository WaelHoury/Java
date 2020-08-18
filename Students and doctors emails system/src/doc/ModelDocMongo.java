/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc;

import com.mongodb.BasicDBObject;
   import com.mongodb.MongoClient;
   import com.mongodb.DB;
   import com.mongodb.DBCollection;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
/**
 *
 * 
 */
public class ModelDocMongo {
    public void connect(String name,String a,String b,String c)
	{
		//Connecting With Server Please add the external jar file first
	 MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
         DB dbs=mongoClient.getDB("project");
          DBCollection coll = dbs.getCollection("sis");
         System.out.println("success");
         BasicDBObject circulaire = new BasicDBObject();
         circulaire.put("name", name);
         circulaire.put("subject", a);
         circulaire.put("text", b);
         circulaire.put("matiere", c);
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();
         circulaire.put("date", dtf.format(now));
         coll.insert(circulaire);
         
    } 

  
}
