<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<style>
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
border-bottom-color: white;
border-left-color: white;
border-right-color: white;
}
tr{
border-style: dashed;
border-bottom-color: gray;
}
td{
border-style:none;
}
</style>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>详细信息</title>
</head>
<body>
<table>
<caption>采购信息</caption>
<tr>
  <th align="right">报价截止日期：</th><td>${buyer.buyer_time}</td><td colspan="4"> </td>
</tr>
<tr>
  <th align="right">单据编号：</th><td>${buyer.buyer_num}</td>
  <th align="right">申请单位：</th><td>${buyer.buyer_cname}</td>
  <th align="right">申请人：</th><td>${buyer.buyer_man}</td>
</tr>
<tr>
  <th align="right">签发人：</th><td>${buyer.buyer_signer}</td>
  <th align="right">申请日期：</th><td>${buyer.buyer_date}</td>
  <th align="right">交货时间：</th><td>${buyer.buyer_time}</td>
</tr>
<tr>
  <th align="right">煤种：</th><td>${buyer.buyer_kind}</td>
  <th align="right">采购数量：</th><td>${buyer.buyer_purnum}</td>
  <th align="right">运输方式：</th><td>${buyer.buyer_trans}</td>
</tr>
<tr>
  <th align="right">交货地点：</th><td>${buyer.buyer_location}</td>
  <th align="right">结算方式：</th><td>${buyer.buyer_pay}</td>
  <th align="right">验收方式：</th><td>${buyer.buyer_test}</td>
</tr>
<tr>
  <th align="right">结算付款方式：</th><td>${buyer.buyer_payway}</td><td colspan="4"> </td>
</tr>
<tr>
  <th align="right">保证金要求：</th><td>${buyer.buyer_offer}</td><td colspan="4"> </td>
</tr>
</table>
<table>
<caption>煤质要求</caption>
<tr style="background:#ccffff;">
  <th align="right">收到基基准</th><td colspan="5"> </td>
</tr>
<tr>
  <th align="right">收到基低位发热量</th><td>${buyer.qnet}</td>
  <th align="right">收到基全硫：</th><td>${buyer.sulfur}</td>
  <th align="right">全水分：</th><td>${buyer.moisture}</td>
</tr>
<tr>
  <th align="right">收到基灰分：</th><td>${buyer.aar}</td>
  <th align="right">收到基会发分：</th><td>${buyer.volatilize}</td>
  <td colspan="2"> </td>
</tr>
<tr style="background:#ccffff;">
  <th align="right">空气干燥基基准</th><td colspan="5"> </td>
</tr>
<tr>
  <th align="right">空气基水分：</th><td>${buyer.mad}</td>
  <th align="right">空气基全硫：</th><td>${buyer.stad}</td>
  <th align="right">空气基挥发分：</th><td>${buyer.vad}</td>
</tr>
<tr style="background:#ccffff;">
  <th align="right">干燥基基准</th><td colspan="5"> </td>
</tr>
<tr>
  <th align="right">干基高位发热量：</th><td>${buyer.qgrd}</td>
  <th align="right">干基全硫：</th><td>${buyer.std}</td>
  <th align="right">干燥无灰基挥发分：</th><td>${buyer.vd}</td>
</tr>
</table>
<table>
<tr>
  <th align="right">粒度：</th><td>${buyer.mm}</td>
  <th align="right">灰熔点：</th><td>${buyer.st}</td>
  <th align="right">哈氏可磨系数：</th><td>${buyer.hgi}</td>
</tr>
<tr>
	<th align="right">备注：</th><td colspan="5">${buyer.beizhu}</td>
</tr>
</table>
<center><button onclick="javascript:history.back(-1)"  align="">返回</button></center>




</html>