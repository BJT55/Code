<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>所有用户信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	table{width: 100%}
	table,tr,th{border:1px solid gray; border-collapse: collapse; }
	#info{margin-left:1200px;}
	</style>
	
  </head>
  
  <body>
 		<span id="info">${user.username}</span> <a href="admin/logout" style="text-decoration: none;">【退出】</a><br/>
 		<!-- EL表达式   page->request->session->application 以此查找
 								找到，直接返回，如果所有范围都没有找到，则返回空（不会报空指针异常） -->
    	所有用户信息如下：<span id="message" style="color: green;">${flag}</span>
    	
    	<table>
    		<tr><th>用户编号</th><th>用户编号</th><th>用户性别</th><th>状态</th><th colspan="3">操作</th></tr>
    		<c:forEach var="user" items="${userList}">
    			<tr>
    				<th>${user.userid}</th>
    				<th>${user.username}</th>
    				<th>${user.sex}</th>
    				<th>
    					<c:choose>
    						<c:when test="${user.state==true}"> 正常</c:when>
    						<c:otherwise>禁用</c:otherwise>
    					</c:choose>
    				</th>
    				<th><button onClick="modifyPasswordById(${user.userid},${pageInfo.pages})">修改密码</button></th>
    				<th><button onClick="modifyUserState(${user.userid},${user.state},${pageInfo.pages})"></th>
    				<c:choose>
    						<c:when test="${user.state==true}"> 禁用</c:when>
    						<c:otherwise>启用</c:otherwise>
    					</c:choose>
    				</button></th>
    				<th><button onClick="removeUserByUserid(${user.userid})">删除用户</button></th>
    				
    			</tr>
    		</c:forEach>
    		
    	</table>
    	当前第${pageInfo.pageNum}页/总共${pageInfo.pages}页,总共${pageInfo.total}条数据
    	<button onClick="javaScript:location.href='admin/getAllUsers?pageNum=${pageInfo.pageNum-1}&maxPage=${pageInfo.pages}'">上一页</button>
    	<button onClick="javaScript:location.href='admin/getAllUsers?pageNum=${pageInfo.pageNum+1}&maxPage=${pageInfo.pages}'">下一页</button>
    	
  </body>
  <script type="text/javascript" src="js/jquery-1.8.3.js"></script>  
  <script type="text/javascript">
  	function modifyPasswordById(id){
  		location.href="admin/modifyPassword/"+id+"/"+${pageInfo.pages}+"/"+${pageInfo.pageNum};
  	}
  	
  	function modifyUserState(id,state){
  		location.href="admin/modifyUserState?userid="+id+"&state="+state+"&pageNum="+${pageInfo.pageNum}+"&maxPage="+${pageInfo.pages};
  	}
  	
  	function removeUserByUserid(id){
  		location.href="admin/removeUser/"+id+"/"+${pageInfo.pages}+"/"+${pageInfo.pageNum};
  	}
   	  	
   $("#message").show(1000).delay(1000).hide(4000);
  		 	
 
  </script>
</html>
