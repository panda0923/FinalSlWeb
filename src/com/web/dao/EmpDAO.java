package com.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bit2015.guestbook.vo.GuestbookVo;
import com.sun.org.apache.xerces.internal.util.DOMUtil;
import com.web.vo.EmpDTO;

public class EmpDAO {
	Connection conn=null;
	PreparedStatement pstmt=null;
	int result = 0;
	
	public void con(){

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

	public void discon() {
		// TODO Auto-generated method stub
		try{
			pstmt.close();
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public int insert(EmpDTO user){
		
		System.out.println(user.getEmpNo()+user.getPosition()+user.getPassWord()+
				user.getEmpName()+user.getDept()+user.getEmpjoin());
		String sql="insert into emp values(EMP_SEQ.nextval,?,?,?,?,SYSDATE,?)";
		try{
			con();
			
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, user.getPosition());
		pstmt.setInt(2, user.getPassWord());
		pstmt.setString(3, user.getEmpName());
		pstmt.setString(4, user.getDept());
		pstmt.setString(5, user.getCount());
		result=pstmt.executeUpdate();//result??????????????
		pstmt.close();
	}catch(SQLException e){
		e.printStackTrace();
			
		}
		discon();
		return result;
		
	}
	public EmpDTO BestEmp(String count){
		con();
		EmpDTO e=null;
		ResultSet rs = null;
		String sql = "select *form emp where count=?";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,count);
			rs=pstmt.executeQuery();
			if(rs.next()){
			e=new EmpDTO(rs.getInt(1),rs.getString(2),rs.getString(3),
							rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
				
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return e;
	}
	public ArrayList selectAll(){
		 ArrayList<EmpDTO> userlist = new ArrayList<EmpDTO>();
		ResultSet rs = null;
		EmpDTO user=null;
		String sql="select * from emp where ";
		
		
		try{
			con();
			pstmt=conn.prepareStatement(sql);
			   
			   rs = pstmt.executeQuery(); // Query실행
		while(rs.next()){
				user = new EmpDTO(rs.getInt(1),rs.getString(2),rs.getInt(3),
						rs.getString(4),rs.getString(5),rs.getString(6));
				userlist.add(user);
		}
			rs.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		discon();
		return userlist;
		}
	}


