package com.javatpoint;

import java.sql.*;

public class RegisterUser1 {
	static int status = 0;

//int accountno=1;
	public static int register1(String username, String password, String repassword, double phone, String adderess,
			String syd) {

		Connection con = GetCon.getCon();
		PreparedStatement ps;
		try {
//		ps = con.prepareStatement("Insert into NEWSTAFFMEMBER values(?,?,?,?,?,?,?)");
		ps = con.prepareStatement("insert into NEWSTAFFMEMBER (username,password,repassword,phone,adderess,syd) values(?,?,?,?,?,?)");
//		int	nextvalue1=GetCon.getPrimaryKey();
//	 	ps.setInt(1,nextvalue1);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, repassword);
			ps.setDouble(4, phone);
			ps.setString(5, adderess);
			ps.setString(6, syd);

			status = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;

	}
}
