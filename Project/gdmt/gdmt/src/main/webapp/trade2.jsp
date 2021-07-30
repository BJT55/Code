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
table{width:100%}
table,tr,td{border:1px solid gray;border-collapse:collapse;text-align:center;}
#info{margin-left:1200px;}
</style>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>informations</title>
</head>
<body>
	<span id="info">${seller.seller_id}</span><a href="seller/logout" style="text-decoration:none;">[exit]</a><br/>
	所有交易信息:<span id="message" style="color: blue;">${flag}</span>
	
	<table>
		<tr><td>卖方编号</td><td>单价</td><td>供应数量</td><td>发货港口</td><td>状态</td><td colspan="3">摘牌</td></tr>
		<c:forEach var="seller" items="${sellerList}">
			<tr>
				<td>${seller.seller_id}</td>
				<td>${seller.seller_price}</td>
				<td>${seller.seller_supnum}</td>
				<td>${seller.port}</td>
				<td>
    				<c:choose>
    					<c:when test="${seller.state==true}">normal</c:when>
    					<c:otherwise>disable</c:otherwise>
    				</c:choose>
    			</td>
				<td><button onclick="modifyPasswordById(${user.userid})">change password</button></td>
				<td><button onclick="modifyUserState(${user.userid},${user.state})">
				<c:choose>
    					<c:when test="${seller.state==true}">待摘牌</c:when>
    					<c:otherwise>摘牌</c:otherwise>
    			</c:choose>
				</button></td>
				<td><button onclick="removeUserByUserid(${user.userid})">delete</button></td>
			</tr>
		</c:forEach>
		
	</table>
	<div style="margin-left:1000px">
		current page:<span id="message" style="color: blue;">${pageInfo.pageNum}</span>/total page:<span id="message" style="color: blue;">${pageInfo.pages}</span>,total data:<span id="message" style="color: blue;">${pageInfo.total}</span>
    	<button onclick="javaScript:location.href='admin/getAllUsers?pageNum=${pageInfo.pageNum-1}&maxPage=${pageInfo.pages}'">上一页</button>
    	<button onclick="javaScript:location.href='admin/getAllUsers?pageNum=${pageInfo.pageNum+1}&maxPage=${pageInfo.pages}'">下一页</button>
	</div>
	
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