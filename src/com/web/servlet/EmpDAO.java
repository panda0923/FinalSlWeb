package com.web.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sun.org.apache.xerces.internal.util.DOMUtil;

public class EmpDAO {
	public int insert(EmpDTO user){
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		int result = 0;
		
		System.out.println(user.getEmpNo()+user.getPosition()+user.getPassWord()+
				user.getEmpName()+user.getDept()+user.getEmpjoin());
		String sql="insert into emp values(?,?,?,?,?,?)";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			conn=DriverManager.getConnection(url,"final","final");

		 pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, user.getEmpNo());
		pstmt.setString(2, user.getPosition());
		pstmt.setInt(3, user.getPassWord());
		pstmt.setString(4, user.getEmpName());
		pstmt.setString(5, user.getDept());
		pstmt.setString(6, user.getEmpjoin());
		result=pstmt.executeUpdate();
		pstmt.close();
	}catch(SQLException e){
		e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
}

