<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script  src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

<div id="head">

</div>
<a href="fail">文件上传</a>
<button id="work">我的作业</button>
<div id="work_div"></div>
<script type="text/javascript">
    $(function () {
        $.ajax({
            url:"<%=request.getContextPath()%>/information",
            data:"stu_no="+${loginInformation.stu_no},
            type:"GET",
            success:function (result) {
                showInforation(result);
            }

        })
    });
    function showInforation(result){
        var data=result.extend.stu;
        $("<h4>欢迎"+data.stuName+"\n" +
            data.college.collageName+"\n"+
            data.depart.departName+"\n"+
            data.aclass.className+"</h4>").appendTo("#head");
    }
</script>
</body>
</html>
