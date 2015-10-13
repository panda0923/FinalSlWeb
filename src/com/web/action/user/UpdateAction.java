package com.web.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.EmpDAO;

import com.web.web.action.Action;

public class UpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");


		int empNo= Integer.parseInt(request.getParameter("empNo"));
		String position = request.getParameter("position");
		int passWord = Integer.parseInt(request.getParameter("passWord"));
		String empName = request.getParameter("empName");
		String dept = request.getParameter("dept");

		
		EmpDAO dao = new EmpDAO();
		
		dao.update(empNo,position,passWord ,empName,dept);
		
		
		
	}

}
