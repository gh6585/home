<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>�α���</h1>
<form action="login" method='post'>
<table>
  <tr>  
    <th>�̸���</th>
      <td>
        <input type="email" name="email" value="">
      </td>  
    </tr>
  <tr>
      <th>��й�ȣ</th>
      <td>
        <input type="text" name="password" value="">
      </td>
  </tr>

</table>

  <button type="submit" name="button">Ȯ��</button>
  <button type="button" name="button" onclick="location.href='../home/list'">���</button>
</form>
</body>
</html>