package com.web.dao.test;


import java.util.List;

import com.web.dao.EmpDAO;
import com.web.vo.EmpDTO;
import com.web.vo.IndolDTO;
import com.web.vo.RankVo;

public class EmpDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insertTest();
		//getTest();
		//deleteTest();
		//updateTest();
		rank();
		selctAll();
		
	}
	public static void rank(){
		EmpDAO dao = new EmpDAO();
		//dao.selectAll();
		List<EmpDTO> list = dao.BestEmp();
		System.out.println(list.size());
		for(EmpDTO dto:list){
			System.out.println(dto);
		}
	}
		public static void selctAll(){
			EmpDAO dao = new EmpDAO();
			//dao.selectAll();
			List<EmpDTO> list = dao.selectAll();
			System.out.println(list.size());
			for(EmpDTO dto:list){
				System.out.println(dto);
			}
		}
	
	public static void insertTest(){
		EmpDAO dao = new EmpDAO();
		EmpDTO dto = new EmpDTO();
		dto.setPosition("CEO");
		dto.setPassWord("dddd");
		dto.setEmpName("스티브");
		dto.setDept("관리");
		dto.setCount("10");
		dao.insert(dto);
			
	}
	
//	public static void getTest() {
//		EmpDAO dao = new EmpDAO();
//		EmpDTO dto = dao.BestEmp("10");
//		System.out.println( dto );
//	}
//	public static void deleteTest(){
//		EmpDAO dao = new EmpDAO();
//		EmpDTO dto =new EmpDTO();
//		
//		dto.setEmpNo(20111759);
//		
//		dao.delete(dto);
//	}
//	public static void updateTest(){
//		EmpDAO dao = new EmpDAO();
//		EmpDTO dto =new EmpDTO();
//		
//		dto.setEmpNo(1234);
//	
//		
//		dao.update(1234, "없음", 5268, "없음", "없음");
//		
//		
//	}
}
