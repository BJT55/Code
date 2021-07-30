<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<style type="text/css">
form{text-align:center;vertical-align:middle;}
caption{
width:100px;
text-align:left;
background-color:#00bbcc;
}
table{
width:70%;
margin-left: 200px;
border:3px;
border-style: solid;
border-top-color: #00bbcc;
border-bottom-color: #00bbcc;
border-left-color: white;
border-right-color: white;
}
tr{
border-style: dashed;
border-color: gray;
}
td{
border-style:none;
}
</style>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>管理员添加</title>
</head>
<body>
    <form action="admin/regist" method="post">
    	<table>
    		<caption>添加用户</caption>
    			<tr>
    				<td>用户名：</td>
    				<td><input name="admin_username"></td>
    			</tr>
    			<tr>
    				<td>密码：</td>
    				<td><input type="password" name="admin_password"></td>
    			</tr>
    			<tr>
    				<td>姓名：</td>
    				<td><input name="admin_name"></td>
    			</tr>
    			<tr>
    				<td>部门：</td>
    				<td>
    					<select name="admin_depart" id="depart">
   							<option>---请选择---</option>
   							<option value="注册信息部门">注册信息部门</option>
   							<option value="交易信息部门">交易信息部门</option>
   							<option value="咨询部门">咨询部门</option>
   						</select>
   					</td>
    			</tr>
    			<tr>
    				<td>联系方式：</td>
    				<td><input name="admin_tel"> </td>
    			</tr>
    			<tr>
    				<td>用户角色：</td>
    				<td>
    					<select name="admin_limit" id="limit">
   							<option>---请选择---</option>
   							<option value="审核人员">审核人员</option>
   							<option value="维护人员">维护人员</option>
   							<option value="编辑人员">编辑人员</option>
   						</select>
   					</td>
    			</tr>
    			<tr>
    				<td><input type="submit"  id="submit" value="保存">&nbsp;&nbsp;&nbsp;</td>
    				<td><input type="reset" name="reset" value="取消"></td>
    			</tr>
    	</table>	
  	</form>

</body>
</html>