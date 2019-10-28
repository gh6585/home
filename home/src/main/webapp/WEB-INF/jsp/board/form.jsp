<%@page import="spring.home.ms.domain.Member"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel='stylesheet' href='/css/common.css'>
</head>
<body>

<jsp:include page="../header.jsp"></jsp:include>
<form action="add" method="post">
<div id="bform">
<table>
	<tr>
		<td>제목<input type="text" name="title"></td>
	</tr>
	<tr>
		<td><textarea rows="20" cols="27" name="memo"></textarea></td>
	</tr>
	


</table>
<div id="bforminput">


<% 

%>
<button type="submit" value= var=>확인</button>
<input type="button" value="최소" onclick="location.href='list'">
</div>
</div>

</form>

</body>

<script>


</script>

<jsp:include page="../footer.jsp"></jsp:include>
</html>