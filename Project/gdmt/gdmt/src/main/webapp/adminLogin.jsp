<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<style type="text/css">
caption{
width:100px;
text-align:left;
background-color:#00bbcc;
}
table{
width:600px;
margin-left: 400px;
border:3px;
border-style: solid;
border-color: #00bbcc;
}
tr{
border:none;
border-collapse:collapse;
border-color: gray;
text-align:center;
}
td{
border:none;
text-align:center;
border-collapse:collapse;
}
</style>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>管理员登录</title>
</head>
<body>
    <form action="admin/login" method="post">
    	<table>
    		<caption>管理员登录</caption>
    			<tr>
    				<td>用户名称:</td>
    				<td><input name="username"></td>
    			</tr>
    			<tr>
    				<td colspan="2"><span style="color:red;">${loginDefeat}</span></td>
    			</tr>
    			<tr>
    				<td>用户密码:</td>
    				<td><input type="password" name="password"></td>
    			</tr>
    			<tr>
    				<td colspan="2">
    				<input type="submit" value="登录">&nbsp;&nbsp;&nbsp;
    				<input type="reset" value="取消"><br/><br/>
    				</td>
    			</tr>
    		</table>	
  	</form>
</body>
</html>