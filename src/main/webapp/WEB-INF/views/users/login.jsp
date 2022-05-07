<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<script>
	if("${id}"){ //isExist의 정보로 인해 id가 있으면 True, 없으면 false
		location.href ="${requestScope.url }"; //url로 돌아간다. 
	} else{
		location.href ="loginform.do?url=${requestScope.encodedUrl }&nid=1";
	} //로그인 정보가 틀릴때 &nid=1을 파라미터값으로 보낸다. 
	
</script>
</body>
</html>