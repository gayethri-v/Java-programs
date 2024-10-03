package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FetchRecordBasedOnId {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//step1. load the driver
			//step2. make the connection
			//step3. create a statement object
			//step4. Execute query
			//step5.close the connection
			
			int eid,did;
	        String ename;
	        float esalary;
	        
	       Scanner sc = new Scanner(System.in);
	       
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/batch_12298_12299";
			String un="root";
			String pass="root";
			
			//step1. load the driver
			
			Class.forName(driver);
			
			//step2. make the connection
			Connection conn = DriverManager.getConnection(url, un, pass);
			//System.out.println(conn);
			
			System.out.println("Enter employee id");
			eid = sc.nextInt();
				
			
			String s = "select * from employee where eid="+eid;
			//step3. create a statement object
			
			Statement stmt = conn.createStatement();
			
			//step4. Execute query
			ResultSet rs = stmt.executeQuery(s);
			
			
			if(rs.next()) {
				System.out.println("Did\tename\tesalary\tdid");
				eid = rs.getInt("eid");
				ename =  rs.getString("ename");
				esalary = rs.getFloat("esalary");
				did = rs.getInt("did");
				
				System.out.println(eid+"\t"+ename+"\t"+esalary+"\t"+did);
			}else {
				System.out.println("Employee not exist");
			}
		}

}
