<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시물</title>
</head>
<body>

   <table>
    <thead>
      <tr>
        <td>번호</td><td>제목</td><td>닉네임</td><td>시간</td><td>조회수</td>
      </tr>
    </thead>
    <tbody>
   <c:forEach items="${list}" var="b">
      <tr>
        <td>${b.bno}</td><td>${b.title}</td><td>${b.nik}</td><td>${b.bdt}</td><td>${b.vs }</td>
      </tr>
      
      </c:forEach>
    </tbody>
  </table>


</body>
</html>