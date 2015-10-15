package com.web.action.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.web.dao.EmpDAO;
import com.web.vo.EmpDTO;
import com.web.web.action.Action;
import com.web.web.WebUtil;
public class BestEmpAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		EmpDAO dao= new EmpDAO();
		List<EmpDTO> list = dao.BestEmp();
		
	
		request.setAttribute( "list", list );
		WebUtil.forwarding( request, response, "views/board/bestlist.jsp" );	;
	
		
	}

}
