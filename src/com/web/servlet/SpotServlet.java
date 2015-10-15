package com.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.web.action.spot.SpotActionFactory;
import com.web.web.action.Action;
import com.web.web.action.ActionFactory;

/**
 * Servlet implementation class SpotServlet
 */
@WebServlet("/Spot")
public class SpotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding( "UTF-8" );
		String actionName = request.getParameter( "a" );
		ActionFactory actionFactory = new SpotActionFactory();
		Action action = actionFactory.getAction( actionName );
		action.execute(request, response);
	}
}


