<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
   <script type="text/javascript">
function display_alert()
  {
  alert("I am an alert box!!")
  }
</script>
  <body>
  <body background="images/8.png" style=" background-repeat:no-repeat ;background-size:100% 100%;
background-attachment: fixed;">
<fieldset style="border-color:#00BBFF; width: 600px;margin-left: 600px;">
  	<script>
        function getVerify(obj) {
            obj.src = "/user/getVerify?"+Math.random();
        }
</script>
  	<form action="user/regist" method="post">
    	用户名称:<input name="user_account" id="username" onBlur="ajaxSubmit()"> <span style="color:red;">${registDefeat}</span><span id="state">${loginError}</span><br>
    	用户密码:<input type="password" name="user_pwd"><br>
    	<!--用户性别:男<input type="radio" value="男" checked name="sex">
    		      女<input type="radio" value="女" name="sex"><br>  -->
    		               公司名称:<input type="text" name="c_name"><br>
    		               公司简称:<input type="text" name="user_csimple"><br>
    		                法人代表:<input type="text" name="user_corporative"><br>
                                                         注册地址:<input type="text" name="address"><br>
                                                            公司地址:<input type="text" name="area"><br>
                                                                   注册资金:<input type="text" name="regist_fund"><br>
                                                                                        联系人:<input type="text" name="user_contact"><br>
                                                                                                           联系电话:<input type="text" name="user_tel"><br>
                               传真:<input type="text" name="fax"><br>                                                                                    
    		          邮箱:<input type="text" name="user_email"><br>
    		          		<div class="row">
		   <div class="col-xs-6 pull_left">
	           <div class="form-group">
	               <input class="form-control" type="tel" id="verify_input" name="code" placeholder="请输入验证码" maxlength="4">
	           </div>
		   </div>
		   <div class="col-xs-6 pull_left">
		       	<a href="javascript:void(0);" title="点击更换验证码">
		           <img id="imgVerify" src="/user/getVerify?"+Math.random() alt="更换验证码" height="36" width="100px" onclick="getVerify(this);">
		        </a>
		    </div>
		
		</div>
    	<input type="submit" id="submit" value="注册会员">&nbsp;&nbsp;&nbsp;
    	<input type="reset" value="取消">
  </form>
  	已有账号？<a href="/user/toLogin">登录</a>  <!-- 不允许页面直接跳转页面 -->
    	</fieldset>
  </body>
</html>
