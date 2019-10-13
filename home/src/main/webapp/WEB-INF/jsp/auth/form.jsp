<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>로그인</h1>
<form action="login" method='post'>
<table>
  <tr>  
    <th>이메일</th>
      <td>
        <input type="email" name="email" value="">
      </td>  
    </tr>
  <tr>
      <th>비밀번호</th>
      <td>
        <input type="text" name="password" value="">
      </td>
  </tr>

</table>

  <button type="submit" name="button">확인</button>
  <button type="button" name="button" onclick="location.href='../home/list'">취소</button>
</form>
</body>
</html>