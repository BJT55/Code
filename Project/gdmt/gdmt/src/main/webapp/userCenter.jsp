<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf8">
<title>用户中心</title>
</head>
<body>
		${pageContext.request.contextPath}
    	<fieldset style="width: 400px;margin-left: 500px;">
    		<legend style="text-align: center;"> 用户登录</legend>
    		 	<form action="user/login" method="post">
    		
  				</form>
  				还没有账号？<a href="buyer/toBuyerGoods">跳转</a>
    	</fieldset>
</body>
</html>