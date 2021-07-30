<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body background="images/8.png" style=" background-repeat:no-repeat ;background-size:100% 100%;
background-attachment: fixed;">

  <script>
        function getVerify(obj) {
            obj.src = "/user/getVerify?"+Math.random();
        }
</script>

	${pageContext.request.contextPath}
	<fieldset style="border-color:#00BBFF; width: 500px;margin-left: 300px;">
		<legend style="text-align: center; border-color:blue;">用户登录</legend>
		<form action="${pageContext.request.contextPath}/user/login" method="post" style="text-align: center">
			
			用户名称:<input name="user_account"><br/>
			<span style="color:red;"> ${loginDefeat}</span><br>
			用户密码:<input type="password" name="user_pwd"><br/><br/>
						<div class="row" style="text-align: center">
		   <div class="col-xs-6 pull_left" style="text-align: center">
	           <div class="form-group" style="text-align: center">
	               <input class="form-control" type="tel" id="verify_input" name="code" placeholder="请输入验证码" maxlength="4">
	           </div>
		   </div>
		   <div class="col-xs-6 pull_left" style="text-align: center">
		       	<a href="javascript:void(0);" title="点击更换验证码">
		           <img id="imgVerify" src="/user/getVerify?"+Math.random() alt="更换验证码" height="36" width="100px" onclick="getVerify(this);">
		        </a>
		    </div>
		
		</div>
			<input type="submit" value="登录">&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="取消">
		</form>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<br/>还没有账号？<a href="user/toRegist">注册</a>
		                  忘记密码？<a href="user/toFindPwd">忘记密码</a>
	</fieldset>
</body>
</html>