package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Read_Value_DB {
      
	
	public static void main(String[] args) {
		
		// Loading the JDBC driver
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
		
		
		 String url = "jdbc:mysql://localhost:3306/GoldilockDb"; // Replace with your actual database URL
	        String username = "root";
	        String password = "Root";
  
	        //Establishing connection
	        try(Connection connection = DriverManager.getConnection(url, username, password)){ 
	           
	        // Creating a statement
	            Statement statement = connection.createStatement();

	            // Executing a query
	            String sql = "SELECT EmpName, EmpAge FROM test";
	            ResultSet resultSet = statement.executeQuery(sql);

	            // Processing the result set
	            while (resultSet.next()) {
	                String empName = resultSet.getString("EmpName");
	                int empAge = resultSet.getInt("EmpAge");
	                System.out.println("Name: " + empName + ", Age: " + empAge);
	            }

	           
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
      
      
}
