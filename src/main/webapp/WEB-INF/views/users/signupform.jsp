<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signup form</title>
</head>
<body>
<div class="container">
	<form action="${pageContext.request.contextPath}/users/signup.do" method="post" id=signup">
		<label for="id">아이디</label>
		<input type="text" name="id" id="id" placeholder="영문 소문자로 시작하여 5~10자 이내로 입력하세요."/><br />
		<label for="pwd">비밀번호</label>
		<input type="password" name="pwd" id="pwd" /><br />
		<label for="email">이메일</label>
		<input type="text" name="email" id="email"/>
		<button type="submit">가입하기</button>
		
	</form>
</div>
</body>
</html>