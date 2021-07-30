<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>买方挂牌</title>
<style type="text/css">
<!--
.f12{font-size:12px;}
.style1 {color: #FFFFFF}
-->
.box1{background-color:#D7D7D7; border:none;height:20px; line-height:20px; width:120px;}
.style2 {font-size: 12px; font-weight: bold; }
.style3 {color: #FF0000}
</style>

<script language="javaScript">
function textValue10(obj) {
	if(obj.value.search("[0-9]+[.]{0,1}[0-9]*[dD]{0,1}")!=0){
	alert("输入不合要求");
	document.getElementById("buyer_purnum").focus();
	return false;
	}
	}
	
	

</script> 

</head>

<body>
<form id="form1" name="form1" method="post" action="buyerGoods">
<table width="789" height="979" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="789" height="895" colspan="2" align="left" valign="top">
	<table width="789" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="35" colspan="6" align="left" valign="top" style="border-bottom:2px solid #3E8BD7;">
        <table width="100" height="35" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td align="center" valign="middle" bgcolor="#3E8BD7"><span class="style1"> 基本情况</span>  </td>
         
            
          </tr>
        </table></td>
      </tr>
      <tr>
              <span style="color:red;"> ${addDefeat}</span><br> 
        <td width="127" height="35" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">申请单位:</strong></td>
      <td width="132" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
        <input type="text" name="buyer_cname" class="box1" placeholder="津能热电"></td>
        <td width="80" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">单据编号:</strong></td>
        <td width="135" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
          <input type="text" name="buyer_num" class="box1" placeholder="津能热电-2015-09-112" ></td>
        <td width="76" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">申请人:</strong></td>
        <td width="239" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
          <input type="text" name="buyer_man" style="width:110px;"></td>
      </tr>
      <tr>
        <td height="35" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">签发人:</strong></td>
      <td height="35" style="border-bottom:1px dotted #E3E3E3;">&nbsp;&nbsp;
      <input type="text" name="buyer_signer" style="width:60px;"></td>
        <td height="35" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">申请日期:</strong></td>
        <td height="35" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
          <input type="text" name="buyer_date" style="width:110px;"></td>
        <td height="35" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">交货时间:</strong></td>
        <td height="35" style="border-bottom:1px dotted #E3E3E3;">
        <table width="100%" height="35"  border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="37%">&nbsp;&nbsp;
            <input type="text" name="buyer_time" style="width:70px;"></td>
            <td width="9%"><img src="image/rq1.png" width="20" height="17"></td>
            <td width="8%" align="center" valign="middle" class="f12">至 </td>
            <td width="33%">&nbsp;
            <input type="text" name="buyer_time" style="width:70px;"></td>
            <td width="13%"><img src="image/rq1.png" width="20" height="17"></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="35" align="right" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">煤种:</strong></td>
      <td height="35" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
        <select name="buyer_kind">
          <option value="烟煤" selected>烟煤</option>
          <option value="无烟煤" selected>无烟煤</option>
          <option value="褐煤" selected>褐煤</option>
          <option value="贫瘦煤" selected>贫瘦煤</option>
          <option value="其他" selected>其他</option>
        </select> &nbsp;
        <select name="buyer_kind">
          <option value="原煤" selected>原煤</option>
          <option value="混煤" selected>混煤</option>
          <option value="中煤" selected>中煤</option>
          <option value="煤泥" selected>煤泥</option>
          <option value="其他" selected>其他</option>
            </select></td>
        <td height="35" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">采购数量:</strong></td>
        <td height="35" style="border-bottom:1px dotted #E3E3E3;"> &nbsp;
          <input type="text" name="buyer_purnum"  id="buyer_purnum" onBlur="textValue10(this)" />
          &nbsp;<strong class="f12">(万吨)</strong>&nbsp;</td>
        <td height="35" align="right" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">运输方式:</strong></td>
        <td height="35" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
		<select name="buyer_trans" style="width:150px;">
          <option value="火车" selected>火车</option>
          <option value="汽车" selected>汽车</option>
          <option value="船运" selected>船运</option>
          <option value="其他" selected>其他</option>
        </select>
		</td>
      </tr>
      <tr>
        <td height="35" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">交货地点:</strong></td>
      <td height="35" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
        <input type="text" name="buyer_location" style="width:110px;"></td>
        <td height="35" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">结算方式:</strong></td>
        <td height="35" style="border-bottom:1px dotted #E3E3E3;"> &nbsp;
          <select name="buyer_pay">
            <option value="一票结算" selected>一票结算</option>
            <option value="二票结算" selected>二票结算</option>
            <option value="铁路大票" selected>铁路大票</option>
            <option value="煤款税票" selected>煤款税票</option>
            <option value="其他" selected>其他</option>
            </select></td>
        <td height="35" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">验收方式:</strong></td>
        <td height="35" style="border-bottom:1px dotted #E3E3E3;">
		&nbsp;
		<select name="buyer_test">
		  <option value="到厂第三方验收" selected>到厂第三方验收</option>
		  <option value="到厂验收" selected>到厂验收</option>
		  <option value="港口第三方验收" selected>港口第三方验收</option>
		  <option value="其他" selected>其他</option>
            </select></td>
      </tr>
      <tr>
	  <td height="65" align="right" valign="top" style="padding-top:5px;border-bottom:1px dotted #E3E3E3;"><strong class="f12">结算付款方式:</strong></td>
	  <td height="35" colspan="5" align="center" valign="middle" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
	    <textarea name="buyer_payway" style="width:97%;"></textarea></td>
	  </tr>
      <tr>
        <td height="35" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">报价保证金级纳:</strong></td>
        <td height="35" colspan="5" class="f12" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
        <input name="buyer_offer" type="radio" >
        不要求 
        <input name="buyer_offer" type="radio" >
        要求 
        <input type="text" name="buyer_offer" style="width:40px;">         元吨&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <strong>履约保证金缴纳: 
          <input type="radio" name="buyer_promise" >
</strong>不要求
<input name="buyer_promise" type="radio" checked>
要求
<input type="text" name="buyer_promise" style="width:40px;">
元吨&nbsp;</td>
        </tr>
      <tr>
        <td height="15" colspan="6">&nbsp;</td>
      </tr>
	</table>
	
	<table width="789" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="35" colspan="6" align="left" valign="top" style="border-bottom:2px solid #3E8BD7;"><table width="100" height="35" border="0" cellpadding="0" cellspacing="0">
            <tr>
              <td align="center" valign="middle" bgcolor="#3E8BD7"><span class="style1"> 煤质要求</span></td>
            </tr>
        </table></td>
      </tr>
      <tr align="left" valign="middle" bgcolor="#E1EBFF">
        <td height="30" colspan="6">&nbsp;<strong>收到基基准</strong></td>
      </tr>
      <tr>
        <td width="208" height="35" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">收到基低位发热量Qnet,ar<span style="color: rgb(51, 51, 51); font-family: arial; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">≥</span>:</strong></td>
        <td width="112" class="f12" style="border-bottom:1px dotted #E3E3E3;">&nbsp; <input type="text" name="qnet" style="width:40px;"> &nbsp;<strong>(KCalkg)</strong></td>
        <td width="112" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">收到基全硫St,ar<span style="color: rgb(51, 51, 51); font-family: arial; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">≤</span>:</strong></td>
        <td width="90" style="border-bottom:1px dotted #E3E3E3;">&nbsp; <input type="text" name="sulfur" style="width:40px;"> &nbsp;<strong class="f12">(%)</strong></td>
        <td width="109" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">全水分M<span style="color: rgb(51, 51, 51); font-family: arial; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">≤</span>:</strong></td>
        <td width="158" class="f12" style="border-bottom:1px dotted #E3E3E3;">&nbsp; <input type="text" name="moisture" style="width:40px;">
&nbsp;<strong>(%)</strong> </td>
      </tr>
      <tr>
        <td height="35" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">收到基灰分Aar<span style="color: rgb(51, 51, 51); font-family: arial; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">≤</span>:</strong></td>
        <td height="35" class="f12" style="border-bottom:1px dotted #E3E3E3;">&nbsp; <input type="text" name="aar" style="width:40px;">
&nbsp;<strong>(%)</strong>           </td>
        <td height="35" align="right" valign="middle" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">收到基挥发分Var:</strong></td>
        <td height="35" colspan="3" class="f12" style="border-bottom:1px dotted #E3E3E3;">&nbsp;  <input type="text" name="volatilize" style="width:40px;">
&nbsp;<strong>(%)</strong> <strong>至</strong>
<input type="text" name="volatilize" style="width:40px;">
&nbsp;<strong>(%)</strong></td>
      </tr>
      <tr align="left" valign="middle" bgcolor="#E1EBFF">
        <td height="30" colspan="6">&nbsp;<strong>空气干燥基基准</strong></td>
      </tr>
      <tr align="left">
        <td height="35" align="right" valign="middle" class="f12" style="border-bottom:1px dotted #E3E3E3;"><strong class="f12">空干基水分Mad<span style="color: rgb(51, 51, 51); font-family: arial; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">≤</span>:</strong>&nbsp; </td>
      <td height="35" valign="middle" class="f12" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
        <input type="text" name="mad" style="width:40px;">
&nbsp;<strong>(%)</strong> </td>
        <td height="35" align="right" valign="middle" class="style2" style="border-bottom:1px dotted #E3E3E3;">空干基全硫Stad<span style="color: rgb(51, 51, 51); font-family: arial; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">≤</span>:</td>
        <td height="35" valign="middle" class="f12" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
          <input type="text" name="stad" style="width:40px;">
&nbsp;<strong class="f12">(%)</strong></td>
        <td height="35" align="right" valign="middle" class="style2" style="border-bottom:1px dotted #E3E3E3;">空干基挥发分Vad:</td>
        <td height="35" valign="middle" class="f12" style="border-bottom:1px dotted #E3E3E3;"><input type="text" name="vad" style="width:40px;">
&nbsp;<strong>(%)</strong> <strong>至</strong>
<input type="text" name="vad" style="width:40px;">
&nbsp;<strong>(%)</strong></td>
      </tr>
      <tr align="left" valign="middle" bgcolor="#E1EBFF">
        <td height="30" colspan="6">&nbsp;<strong>干基基准</strong></td>
      </tr>
<tr align="left">
        <td height="35" align="right" valign="middle" class="f12" style="border-bottom:1px dotted #E3E3E3;"><strong>干基高位发热里Qgrd<span style="color: rgb(51, 51, 51); font-family: arial; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">≥</span>:</strong>&nbsp; </td>
      <td height="35" valign="middle" class="f12" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
        <input type="text" name="qgrd" style="width:40px;">
&nbsp;<strong>(KCalkg)</strong></td>
        <td height="35" align="right" valign="middle" class="style2" style="border-bottom:1px dotted #E3E3E3;">干基全破Std<span style="color: rgb(51, 51, 51); font-family: arial; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">≤</span>:</td>
        <td height="35" valign="middle" class="f12" style="border-bottom:1px dotted #E3E3E3;">&nbsp;
          <input type="text" name="std" style="width:40px;">
&nbsp;<strong class="f12">(%)</strong></td>
        <td height="35" align="right" valign="middle" class="style2" style="border-bottom:1px dotted #E3E3E3;">干燥无灰基挥发分:</td>
        <td height="35" valign="middle" class="f12" style="border-bottom:1px dotted #E3E3E3;"><input type="text" name="vd" style="width:40px;">
&nbsp;<strong>(%)</strong> <strong>至</strong>
<input type="text" name="vd" style="width:40px;">
&nbsp;<strong>(%)</strong></td>
      </tr>
      <tr align="left" valign="top">
        <td height="138" colspan="6">
		<table width="100%"  border="0" cellpadding="0" cellspacing="0" bgcolor="#F9F9F9" style="border-left:1px solid #D7D7D7;border-bottom:1px solid #D7D7D7;border-right:1px solid #D7D7D7;border-top:2px solid #3E8BD7; margin-top:20px;">
          <tr>
            <td width="206" height="35" align="right" valign="middle"><strong class="f12">粒度(mm)<span style="color: rgb(51, 51, 51); font-family: arial; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">≤</span>:&nbsp;</strong></td>
            <td width="112"><span class="f12">
&nbsp;
<input type="text" name="mm" style="width:40px;"> 
</span></td>
            <td width="112" align="right" valign="middle"><strong class="f12">灰熔点ST(℃)<span style="color: rgb(51, 51, 51); font-family: arial; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">≥</span>:</strong></td>
            <td width="90"><span class="f12">
&nbsp;
<input type="text" name="st" style="width:40px;"> 
</span></td>
            <td width="116" align="right" valign="middle" class="style2">哈式可磨系数(HGI)<span style="color: rgb(51, 51, 51); font-family: arial; font-size: 13px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">≥</span>:</td>
            <td width="151">&nbsp;<span class="f12">
              <input type="text" name="hgi" style="width:40px;">
            </span></td>
          </tr>
          <tr>
            <td height="80" align="right" valign="top" style="padding-top:10px;"><strong class="f12">备注:</strong></td>
            <td colspan="5" style="padding-top:10px;">&nbsp;<textarea name="beizhu" rows="4" style="width:95%;"></textarea></td>
            </tr>
        </table></td>
      </tr>
    </table>
  <tr>
    <td height="55" align="right" valign="middle">
	<table width="90" height="20" border="0" cellpadding="0" cellspacing="0" style="margin-right:15px;border:1px solid #9A9A99;">
      <tr>
        <td align="center" valign="middle" bgcolor="F3F3F3"><input type="submit" name="fabu" id="fabu" value="提交"/></td>
      </tr>
    </table>
  </td>
  <td align="left" valign="middle">
  <table width="90" height="20" border="0" cellpadding="0" cellspacing="0" style="margin-left:15px;border:1px solid #9A9A99;">
    <tr>
      <td align="center" valign="middle" bgcolor="F3F3F3"><input type="reset" name="fabu" id="fabu" value="清空"/></td>
    </tr>
  </table>
  </td>
  </tr>
</table>
</form>
	<a href="toTop">返回用户中心界面</a>
</body>
</html>
