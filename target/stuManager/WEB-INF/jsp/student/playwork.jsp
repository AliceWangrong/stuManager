<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <h3 style="margin-left: 300px">作业查看</h3>
    <div class="col-md-8 col-md-offset-2" style="margin-top: 30px">
        <table class="table table-hover" id="emps_table">
            <thead>
            <tr style="font-weight: bold">
                <td>ID</td>
                <td>科目</td>
                <td>作业名称</td>
                <td>状态</td>
                <td>得分</td>
                <td>评价</td>
                <td>批改时间</td>
                <td>操作</td>
            </tr>
            </thead>
            <%--<tr>
                <td>1</td>
                <td>JAVAEE</td>
                <td>SpringMVC</td>
                <td>已提交</td>
                <td>98</td>
                <td>注意缩进</td>
                <td>7.8</td>
                <td><button type="button" class="btn btn-success btn-sm">提交</button></td>
            </tr>--%>
        </table>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        //alert(localStorage.getItem("no"));
        $.ajax({
            url:"<%=request.getContextPath()%>/playwork",
            type:"POST",
            data:"stu_no="+localStorage.getItem("no"),
            success:function (result) {
                //$("#emps_table").empty();
                 var listwork=result.extend.viewworks;
                $.each(listwork,function (index,viewwork) {
                    var no=null;
                    var pomt="";
                    var evluate="";
                    var evluatedata="";
                    var butt;
                    if(viewwork.readNo==0){
                        no="未提交";
                        butt="<button type=\"button\" class=\"btn btn-success btn-sm\"" +
                            "onclick='window.location.href=\"<%=request.getContextPath()%>/tijiaopage?workid="+viewwork.workId+"&stu_id="+localStorage.getItem("no")+"\"' >" +
                            "提交</button>";
                    }
                    if(viewwork.readNo==1){
                        no="已提交";
                        butt="<button type=\"button\" class=\"btn btn-success btn-sm\"" +
                            "onclick='window.location.href=\"<%=request.getContextPath()%>/chakan?workurl="+viewwork.workUrl+"\"' >" +
                            "查看</button>";
                    }
                    if(viewwork.readNo==2){
                        no="已批改";
                        pomt=viewwork.pomt;
                        evluate=viewwork.evluate;
                        evluatedata=viewwork.evluateData;
                        butt="<button type=\"button\" class=\"btn btn-success btn-sm\"" +
                            "onclick='window.location.href=\"<%=request.getContextPath()%>/chakan?workurl="+viewwork.workUrl+"\"' >" +
                            "查看</button>";
                    }
                    $("<tr>\n" +
                        "                <td>" + viewwork.workId + "</td>\n" +
                        "                <td>" + viewwork.currName + "</td>\n" +
                        "                <td>" + viewwork.workRequest + "</td>\n" +
                        "                <td>" + no+ "</td>\n" +
                        "                <td>" + pomt+ "</td>\n" +
                        "                <td>" + evluate + "</td>\n" +
                        "                <td>" + evluatedata + "</td>\n" +
                        "                <td>"+butt+"</td>\n" +
                        "            </tr>").appendTo("#emps_table");
                });
            }
        })
    });
    /*$(document).on("click","#btn",function () {
        alert($(this).attr("workid"));
        $.ajax({
            url:"/tijiaopage",
            type:"POST",
            data:"workid="+$(this).attr("workid"),
            success:function (result) {

            }
        })
    })*/
</script>
</body>
</html>
