package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.PreparedQuery;

public class AddUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch_12298_12299";
		String un = "root";
		String pass = "root";
		
		int eid,did;
		String ename;
		float esalary;
		PreparedStatement pst;
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url, un, pass);
		//Statement stmt = conn.createStatement();
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee id");
		eid = sc.nextInt();
		
		//String sql = "select * from employee where eid="+eid;
		String sql = "select * from employee where eid=?";
		pst = conn.prepareStatement(sql);
		pst.setInt(1, eid);
		ResultSet rs = pst.executeQuery();
		
		if(rs.next()) {
			System.out.println(eid+" already exists ");
			return;
		}
		else 
		{
			System.out.println("Enter name");
			ename = sc.next();
			System.out.println("Enter salary");
			esalary = sc.nextFloat();
			System.out.println("Enter did (10,20,30)");
			did=sc.nextInt();
			
	//String inssql ="insert into employee(eid,ename,esalary,did) values("+eid+",'"+ename+"',"+esalary+","+did+")";
		String inssql ="insert into employee(eid,ename,esalary,did) values(?,?,?,?)";  
		    pst = conn.prepareStatement(inssql);
		    pst.setInt(1, eid);
		    pst.setString(2, ename);
		    pst.setFloat(3, esalary);
            pst.setInt(4,did);
		    
		int i = pst.executeUpdate();
		
		    
		    if(i>0) {
		    	System.out.println("Record added successfully");
		    }
		}
		

	}

}
