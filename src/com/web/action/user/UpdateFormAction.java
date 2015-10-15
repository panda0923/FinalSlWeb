/**
 * 
 */
package com.web.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.web.WebUtil;
import com.web.web.action.Action;

/**
 * @author bit-user
 *
 */
public class UpdateFormAction implements Action {

	/* (non-Javadoc)
	 * @see com.web.web.action.Action#execute(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		WebUtil.forwarding(request, response, "views/user/updateform.jsp");
	}

}
