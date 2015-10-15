<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/mysite/assets/css/main.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
	<jsp:include page="/views/include/header.jsp" flush="false"></jsp:include>
		<div id="wrapper">
			<div id="content">
				<div id="site-introduction">
					
					<h2>안녕하세요. SL  근태 관리자 서버 입니다.</h2>
					<p> 
					저희 기업은 전자, 중공업·건설,<br>
						화학, 금융, 서비스 산업을 통해 90개 국가, 600여개 세계 속 거점에서 국가 경제에 기여하고 있습니다.
						저희 기업을 이렇게까지 발전 시킨 원동력이 된 사원들을 체계적으로 관리하기 위해
						만들어 놓은 사이트 입니다.<br><br>
						<a href="#">메일</a>보내기<br>
					</p>
				</div>
			</div>
		</div>
		<jsp:include page="/views/include/navication.jsp" ></jsp:include>
		<jsp:include page="/views/include/footer.jsp" ></jsp:include>
	</div>
</body>
</html>