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

				<form id="join-form" name="entjoinForm" method="post" action="/FinalSlWeb/Spot">
				<input type = "hidden" name ="a" value="insert">
					<label class="block-label" for="entname">회사 이름</label>
					<input id="entname" name="entname" type="text" value="">

					<label class="block-label" for="entspot">주소</label>
					<input id="entspot" name="entspot" type="text" value="">
					
					<label class="block-label" for="enttel">전화 번호</label>
					<input id="enttel" name="enttel" type="text" value="">
					
					
					<label class="block-label"for ="entempname">담당자명</label>
					<input id="entempname" name="entempname" type="text" value="">
					
				
					
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