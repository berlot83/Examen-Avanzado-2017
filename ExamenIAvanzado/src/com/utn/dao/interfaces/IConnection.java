package com.utn.dao.interfaces;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public interface IConnection {

	default public Connection getConnection() {
				Connection con = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/utnavanzado", "root", "");
					if(con != null) {
						System.out.println("Connection ok");
					}else {
						System.out.println("Connection refused");
					}
					return con;
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("error");
					e.printStackTrace();
				}
			return con;
		}
		
}
	
