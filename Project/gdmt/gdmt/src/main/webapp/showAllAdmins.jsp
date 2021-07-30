<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<style type="text/css">
#info{margin-left:1000px;}
caption{
width:120px;
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
border:1px solid;
border-collapse:collapse;
border-color: gray;
text-align:center;
}
td{
border:1px;
text-align:center;
border-collapse:collapse;
}
</style>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>管理员信息</title>
</head>
<body>
	
<span id="message" style="color: blue;">${flag}</span>
	<table>
	<caption>所有管理员信息</caption>
		<tr><td>编号</td><td>用户名</td><td>姓名</td><td>角色</td><td>部门</td><td colspan="2">操作</td></tr>
		<c:forEach var="admin" items="${adminList}">
			<tr>
				<td>${admin.admin_id}</td>
				<td>${admin.admin_username}</td>
				<td>${admin.admin_name}</td>
				<td>${admin.admin_limit}</td>
				<td>${admin.admin_depart}</td>
				<td><button onclick="modifyPasswordById(${admin.admin_id})">重置密码</button></td>
				<td><button onclick="removeAdminByAdminid(${admin.admin_id})">删除</button></td>
			</tr>
		</c:forEach>
		
	</table>
	<div style="margin-left:600px">
		当前页：<span style="color: blue;">${pageInfo.pageNum}</span>/总页数：<span style="color: blue;">${pageInfo.pages}</span>，总管理员数：<span style="color: blue;">${pageInfo.total}</span>
    	<button onclick="javaScript:location.href='admin/getAllAdmins?pageNum=${pageInfo.pageNum-1}&maxPage=${pageInfo.pages}'">上一页</button>
    	<button onclick="javaScript:location.href='admin/getAllAdmins?pageNum=${pageInfo.pageNum+1}&maxPage=${pageInfo.pages}'">下一页</button>
	</div>
	
</body>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>  
<script type="text/javascript">
  	function modifyPasswordById(id){
  		location.href="admin/modifyPassword/"+id+"/"+${pageInfo.pages}+"/"+${pageInfo.pageNum};
  	}
  	function removeAdminByAdminid(id){
  		location.href="admin/removeAdmin/"+id+"/"+${pageInfo.pages}+"/"+${pageInfo.pageNum};
  	}
  	
   $("#message").show(1000).delay(1000).hide(4000);
</script>
</html>