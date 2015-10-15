<%@page import="com.web.dao.SpotDao" %>
<%@page import="com.web.vo.SpotDTO" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

	SpotDao dao = new SpotDao();
	List<SpotDTO> list = dao.selectAll();
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
						<th>회사번호</th>
						<th>이름</th>
						<th>주소</th>
						<th>전화번호</th>
						<th>담당자</th>
						<th>&nbsp;</th>
					</tr>	
											<%
					int countTotal = list.size();
					int index = 0;
					for( SpotDTO dto : list ) {
				%>		
					<tr>
				
						<td><a href="/FinalSlWeb/Spot?a=updateform&entno=<%=dto.getEntno() %>"><%=dto.getEntno() %></td>
						<td><%=dto.getEntname()%></td>
						<td><%=dto.getEntspot() %></td>
						<td><%=dto.getEnttel()%></td>
						<td><%=dto.getEntempname()%></td>
						
						<td><a href="/FinalSlWeb/Spot?a=delete&entno=<%=dto.getEntno() %>"class="del">삭제</a></td>
					</tr>
								<%
		}
	%>
				</table>
	
				<div class="bottom">
			
				</div>				
			</div>
		</div>
		<jsp:include page="/views/include/navication.jsp" ></jsp:include>
		<jsp:include page="/views/include/footer.jsp" ></jsp:include>
	</div>
</body>
</html>