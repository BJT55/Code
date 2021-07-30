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
<title>超级管理员首页</title>
<style>
        body,ul,li{
            margin:0;
            padding:0;
        }
        a{
            text-decoration: none;
            color:black;
        }
        .box{
            width:100%;
            height:800px;
            margin:40px auto;
        }
        h3{
            text-align:center;
        }
        ul{
            list-style: none;
            border-bottom:1px solid #00bbcc;
            overflow:hidden;
        }
        ul li{
            float:left;
            border:1px solid #00bbcc;
            margin-left:-1px;
            padding:6px 30px;
            border-top-left-radius:3px;
            border-top-right-radius:3px;
            border-bottom:none;
            cursor:pointer;
        }
        ul li:first-child{
            background:#00bbcc;
        }
        ul li:first-child a{
            color:white;
        }
        iframe{
            width:100%;
            height:100%;
            border:none;
            background:none;
        }
    </style>
</head>
<body>
	用户：<span style="color:#00bbcc;font-size:32px">${admin.admin_name}</span><a href="admin/logout"  style="text-decoration: none;">[退出]</a>
	<hr style="border:3px solid #00bbcc;"/>

<div class="box">
    <h3>操作</h3>
    <ul id="example1">
        <li><a href="admin/add" target="content1">增加新管理员</a></li>
        <li><a href="admin/modify" target="content1">修改管理员信息</a></li>
    </ul>
    <iframe src="admin/add" name="content1" ></iframe>
</div>
<script>
    var lis=document.querySelectorAll("#example1 li");
    var len=lis.length;
//切换页签样式：遍历li，给li绑定onclick事件
    for(var i=0;i<len;i++){
        lis[i].onclick=function(){
            //切换页签样式↓
            for(var i=0;i<len;i++){
                if(lis[i]==this){//判断是否为当前对象
                    lis[i].style.background="#00bbcc";
                    lis[i].querySelector("a").style.color="white";
                }else{
                    lis[i].style.background="white";
                    lis[i].querySelector("a").style.color="black";
                }
            }
        }
    }
</script>
</body>
</html>