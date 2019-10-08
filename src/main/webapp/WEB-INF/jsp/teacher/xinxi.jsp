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
<style>
    *{
        margin:0 auto;
        padding: 0px;
    }
    .bigBox{
        width: 80%;
    }

    .topBox{
        height: 50px;

        text-align: center;
    }
    .topBox h3{
        padding-top: 10px;
        width: 400px;
        padding-right: 20px;
    }
    .middleBox{
        height: 300px;

    }
    .middleBox p{
        float: right;
    }
    /* Style the tab */
    div.tab {
        overflow: hidden;
        border: 1px solid #ccc;
        background-color: #f1f1f1;
    }
    .tab p{
        float: right;
        font-size: 14px;
        width: 200px;
        padding-top: 15px;
        text-align: center;
    }
    /* Style the buttons inside the tab */
    div.tab button {
        background-color: inherit;
        float: left;
        border: none;
        outline: none;
        cursor: pointer;
        padding: 14px 16px;
        transition: 0.3s;
        font-size: 17px;
    }

    /* Change background color of buttons on hover */
    div.tab button:hover {
        background-color: #ddd;
    }

    /* Create an active/current tablink class */
    div.tab button.active {
        background-color: #ccc;
    }

    /* Style the tab content */
    .tabcontent {
        display: none;
        padding: 6px 12px;
        border: 1px solid #ccc;
        border-top: none;
    }
    .timezi{
        width: 5px;
        height: 30px;
        padding-top: 20px;
    }
</style>
<body>
<div class="bigBox">
    <div class="topBox">
        <h3>个&nbsp;人&nbsp;信&nbsp;息</h3>

    </div>

    <div class="middleBox">

        <div class="tab">
            <button class="tablinks" id="shouye" onclick="daohang(event, 'personal')">个人资料</button>
            <button class="tablinks" onclick="daohang(event, 'coure')">课程查看</button>
            <button class="tablinks" onclick="daohang(event, 'schedule')">课表查看</button>
            <button class="tablinks" onclick="daohang(event, 'exam')">作业信息</button>
            <p>欢迎您，风老师</p>
        </div>

        <div id="personal" class="tabcontent shouye">
            <table class="table table-hover">
                <tr>
                    <td>姓名：</td>
                    <td>风清扬</td>
                </tr>
                <tr>
                    <td>学院：</td>
                    <td>数字媒体学院</td>
                </tr>
                <tr>
                    <td>院系</td>
                    <td>软件工程系</td>
                </tr>
            </table>
        </div>

        <div id="coure" class="tabcontent">
            <table class="table table-hover">
                <tr>
                    <td>课程名</td>
                    <td>上课时间</td>
                    <td>上课教室</td>
                </tr>
                <tr>
                    <td>java企业级开发</td>
                    <td>星期二上午</td>
                    <td>1-611</td>
                </tr>
                <tr>
                    <td>java企业级开发</td>
                    <td>星期五上午</td>
                    <td>1-611</td>
                </tr>
            </table>
        </div>

        <div id="schedule" class="tabcontent">

        </div>

        <div id="exam" class="tabcontent">

        </div>


    </div>
</div>
<script type="text/javascript">
    $(function () {
        $("#shouye").addClass("active");
        $(".shouye").attr("style","display:block");
    });
    function daohang(evt, ziName) {
        var i, tabcontent, tablinks;
        tabcontent = document.getElementsByClassName("tabcontent");
        for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
        }
        tablinks = document.getElementsByClassName("tablinks");
        for (i = 0; i < tablinks.length; i++) {
            tablinks[i].className = tablinks[i].className.replace(" active", "");
        }
        document.getElementById(ziName).style.display = "block";
        evt.currentTarget.className += " active";
    }
</script>
</body>
</html>