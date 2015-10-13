package com.web.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.EmpDAO;
import com.web.vo.EmpDTO;
import com.web.web.action.Action;

public class BestEmpAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String count = request.getParameter("count");
		
		EmpDAO dao = new EmpDAO();
		EmpDTO dto = dao.BestEmp(count);
		
		 int empNo=dto.getEmpNo();
		 String position= dto.getPosition();
		 int passWord = dto.getPassWord();
		 String empName=dto.getEmpName();
		 String dept=dto.getDept();
		 String empjoin=dto.getEmpjoin();
		 
		 response.sendRedirect("");
	
		
	}

}
