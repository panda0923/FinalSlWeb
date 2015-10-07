package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class insertServlet
 */
@WebServlet("/insertServlet")
public class insertServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		int EmpNo= Integer.parseInt(request.getParameter("EmpNo"));
		String Position = request.getParameter("Position");
		int PassWord = Integer.parseInt(request.getParameter("PassWord"));
		String EmpName = request.getParameter("EmpName");
		String Dept = request.getParameter("Dept");
		String Empjoin = request.getParameter("Empjoin");
		
		EmpDAO dao = new EmpDAO();
		EmpDTO user = new EmpDTO(EmpNo,Position,PassWord,EmpName,
													Dept,Empjoin);
		
		int result  =dao.insert(user);
		if(result ==0){
			System.out.println("입력실패");
		}else{
			
			System.out.println("입력완료");
		
		}
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<head></head>");
		pw.println("<body>");
		pw.println("["+EmpName+"] 님! 입사를 축하드립니다. <br/>");
		pw.println("사원번호:["+EmpNo+"]<br>부서:["+Dept+"]");
	
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	
	}


}
