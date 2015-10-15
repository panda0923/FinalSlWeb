<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

				<form id="join-form" name="joinForm" method="post" action="/FinalSlWeb/user?a=insert">

					<label class="block-label" for="EmpName">사원 이름</label>
					<input id="EmpName" name="EmpName" type="text" value="">

					<label class="block-label" for="Position">직책</label>
					<input id="Position" name="Position" type="text" value="">
					
					<label class="block-label" for="Dept">부서</label>
					<input id="Dept" name="Dept" type="text" value="">
					
					
					<label class="block-label">패스워드</label>
					<input name="PassWord" type="password" value="">
					
					<fieldset>
						<legend>약관동의</legend>
						<input id="agree-prov" type="checkbox" name="agreeProv" value="y">
						<label>서비스 약관에 동의합니다.</label>
					</fieldset>
					
					<input type="submit" value="가입하기">
					
				</form>
			</div>
		</div>
			<jsp:include page="/views/include/navication.jsp" ></jsp:include>
		<jsp:include page="/views/include/footer.jsp" ></jsp:include>
	</div>
</body>
</html>