<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<h1>로그인 페이지</h1>
<div class="container">
	<form action="${pageContext.request.contextPath}/users/login.do" method="post">
	<!-- url정보를 넘겨서 원래있던 곳으로 이동하기 위한 코드 -->
		<c:choose>
			<c:when test="${ empty param.url }"> 
			<!-- 로그인 성공하면 url은 넘어오지않는다 -->
				<input type="hidden" name="url" value="${pageContext.request.contextPath}/"/>
			</c:when>
			<c:otherwise>
				<input type="hidden" name="url" value="${param.url }"/>
			</c:otherwise>
		</c:choose>
	<input type="text" name="id" placeholder="아이디"/>
	<input type="password" name="pwd" placeholder="비밀번호"/>
	
	<!-- param.nid는 로그인 실패서 넘겨받는 파라미터값을 login.jsp에 설정해놓았다. nid가 비어있지않으면 <p>를 실행한다. -->
	<c:if test="${ not empty param.nid }">< 
	<p class="text-danger"> 아이디 또는 비밀번호를 잘못 입력했습니다. 입력하신 내용을 다시 확인해주세요.</p>
	</c:if>
	<button type="submit">로그인하기</button>
	</form>
</div>
</body>
</html>