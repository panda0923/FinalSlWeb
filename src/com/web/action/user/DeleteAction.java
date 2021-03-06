package com.web.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.EmpDAO;
import com.web.vo.EmpDTO;
import com.web.web.action.Action;

public class DeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String empNo = request.getParameter("empNo");
		
		EmpDTO dto = new EmpDTO();
		dto.setEmpNo(Long.parseLong(empNo));
		
		 
		EmpDAO dao = new EmpDAO();

		dao.delete(dto);
		
		response.sendRedirect("/FinalSlWeb/views/board/list.jsp");
	}

}
