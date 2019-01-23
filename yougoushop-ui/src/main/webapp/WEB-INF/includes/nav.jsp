<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MY HP
  Date: 2019/1/19
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="top-nav">
    <div class="nav wid">
        <div class="fashion link_box">
            <a href="/index">时尚商城</a>
        </div>
        <div class="phone link_box">
            <a href="##"><i class="mob"></i>手机优购<em></em></a>
        </div>
        <ul class="clear">
            <c:if test="${tbUser==null}">
                <li class="login"><a href="/login" class="color">登录</a></li>
                <li class="reg"><a href="/regist" class="color">注册</a></li>
            </c:if>
            <c:if test="${tbUser!=null}">
                <li>
                    欢迎光临优购,${tbUser.name}
                </li>
                <li>
                    <<a href="/logout">注销</a>
                </li>
            </c:if>
            <li class="yg a"><a href="##">我的优购<em></em></a></li>
            <li><a href="##">我的订单</a></li>
            <li class="gg a"><a href="##">公告<em></em></a></li>
            <li class="gd a"><a href="##">更多<em></em></a></li>
        </ul>
    </div>
</div>
