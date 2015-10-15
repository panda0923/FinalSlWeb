package com.web.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.EmpDAO;
import com.web.vo.EmpDTO;
import com.web.web.WebUtil;
import com.web.web.action.Action;

public class UpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		String empNo = request.getParameter("empNo");
		String empName = request.getParameter("empName");
		String dept = request.getParameter("dept");
		String position = request.getParameter("position");
		String passWord = request.getParameter("passWord");
		
		System.out.println(1);
		EmpDAO dao = new EmpDAO();
		EmpDTO dto = new EmpDTO();
		
		dto.setEmpNo(Long.parseLong(empNo));
		dto.setEmpName(empName);
		dto.setDept(dept);
		dto.setPosition(position);
		dto.setPassWord(passWord);
		
		
		dao.update(dto);
		System.out.println(dto);
		WebUtil.forwarding(request, response, "views/board/list.jsp");
		
	}

}
