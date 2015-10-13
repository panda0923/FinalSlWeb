package com.web.action.spot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.SpotDao;
import com.web.vo.SpotDTO;
import com.web.web.action.Action;

public class EntSearchAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String entname = request.getParameter("entname");
		SpotDao dao = new SpotDao();
		SpotDTO dto = dao.EntSerch(entname);
		Long entno = dto.getEntno();
		String entspot = dto.getEntspot();
		String enttel = dto.getEnttel();
		String entempname = dto.getEntempname(); 
		
		response.sendRedirect("");
	}

}
