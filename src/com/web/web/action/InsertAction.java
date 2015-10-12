package com.web.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.EmpDAO;
import com.web.vo.EmpDTO;

public class InsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		int EmpNo= Integer.parseInt(request.getParameter("EmpNo"));
		String Position = request.getParameter("Position");
		int PassWord = Integer.parseInt(request.getParameter("PassWord"));
		String EmpName = request.getParameter("EmpName");
		String Dept = request.getParameter("Dept");
		String Empjoin = request.getParameter("Empjoin");
		
		EmpDAO dao = new EmpDAO();
		EmpDTO user = new EmpDTO(EmpNo,Position,PassWord,EmpName,
													Dept,Empjoin);
		
		int result  =dao.insert(user);
		if(result ==0){
			System.out.println("입력실패");
		}else{
			
			System.out.println("입력완료");
		
		}
	}

}
