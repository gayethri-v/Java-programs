package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateSwitchCase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch_12298_12299";
		String un = "root";
		String pass = "root";
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to update Record");
		int id = sc.nextInt();
		
			
		//step 1: load the driver
		Class.forName(driver);
		//step 2 make the connection
		
		Connection conn = DriverManager.getConnection(url, un, pass);
		//create statement
		
		Statement stmt = conn.createStatement();
		
		//for deletion need to check record exists
		
		String sql = "select * from employee where eid="+id;
		//select * from employee where eid=23
		
		ResultSet rs = stmt.executeQuery(sql);
		
		if(rs.next()) {  //if record exists, then go for delete
			
			//MENU
			System.out.println("Enter your choice");
			System.out.println("1.to update name");
			System.out.println("2.to update salary");
			
			int ch = sc.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter name to change");		
					String name = sc.next();
					String upsql = "update employee set ename='"+name+"' where eid="+id;
					 r = stmt.executeUpdate(upsql);
		
					if(r>0) {
						System.out.println("name with id="+id +" is Updated");
						}
					break;
			case 2: System.out.println("Enter salary to update");
			        float sal = sc.nextFloat();
			        String salup = "update employee set esalary="+sal+" where eid="+id;
			        r = stmt.executeUpdate(salup);
			        if(r>0) {
						System.out.println("salary with id="+id +" is Updated");
						}
					break;
		}//switch
		}//if(rs.next())
			
			else {
			System.out.println(id+" not exists");
		}
		
		
	}

}
