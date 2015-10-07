<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name = "form1" method="post" action="/FinalSlWeb/insert.do">
	<table align="center" cellpadding="0" cellspacing="0" width=479">
	<tr>
		<td width="469" colspan="2" height="42">
			<p align = "center"><code><b><span style="font-size:20pt;">사원등록</span></b></code></p>
		</td>
	</tr>
	
	</table>

		사원번호:<input type="text" name = EmpNo><br>
		직책:<input type = "text"name=Position><br>
		비밀번호:<input type="password"name=PassWord><br>
		사원이름:<input type="text" name = EmpName><br>
		부서:<input type = "text"name=Dept><br>
		입사일:<input type="text"name=Empjoin><br>
		<input type=submit value="등록" >
	
	</form>
</body>
</html>