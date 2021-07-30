<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/style_link.css"/>
<title>用户商品管理中心</title>
<style type="text/css">
.biaoti{
	font-family: 微软雅黑;
	font-size: 26px;
	font-weight: bold;
	border-bottom:1px dashed #CCCCCC;
	color: #255e95;
}
</style>
</head>
<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0" align="center">
 
</table>
<table width="1407" height="55" border="1" align="center">
  <tr>
    <td width="117" height="49" align="center">当前角色</td>
    <td width="201" align="center">挂牌公司</td>
    <td width="199" align="center">挂牌人</td>
    <td width="174" align="center">所需煤种</td>
    <td width="312" align="center">收货地址</td>
    <td width="155" align="center">运输方式</td>
    <td width="158" align="center">状态</td>
    <td width="233" align="center" >操作</td>
  </tr>
  <c:forEach var="buyer" items="${buyerList}">
    			<tr>
    				<th>买方</th>
    				<th>${buyer.buyer_cname}</th>
    				<th>${buyer.buyer_man}</th>
    				<th>${buyer.buyer_kind}</th>
    				<th>${buyer.buyer_location} </th>
    				<th>${buyer.buyer_trans}</th>
    			<th>	<c:choose>
    						<c:when test="${buyer.buyer_state=='true'}"> 已发布</c:when>
    						<c:when test="${buyer.buyer_state=='mtrue'}"> 待审核</c:when>
    						<c:otherwise>已下架</c:otherwise>
    					</c:choose>
    				</button></th>
    					<th><button onclick="showBuyerDetailsByUserid(${buyer.buyer_id})">查看</button></th>
    		
    			</tr>
    		</c:forEach>
</table>
<br />
<br />


<table width="1407" height="55" border="1" align="center">
  <tr>
    <td width="92" height="49" align="center">当前角色</td>
    <td width="188" align="center">挂牌公司</td>
    <td width="178" align="center">煤原地</td>
    <td width="166" align="center">所需煤种</td>
    <td width="269" align="center">发货港口</td>
    <td width="156" align="center">煤湿度</td>
    <td width="124" align="center">状态</td>
    <td width="182" align="center" >操作</td>
  </tr>
  <c:forEach var="seller" items="${sellerList}">
    			<tr>
    				<th>卖方</th>
    				<th>${seller.seller_cname}</th>
    				<th>${seller.seller_origin}</th>
                    <th>${seller.port} </th>
    				<th>${seller.port}</th>
    				<th>${seller.moisture} </th>
    			
    			<th>	<c:choose>
    						<c:when test="${seller.seller_state=='true'}"> 已发布</c:when>
    						<c:when test="${seller.seller_state=='mtrue'}"> 待审核</c:when>
    						<c:otherwise>已下架</c:otherwise>
    					</c:choose>
    				</button></th>
    					<th><button onclick="showSellerDetailsByUserid(${seller.seller_id})">查看</button></th>
    					    				
    			</tr>
    		</c:forEach>
</table>
    		<br/>
     	</table>
    
		  <script type="text/javascript">
			 
			  function  showSellerDetailsByUserid(id)
			  {
				  location.href="showSellerDetailsByUserid/"+id;
			  }
			 
		
			  function  showBuyerDetailsByUserid(id)
			  {
				  location.href="showBuyerDetailsByUserid/"+id;
			  }
			 
         </script>

     
    
</body>
</html>
