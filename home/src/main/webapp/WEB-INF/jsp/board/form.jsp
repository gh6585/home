<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel='stylesheet' href='/css/common.css'>
</head>
<body>

<jsp:include page="../header.jsp"></jsp:include>
<form action="add">
<div id="bform">
<table>
	<tr>
		<td>����<input type="text" name="title"></td>
	</tr>
	<tr>
		<td><textarea rows="20" cols="27"></textarea></td>
	</tr>
	


</table>
<div id="bforminput">
<input type="submit" value="Ȯ��">
<input type="button" value="�ּ�" onclick="location.href='list'">
</div>
</div>

</form>

</body>

<jsp:include page="../footer.jsp"></jsp:include>
</html>