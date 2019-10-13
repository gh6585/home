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

<form action="add" method="post">
   <table>
     <tbody>
       <tr>
         <th>email</th>
         <td>
           <input type="email" name="email">
         </td>
       </tr>
       <tr>
         <th>아이디</th>
         <td>
           <input type="text" name="id">
         </td>
       </tr>
       <tr>
         <th>비밀번호</th>
         <td>
           <input type="text" name="password">
         </td>
       </tr>


  </tbody>
</table>


<div>

<input type="submit" value="확인" onclick="location.href='../auth/signupend'">
<input type="button" value="취소" onclick="location.href='list'">
<!-- <input type="button" value="취소" onclick="location.reload()"> -->
</div>
</form>

<jsp:include page="../footer.jsp"></jsp:include>

</body>
</html>
