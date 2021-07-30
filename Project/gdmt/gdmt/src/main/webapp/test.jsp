<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.sql.*" errorPage=""   autoFlush="false" buffer="500kb" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>全国煤炭交易中心 - 首页</title>
<link href="css/common.css" rel="stylesheet" type="text/css">
<link href="css/swiper.min.css" rel="stylesheet" type="text/css">
<style type="text/css">
.body {
    height: 640px;
}
.body .slide {
    height: 640px;
    background-position: center center;
}
.slide.p01 {
    background-image: url(image/sl10.jpg);
}
.slide.p02 {
    background-image: url(image/sl11.jpg);
}
.slide.p03 {
    background-image: url(image/sl12.jpg);
}
.slide.p04 {
    background-image: url(image/sl13.jpg);
}
.swiper-pagination {
    position: inherit;
    text-align: right;
}
.swiper-pagination-bullets {
    margin-top: 16px;
}
.swiper-pagination-bullet {
    width: 16px;
    height: 16px;
    background-color: #fff;
    opacity: .8;
    margin-right: 10px;
}
.swiper-pagination-bullet-active {
    background-color: #F18E1D;
}
.body .content {
    position: absolute;
    z-index: 13;
    width: 722px;
    margin-left: 558px;
    margin-top: 70px;
    font-size: 14px;
}
.body .content .indices {
    height: 222px;
    padding: 10px;
    background-color: rgba(0,59,72,.8);
    color: #fff;
}
.clock {
    float: left;
    font-family: Arial Narrow;
    vertical-align: baseline;
    padding: 12px 0 0 20px;
}
.clock .date {
    font-size: 32px;
    margin-right: 10px;
}
.clock .time {
    color: #59BDED;
    font-size: 16px;
}
.body .content .indices .more {
    height: 43px;
    margin: 8px 20px;
    padding-right: 20px;
    line-height: 43px;
    text-align: right;
    background: url(image/arr_r.png) no-repeat center right;
    background-size: contain;
    color: #F18E1D;
}
.body .content .indices table {
    border-spacing: 18px 0;
    width: 100%;
}
.body .content .indices td {
    text-align: center;
}
.body .content .indices tr.row1 td {
    padding: 14px 0;
}
.body .content .indices tr.row2 td {
    padding: 6px 0;
    border-top: 1px solid #59BDED;
    border-bottom: 1px solid #59BDED;
    font-family: Arial Narrow;
    font-size: 52px;
}
.body .content .indices tr.row3 td {
    padding-top: 10px;
    font-size: 12px;
}
.body .content .notice {
    position: absolute;
    z-index: 14;
    margin-top: 8px;
    height: 154px;
    width: 679px;
    overflow: hidden;
    background-color: rgba(255,255,255,.5);
    border-top: 4px solid #F18E1D;
    padding: 12px 22px;
}
.body .content .notice .icon {
    position: absolute;
    padding: 4px 0 4px 50px;
    width: 56px;
    background: url(image/notice.png) left center no-repeat;
    background-size: 35px 32px;
    font-size: 18px;
    color: #0088A8;
    border-right: 1px solid #F18E1D;
}
.body .content .notice .expand {
    float: right;
    width: 40px;
    height: 24px;
    margin-top: 126px;
    background: url(image/arr_d.png) center center no-repeat;
    background-size: 24px 8px;
    cursor: pointer;
}
.body .content .notice .expand.on {
    background-image: url(image/arr_u.png);
}
.body .content .notice .list {
    padding: 0 80px 0 120px;
    height: 448px;
}
.body .content .notice .list p {
    margin: 0;
    margin-bottom: 22px;
    font-size: 14px;
    color: #fff;
    line-height: 170%;
}
.body .content .notice .list p.title {
    font-size: 18px;
    font-family: Arial Narrow;
    color: #F18E1D;
    margin-bottom: 0;
    line-height: 135%;
}
.body .content .notice a {
	color: #fff;
    text-decoration: none;
}
.body .pagination {
    padding-top: 290px;
    text-align: right;
}
</style>
<meta name="viewport" content="width=1920, initial-scale=0.4, user-scalable=yes">
<script type="text/javascript">
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "https://hm.baidu.com/hm.js?e18f978b361616198f7f6ad8b052f12f";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>

</head>

<body>
<div class="header">
    <div class="menu">
        <div class="panel">
            <div style="float:right;padding-right:8px;font-weight:normal;">欢迎</div>
            <div class="status"><img src="images/one.png" width="27" height="27" alt="" style="margin-left:8px;"><img src="images/two.png" width="27" height="27" alt="" style="margin-left:0;"><a href="seller/getAllSellers" target="_blank" rel="noreferrer">交易平台</a>
                <ul>
                    <li><a href="index" target="_blank">注册登录</a></li>
                    <li><a href="/User/loginnn">用户中心</a></li>
                    <!-- <li><a href="category.html">交易品种</a></li> -->
                      <!-- <li><a href="contact.html">管理员</a></li> -->
                    <!-- <li><a href="jobs.html">英才招聘</a></li> -->
                </ul>
            </div>
        </div>
    </div>
    <div class="panel">
        <div class="logo"><img src="images/logo.png" width="223" height="63" alt=""></div>
        <div class="nav">
            <ul>
                <li class="on">首页</a></li>
                <li ><a href="deal/getAllDeals/${user.c_name}">订单信息</a></li>
                <li id="two"><a href="user/toUpLoadImage">企业资质上传</a></li>
                <li><a href="buyer/toBuyerGoods">买方挂牌</a></li>
                <li><a href="seller/toSellerGoods">卖方挂牌</a></li>
                <!-- <li><a href="bp.html">业务流程</a></li> -->
                <li><a href="https://www.mycoal.cn/news/tags-meitan/">资讯中心</a></li>
            </ul>

                <ul></ul>
                <ul></ul>
                <ul></ul>
                <!-- <ul></ul> -->
                <ul></ul>
                <ul></ul>
        </div>
    </div>
</div>
<script type="text/javascript">initMenu();</script>
<div class="body">
    <div class="panel">
        <div class="content">
            <div class="indices" style="display:none;">
                <div class="clock"><span class="date">0000-00-00</span><span class="time">00:00:00</span></div>
                <table>
                    <tr>
                        <td colspan="6" style="border-bottom: 1px solid #CCC;"></td>
                    </tr>
                    <tr class="row1">
                        <td colspan="2">NCEI（下水煤价格指数）</td>
                        <td colspan="2">NCEI（直达煤价格指数）</td>
                        <td colspan="2">NCEI（海运价格指数）</td>
                    </tr>
                    <tr class="row2">
                        <td colspan="2" style="color:#CC9F5C;">--</td>
                        <td colspan="2">--</td>
                        <td colspan="2" style="color:#59BDED;">--</td>
                    </tr>
                    <tr class="row3">
                        <td colspan="6" style="text-align:right;">全国煤炭交易中心指数待开业后发布</td>
                    </tr>
                    <!-- 
                    <tr class="row3">
                        <td>环比+0.20</td>
                        <td>环比增幅(%)+0.13</td>
                        <td>环比0.00</td>
                        <td>环比增幅(%)0.00</td>
                        <td>环比+0.22</td>
                        <td>环比增幅(%)+0.16</td>
                    </tr>
                     -->
                </table>
            </div>
            <div class="notice">
                <div class="icon">中心<br>公告</div>
                <div class="expand" onClick="expand(this)"></div>
                <div class="list dark">
                    <p class="">2021-06-23<br>关于山西华阳集团新能股份有限公司公开竞价交易的公告</p>
                    <p><a href="1.html" target="_blank">山西华阳集团新能股份有限公司拟于2021年6月24日在我交易平台以竞价方式进行对外销售景福矿洗混块...全国煤炭交易中心有限公司本着公开、公平、公正、诚信的原则，邀请符合条件的交易会员参加</a></p>
                    
                    <p class="">2021-06-18<br>关于非工作日期间资金结算功能说明的公告</p>

                </div>
            </div>
            <div class="pagination">
                <div class="swiper-pagination"></div>
            </div>
        </div>
    </div>
    <img src="images/k.jpg" width="1220" height="700" style="position:absolute;left:0px;top:230px"/>
    <div class="swiper-container">

        </div>
    </div>
</div>
<div class="footer">
    <div class="panel">
        <div class="lists">
            <div class="list dark">
                <div class="title">新闻中心</div>
                <div class="content">
                                    <p><a href="news-2a8123177ffd4320acdb00a91ec4b63e.html" target="_blank">预计今年新增煤炭先进产能超过2亿吨</a></p>
                    <p><a href="news-261b98755df8475999b14016dbdbdc24.html" target="_blank">上半年我国原煤产量19.5亿吨</a></p>
                    <p><a href="news-61fd7174d68c4005a095fa7226ea02ff.html" target="_blank">全国碳市场首日成交2.1亿　后续价格仍有上涨空间</a></p>
                </div>
                <div class="btn more"><img src="images/icon_01.png" width="59" height="60" alt=""><a href="news.html" target="_blank">更多</a></div>
            </div>
            <div class="list dark">
                <div class="title">交易平台</div>
                <div class="content">
                    <p><a href="" target="_blank" rel="noreferrer">交易服务</a></p>
                    <p>物流服务</p>
                    <p>质检服务</p>
                    <p><a href="" target="_blank" rel="noreferrer">结算服务</a></p>
                </div>
                <div class="btn more"><img src="images/icon_02.png" width="58" height="60" alt=""><a href="" target="_blank" rel="noreferrer">进入</a></div>
            </div>
            <div class="list dark">
                <div class="title">煤炭价格指数</div>
                <div class="content">
                    <p><a href="http://www.cqcoal.com/" target="_blank">秦皇岛煤炭网</a></p>
                    <p><a href="https://www.cctd.com.cn/" target="_blank">煤炭市场网</a></p>
                    <p><a href="http://www.cec.org.cn/" target="_blank">中国电力企业联合会</a></p>
                    <p><a href="http://jgjc.ndrc.gov.cn/" target="_blank">国家发改委价监中心</a></p>
                </div>
                <div class="btn"><img src="images/icon_03.png" width="58" height="60" alt=""></div>
            </div>
            
        </div>
    </div>
    <div class="copyright">
        <table align="center">
        <tr>
        <td><a href="https://trust.china-railway.com.cn:8079/webca/verifySrc?webid=20200904010100001" target="_blank" style="float:left;"><img alt="" src="/image/rz.png" height="81" weight="64" border="0"></a></td>
        <td> &copy; 2021 全国煤炭交易中心<br>
    NATIONAL COAL EXCHANGE CO.,LTD. ALL RIGHTS RESERVED,COPYRIGHT 2021<br>
    <a href="https://beian.miit.gov.cn/" target="_blank">京ICP备20018636号-1</a> &nbsp;&nbsp;&nbsp;&nbsp;<img alt="" src="/image/jbtb.png" height="20" weight="20" border="0"></td>
        </tr>
        </table>
    </div>
</div>

<div id="imgDiv" style="z-index:100;left:1600px;width:180px;position:absolute;top:193px;height:160px;border:2px solid #59BDED;text-align:center;visibility:visible;background-color:#fff;">
    <a href="2021.html" target="_blank" style="color:#59BDED;font-size:20px;font-weight:bold;"><table width="180" height="160">

</table></a>
</div>


<script>
$("#two").click(function(){
	alert("欢迎进入交易中心");
	location.href='seller/getAllSellers';
});
</script>
</body>
</html>