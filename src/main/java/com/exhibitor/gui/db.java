
package com.exhibitor.gui;

import java.sql.Connection;
import java.sql.DriverManager;


public class db {
    
    public static Connection myconn(){
      Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/expomanagement","root","");
        }catch(Exception e){
            
            System.out.println(e);
        }
           return conn;
    }
}
