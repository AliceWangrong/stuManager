<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <title></title>
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script  src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="row">
    <h3 style="margin-left: 300px">作业提交</h3>
    <div class="col-md-8 col-md-offset-2" style="margin-top: 30px">
        <form id="from" enctype="multipart/form-data" action="<%=request.getContextPath()%>/upload" method="post">
            <div style="display: none">
            <input type="text" name="workid" value="${viewwork.workId}">
            <input type="text" name="stuid" value="${viewwork.stuNo}">
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">作业要求</label>
                <div class="col-sm-10">
                    <p class="form-control-static">${viewwork.workRequest}</p>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">截至时间</label>
                <div class="col-sm-10">
                    <p class="form-control-static">${viewwork.workFindata}</p>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">提交作业</label>
                <div class="col-sm-10">
                    <input id="dir" type="file" name="file" webkitdirectory mozdirectory/>
                </div>
            </div>
            <button type="submit" class="btn btn-default" id="sub">发布</button>
        </form>

    </div>
</div>
<script type="text/javascript">
    /*$("#sub").click(function () {
        alert($("#from").serialize());
        var form = new FormData(document.getElementById("#from"));
        $.ajax({
            type:"POST",
            url:"",
            data:form,
            //告诉jQuery不要去处理发送的数据
            processData:false,
            //告诉jQuery不要去设置Content-Type请求头,因为表单已经设置了multipart/form-data
            contentType:false,
            success:function(data) {
            }

        });
    })*/
</script>
</body>
</html>
