package com.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.web.vo.EmpDTO;
import com.web.vo.SpotDTO;
import com.sun.org.apache.xerces.internal.util.DOMUtil;


public class EmpDAO {
private Connection getConnection() throws SQLException {
		
		Connection connection = null;
		
		try {
			//1.드라이버 로딩
			Class.forName( "oracle.jdbc.driver.OracleDriver" );
		
			//2.커넥션 만들기(ORACLE DB)
			String dbURL  = "jdbc:oracle:thin:@localhost:1521:xe";
			connection = DriverManager.getConnection( dbURL, "final", "final" );
			
		} catch( ClassNotFoundException ex ){
			System.out.println( "드라이버 로딩 실패-" + ex );
		} 
		
		return connection;
	}

	public void insert(EmpDTO dto){
		
		
		try{
			//1.connection 가져오기
			Connection connection = getConnection();
			//2.PreparedStatement준비
			String sql="insert into emp values(EMP_SEQ.nextval,?,?,?,?,SYSDATE,?)";		
			PreparedStatement pstmt=connection.prepareStatement(sql);
			//3.바인딩
			pstmt.setString(1, dto.getPosition());
			pstmt.setInt(2, dto.getPassWord());
			pstmt.setString(3, dto.getEmpName());
			pstmt.setString(4, dto.getDept());
			pstmt.setString(5, dto.getCount());
			//4.쿼리 싱핼
			pstmt.executeUpdate();
			//5.자원정리
			pstmt.close();
			connection.close();
	}catch(SQLException ex){
		System.out.println( "SQL 오류-" + ex );
			
		}
	}
	//////////////////////////////////오류///////////////////////////
	public EmpDTO EmpSerch(String empName){
		
		EmpDTO dto = new EmpDTO();
		ResultSet rs = null;
		
		try{
			Connection connection = getConnection();
			String sql = "select * from emp where EMPNAME=?";
			PreparedStatement pstmt=connection.prepareStatement(sql);
			pstmt.setString(1,empName);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				dto.setEmpNo(rs.getInt("empNo"));
				dto.setPosition(rs.getString("position"));
				dto.setPassWord(rs.getInt("passWord"));
				dto.setDept(rs.getString("dept"));
				dto.setEmpjoin(rs.getString("empjoin"));
				dto.setCount(rs.getString("count"));
				
			}
			rs.close();
			pstmt.close();
			connection.close();
			
		}catch(Exception ex){
			System.out.println( "SQL 오류-" + ex );
		}
		return null;
	}
	public EmpDTO BestEmp(String count){
		
		EmpDTO dto = new EmpDTO();
		ResultSet rs = null;
		
		try{
			Connection connection = getConnection();
			String sql = "select *from emp where count=?";
			PreparedStatement pstmt=connection.prepareStatement(sql);
			pstmt.setString(1,count);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				dto.setEmpNo(rs.getInt("empNo"));
				dto.setPosition(rs.getString("position"));
				dto.setPassWord(rs.getInt("passWord"));
				dto.setEmpName(rs.getString("empName"));
				dto.setDept(rs.getString("dept"));
				dto.setEmpjoin(rs.getString("empjoin"));
				
				
			}
			rs.close();
			pstmt.close();
			connection.close();
		}catch(Exception ex){
			System.out.println( "SQL 오류-" + ex );
		}
		
		return dto;
	}
	public List<EmpDTO> selectAll(){
		 ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();

		try{
			//1.connection 가져오기
			Connection connection = getConnection();
			//2.Statement 생성
			
			Statement stmt = connection.createStatement(); 
			//3.쿼리 문 실행
			String sql="select * from emp  ";
			ResultSet rs = stmt.executeQuery( sql );
			//4,.row 가져오기
		while(rs.next()){
			 int empNo=rs.getInt(1);
			 String position=rs.getString(2);
			 int passWord =rs.getInt(3);;
			 String empName=rs.getString(4);;
			 String dept=rs.getString(5);;
			 String empjoin=rs.getString(6);;
			 String count=rs.getString(7);;
			 
			 EmpDTO dto = new EmpDTO();
			 dto.setEmpNo(empNo);
			 dto.setPosition(position);
			 dto.setPassWord(passWord);
			 dto.setEmpName(empName);
			 dto.setDept(dept);
			 dto.setEmpjoin(empjoin);
			 dto.setCount(count);
			 
			 list.add(dto);
			 
		}
		
			rs.close();
			stmt.close();
			connection.close();
		}catch(Exception ex){
				System.out.println( "SQL 오류-" + ex );
			}
		
		return list;
		}
	public void delete(EmpDTO dto){
		try{
			//1.connection 가져오기
			Connection connection = getConnection();
			String sql = "delete from emp where empNo = ?";
			//2.statement 생성
			PreparedStatement pstmt = connection.prepareStatement(sql);
			//3.바인딩
			pstmt.setInt(1,dto.getEmpNo());
			//4.쿼리실행
			pstmt.executeUpdate();
		
			//4.자원정리
			pstmt.close();
			connection.close();
		}catch(Exception ex){
			System.out.println( "SQL 오류-" + ex );
		}
	}
	public void update(int empNo,String position,int passWord ,String empName,String dept){
		try{
			Connection conn =getConnection();
			String sql ="UPDATE emp set position=?,passWord=?,empName=?,dept=?,where empNo=?";
		
			PreparedStatement pstmt =conn.prepareStatement(sql);
			
			//3.바인딩
			pstmt.setString(1, position);
			pstmt.setInt(2, passWord);
			pstmt.setString(3, empName);
			pstmt.setString(4,dept);
			pstmt.setInt(5, empNo);
			
			pstmt.executeUpdate();
		
		
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


