<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script  src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<style>
    .head{
        width: 100%;
        height: 42px;
        border-bottom: 3px solid #ff6633;
        border-radius: 3px;
    }
    .head>div{
        width: 90px;
        height: 100%;
        background-color: #ff6633;
        border-top-left-radius: 9px;
        border-top-right-radius: 9px;
    }
    .head>div>a{
        color: white;
        font-size: 16px;
        line-height: 45px;
    }
</style>
<body>
<h3 style="margin-left: 300px">作业查看</h3>
<div class="col-md-10 col-md-offset-1" style="margin-top: 30px">
    <div class="head"><div><a>未提交作业</a></div></div>
    <table class="table table-hover">
        <thead>
        <tr style="font-weight: bold">
            <td>学号</td>
            <td>作业号</td>
            <td>班级</td>
            <td>科目</td>
            <td>作业名称</td>
        </tr>
        </thead>
        <c:forEach items="${viewworks1}" var="viewwork">
            <tr>
                <td>${viewwork.stuNo}</td>
                <td>${viewwork.workId}</td>
                <td>${viewwork.className}</td>
                <td>${viewwork.currName}</td>
                <td>${viewwork.workRequest}</td>
            </tr>
        </c:forEach>
    </table>
    <div class="head"><div><a>已提交作业</a></div></div>
    <table class="table table-hover">
        <thead>
        <tr style="font-weight: bold">
            <td>学号</td>
            <td>作业号</td>
            <td>班级</td>
            <td>科目</td>
            <td>作业名称</td>
            <td>上传时间</td>
        </tr>
        </thead>
        <c:forEach items="${viewworks}" var="viewwork">
            <tr>
                <td>${viewwork.stuNo}</td>
                <td>${viewwork.workId}</td>
                <td>${viewwork.className}</td>
                <td>${viewwork.currName}</td>
                <td>${viewwork.workRequest}</td>
                <td>${viewwork.finallData}</td>
            </tr>
        </c:forEach>
    </table>
    <div class="head"><div><a>已批改作业</a></div></div>
    <table class="table table-hover" style="margin-bottom: 200px">
        <thead>
        <tr style="font-weight: bold">
            <td>学号</td>
            <td>作业号</td>
            <td>班级</td>
            <td>科目</td>
            <td>作业名称</td>
            <td>上传时间</td>
            <td>得分</td>
            <td>评价</td>
        </tr>
        </thead>
        <c:forEach items="${viewworks2}" var="viewwork">
            <tr>
                <td>${viewwork.stuNo}</td>
                <td>${viewwork.workId}</td>
                <td>${viewwork.className}</td>
                <td>${viewwork.currName}</td>
                <td>${viewwork.workRequest}</td>
                <td>${viewwork.finallData}</td>
                <td>${viewwork.pomt}</td>
                <td>${viewwork.evluate}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
