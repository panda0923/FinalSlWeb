<%@page import="com.web.dao.EmpDAO" %>
<%@page import="com.web.vo.EmpDTO" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

	EmpDAO dao = new EmpDAO();
	List<EmpDTO> list = dao.selectAll();

%>

<!DOCTYPE html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/mysite/assets/css/board.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		<jsp:include page="/views/include/header.jsp" flush="false"></jsp:include>
		<div id="content">
			<div id="board">
				<form id="search_form" action="" method="post">
					<input type="text" id="kwd" name="kwd" value="">
					<input type="submit" value="찾기">
				</form>
				
				
				<table class="tbl-ex">
					<tr>
						<th>사원번호</th>
						<th>이름</th>
						<th>부서</th>
						<th>직책</th>
						<th>입사일</th>
						<th>&nbsp;</th>
					</tr>	
								<%
					int countTotal = list.size();
					int index = 0;
					for( EmpDTO dto : list ) {
				%>
							
					<tr>
						<td><a href="/FinalSlWeb/user?a=updateform&empNo=<%=dto.getEmpNo() %>"><%=dto.getEmpNo() %></a></td>
						<td><%=dto.getEmpName() %></td>
						<td><%=dto.getDept() %></td>
						<td><%=dto.getPosition() %></td>
						<td><%=dto.getEmpjoin() %></td>
						<td><a href="/FinalSlWeb/user?a=delete&empNo=<%=dto.getEmpNo() %>" class="del">삭제</a></td>
					</tr>
									<%
		}
	%>
			
				</table>
	<div class="bottom">
					<a href="" id="new-book">글쓰기</a>
				</div>				
			</div>
		</div>
		<jsp:include page="/views/include/navication.jsp" ></jsp:include>
		<jsp:include page="/views/include/footer.jsp" ></jsp:include>
	</div>
</body>
</html>