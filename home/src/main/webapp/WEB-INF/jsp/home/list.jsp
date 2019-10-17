<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>search test</title>
<link rel='stylesheet' href='/css/common.css'>
</head>
<body>

<jsp:include page="../header.jsp"></jsp:include>

<table>

<tr>
	<th>번호</th><th>email</th><th>아이디</th><th>비번</th>
</tr>
<c:forEach items="${list}" var="m">
<tr>
	<td>${m.hno}</td>
	<td>${m.email}</td>
	<td>${m.id}</td>
	<td>${m.password}</td>
</tr>



</c:forEach>
</table>



<jsp:include page="../footer.jsp"></jsp:include>

</body>
</html>
    