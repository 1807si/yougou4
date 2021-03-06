<%--
  Created by IntelliJ IDEA.
  User: MY HP
  Date: 2019/1/19
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>优购时尚商城-时尚服饰鞋包网购首选-优生活，购时尚！</title>
    <meta name="keywords"  content="优购网,优购时尚商城,优购网上鞋城"/>
    <meta name="description" content="优购网-时尚服饰鞋包网购首选,经营耐克、阿迪达斯、Kappa、匡威、百丽、他她、天美意、森达等众多知名品牌,100%专柜正品,免费送货,10天退换货,提供愉悦购物体验!"/>
    <link rel="stylesheet" href="/static/assets/css/index.css" />
    <link rel="stylesheet" href="/static/assets/css/normalize.css" />
    <link rel="stylesheet" href="/static/assets/css/nav.css" />
</head>
<body>
<!--头部-->
<div class="header">
    <div class="top">
        <a href="##"></a>
    </div>
    <!--导航条-->
    <jsp:include page="../includes/nav.jsp"/>
    <!--logo-->
    <div class="logo-wrap clear wid">
        <!--logo图标-->
        <div class="logo flaot">
            <a href="##"></a>
        </div>
        <!--搜索框-->
        <form class="flaot">
            <input name="name" type="text" />
            <a href="##"></a>

        </form>
        <div class="list">
            <a href="##">运动18年新品</a>|
            <a href="##">卫衣</a>|
            <a href="##" class="color">跑步鞋</a>|
            <a href="##">专柜同款</a>|
            <a href="##">冲锋衣</a>|
            <a href="##">女靴</a>|
            <a href="##">夹克</a>
        </div>
        <!--购物车-->
        <div class="cart">
            <a href="cart.html">
                <i class="car"></i>
                <span>购物车(<em>0</em>)件</span>
                <i class="tip"></i>
            </a>
        </div>
        <div class="text color">百丽国际旗下购物网站</div>
    </div>
</div>
<!--商品分类导航-->
<div class="yg-nav">
    <div class="rel wid z-ind">
        <!--商品导航-->
        <h2 class="abs"><a href="##">全部商品分类</a></h2>
        <ul class="goods-nav">
            <li><a href="##">运动馆</a></li>
            <li><a href="##">鞋靴馆</a></li>
            <li><a href="##">儿童馆</a></li>
            <li><a href="##" class="color">积分换券</a></li>
            <li class="right"><a href="##">秒杀</a></li>
        </ul>
    </div>
</div>
<!--商品分类列表-->
<div class="rel wid goods">
    <ul class="goods-list rel">
        <li>
            <i></i><h4><a href="##">女鞋</a></h4>
            <p><a href="##">美靴上新</a> <a href="##">专柜同款</a></p>
            <!--二级导航-->
            <div class="sub">
                <a href="javascript:;"><img src="/static/assets/img/bee.jpg" /></a>
                <p>
                    <a href="javascript:;">美靴上新</a>
                    <a href="javascript:;">短靴</a>
                    <a href="javascript:;">美靴上新</a>
                    <a href="javascript:;">短靴</a>
                    <a href="javascript:;">短靴</a>
                    <a href="javascript:;">美靴上新</a>
                    <a href="javascript:;">短靴</a>
                    <a href="javascript:;">美靴上新</a>
                </p>
                <a href="javascript:;"><img src="/static/assets/img/edb.jpg" /></a>
                <p>
                    <a href="javascript:;">美靴上新</a>
                    <a href="javascript:;">短靴</a>
                    <a href="javascript:;">美靴上新</a>
                    <a href="javascript:;">短靴</a>
                    <a href="javascript:;">短靴</a>
                    <a href="javascript:;">美靴上新</a>
                    <a href="javascript:;">短靴</a>
                    <a href="javascript:;">美靴上新</a>
                </p>
            </div>
        </li>
        <li>
            <i></i><h4><a href="##">男鞋</a></h4>
            <p><a href="##">时尚男鞋</a> <a href="##">专柜同款</a></p>
        </li>
        <li>
            <i></i><h4><a href="##">运动</a></h4>
            <p><a href="##">新品上市</a> <a href="##">运动鞋</a> <a href="##">夹克</a></p>
        </li>
        <li>
            <i></i><h4><a href="##">户外</a></h4>
            <p><a href="##">抓绒衣裤</a> <a href="##">冲锋衣</a> <a href="##">越野鞋</a></p>
        </li>
        <li>
            <i></i><h4><a href="##">童装/童鞋</a></h4>
            <p><a href="##">外套</a> <a href="##">裤装</a> <a href="##">跑步鞋</a></p>
        </li>
        <li>
            <i></i><h4><a href="##">箱包/配饰</a></h4>
            <p><a href="##">女包</a> <a href="##">男包</a> <a href="##">饰品</a></p>
        </li>
    </ul>
    <!--轮播-->
    <div class="lunbo abs">
        <div class="scroll">
            <img class="first" src="" />
            <img src="" />
            <img src="" />
            <img src="" />
            <img src="" />
        </div>
        <div class="btn">
            <span class="hover">1</span>
            <span>2</span>
            <span>3</span>
            <span>4</span>
            <span>5</span>
        </div>

    </div>
</div>
<!--主体部分-->
<div class="main wid">
    <!--热门品牌-->
    <div class="hot">
        <div class="hot-title title clear">
            <p class="flaot-l">热门品牌<span>HOT BRAND</span></p>
            <p class="flaot-r">more ></p>
        </div>
        <div class="hot-wrap wrap">
            <ul class="/static/assets/img clear">
                <li><a href="details.html"><img src=""/></a></li>
                <li><a href="details.html"><img src=""/></a></li>
                <li><a href="details.html"><img src=""/></a></li>
                <li><a href="details.html"><img src=""/></a></li>
            </ul>
            <div class="hot-tab rel">
                <div class="hot-list">
                    <ul class="abs">
                        <li class="clear">
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                        </li>

                        <li>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                        </li>
                        <li>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                            <a href="javascript:;"></a>
                        </li>
                    </ul>
                </div>

                <a href="javascript:;" class="abs" id="btn1"></a>
                <a href="javascript:;" class="abs" id="btn2"></a>
            </div>
        </div>
    </div>
    <!--女鞋馆-->
    <div class="women">
        <div class="cap title clear">
            <p class="flaot-l"><a href="#">女鞋馆</a><span>WOMEN'S SHOES</span></p>
            <p class="flaot-r more"><a href="##">MORE ></a></p>
        </div>
        <div class="women-wrap wrap clear">
            <div class="left">
                <img src="/static/assets/img/01.jpg" />
                <ul class="clear">
                    <li><a href="#"><img src="/static/assets/img/belle.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/tata.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/teenmix.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/staccato.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/bata.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/hushpuppies.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/basto.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/crocs.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/innet.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/joypeace.jpg" /></a></li>
                </ul>
            </div>
            <div class="center">
                <a href="##">
                    <img src="" />
                </a>
            </div>
            <div class="right">
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
            </div>
        </div>
    </div>

    <!--男鞋馆-->
    <div class="women">
        <div class="cap title clear">
            <p class="flaot-l"><a href="#">男鞋馆</a><span>MEN'S SHOES</span></p>
            <p class="flaot-r more"><a href="##">MORE ></a></p>
        </div>
        <div class="women-wrap wrap clear">
            <div class="left">
                <img src="/static/assets/img/02.jpg" />
                <ul class="clear">
                    <li><a href="#"><img src="/static/assets/img/belle.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/tata.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/teenmix.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/staccato.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/bata.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/hushpuppies.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/basto.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/crocs.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/innet.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/joypeace.jpg" /></a></li>
                </ul>
            </div>
            <div class="center">
                <a href="##">
                    <img src="" />
                </a>
            </div>
            <div class="right">
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
            </div>
        </div>
    </div>
    <!--运动户外馆-->
    <div class="women">
        <div class="cap title clear">
            <p class="flaot-l"><a href="#">运动/户外馆</a><span>SPORT/Outdoor Goods</span></p>
            <p class="flaot-r more"><a href="##">MORE ></a></p>
        </div>
        <div class="women-wrap wrap clear">
            <div class="left">
                <img src="/static/assets/img/03.jpg" />
                <ul class="clear">
                    <li><a href="#"><img src="/static/assets/img/belle.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/tata.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/teenmix.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/staccato.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/bata.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/hushpuppies.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/basto.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/crocs.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/innet.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/joypeace.jpg" /></a></li>
                </ul>
            </div>
            <div class="center">
                <a href="##">
                    <img src="" />
                </a>
            </div>
            <div class="right">
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
            </div>
        </div>
    </div>
    <!--孕婴童-->
    <div class="women">
        <div class="cap title clear">
            <p class="flaot-l"><a href="#">孕婴童</a><span>CHILDREN'S</span></p>
            <p class="flaot-r more"><a href="##">MORE ></a></p>
        </div>
        <div class="women-wrap wrap clear">
            <div class="left">
                <img src="/static/assets/img/04.jpg" />
                <ul class="clear">
                    <li><a href="#"><img src="/static/assets/img/belle.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/tata.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/teenmix.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/staccato.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/bata.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/hushpuppies.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/basto.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/crocs.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/innet.jpg" /></a></li>
                    <li><a href="#"><img src="/static/assets/img/joypeace.jpg" /></a></li>
                </ul>
            </div>
            <div class="center">
                <a href="##">
                    <img src="" />
                </a>
            </div>
            <div class="right">
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
                <a href="##"><img src="" class="simg" /></a>
            </div>
        </div>
    </div>
</div>

<!--底部-->
<div class="footer">
    <div class="fot-top">
        <div class="wid">
            <ul class="pane">
                <li>
                    <i></i>
                    <a href="##"><span class="color">正品</span>保证</a>
                </li>
                <li>
                    <i></i>
                    <a href="##"><span class="color">10天</span>退换货</a>
                </li>
                <li>
                    <i></i>
                    <a href="##"><span class="color">10天调价</span>补差额</a>
                </li>
                <li>
                    <i></i>
                    <a href="##"><span class="color">09:00-23:00</span>在线客服</a>
                </li>
            </ul>
            <div class="list clear">
                <ul>
                    <p>新手帮助</p>
                    <li><a href="##">交易条款协议</a></li>
                    <li><a href="##">注册新用户</a></li>
                    <li><a href="##">会员积分详情</a></li>
                </ul>
                <ul>
                    <p>购物指南</p>
                    <li><a href="##">订购流程</a></li>
                    <li><a href="##">验货与签收</a></li>
                    <li><a href="##">订单配送查询</a></li>
                </ul>
                <ul>
                    <p>支付/配送</p>
                    <li><a href="##">支付方式</a></li>
                    <li><a href="##">配送方式</a></li>
                    <li><a href="##">配送时间及运费</a></li>
                </ul>
                <ul>
                    <p>售后服务</p>
                    <li><a href="##">退换货政策</a></li>
                    <li><a href="##">退款说明</a></li>
                    <li><a href="##">发票制度</a></li>
                </ul>
                <ul>
                    <p>会员服务</p>
                    <li><a href="##">找回密码</a></li>
                    <li><a href="##">联系我们</a></li>
                </ul>
                <ul>
                    <p>优购客服</p>
                    <li class="seek"><i></i><a href="##">在线咨询</a></li>
                    <li><a href="##">联系我们</a></li>
                    <li>Email：<span class="color">ygservice@belle.com.cn</span></li>
                    <li>微信客服：<span class="color">优购时尚商城</span></li>
                </ul>
                <ul>
                    <img src="/static/assets/img/qrcode.jpg" />
                    <img src="/static/assets/img/wechat.png" />
                </ul>
            </div>
        </div>
    </div>
    <!--底部的下半部分-->
    <div class="fot-bot">
        <div class="wid">
            <a href="##"></a><img src="/static/assets/img/endlogo.gif" class="logo-img" /></a>
            <div class="right">
                <p>
                    <a href="##">关于优购</a>|
                    <a href="##">集团采购</a>|
                    <a href="##">招贤纳士</a>|
                    <a href="##">手机优购</a>|
                    <a href="##">联系我们</a>|
                    <a href="##">友情链接</a>
                </p>
                <p>
                    Copyright © 2011-2016 Yougou Technology Co., Ltd.<a href="##">粤ICP备09070608号-4</a>增值电信业务经营许可证：<a href="##">粤 B2-20090203</a>深公网安备：4403101910665<a href="##"><i><img src="/static/assets/img/bei.png" /></i>粤公网安备 44030502000017号</a>
                </p>
                <p>
                    <a><img src="/static/assets/img/sm.png" /></a>
                    <a><img src="/static/assets/img/ebs-logo.jpg" /></a>
                    <a><img src="/static/assets/img/beian1.png" /></a>
                    <a><img src="/static/assets/img/beian2.png" /></a>
                </p>
            </div>
        </div>

    </div>
</div>
<script src="/static/assets/js/jquery-2.2.3.min.js" ></script>
<script src="/static/assets/js/index.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>
