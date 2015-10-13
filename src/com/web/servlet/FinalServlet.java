package com.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.action.user.UserActionFactory;
import com.web.web.action.Action;
import com.web.web.action.ActionFactory;



/**
 * Servlet implementation class FinalServlet
 */
@WebServlet("/fs")
public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding( "UTF-8" );
		String actionName = request.getParameter( "a" );
		ActionFactory actionFactory = new UserActionFactory();
		Action action = actionFactory.getAction( actionName );
		action.execute(request, response);
	}

}
