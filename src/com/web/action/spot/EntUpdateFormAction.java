package com.web.action.spot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.web.WebUtil;
import com.web.web.action.Action;

public class EntUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		WebUtil.forwarding(request, response, "views/user/entupdateform.jsp");
	}

}
