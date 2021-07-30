<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		#info{margin-left:800px;border:1px solid red;}
	</style>
	<script type="text/javascript" src="js/jquery-1.8.3.js"></script>  
  </head>
  
  
  <body>
   <span id="info">
   	<form enctype="multipart/form-data" id="uploadForm">
  		<img alt="" id="personal_photo" onClick="personal_ajax()" src="images/default.jpg" style="width: 30px;height: 30px;"/>
  		<input type="file" name="mfile" id="file" style="display: none" />
   		${user.user_account},<a href="location.href=user/logout"  style="text-decoration: none;">【退出】</a>
    </form>
   </span>
   <hr style="border:3px solid gray;"/> 
      数据库:85<br/>
   java基础:68<br/>
     前端:88
   <hr/>
   <img src="images/白敬亭.jpg" style="width:300px;height: 300px;"><br/>
   	本人照片<br/>
   <a style="text-decoration: none;" href="file/download?fileName=白敬亭.jpg">下载</a>
  </body>
  
  <script type="text/javascript">
  		function personal_ajax(){
  			$("#file").click().change(function() {
			var photo_name = $("#personal_photo").attr("src").substr(7);//获取当前显示的图片的名称
		$.ajax({
			type : "post",
			url : "file/upload_personal_ajax",  //请求地址
			enctype : "multipart/form-data",  //提交类型--文件上传，类型必须是multipart/form-data
			data : new FormData($("#uploadForm")[0]),//新的文件对象（新的图片名称）
			processData : false, //data的值是FormData对象，不需要对数据进行处理
			contentType : false, //FormData对象由form表单构建                                         
			cache : false,
			success : function(msg) { //成功回调函数
				//alert("传回来的文件名称:"+msg);//msg----文件名
				//msg为拦截器中传回的信息--显示原来的图片
				$("#personal_photo").attr("src","images/" + msg);
				
			}
		});
	});
  		
  		}
  
  </script>
</html>
