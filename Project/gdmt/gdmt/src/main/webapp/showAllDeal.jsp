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
<title>订单信息</title>
</head>
<body>
<table>
<caption>订单信息</caption>
		<tr><td>订单编号</td><td>摘牌方</td><td>被摘牌方</td><td>订单生产时间</td><td>商品号</td></tr>
		<c:forEach var="deal" items="${dealList}">
			<tr>
				<td>${deal.deal_id}</td>
				<td>${deal.dealist}</td>
				<td>${deal.hanger}</td>
				<td>${deal.create_time}</td>
				<td>${deal.goodid}</td>
			</tr>
		</c:forEach>
		
	</table>
	<div style="margin-left:800px">
		当前页：<span id="message" style="color: blue;">${pageInfo.pageNum}</span>/总页数：<span id="message" style="color: blue;">${pageInfo.pages}</span>，总记录数：<span id="message" style="color: blue;">${pageInfo.total}</span>
    <!--  	<button onclick="javaScript:location.href='deal/getAllDeals?pageNum=${pageInfo.pageNum-1}&maxPage=${pageInfo.pages}'">上一页</button>
    	<button onclick="javaScript:location.href='deal/getAllDeals?pageNum=${pageInfo.pageNum+1}&maxPage=${pageInfo.pages}'">下一页</button>  -->
	</div>
</body>
</html>