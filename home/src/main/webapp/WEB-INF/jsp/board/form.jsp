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
<%
Member loginUser =(Member)session.getAttribute("loginUser"); 
String nik = loginUser.getNik();

%>
<form action="add" method="post">
<div id="bform">
<table>
	<tr>
		<td>����<input type="text" name="title"></td>
	</tr>
	<tr>
		<td><textarea rows="20" cols="27" name="memo"></textarea></td>
	</tr>
	 <tr>
	   <td><input type="text" value="<%=nik %>" name="nik" style="hidden"></td>
	 </tr>  
	   


</table>
</div>
<div>
<% 
  


loginUser.getNik();
%>
</div>
<div>
<button type="submit">Ȯ��</button>
<input type="button" value="�ּ�" onclick="location.href='list'">
</div>

</form>

</body>

<script>


</script>

<jsp:include page="../footer.jsp"></jsp:include>
</html>