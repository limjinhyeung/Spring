<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
</head>
<body>
<h1>wellcome</h1>
      <c:choose>
		<c:when test="${ empty sessionScope.id}">
      		<li > 
      			<a class="nav-link" href="${pageContext.request.contextPath}/users/loginform.do">로그인</a> 
      		</li> 
      		<li> 
      			<a class="nav-link" href="${pageContext.request.contextPath}/users/signupform.do">회원가입</a> 
      		</li>
		</c:when>
		
		<c:otherwise>
			<li> 
      			<a class="nav-link" href="${pageContext.request.contextPath}/users/private/info.do">${sessionScope.id }님 로그인 중</a>
      		</li> 
      		<li> 
      			<a class="nav-link" href="${pageContext.request.contextPath}/users/logout.do">로그아웃</a> 
      		</li>
      	</c:otherwise>
	</c:choose>
</body>
</html>