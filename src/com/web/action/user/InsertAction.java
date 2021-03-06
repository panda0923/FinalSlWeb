package com.web.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.EmpDAO;
import com.web.vo.EmpDTO;
import com.web.web.WebUtil;
import com.web.web.action.Action;

public class InsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		
		String Position = request.getParameter("Position");
		String PassWord = request.getParameter("PassWord");
		String EmpName = request.getParameter("EmpName");
		String Dept = request.getParameter("Dept");
		String Empjoin = request.getParameter("Empjoin");
		String count =request.getParameter("count");
		
		EmpDTO dto = new EmpDTO();
	
		dto.setPosition(Position);
		dto.setPassWord(PassWord);
		dto.setEmpName(EmpName);
		dto.setDept(Dept);
		dto.setEmpjoin(Empjoin);
		dto.setCount(count);
		
		EmpDAO dao = new EmpDAO();
		dao.insert(dto);
		WebUtil.forwarding(request, response, "views/main/index.jsp");
		
	}
	

}
