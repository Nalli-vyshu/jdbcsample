package com.jdbcsample;
import java.sql.*;


public class addmobile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
	        //create the object to get connection
	        //Burl to db,username,password
	        String url="jdbc:mysql://localhost:3306/oneplus";
	        String username="root";
	        String password="vyshu2525";
	        //get connection to the db
	        
	        Connection bin=DriverManager.getConnection(url,username,password);
	        //a statement to execute a query		
         
	        int mid=10;
	        String mname="vivo";
	        int mprice=123;
	        String query="insert into mobile values(?,?,?)";
	        
	        PreparedStatement pst=bin.prepareStatement(query);
	        pst.setInt(1, mid);
	        pst.setString(2, mname);
	        pst.setInt(3, mprice);
	        
	        int count=pst.executeUpdate();
	        System.out.println(count+"row(s) affected(created)");
	        bin.close();
	        
	        
	   }

}
