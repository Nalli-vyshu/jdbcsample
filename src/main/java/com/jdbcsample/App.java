package com.jdbcsample;
//importing package
import java.sql.*;

/**
 * JDBC SAMPLE PROGRAM BY HP
 *
 */

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	//load and register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //create the object to get connection
        //Burl to db,username,password
        String url="jdbc:mysql://localhost:3306/oneplus";
        String username="root";
        String password="vyshu2525";
        //get connection to the db
        
        Connection bs=DriverManager.getConnection(url,username,password);
        //a statement to execute a query
        Statement st=bs.createStatement();
        //checking for responce
        ResultSet rs=st.executeQuery("select * from mobile where mobileId=2");
        //checking for responce
        rs.next();
        //roading the mobile name from responce
        String mobileName=rs.getString("mobileName");
        //printing mobile name
        System.out.println(mobileName);
       
     
        
        bs.close();
    }
}
