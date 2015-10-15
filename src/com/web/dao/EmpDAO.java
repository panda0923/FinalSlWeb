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
import com.web.vo.IndolDTO;
import com.web.vo.RankVo;



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
			String sql="insert into emp values(EMP_EMPNO_SEQ.nextval,?,?,?,?,SYSDATE,?)";		
			PreparedStatement pstmt=connection.prepareStatement(sql);
			//3.바인딩
			pstmt.setString(1, dto.getPosition());
			pstmt.setString(2, dto.getPassWord());
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
				dto.setEmpNo(rs.getLong("empNo"));
				dto.setPosition(rs.getString("position"));
				dto.setPassWord(rs.getString("passWord"));
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
	
	public List<EmpDTO> BestEmp(){
		 ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		
		
		ResultSet rs = null;
		
		try{
			Connection connection = getConnection();
			String sql = "select e.empname,e.position,e.dept,RANK()OVER(ORDER BY sum(ok))"
					+"from emp e,indol i "
					+"where e.empno = i.empno "
					+"group by empname,position,dept ";
			PreparedStatement pstmt=connection.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
	
			while(rs.next()){
			
			String empName=rs.getString(1);;
			String position=rs.getString(2);
			String dept=rs.getString(3);;
			Long ok = rs.getLong(4);
			
			
			
			 EmpDTO dto = new EmpDTO();
			 dto.setEmpName(empName);
			 dto.setPosition(position);
			 dto.setDept(dept);
			 dto.setOk(ok);
		
			 list.add(dto);
				
			}
			rs.close();
			pstmt.close();
			connection.close();
		}catch(Exception ex){
			System.out.println( "SQL 오류-" + ex );
		}
		
		return list;
	}
	public List<EmpDTO> selectAll(){
		 ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();

		try{
			//1.connection 가져오기
			Connection connection = getConnection();
			//2.Statement 생성
			
			Statement stmt = connection.createStatement(); 
			//3.쿼리 문 실행
			String sql="select * from emp ";
			ResultSet rs = stmt.executeQuery( sql );
			//4,.row 가져오기
		while(rs.next()){
			 Long empNo=rs.getLong(1);
			 String position=rs.getString(2);
			 String passWord =rs.getString(3);;
			 String empName=rs.getString(4);;
			 String dept=rs.getString(5);;
			 String empjoin=rs.getString(6);;
			
			 
			 EmpDTO dto = new EmpDTO();
			 dto.setEmpNo(empNo);
			 dto.setPosition(position);
			 dto.setPassWord(passWord);
			 dto.setEmpName(empName);
			 dto.setDept(dept);
			 dto.setEmpjoin(empjoin);
			
			 
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
			pstmt.setLong(1,dto.getEmpNo());
			//4.쿼리실행
			pstmt.executeUpdate();
		
			//4.자원정리
			pstmt.close();
			connection.close();
		}catch(Exception ex){
			System.out.println( "SQL 오류-" + ex );
		}
	}
	public void update(EmpDTO dto){
		try{
			Connection conn =getConnection();
			String sql ="update emp set position=?,passWord=?,empName=?,dept=? where empNo=?" ;
		
			PreparedStatement pstmt =conn.prepareStatement(sql);
			
			//3.바인딩
			pstmt.setString(1,dto.getPosition());
			pstmt.setString(2, dto.getPassWord());
			pstmt.setString(3, dto.getEmpName());
			pstmt.setString(4,dto.getDept());
			pstmt.setLong(5, dto.getEmpNo());
			
			pstmt.executeUpdate();
		
		
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


