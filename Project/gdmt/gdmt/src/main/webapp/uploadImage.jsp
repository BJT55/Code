<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>企业资质</title>
	<script type="text/javascript" src="js/jquery-1.8.3.js"></script>  
  </head>
  
  
<body background="images/bj.jpg" style=" background-repeat:no-repeat ;background-size:100% 100%;
background-attachment: fixed;">

<center><h1 style="background-color: blue;width: 200px; height: 30px;">
    <p style="color: white; font-family: 宋体; font-size: 20px;">企业资质上传</p>
</h1></center>
<p style="color: red; font-family: 宋体; font-size: 30px; font-width: 100px">[注]:仅支持( jpg, png, ico, bmp, jpeg ) 格式的图片上传 !</p>
<hr style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="100%" color=blue SIZE=5></hr>
<hr style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="100%" color=#1E90FF SIZE=3></hr>
<hr style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="100%" color=#00BFFF SIZE=2></hr>
<br>
  
   	<form enctype="multipart/form-data" id="uploadForm1" style="text-align: center">
   	<label>营业执照上传:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
  		<img alt="" id="upload1" onclick="uploadLicense()" src="images/upLoad.jpg" style="width: 30px;height: 30px;"/>
  		<input type="file" name="mfile" id="file1" style="display: none" />
   		<br>
   		
		<div style="border-top:1px dashed #cccccc;height: 10px;overflow:hidden"></div>
	</form>
	
	<form enctype="multipart/form-data" id="uploadForm2" style="text-align: center">
	<label>税务登记证上传:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
  		<img alt="" id="upload2" onclick="uploadTax()" src="images/upLoad.jpg" style="width: 30px;height: 30px;"/>
  		<input type="file" name="mfile" id="file2" style="display: none" />
   		<br>
		<div style="border-top:1px dashed #cccccc;height: 10px;overflow:hidden"></div>
	</form>
	
	<form enctype="multipart/form-data" id="uploadForm3" style="text-align: center">
	<label>组织机构代码证上传:&nbsp;</label>
  		<img alt="" id="upload3" onclick="uploadOrgnum()" src="images/upLoad.jpg" style="width: 30px;height: 30px;"/>
  		<input type="file" name="mfile" id="file3" style="display: none" />
   		<br>
		<div style="border-top:1px dashed #cccccc;height: 10px;overflow:hidden"></div>
	</form>
		
	<form enctype="multipart/form-data" id="uploadForm4" style="text-align: center">
	<label>开户许可证上传:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
  		<img alt="" id="upload4" onclick="uploadBank()" src="images/upLoad.jpg" style="width: 30px;height: 30px;"/>
  		<input type="file" name="mfile" id="file4" style="display: none" />
   		<br>
		<div style="border-top:1px dashed #cccccc;height: 10px;overflow:hidden"></div>
	</form>
    
    <form enctype="multipart/form-data" id="uploadForm5" style="text-align: center">
	&nbsp;<label>煤炭经营许可证上传:&nbsp;&nbsp;</label>
  		<img alt="" id="upload5" onclick="uploadPermit()" src="images/upLoad.jpg" style="width: 30px;height: 30px;"/>
  		<input type="file" name="mfile" id="file5" style="display: none" />
   		<br>
		<div style="border-top:1px dashed #cccccc;height: 10px;overflow:hidden"></div>
	</form>
	
	<form enctype="multipart/form-data" id="uploadForm6" style="text-align: center">
	<label>法人身份证上传:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
  		<img alt="" id="upload6" onclick="uploadCorporative()" src="images/upLoad.jpg" style="width: 30px;height: 30px;"/>
  		<input type="file" name="mfile" id="file6" style="display: none" />
   		<br>
		<div style="border-top:1px dashed #cccccc;height: 10px;overflow:hidden"></div>
	</form>
  
    <center>
    <input type="button" class="btn"  value="返回" onclick="javascrtpt:window.location.href='user/toTop'"/>
    </center>
    <br>
    <br>
    <hr style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="100%" color=#00BFFF SIZE=2></hr>
    <hr style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="100%" color=#1E90FF SIZE=3></hr>	
    <hr style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="100%" color=blue SIZE=5></hr>
   
<%--    	<br>营业执照:
   <a style="text-decoration: none;" href="file/download?fileName=${user.user_license }">下载</a>
 	<br>税务证:
   <a style="text-decoration: none;" href="file/download?fileName=ggg3.jpg">下载</a> --%>
   
   
   
   
  </body>
  <script type="text/javascript" src="js/jquery-1.8.3.js"></script> 
  <script type="text/javascript">
  		function uploadLicense(){
  			$("#file1").click().change(function() {
			var photo_name = $("#upload1").attr("src").substr(7);//获取当前显示的图片的名称
		$.ajax({
			type : "post",
			url : "file/uploadLicense",  //请求地址
			enctype : "multipart/form-data",  //提交类型--文件上传，类型必须是multipart/form-data
			data : new FormData($("#uploadForm1")[0]),//新的文件对象（新的图片名称）
			processData : false, //data的值是FormData对象，不需要对数据进行处理
			contentType : false, //FormData对象由form表单构建                                         
			cache : false,
			success : function (msg) { //成功回调函数
				alert(msg + "上传成功!");//msg----文件名
				//msg为拦截器中传回的信息--显示原来的图片
				$("#upload1").attr("src","images/" + msg);	
			},
			error: function (msg){
				alert("上传失败! 请检查格式或大小重新上传...");
			}
		});
	});
}
  </script>
  
  <script type="text/javascript">
  		function uploadTax(){
  			$("#file2").click().change(function() {
			var photo_name = $("#upload2").attr("src").substr(7);//获取当前显示的图片的名称
		$.ajax({
			type : "post",
			url : "file/uploadTax",  //请求地址
			enctype : "multipart/form-data",  //提交类型--文件上传，类型必须是multipart/form-data
			data : new FormData($("#uploadForm2")[0]),//新的文件对象（新的图片名称）
			processData : false, //data的值是FormData对象，不需要对数据进行处理
			contentType : false, //FormData对象由form表单构建                                         
			cache : false,
			success : function(msg) { //成功回调函数
				alert(msg + "上传成功");//msg----文件名
				//msg为拦截器中传回的信息--显示原来的图片
				$("#upload2").attr("src","images/" + msg);	
			},
			error: function (msg){
				alert("删除失败! 请检查格式或大小重新上传...");
			}
		});
	});
  		
  		}
  
  </script>
  
  <script type="text/javascript">
  		function uploadOrgnum(){
  			$("#file3").click().change(function() {
			var photo_name = $("#upload3").attr("src").substr(7);//获取当前显示的图片的名称
		$.ajax({
			type : "post",
			url : "file/uploadOrgnum",  //请求地址
			enctype : "multipart/form-data",  //提交类型--文件上传，类型必须是multipart/form-data
			data : new FormData($("#uploadForm3")[0]),//新的文件对象（新的图片名称）
			processData : false, //data的值是FormData对象，不需要对数据进行处理
			contentType : false, //FormData对象由form表单构建                                         
			cache : false,
			success : function(msg) { //成功回调函数
				alert(msg + "上传成功");//msg----文件名
				//msg为拦截器中传回的信息--显示原来的图片
				$("#upload3").attr("src","images/" + msg);	
			},
			error: function (msg){
				alert("删除失败! 请检查格式或大小重新上传...");
			}
		});
	});
}
  
  </script>
  
    <script type="text/javascript">
  		function uploadBank(){
  			$("#file4").click().change(function() {
			var photo_name = $("#upload4").attr("src").substr(7);//获取当前显示的图片的名称
		$.ajax({
			type : "post",
			url : "file/uploadBank",  //请求地址
			enctype : "multipart/form-data",  //提交类型--文件上传，类型必须是multipart/form-data
			data : new FormData($("#uploadForm4")[0]),//新的文件对象（新的图片名称）
			processData : false, //data的值是FormData对象，不需要对数据进行处理
			contentType : false, //FormData对象由form表单构建                                         
			cache : false,
			success : function(msg) { //成功回调函数
				alert(msg + "上传成功");//msg----文件名
				//msg为拦截器中传回的信息--显示原来的图片
				$("#upload4").attr("src","images/" + msg);	
			},
			error: function (msg){
				alert("删除失败! 请检查格式或大小重新上传...");
			}
		});
	});
}
  
  </script>
  
    <script type="text/javascript">
  		function uploadPermit(){
  			$("#file5").click().change(function() {
			var photo_name = $("#upload5").attr("src").substr(7);//获取当前显示的图片的名称
		$.ajax({
			type : "post",
			url : "file/uploadPermit",  //请求地址
			enctype : "multipart/form-data",  //提交类型--文件上传，类型必须是multipart/form-data
			data : new FormData($("#uploadForm5")[0]),//新的文件对象（新的图片名称）
			processData : false, //data的值是FormData对象，不需要对数据进行处理
			contentType : false, //FormData对象由form表单构建                                         
			cache : false,
			success : function(msg) { //成功回调函数
				alert(msg + "上传成功");//msg----文件名
				//msg为拦截器中传回的信息--显示原来的图片
				$("#upload5").attr("src","images/" + msg);	
			},
			error: function (msg){
				alert("删除失败! 请检查格式或大小重新上传...");
			}
		});
	});
}
  
  </script>
  
    <script type="text/javascript">
  		function uploadCorporative(){
  			$("#file6").click().change(function() {
			var photo_name = $("#upload6").attr("src").substr(7);//获取当前显示的图片的名称
		$.ajax({
			type : "post",
			url : "file/uploadCorporative",  //请求地址
			enctype : "multipart/form-data",  //提交类型--文件上传，类型必须是multipart/form-data
			data : new FormData($("#uploadForm6")[0]),//新的文件对象（新的图片名称）
			processData : false, //data的值是FormData对象，不需要对数据进行处理
			contentType : false, //FormData对象由form表单构建                                         
			cache : false,
			success : function(msg) { //成功回调函数
				alert(msg + "上传成功");//msg----文件名
				//msg为拦截器中传回的信息--显示原来的图片
				$("#upload6").attr("src","images/" + msg);	
			},
			error: function (msg){
				alert("删除失败! 请检查格式或大小重新上传...");
			}
		});
	});
}
  
  </script>
</html>