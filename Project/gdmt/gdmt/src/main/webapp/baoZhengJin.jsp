<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>缴纳保证金</title>
<style type="text/css">
<!--
.baozhengjin {
	font-family: 微软雅黑;
	font-size: 26px;
	font-weight: bold;
	border-bottom:1px dashed #CCCCCC;
	color: #255e95;
}
.baozhengjine {
	font-size: 36px;
}
.baozhengjine div {
	font-size: 24px;
}
-->
</style>
</head>

<body>
<form id="form1" name="form1" method="post" action="toSellerGoods">
<table width="1582" height="251">
  <tr>
    <td height="84" colspan="2" class="baozhengjin"><div align="center">缴纳保证金</div></td>
  </tr>
  <tr>
    <td width="792" height="53" align="right" class="baozhengjine"><div align="right">保证金：</div></td>
    <td width="778"><label>
      <input type="text" name="jine" id="jine" />
    </label></td>
  </tr>
  <tr>
    <td height="73" align="right"><label>
      <input type="submit" name="tijiao" id="tijiao" value="提交" />
    </label></td>
    <td><label>
      <input type="button" class="btn"  value="返回" onclick="javascript:history.go(-1);"/>
    </label></td>
  </tr>
</table>
</form>
</body>
</html>