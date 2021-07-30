<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    
  </head>
  
  <body>
   <body background="images/8.png" style=" background-repeat:no-repeat ;background-size:100% 100%;
background-attachment: fixed;">

  		${pageContext.request.contextPath}
    	<fieldset style="width: 400px;margin-left: 500px;">
    		<legend style="text-align: center;"> 用户登录</legend>
    		 	<form action="user/findPwd" method="post">
    				用户名称:<input name="user_account"><span style="color:red;"> ${accountDefeat}</span><br>
    				邮箱:<input name="user_email"><span style="color:red;"> ${emailDefeat}</span><br>
    				输入新密码:<input type="password" name="user_pwd"><br>
    				确认新密码:<input type="password" name="user_pwd2"><br><span style="color:red;">${pwdDefeat}</span><br>
    				<input type="submit" value="确认修改">&nbsp;&nbsp;&nbsp;
    				<input type="reset" value="取消">
  				</form>
  				已有账号，立即登录？<a href="user/toLogin">登录</a>
    	</fieldset>
   
  </body>
</html>
