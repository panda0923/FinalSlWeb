package com.web.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.org.apache.xerces.internal.util.DOMUtil;

public class EmpDAO {
	Connection conn=null;
	PreparedStatement pstmt=null;
	int result = 0;
	public void con(){
		String sql="insert into emp values(?,?,?,?,?,?)";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			conn=DriverManager.getConnection(url,"final","final");
	}catch(SQLException e){
		e.printStackTrace();
			
		}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	public int insert(EmpDTO user){
		
		System.out.println(user.getEmpNo()+user.getPosition()+user.getPassWord()+
				user.getEmpName()+user.getDept()+user.getEmpjoin());
		String sql="insert into emp values(?,?,?,?,?,?)";
		try{
			con();
			
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
			
		}
		return result;
		
	}
	public ArrayList<EmpDTO> selectAll(){
		 ArrayList<EmpDTO> userlist = new ArrayList<EmpDTO>();
		ResultSet rs = null;
		EmpDTO user=null;
		String sql="select * from emp ";
		try{
			con();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				user = new EmpDTO(rs.getInt(1),rs.getString(2),rs.getInt(3),
						rs.getString(4),rs.getString(5),rs.getString(6));
				userlist.add(user);
			}
		}catch(SQLException e){
			e.printStackTrace();
			
			}
		
		return userlist;
		}
	}


