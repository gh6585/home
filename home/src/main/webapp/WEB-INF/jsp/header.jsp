<%@page import="spring.home.ms.domain.Member"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<header>
	<h1 id='main'>main</h1>
<ul>

<%
	Member loginUser = (Member)session.getAttribute("loginUser");
if (loginUser == null){
%>
	<li><a href="">�α���</a></li>
<%
} else {
	String loginType ="ȸ��";

}
%>
	<li><a href="/app/home/form">ȸ������</a></li>


</ul>

</header>

<script>
$('#main').click(function(){
	location.href='list';
});

</script>

</html>