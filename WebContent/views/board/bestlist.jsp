<%@page import="com.web.dao.EmpDAO" %>
<%@page import="com.web.vo.EmpDTO" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

List<EmpDTO> list = 
(List<EmpDTO>)request.getAttribute( "list" );
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
						<th>사원이름</th>
						<th>직책</th>
						<th>부서</th>
						<th>순위</th>
						<th>&nbsp;</th>
					</tr>	
								<%
					int countTotal = list.size();
					int index = 0;
					for( EmpDTO dto : list ) {
				%>
							
					<tr>
<!-- 						사원이름 누르면 사원 정보 뜨기!! -->
						<td><%=dto.getEmpName() %></td>
						<td><%=dto.getPosition()%></td>
						<td><%=dto.getDept()%></td>
						<td><%=countTotal-index++ %></td>
						
					</tr>
									<%
		}
	%>
			
				</table>
	<div class="bottom">
<!-- 					<a href="" id="new-book"></a> -->
				</div>				
			</div>
		</div>
		<jsp:include page="/views/include/navication.jsp" ></jsp:include>
		<jsp:include page="/views/include/footer.jsp" ></jsp:include>
	</div>
</body>
</html>