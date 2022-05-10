<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/users/mypageupdate.do" method="post">
	<input type="hidden" name="profile" 
		value="${ empty dto.profile ? 'empty' : dto.profile}"/>
	<div>
		<label for="id" class="form-label">아이디</label>
		<input type="text" id="id" value="${id }" disabled class="form-control"/>
	</div>
	<div>
		<label for="email" class="form-label">이메일</label>
		<input type="text" name="email" id="email" value="${dto.email }" class="form-control"/>
	</div>
	<div>
		<button type="submit" class="btn btn-dark">수정</button>
	</div>
</div>
	<p>비밀번호 수정하기</p>
	<div>
	<a href="${pageContext.request.contextPath}/users/private/pwd_updateform.do">수정하기</a>
	</div>
</form>
</body>
</html>