<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>卖方挂牌</title>
<style type="text/css">
<!--
.tip {
	color: #F00;
}
.message {
	color: #FFF;
	font-weight: bold;
}
.message div {
	font-size: 18px;
}
.tip {
	color: #F00;
}
.xinxi {
	color: #FFF;
}
.xinxi div {
	font-size: 24px;
}
.shuoming {
	color: #F00;
}
.yunfei335 {
	color: #F00;
}
.tr td{border-bottom:3px solid #3299CC;}
-->
</style>
<script language="javaScript">
function textValue(obj) {
if(obj.value.search("[0-9]+[.]{0,1}[0-9]*[dD]{0,1}")!=0){
alert("输入不合要求");
document.getElementById("need1").focus();
return false;
}
}
function textValue1(obj) {
	if(obj.value.search("[0-9]+[.]{0,1}[0-9]*[dD]{0,1}")!=0){
	alert("输入不合要求");
	document.getElementById("calorific").focus();
	return false;
	}
	}
	
	
function textValue2(obj) {
	if(obj.value.search("[0-9]+[.]{0,1}[0-9]*[dD]{0,1}")!=0){
	alert("输入不合要求");
	document.getElementById("seller_price").focus();
	return false;
	}
	}

function textValue3(obj) {
	if(obj.value.search("[0-9]+[.]{0,1}[0-9]*[dD]{0,1}")!=0){
	alert("输入不合要求");
	document.getElementById("sulful").focus();
	return false;
	}
	}
	
function textValue4(obj) {
	if(obj.value.search("[0-9]+[.]{0,1}[0-9]*[dD]{0,1}")!=0){
	alert("输入不合要求");
	document.getElementById("trans_price").focus();
	return false;
	}
	}
	
function textValue5(obj) {
	if(obj.value.search("[0-9]+[.]{0,1}[0-9]*[dD]{0,1}")!=0){
	alert("输入不合要求");
	document.getElementById("volatility").focus();
	return false;
	}
	}
function textValue6(obj) {
	if(obj.value.search("[0-9]+[.]{0,1}[0-9]*[dD]{0,1}")!=0){
	alert("输入不合要求");
	document.getElementById("volatility2").focus();
	return false;
	}
	}
	
	
function textValue7(obj) {
	if(obj.value.search("[0-9]+[.]{0,1}[0-9]*[dD]{0,1}")!=0){
	alert("输入不合要求");
	document.getElementById("element").focus();
	return false;
	}
	}
	
	
function textValue8(obj) {
	if(obj.value.search("[0-9]+[.]{0,1}[0-9]*[dD]{0,1}")!=0){
	alert("输入不合要求");
	document.getElementById("moisture").focus();
	return false;
	}
	}
	
	




</script> 
</head>

<body>
<form id="form1" name="form1" method="post" action="sellerGoods">
<table width="1099">
  <tr class="tr">
    <td width="124" height="61" bgcolor="#3299CC" class="xinxi"><div align="center">报价信息</div></td>
    <td colspan="7"><span class="tip"><strong>注：报价信息内容均为必填</strong></span></td>
  </tr>
  <tr>
      <span style="color:red;"> ${addDefeat}</span><br>
    <td height="53"><div align="right">  供应数量(万吨): </div></td>
    <td colspan="3">
      <label>
       <input type="text" name="seller_supnum"  id="need1" onBlur="textValue(this)"/>
      </label>
    </td>
    <td width="167"><div align="right">热值(KCal/Kg)≥:</div></td>
    <td width="183">
      <label>
        <input type="text" name="calorific" id="calorific"  onBlur="textValue1(this)" />
      </label>
    </td>
    <td width="152"><div align="right">原煤单价(元/吨):</div></td>
    <td width="266">
      <label>
        <input type="text" name="seller_price" id="seller_price"   onBlur="textValue2(this)" />
        </label>
    </td>
  </tr>
  <tr>
    <td height="52"><div align="right">全硫(%)≤:</div></td>
    <td colspan="3">
      <label>
        <input type="text" name="sulful" id="sulful"   onBlur="textValue3(this)"/>
      </label>
    </td>
    <td><div align="right">产地:</div></td>
    <td>
      <label>
        <input type="text" name="seller_origin" id="seller_origin" />
      </label>
    </td>
    <td><div align="right">运费单价:</div></td>
    <td>
      <label>
        <input name="trans_price" type="text" id="trans_price"  onBlur="textValue4(this)"  size="20" />
      </label>
      <span class="yunfei335">335.00</span>元/吨
</td>
  </tr>
  <tr>
    <td height="54"><div align="right">挥发分(%):</div></td>
    <td width="66">
      <label>
        <input name="volatility" type="text" id="volatility"    onBlur="textValue5(this)" size="5" />
      </label>
    </td>
    <td width="19"><div align="center">至</div></td>
    <td width="70">
      <label>
        <input name="volatility" type="text" id="volatility2"    onBlur="textValue6(this)"  size="5" />
      </label>
    </td>
    <td><div align="right">发站(发货港口):</div></td>
    <td><input type="text" name="port" id="port" /></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="53"><div align="right">空干基灰分(%≤):</div></td>
    <td colspan="3">
      <label>
        <input type="text" name="element" id="element"   onBlur="textValue7(this)" />
      </label>
    </td>
    <td><div align="right">全水分(%)≤:</div></td>
    <td><input type="text" name="moisture" id="moisture"  onBlur="textValue8(this)"  /></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="98" colspan="8" class="shuoming"><p>报价说明：供应商报价中的“全硫”，“挥发分”，“灰分”请按照采购方在煤质要求中提出的基准填写！“运费”仅在该采购单的“结算方式”为“两票结算”时才需要填写！</p></td>
  </tr>
  <tr>
    <td height="54">&nbsp;</td>
    <td colspan="3">
    </td>
    <td colspan="2"><input type="submit" name="fabu" id="fabu" value="发布商品" /></td>
    <td>
      <label>
        <input type="button" class="btn"  value="返回" onclick="javascrtpt:window.location.href='toTop'"/>
        </label>
    </td>
    <td>&nbsp;</td>
  </tr>
</table>
</form>
</body>
</html>