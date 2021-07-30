<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title></title>
    <style>
    #info{
    margin-left:1500px;
    }
        body,ul,li{
            margin:0;
            padding:0;
        }
       a{
            text-decoration: none;
            color:black;
        }
        .box{
            
            height:1000px;
           
            border-radius:10px;
            margin:40px auto;
        }
        h3{
            text-align:center;
            font-family: 微软雅黑;
			font-size: 26px;
			font-weight: bold;
			
			color: #255e95;
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
            background:	#00bbcc;
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
<span id="info">当前用户:${user.c_name}</span> <a href="/seller/toTop">【退出】</a><br/>
<div class="box">
    <h3>个人中心挂牌管理</h3>
    <ul id="example1" >
        <li><a href="showMyBuyerAndSeller/all" target="content1">所有挂牌</a></li>
        <li><a href="showMyBuyerAndSeller/true" target="content1">已发布</a></li>
        <li><a href="showMyBuyerAndSeller/mtrue" target="content1">待审核</a></li>
        <li><a href="showMyBuyerAndSeller/false" target="content1">已下架</a></li>
    </ul>
    <iframe src="showMyBuyerAndSeller/all" name="content1" ></iframe>
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
                    lis[i].style.background="#00BFFF";
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

