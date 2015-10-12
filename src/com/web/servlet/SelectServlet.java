package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.EmpDAO;
import com.web.vo.EmpDTO;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType( "text/html; charset=UTF-8");
		
		EmpDAO dao = new EmpDAO();
		 ArrayList<EmpDTO> userlist=dao.selectAll();
		
			PrintWriter pw=response.getWriter();
			pw.println("<table border ='1'<tr><th colspan='7'>");
			pw.println("사원 정보 리스트</th></tr>");
			pw.println("<tr>");
			pw.println("<td>EmpNo</td>");
			pw.println("<td>Position</td>");
			pw.println("<td>Password</td>");
			pw.println("<td>EmpName</td>");
			pw.println("<td>Dept</td>");
			pw.println("<td>Empjoin</td>");
			pw.println("</tr>");
			
			int size =userlist.size();
			
			for(int i=0;i<size;i++){
				 int EmpNo =userlist.get(i).getEmpNo();
				 String Position=userlist.get(i).getPosition();
				 int PassWord =userlist.get(i).getPassWord();
				 String EmpName = request.getParameter("EmpName");
				 String Dept=userlist.get(i).getDept();
				 String Empjoin=userlist.get(i).getEmpjoin();
				 pw.print("<tr>");
				 pw.print("<td>EmpNo</td>");
				 pw.print("<td>Position</td>");
				 pw.print("<td>PassWord</td>");
				 pw.print("<td>EmpName</td>");
				 pw.print("<td>Dept</td>");
				 pw.print("<td>Empjoin</td>");
				 pw.print("<td><a href=/FinalSlWeb/insert.do?test=info&EmpNo="+EmpNo+">delete</a></td>");
			}
		
			pw.close();
		
	}

}
