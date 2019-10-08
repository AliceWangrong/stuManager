<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
    <link rel="stylesheet" href="static/css/index.css" />
    <link rel="stylesheet" href="static/css/iconfont.css" />
    <script type="text/javascript" src="static/js/jquery.min.js" ></script>
    <script type="text/javascript" src="static/js/index.js"></script>
    <title>主页</title>
</head>
<body>
<div id="max" class="max">
    <div class="nav_left">
        <div class="nav_left_top">
        </div>
        <ul class="expmenu">
            <li>
                <div class="header">
                    <span class="label" ><i class="iconfont">&#xe64b;</i>&nbsp;&nbsp;&nbsp;&nbsp;<a href="<%=request.getContextPath()%>/xinxi" target="iframe0" style="text-decoration:none;black">主页</a></span>
                </div>
            </li>
            <li>
                <div class="header">
                    <span class="label"><i class="iconfont">&#xe602;</i>&nbsp;&nbsp;&nbsp;&nbsp;<a class="title_">教师情况</a><i class="iconfont" id="icon">&#xe616;</i></span>

                </div>
                <ul class="menu" style="display:none;">
                    <li><a class="J_menuItem" href="<%=request.getContextPath()%>/xinxi" target="iframe0">信息管理</a></li>
                    <%--<li><a class="J_menuItem" href="<%=request.getContextPath()%>/banji" target="iframe0">班级查看</a></li>--%>
                </ul>
            </li>
            <li>
                <div class="header">
                    <span class="label"><i class="iconfont">&#xe61d;</i>&nbsp;&nbsp;&nbsp;&nbsp;作业情况<i class="iconfont" id="icon">&#xe616;</i></span>
                </div>
                <ul class="menu" style="display:none;">
                    <li><a class="J_menuItem" href="<%=request.getContextPath()%>/workpublish" target="iframe0">作业发布</a></li>
                    <li><a class="J_menuItem" href="<%=request.getContextPath()%>/pigai" target="iframe0">作业批改</a></li>
                    <li><a class="J_menuItem" href="<%=request.getContextPath()%>/chaxun" target="iframe0">作业查询</a></li>
                </ul>
            </li>
        </ul>
    </div>
    <!-- 左边 -->
    <div class="nav_top">
        <div class="nav_top_top">
            <img src="http://localhost:8080/images/logo.png"/>
            <div class="nav_top_top_right">
                <div class="impo">教师端</div>
                <ul>
                    <li style="width:70px;"><a href="<%=request.getContextPath()%>/login" style="color:white;">退出</a></li>
                </ul>
            </div>
        </div>
        <div class="nav_top_second">
            <ul>
                <li id="a1"><a href="<%=request.getContextPath()%>/xinxi" target="iframe0">首页</a></li>
                <li id="mingcheng"><a>王帅老师</a></li>
            </ul>
        </div>
        <div class="nav_top_body">
            <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="<%=request.getContextPath()%>/xinxi" frameborder="0" data-id="" seamless> </iframe>
            <div class="foot">
                <a>2019-7-1软件归子不语创作团队所有</a>
            </div>
        </div>
    </div>
    <!-- 右边 -->
</div>
</body>
</html>