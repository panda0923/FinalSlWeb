package com.web.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.EmpDAO;
import com.web.vo.EmpDTO;
import com.web.web.action.Action;

public class EmpSerchAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String empName=request.getParameter("empName");
			
			EmpDAO dao = new EmpDAO();
			EmpDTO dto = dao.EmpSerch(empName);
			
			 int empNo=dto.getEmpNo();
			 String position= dto.getPosition();
			 int passWord = dto.getPassWord();
			 String dept=dto.getDept();
			 String empjoin=dto.getEmpjoin();
			 
			 response.sendRedirect("");

	}

}
