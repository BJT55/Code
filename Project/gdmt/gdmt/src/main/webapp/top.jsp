<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.sql.*" errorPage="" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%><html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/layout.css">
<title>top</title>
</head>
<script language="JavaScript" src="js/validate.js"></script>
<script language="JavaScript" type="text/JavaScript"></script>

<body>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<div id="container">

<div id="header" style="position:relative">
        <img src="images/1.jpg" width="1200" height="138" style="position:absolute;left:0px;top:0px">
        <img src="images/2.png" style="position:absolute;left:18px;top:8px">
        <img src="images/3.png" id="one" style="position:absolute;left:100px;top:90px"/>
        <img src="images/4.png" id="two" style="position:absolute;left:400px;top:90px">
        <img src="images/5.png" id="three" style="position:absolute;left:700px;top:90px">
        <img src="images/6.png" id="four" style="position:absolute;left:1000px;top:90px"></div>

</div>
<HR style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="100%" color=#00BBFF SIZE=3>
  
  <div id="main">
    <div class="cat" style="position:relative"><img src="images/7.png" width="300" height="400" />
    <input type="button" id="five" value="事务中心" style="position:absolute; left:50px; width:180px;height:30px; background:#00BBFF; border:none; top:30px;" />
	<input type="button" id="six" value="用户中心" style="position:absolute; left:50px; width:180px;height:30px; background:#00BBFF; border:none; top:75px;" />
	<input type="button" id="seven" value="卖家挂牌" style="position:absolute; left:50px; width:180px;height:30px; background:#00BBFF; border:none; top:120px;" />
	<input type="button" id="eight" value="买家挂牌" style="position:absolute; left:50px; width:180px;height:30px; background:#00BBFF; border:none; top:165px;" />
	<input type="button" id="nine" value="企业资质上传" style="position:absolute; left:50px; width:180px;height:30px; background:#00BBFF; border:none; top:210px;" />
	<input type="button" id="ten" value="供应商管理" style="position:absolute; left:50px; width:180px;height:30px; background:#00BBFF; border:none; top:255px;" />
	<input type="button" id="eleven" value="账户管理" style="position:absolute; left:50px; width:180px;height:30px; background:#00BBFF; border:none; top:300px;" />
	</div> 

    <div class="content" style="position:relative">
     <img src="images/8.png" width="1000" height="400"; />
     <input type="button" id="twelve" value="通知公告" style="position:absolute; left:50px; width:180px;height:30px; background:#77DDFF; border:none; top:30px;" />
     <div>
     <img src="images/10.png" id="three" style="position:absolute;left:50px;top:60px">
     </div>
     <input type="button" id="twelve" value="采购审批表" style="position:absolute; left:50px; width:180px;height:30px; background:#77DDFF; border:none; top:250px;" />
    
    </div>
    <div class="sidebar"></div>
  </div>
  

  
</div> 
<script>
$("#one").click(function(){
	location.href='';
});
</script>

<script>
$("#two").click(function(){
	alert("欢迎进入交易中心");
	location.href='seller/getAllSellers';
});
</script>

<script>
$("#three").click(function(){
	location.href='https://www.mycoal.cn/news/tags-meitan/';
});
</script>

<script>
$("#four").click(function(){
	location.href='http://www.baidu.com';
});
</script>

<script>
$("#five").click(function(){
	location.href='http://www.baidu.com';
});
</script>

<script>
$("#six").click(function(){
	location.href='/User/loginnn';
});
</script>

<script>
$("#seven").click(function(){
	location.href='seller/toSellerGoods';

});
</script>

<script>
$("#eight").click(function(){
	location.href='buyer/toBuyerGoods';
});
</script>

<script>
$("#nine").click(function(){
	location.href='user/toUpLoadImage';
});
</script>

<script>
$("#ten").click(function(){
	location.href='http://www.baidu.com';
});
</script>

<script>
$("#twelve").click(function(){
	location.href='News.jsp';
});
</script>

	</body>
</html>