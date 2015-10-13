package com.web.action.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.EmpDAO;
import com.web.vo.EmpDTO;
import com.web.web.WebUtil;
import com.web.web.action.Action;

public class SelectAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmpDAO dao = new EmpDAO();
		List<EmpDTO>list = dao.selectAll();
		
		request.setAttribute("list", list);
		WebUtil.forwarding(request, response, "");
	}

}
