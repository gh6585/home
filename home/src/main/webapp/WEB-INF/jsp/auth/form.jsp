<%@ page language="java" 
    contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<meta name="viewport" content="user-scalable=no, initial-scale=1.0, 
maximum-scale=1.0, minimum-scale=1.0, width=device-width"/>
<title>Insert title here</title>
<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
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


<a id="kakao-login-btn"></a>
<a href="http://developers.kakao.com/logout"></a>

<script type='text/javascript'>
//<![CDATA[
// ����� ���� JavaScript Ű�� ������ �ּ���.
Kakao.init('c14fe92965509470b4cee37593ff44bd');
// īī�� �α��� ��ư�� �����մϴ�.
Kakao.Auth.createLoginButton({
  container: '#kakao-login-btn',
  success: function(authObj) {

	  Kakao.API.request({
		  url:'/v1/user/me',
		  success: function(res){
			  alert(JSON.stringify(res.properties));
			  alert(JSON.stringify(res.properties.nickname));

		  }
		  
		  
	  })
    
  },
  fail: function(err) {
     alert(JSON.stringify(err));
  }
});
//]]>
  
</script>

</body>


</html>