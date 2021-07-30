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
border-color: #00bbcc;
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
<title>订单详细信息</title>
</head>
<body>
<button class="btn btn-success" name="button1" id="button1" onclick="history.go(-1)">返回</button>
<table>
<caption>本次订单详细信息</caption>
		<tr>
			<td>摘牌方:</td>
			<td>${deal.dealist}</td>
		</tr>
		<tr>
			<td>被摘牌方:</td>
			<td>${deal.hanger}</td>
		</tr>
		<tr>
			<td>订单编号:</td>
			<td>${deal.deal_id}</td>
		</tr>
		<tr>
			<td>交货时间:</td>
			<td>${deal.deal_time}</td>
		</tr>
		<tr>
			<td>生成订单时间:</td>
			<td>${deal.create_time}</td>
		</tr>
		<tr>
			<td>产品编号:</td>
			<td>${deal.goodid}</td>
		</tr>
</table>

</body>
</html>