package com.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.web.vo.EmpDTO;
import com.web.vo.SpotDTO;

public class SpotDao {
	
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

	public void insert(SpotDTO dto){
		
		
		try{
				//1.connection 가져오기
				Connection connection = getConnection();
				//2.PreparedStatement준비
				String sql="insert into EXENTERPRISE values(ENTNO_SEQ.nextval,?,?,?,?)";		
				PreparedStatement pstmt=connection.prepareStatement(sql);
				//3.바인딩
				
				pstmt.setString(1,dto.getEntname());
				pstmt.setString(2, dto.getEntspot());
				pstmt.setString(3, dto.getEnttel());
				pstmt.setString(4, dto.getEntempname());
				//4.쿼리 싱핼
				pstmt.executeUpdate();
				//5.자원정리
				pstmt.close();
				connection.close();
		}catch(SQLException ex){
			System.out.println( "SQL 오류-" + ex );
			
		}
	}
	public void delete(SpotDTO dto){
		try{
				//1.connection 가져오기
				Connection connection = getConnection();
				String sql = "delete from EXENTERPRISE where entno = ?";
				//2.statement 생성
				PreparedStatement pstmt = connection.prepareStatement(sql);
				//3.바인딩
				pstmt.setLong(1,dto.getEntno());
				//4.쿼리실행
				pstmt.executeUpdate();
			
				//4.자원정리
				pstmt.close();
				connection.close();
		}catch(Exception ex){
			System.out.println( "SQL 오류-" + ex );
		}
	}
	public SpotDTO EntSerch(String entname){
		
		SpotDTO dto = null;
		
		
		try{
				Connection connection = getConnection();
				String sql = "select * from EXENTERPRISE where entname=?";
				PreparedStatement pstmt=connection.prepareStatement(sql);
				pstmt.setString(1,entname);
				ResultSet rs=pstmt.executeQuery();
				
				if(rs.next()){
					
					Long entno = rs.getLong(1);
					String entspot=rs.getString(2);
					String enttel=rs.getString(3);
					String entempname=rs.getString(4);
					
					dto=new SpotDTO();
					dto.setEntno(entno);
					dto.setEntspot(entspot);
					dto.setEnttel(enttel);
					dto.setEntempname(entempname);
							
				}
			
		}catch( SQLException ex ) {
			System.out.println( "SQL Error:" + ex );
		}
		return dto;
	}
	public void update(SpotDTO dto){
		try{
			Connection conn =getConnection();
			String sql ="UPDATE EXENTERPRISE set entname=?,entspot=?,enttel=?,entempname=?where entno=?";
		
			PreparedStatement pstmt =conn.prepareStatement(sql);
			
			//3.바인딩
			pstmt.setString(1,dto.getEntname());
			pstmt.setString(2,dto.getEntspot());
			pstmt.setString(3, dto.getEnttel());
			pstmt.setString(4, dto.getEntempname());
			pstmt.setLong(5, dto.getEntno());
			
			pstmt.executeUpdate();
	
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
	
}
