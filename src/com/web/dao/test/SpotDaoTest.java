package com.web.dao.test;

import com.web.dao.SpotDao;
import com.web.vo.SpotDTO;


public class SpotDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deleteTest();
		//EntSerch();EntSerch
		updateTest();
	}
//	public static void insertTest(){
//		SpotDao dao = new SpotDao();
//		SpotDTO dto = new SpotDTO();
//		dto.setEntname("이상하다");
//		dto.setEntspot("ㅋ");
//		dto.setEnttel("ㅋ");
//		dto.setEntempname("ㅋㅋ");
//		dao.insert(dto);
//			
//	}
	public static void EntSerch() {
		SpotDao dao = new SpotDao();
		SpotDTO dto = dao.EntSerch("ㅋ");
		System.out.println( dto );
	}
	public static void deleteTest(){
		SpotDao dao = new SpotDao();
	SpotDTO dto = new SpotDTO();
		
		dto.setEntno(1L);
		
		dao.delete(dto);
	}
	public static void updateTest(){
		SpotDao dao = new SpotDao();
		SpotDTO dto = new SpotDTO();
		
		dto.setEntno(1L);
		dto.setEntname("zz");
		dto.setEntspot("zz");
		dto.setEnttel("zz");
		dto.setEntempname("zz");
		dao.update(dto);
	
		
}
}
