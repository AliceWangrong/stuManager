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
<body>
<div class="row">
    <h3 style="margin-left: 300px">作业批改</h3>
    <div class="col-md-8 col-md-offset-2" style="margin-top: 30px">
        <table class="table table-hover" id="emps_table">
            <thead>
            <tr style="font-weight: bold">
                <td>学号</td>
                <td>作业号</td>
                <td>班级</td>
                <td>科目</td>
                <td>作业名称</td>
                <td>上传时间</td>
                <td>操作</td>
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
                    <td><button id="look" class="btn btn-primary" work="${viewwork.workUrl}" stuid="${viewwork.stuNo}"
                                onclick="window.location.href='<%=request.getContextPath()%>/chakan?workurl=${viewwork.workUrl}'">查看</button>
                        <button id="pigai" class="btn btn-success" work="${viewwork.workId}" stuid="${viewwork.stuNo}">批改</button>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <div style="display: none" id="pomt">
            <form class="form-inline" id="from">
                <div style="display: none">
                    <input type="text" class="form-control" id="workid" name="workid">
                    <input type="text" class="form-control" id="stuNo" name="stuNo">
                </div>
                <div class="form-group">
                    <label for="exampleInputName2">得分</label>
                    <input type="text" class="form-control" id="exampleInputName2" name="pomt">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail2">评价</label>
                    <input type="text" class="form-control" id="exampleInputEmail2" name="speak">
                </div>
                <button type="button" class="btn btn-success" id="sub">批阅</button>
            </form>

        </div>
    </div>
</div>
<script type="text/javascript">
    $(document).on("click","#pigai",function () {
         $("#pomt").attr("style","display:block");
         var workid=$(this).attr("work");
         var stuid=$(this).attr("stuid");
         $("#workid").val(workid);
         $("#stuNo").val(stuid);
    })
    $(document).on("click","#sub",function () {
        $.ajax({
            url:"<%=request.getContextPath()%>/piyue",
            type:"POST",
            data:$("#from").serialize(),
            success:function (result) {
                 location.reload();
            }
        })
    })
</script>

</body>
</html>
