<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입완료!</title>
</head>
<body>
<div class="container">
	<div class="text-center my-3">
		<h1>회원 가입 완료</h1>
	</div>
	<div class="text-center my-3">
		<p>환영합니다 ! 회원가입이 완료되었습니다. 이제부터 로그인이 가능합니다.</p>
		<a href="${pageContext.request.contextPath}/users/loginform.do">로그인 하러가기</a>
	</div>
</div>

</body>
</html>