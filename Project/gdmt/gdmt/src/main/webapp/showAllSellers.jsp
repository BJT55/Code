<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showAllSellers.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	table{width: 100%}
	table,tr,th{border:1px solid gray; border-collapse: collapse; }
	#info{margin-left:1200px;}
	</style>
	
  </head>
  
<body>
<form action="http://vip.biancheng.net/login.php" method="post">
     身份选择:
     <select onchange="window.location=this.value;">
         <option value="showAllSellers.jsp">卖方</option>
         <option value="showAllBuyers.jsp">买方</option>
      </select>
      <input type="button" id="1" value="买方用户" style="left:50px; width:80px;height:22px; background:white; border:;" />
</form>
	<span id="info">${seller.seller_cname}</span>
	<a href="seller/logout" style="text-decoration:none;">[退出]</a><br/>


	所有交易信息:<span id="message" style="color: blue;">${flag}</span>
	
	<table>
		<tr><td>卖方编号</td><td>单价</td><td>供应数量</td><td>发货港口</td><td>状态</td><td colspan="3">操作</td></tr>
		<c:forEach var="seller" items="${sellerList}">
			<tr>
				<td>${seller.seller_id}</td>
				<td>${seller.seller_price}</td>
				<td>${seller.seller_supnum}</td>
				<td>${seller.port}</td>
				<td>
    				<c:choose>
    					<c:when test="${seller.seller_state==true}">未摘牌</c:when>
    					<c:otherwise>未摘牌</c:otherwise>
    				</c:choose>
    			</td>
				<td style="text-align:center">
				<form action="deal/dealMake2">
				<br/>
				<input type="hidden" name="dealist" value="${user.c_name}">
				<input type="hidden" name="hanger" value="${seller.seller_cname}">
				<input type="hidden" name="goodid" value="${seller.seller_id}">
				<input type="submit" value="摘牌">
				</form>
				</td>
				
				<td><button onclick="checkBySellerId(${seller.seller_id})">查询</button></td>
			</tr>
		</c:forEach>
		
	</table>
	<br/>
	<div style="margin-left:100px">
		当前页:[<span id="message" style="color:#00bbff;">${pageInfo.pageNum}</span>]<br/>
		总页数:[<span id="message" style="color:#00bbff;">${pageInfo.pages}</span>]<br/>
		总数据:[<span id="message" style="color:#00bbff;">${pageInfo.total}</span>]<br/>

    	<button onclick="javaScript:location.href='seller/getAllSellers?pageNum=${pageInfo.pageNum-1}&maxPage=${pageInfo.pages}'">上一页</button>
    	<button onclick="javaScript:location.href='seller/getAllSellers?pageNum=${pageInfo.pageNum+1}&maxPage=${pageInfo.pages}'">下一页</button>
		
	</div>
	
</body>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>  
<script type="text/javascript">

function checkBySellerId(id){
	location.href="seller/checkBySellerId/"+id;
}

var pageIndex = 0; //初始页索引
var pageSize = '{$showrow}'; //每页显示的条数
var totalSize; //设置默认总数据条数
$(function() {
    totalSize = '{$count}'; //绑定后台字段
    //InitTable(0);
    window.flagp = 0;
    pagecallback(totalSize);
});
//定义回调函数
function PageCallback(index, jq) {
    InitTable(index);
};
//定义初始函数
function InitTable(pageIndex) {
    if(window.flagp) {
        $.ajax({
            type: "POST",
            dataType: "json",
            url: '/user/user_list_json',
            data: {
                "doajax": "ajaxpost",
                "pageIndex": pageIndex,
                "pageSize": pageSize,
                "workstate": '{$workstate}',
                "user_name": $("#user_name").val(),
                "s_state": $("#stateDdl").val(),
            },
            success: function(data) {
                ins(data);
            }
        });
    } else {
        $.ajax({
            type: "POST",
            dataType: "json",
            url: '/user/user_list_json',
            data: {
                "doajax": "ajaxpost",
                "pageIndex": pageIndex,
                "pageSize": pageSize,
                "workstate": '{$workstate}',
     
            },
            success: function(data) {
                ins(data);
            }
        });
    }
};
function ins(data){
    count = data.sum;
    $("#count").html(count);
    data = data.data;
    if(data != "") {
        var str = '';
        $.each(data, function(index, v) {
            str += ("<tr class=\"text-c\"> <td><input type=\"checkbox\" value='" + v.pf_id + "'   id='" + v.pf_id + "' name=\"userCheck\" onclick=\"swapCheck(this);\"></td><td class=\"idss\">" + v.pf_fileNumber + "</td><td class=\"idss\">" + v.pf_name + "</td><td class=\"idss\">" + v.pf_sex + "</td><td class=\"idss\">" + v.m_id_post + "</td><td class=\"idss\">" + v.m_id_diploma + "</td><td class=\"idss\">" + v.pf_phone + "</td><td class=\"idss\">" + v.pf_birthday + "</td><td class=\"idss\">" + v.pf_entrytime + "</td>{if $workstate==0}<td class=\"idss\">" + v.pf_departuretime + "</td>{/if}<td class=\"idss\">" + v.worktime + "</td><td class=\"td-status\"><span class=\"label radius " + v.pf_workingState.state_style + "\">" + v.pf_workingState.state_name + "</span></td><td class=\"idss\">" + v.pf_addtime + "</td><td class=\"td-manage\">\n   <a title=\"编辑\" href=\"javascript:;\" onclick=\"admin_edit('管理员编辑','/user/user_edit/pf_id/" + v.pf_id + "','" + v.pf_id + "','850','650')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6df;</i></a>\n   <a title=\"删除\" href=\"javascript:;\" onclick=\"del_obj(this," + v.pf_id + ",'/user/user_del')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6e2;</i></a>\n</td></tr>");
        });
        $("#tblData").html(str);
    } else {
        $("#tblData").html("没有数据");
    }
}
//查询
function search() {
    $.post("/user/user_list_json", {
        "doajax": "ajaxpost",
        "pageIndex": pageIndex,
        "pageSize": pageSize,
        "workstate": '{$workstate}',
        "user_name": $("#user_name").val(),
        "s_state": $("#stateDdl").val(),
    }, function(arg1) {
        window.flagp = 1;
        window.resdata = arg1;
        pagecallback(arg1.sum);
    });
};
function pagecallback(datasum, pageIndex) {
    $("#Pagination").pagination(datasum, { //显示底端的页码
        callback: PageCallback,
        first_text: '首页',
        pre_text: '上一页',
        net_text: '下一页',
        last_text: '尾页',
        items_per_page: pageSize, //显示条数
        num_display_entries: 3, //连续分页主体部分分页条目数
        current_page: pageIndex, //当前页索引
        num_edge_entries: 2
    });
}
</script>
<script>
$("#1").click(function(){
	alert("买家界面");
	location.href='buyer/getAllBuyers';
});
</script>

</html>