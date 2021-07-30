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
<title>审核首页</title>
</head>
<body>
<span id="info">${admin.admin_name}</span>
<a href="admin/logout" style="text-decoration:none;"><input type="button" value="退出"></a><br/>
<table>
<caption>未审核信息</caption>
		<tr><td>编号</td><td>公司名称</td><td>待审核类别</td><td>状态</td><td>操作</td></tr>
		<c:forEach var="user" items="${userList}">
			<tr>
				<td>${user.user_id}</td>
				<td>${user.c_name}</td>
				<td>注册信息</td>
				<td>${user.user_state}</td>
				<td><button onclick="checkByUserId(${user.user_id})">审核</button></td>
			</tr>
		</c:forEach>
		
	</table>
	<div style="margin-left:800px">
		当前页：<span id="message" style="color: blue;">${pageInfo.pageNum}</span>/总页数：<span id="message" style="color: blue;">${pageInfo.pages}</span>，总记录数：<span id="message" style="color: blue;">${pageInfo.total}</span>
    	<button onclick="javaScript:location.href='admin/getAllUsers?pageNum=${pageInfo.pageNum-1}&maxPage=${pageInfo.pages}'">上一页</button>
    	<button onclick="javaScript:location.href='admin/getAllUsers?pageNum=${pageInfo.pageNum+1}&maxPage=${pageInfo.pages}'">下一页</button>
	</div>
</body>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>  
<script type="text/javascript">
  	function checkByUserId(id){
  		location.href="admin/checkByUserId/"+id;
  	}

</script>
</html>