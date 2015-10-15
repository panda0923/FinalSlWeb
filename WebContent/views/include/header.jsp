<%-- <%@page import= "com.bit2015.mysite.vo.MemberVo "%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--    
//     MemberVo vo=(MemberVo)session.getAttribute("authUser");
    
 --%>
<div id="header">
<!-- 			<h1>SL</h1> -->
			<center>
			<img src="assets/images/logo.jpg"" width="150" height="60">
			</center>
			<ul>
<%-- 			
// 				if(vo==null){
 --%>
				<li><a href="/FinalSlWeb/views/user/joinform.jsp">사원등록</a><li>
				<li><a href="/FinalSlWeb/views/user/entjoinform.jsp">협력업체 등록</a><li>
<%-- 				
// 					} else{
--%>
				<li><a href="">검색</a><li>
				<li><a href=""></a><li>
				<li><a href="/FinalSlWeb/views/main/index.jsp">(SL 직원 근태 관리자 사이트)</a></li>
<%-- 		
// 				}
 			--%>
			</ul>
		</div>