package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;





public class DatabaseOperations {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/example";
		String userName="debian-sys-maint";
		String password="a48qIJwnTfPENyKp";
		Connection con=null;

		try {

			con=DriverManager.getConnection(url,userName,password);
			
			System.out.println("1] Add. \n 2] Update. \n3] Delete. \n4] Read.");
			Scanner scanner =  new Scanner(System.in);
			int choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1: 
				String query = "insert into demo values(?, ?)";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setInt(1,  67);
				stmt.setString(2, "Bharat");
				stmt.execute();
				stmt.close();
				System.out.println("Added.");
				break;
			case 2: 
				String query0 = "update demo set id=?, name=? where id=?";
				PreparedStatement stmt0 = con.prepareStatement(query0);
				stmt0.setInt(1, 10);
				stmt0.setString(2, "CTY");
				stmt0.setInt(3, 1);
				int update = stmt0.executeUpdate();
				stmt0.close();
				System.out.println(update + "Updated");
				break;
			case 3:
				String query1 = "delete from demo where id=?";
				PreparedStatement stmt1 = con.prepareStatement(query1);
				stmt1.setInt(1, 2);
				System.out.println("Deleted");
				stmt1.close();
				
				break;
			case 4:
				System.out.println("Enter id to read data:");
				int id0= scanner.nextInt();
				String query2 = "select * from demo where id=?";
				PreparedStatement stmt2 = con.prepareStatement(query2);
				stmt2.setInt(1, id0);
				ResultSet rs = stmt2.executeQuery();
				if(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					System.out.println(id + " " +name);
				}else {
					System.out.println("Sorry no record");
				}
				stmt2.close();
				rs.close();
				break;
				default:
					System.out.println("Wrong choice.");
					break;
			}

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			con.close();
		}

	}

}

