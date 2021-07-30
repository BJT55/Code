<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>卖方挂牌</title>
<style type="text/css">
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
</head>

<body>

<table>
<caption>煤质信息</caption>
<tr style="background:#ccffff;">
  <th align="right">货物信息</th><td colspan="5"> </td>
</tr>
<tr>
  <th align="right">供应数量(万吨):</th><td>${seller.seller_supnum}</td>
  <th align="right">热值(KCal/)≥:</th><td>${seller.calorific}</td>
  <th align="right">原煤单价(元/吨)：</th><td>${seller.seller_price}</td>
</tr>
<tr>
  <th align="right">余硫(%)≤ </th><td>${seller.sulful}</td>
  <th align="right">产地</th><td>${seller.seller_origin}</td>
  <th align="right">运费单价</th><td>${seller.trans_price}元/吨</td>
</tr>

<tr>
  <th align="right">挥发分(%)</th><td>${seller.volatility}</td>
  <th align="right">发货港口</th><td>${seller.port}</td>
  <th align="right">空干基灰分(%)</th><td>${seller.element}</td>
  <th align="right">含水分(%)</th><td>${seller.moisture}</td>
</tr>


</table>

<center><button onclick="javascript:history.back(-1)"  align="">返回</button></center>
</body>
</html>