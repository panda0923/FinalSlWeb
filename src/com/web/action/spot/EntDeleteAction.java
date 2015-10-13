package com.web.action.spot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.SpotDao;
import com.web.vo.SpotDTO;
import com.web.web.action.Action;

public class EntDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String entno = request.getParameter("entno");
		
		SpotDTO dto = new SpotDTO();
		dto.setEntno(Long.parseLong(entno));
		
		SpotDao dao = new SpotDao();
		dao.delete(dto);
		response.sendRedirect("");
	}

}
