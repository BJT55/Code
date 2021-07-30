<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
border-color: gray;
}
td{
border-style:none;
height:20px;
}
</style>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>审核</title>
</head>
<body>
<table>
<caption>用户基本信息</caption>
<tr>
  <td align="right">企业名称：</td><td>${user.c_name}</td>
</tr>
<tr>
  <td align="right">企业简称：</td><td>${user.user_csimple}</td>
</tr>
<tr>
  <td align="right">法人代表：</td><td>${user.user_corporative}</td>
</tr>
<tr>
  <td align="right">注册地区：</td><td>${user.area}</td>
</tr>
<tr>
  <td align="right">注册资金（万元）：</td><td>${user.regist_fund}</td>
</tr>
<tr>
  <td align="right">联系人：</td><td>${user.user_contact}</td>
</tr>
<tr>
  <td align="right">联系电话：</td><td>${user.user_tel}</td>
</tr>
<tr>
  <td align="right">传真：</td><td>${user.fax}</td>
</tr>
<tr>
  <td align="right">企业邮箱:</td><td>${user.user_email}</td>
</tr>
</table>

<table>
<caption>相关资质查看</caption>
<tr>
  <td align="right">营业执照号：</td><td>${user.user_license}</td><td><a href="file/download?fileName=${user.user_license}">文件下载</a></td>
</tr>
<tr>
  <td align="right">税务登记号：</td><td>${user.user_tax}</td><td><a href="file/download?fileName=${user.user_tax}">文件下载</a></td>
</tr>
<tr>
  <td align="right">组织机构代码证号：</td><td>${user.user_orgnum}</td><td><a href="file/download?fileName=${user.user_orgnum}">文件下载</a></td>
</tr>
<tr>
  <td align="right">开户行：</td><td>${user.user_bankname}</td>
</tr>
<tr>
  <td align="right">开户行账号：</td><td>${user.user_bankaccount}</td><td><a href="file/download?fileName=${user.user_bankaccount}">文件下载</a></td>
</tr>
<tr>
  <td align="right">煤炭经营许可证号：</td><td>${user.user_permit}</td><td><a href="file/download?fileName=${user.user_permit}">文件下载</a></td>
</tr>
<tr>
  <td align="right">法人：</td><td>${user.user_corp}</td><td><a href="file/download?fileName=${user.user_corp}">文件下载</a></td>
</tr>
<tr>
  <td align="right">可控煤炭资源（煤源、储煤场地）情况：</td><td>${user.user_condition}</td>
</tr>
<tr>
  <td align="right">运输保障能力：</td><td>${user.user_trans}</td>
<tr>
  <td align="right">供应商简介：</td><td><textarea cols="50" rows="10" readonly>${user.user_brief}</textarea></td>
</tr>
<tr>
  <td align="right">供应商业绩：</td><td>${user.user_performance}</td>
</tr>
</table>

<form action="admin/updateUserView">
<table>
<caption>审核</caption>
	<tr>
	<td><input type="hidden" name="user_id" value="${user.user_id}"></td>
		<td align="right">审核意见：</td>
		<td><textarea name="user_view" class="comments" rows="10" cols="100">${user.user_view}</textarea></td>
	</tr>
	<tr>
    	<td colspan="3" style="text-align:center;">
    	<input type="submit"  id="submit" value="保存">&nbsp;&nbsp;&nbsp;
    	<input type="reset" id="reset" value="取消">
    	</td>
    </tr>
</table>
</form>
<table>
	<tr>
		<td colspan="3" style="text-align:center;">
		<button onclick="userPass(${user.user_id})">通过</button>&nbsp;&nbsp;
		<button onclick="userFailToPass(${user.user_id})">驳回</button>&nbsp;&nbsp;
		<input type="button" name="back" onclick="javascript:history.back(-1);" value="返回">
		</td>
	</tr>
</table>
</body>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>  
<script type="text/javascript">
  	function userPass(id){
  		location.href="admin/userPass/"+id;
  	}
  	function userFailToPass(id){
  		location.href="admin/userFailToPass/"+id;
  	}

</script>
</html>