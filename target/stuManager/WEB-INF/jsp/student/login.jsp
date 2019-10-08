<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script  src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="static/css/student/login.css"/>
</head>
<body style="background-image: url('http://localhost:8080/images/timgb.jpg');background-size: cover">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-4 col-md-offset-4 login" style="background-color:rgba(245, 245, 245, 0.24);">
                <h4 class="text-center">欢迎登录师生交互平台</h4>
                <form class="form-horizontal" id="loginFrom">
                    <div class="form-group">
                        <label for="inputStuNo" class="col-sm-2 control-label">学号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputStuNo" name="stuNoString" placeholder="学号">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" id="inputPassword3" name="stuPass" placeholder="密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">
                                <label class="radio-inline">
                                    <input type="radio" id="inlineRadio1" name="loginType" value="S" checked="checked">学生
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" id="inlineRadio2" name="loginType" value="T">教师
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="button" class="btn btn-primary login_btn">登录</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <script type="text/javascript">
        $(document).on("click",".login_btn",function () {
            if(checkStuNo($("#inputStuNo").val())){
            $.ajax({
                url:"<%=request.getContextPath()%>/login",
                type:"POST",
                data:$("#loginFrom").serialize(),
                success:function (result) {
                    if(result.code==100){
                        localStorage.setItem("no", result.extend.no);
                        if(result.extend.loginType=="S"){
                            alert("欢迎登录学生管理系统");
                            window.location.href="<%=request.getContextPath()%>/index";
                        }
                        else if(result.extend.loginType=="T"){
                            alert("欢迎登录学生管理系统");
                            window.location.href="<%=request.getContextPath()%>/teacher";
                        }
                    }
                    else{
                    alert(result.msg);
                    }
                }
            })
            }
        })
        function checkStuNo(ele) {
            var pattern = /^[0-9]+(.[0-9]{0,3})?$/;//只能输入数字
            var leng=ele.length;    //获取账号位数
            var sta=pattern.test(ele);   //正则表达式检索
            if (leng==11&&sta==true){
                return true;
            } else{
                alert("请输入正确格式账号");
                return false;
            }
        }
    </script>
</body>
</html>