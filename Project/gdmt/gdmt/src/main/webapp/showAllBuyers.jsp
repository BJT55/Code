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
    
    <title>My JSP 'showAllBuyers.jsp' starting page</title>
    
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
    
	<form action="http://vip.biancheng.net/login.php" method="post">
     	身份选择:
     <select onchange="window.location=this.value;">
         <option value="showAllSellers.jsp">卖方</option>
         <option value="showAllBuyers.jsp" id="one">买方</option>
      </select>
      <input type="button" id="1" value="卖方用户" style="left:50px; width:80px;height:22px; background:white; border:;" />
</form>
	
	<span id="info">${buyer.buyer_id}</span>


	所有交易信息:<span id="message" style="color: blue;">${flag}</span>
	
	<table>
		<tr><td>买方编号</td><td>交货地点</td><td>采购数量</td><td>运输方式</td><td>状态</td><td colspan="3">操作</td></tr>
		<c:forEach var="buyer" items="${buyerList}">
			<tr>
				<td>${buyer.buyer_id}</td>
				<td>${buyer.buyer_location}</td>
				<td>${buyer.buyer_num}</td>
				<td>${buyer.buyer_trans}</td>
				<td>
    				<c:choose>
    					<c:when test="${buyer.buyer_state==true}">未摘牌</c:when>
    					<c:otherwise>未摘牌</c:otherwise>
    				</c:choose>
    			</td>
				
				<td style="text-align:center">
				<form action="deal/dealMake">
				<br/>
				<input type="hidden" name="dealist" value="${buyer.buyer_cname}">
				<input type="hidden" name="hanger" value="${user.c_name}">
				<input type="hidden" name="goodid" value="${buyer.buyer_id}">
				<input type="submit" value="摘牌">
				</form>
				</td>
				
				<td><button onclick="checkByBuyerId(${buyer.buyer_id})">查询</button></td>
			</tr>
		</c:forEach>
		
	</table>



	<br/>
	<div style="margin-left:100px">
		当前页:[<span id="message" style="color:#00bbff;">${pageInfo.pageNum}</span>]<br/>
		总页数:[<span id="message" style="color:#00bbff;">${pageInfo.pages}</span>]<br/>
		总数据:[<span id="message" style="color:#00bbff;">${pageInfo.total}</span>]<br/>

    	<button onclick="javaScript:location.href='seller/getAllBuyers?pageNum=${pageInfo.pageNum-1}&maxPage=${pageInfo.pages}'">上一页</button>
    	<button onclick="javaScript:location.href='seller/getAllBuyers?pageNum=${pageInfo.pageNum+1}&maxPage=${pageInfo.pages}'">下一页</button>
		
	</div>
	
<script type="text/javascript" src="js/jquery-1.8.3.js"></script> 
<script type="text/javascript">
	function checkByBuyerId(id){
		location.href="buyer/checkByBuyerId/"+id;
	}

$("#1").click(function(){
	alert("卖家界面");
	location.href='seller/getAllSellers';
});


</script>
</body>

</html>