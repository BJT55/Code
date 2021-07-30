<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
 <base href="<%=basePath%>">
    <meta charset="utf-8"/>
    <title></title>
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
            width:1000px;
            height:600px;
            border:1px solid #00bbff;
            border-radius:10px;
            margin:40px auto;
        }
        h3{
            text-align:center;
        }
        ul{
            list-style: none;
            border-bottom:1px solid #00bbff;
            overflow:hidden;
        }
        ul li{
            float:left;
            border:1px solid #00bbff;
            margin-left:-1px;
            padding:6px 30px;
            border-top-left-radius:3px;
            border-top-right-radius:3px;
            border-bottom:none;
            cursor:pointer;
        }
        ul li:first-child{
            background:#00bbff;
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
<body background="images/white.png" style=" background-repeat:no-repeat ;background-size:100% 100%;
background-attachment: fixed;">
<a href="/logout" style="text-decoration:none;">[退出]</a><br/>
<div class="box">
    <h3>交易中心</h3>
    
    <ul id="example1">
        <li><a href="seller/getAllSellers" target="content1">卖方</a></li>
        <li><a href="buyer/getAllBuyers" target="content1">买方</a></li>
    </ul>
    <iframe src="seller/getAllSellers" name="content1" ></iframe>
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
                    lis[i].style.background="#oobbff";
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