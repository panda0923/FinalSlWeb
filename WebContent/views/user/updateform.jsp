<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.web.dao.EmpDAO" %>
<%@page import="com.web.vo.EmpDTO" %>
<%@page import="java.util.List" %>
<%
			EmpDAO dao = new EmpDAO();
			List<EmpDTO> list = dao.selectAll();
			EmpDTO dto = new EmpDTO();
		
			String empNo = request.getParameter("empNo");
			dto.setEmpNo(Long.parseLong(empNo));
%>

<!doctype html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/mysite/assets/css/user.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		<jsp:include page="/views/include/header.jsp" flush="false"></jsp:include>
		<div id="content">
			<div id="user">

				<form id="join-form" name="updateForm" method="post" action="/FinalSlWeb/user?a=update&entno=<%=dto.getEmpNo() %>">

					<label class="block-label" for="empName">사원 이름</label>
					<input id="empName" name="empName" type="text" value="">

					<label class="block-label" for="position">직책</label>
					<input id="position" name="position" type="text" value="">
					
					<label class="block-label" for="dept">부서</label>
					<input id="dept" name="dept" type="text" value="">
					
					
					<label class="block-label">패스워드</label>
					<input name="passWord" type="passWord" value="">
					

					<p>사원 정보 수정 </p>
					
					<input type="submit" value="수정하기">
					
				</form>
			</div>
		</div>
			<jsp:include page="/views/include/navication.jsp" ></jsp:include>
		<jsp:include page="/views/include/footer.jsp" ></jsp:include>
	</div>
</body>
</html>