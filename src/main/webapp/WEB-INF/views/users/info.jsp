<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인정보</title>
</head>
<body>
<h2>개인정보페이지</h2>
<ul>
	<li><a href="${pageContext.request.contextPath}/users/private/mypage.do">내 정보 관리</a></li>
	<li><a href="javascript:deleteConfirm()">회원탈퇴</a></li>
</ul>

<script>
	function deleteConfirm(){
		const isDelete=confirm("${id} 님 탈퇴 하시겠습니까?");
		if(isDelete){
			location.href="${pageContext.request.contextPath}/users/delete.do";
		}
	}
</script>
</body>
</html>