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
    <link href="static/css/person.css" rel="stylesheet">
</head>
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
            <button class="tablinks" onclick="daohang(event, 'exam')">考试信息</button>
            <p>欢迎您，王荣同学</p>
        </div>

        <div id="personal" class="tabcontent shouye">
            <table class="table table-hover">
                <tr>
                    <td>姓名：</td>
                    <td>王荣</td>
                </tr>
                <tr>
                    <td>班级：</td>
                    <td>软件工程一班</td>
                </tr>
                <tr>
                    <td>年级：</td>
                    <td>17级</td>
                </tr>
            </table>
        </div>

        <div id="coure" class="tabcontent">
            <table class="table table-hover">
                <tr>
                    <td>所修课程</td>
                    <td>截止时间</td>
                </tr>
                <tr>
                    <td>javaEE企业级开发</td>
                    <td>至16周</td>
                </tr>
                <tr>
                    <td>操作系统</td>
                    <td>至16周</td>
                </tr>
                <tr>
                    <td>大学英语4</td>
                    <td>至16周</td>
                </tr>
                <tr>
                    <td>概率论与数理统计</td>
                    <td>至16周</td>
                </tr>
                <tr>
                    <td>应用文写作</td>
                    <td>至16周</td>
                </tr>
            </table>
        </div>

        <div id="schedule" class="tabcontent">
            <table class="table table-bordered"style="text-align: center">
                <tr>
                    <td colspan="2">时间</td>
                    <td>星期一</td>
                    <td>星期二</td>
                    <td>星期三</td>
                    <td>星期四</td>
                    <td>星期五</td>
                    <td>星期六</td>
                    <td>星期日</td>

                </tr>
                <tr>
                    <td rowspan="4" class="timezi"> <p>上午</p></td>
                    <td>第一节</td>
                    <td></td>
                    <td rowspan="2">java企业级开发</td>
                    <td></td>
                    <td></td>
                    <td rowspan="2">操作系统</td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>

                    <td>第二节</td>


                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>

                    <td>第三节</td>
                    <td rowspan="2">大学英语</td>
                    <td rowspan="2">java企业级开发</td>
                    <td rowspan="2">毛概</td>
                    <td rowspan="2">操作系统</td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>

                    <td>第四节</td>



                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td rowspan="4">下午</td>
                    <td>第一节</td>
                    <td rowspan="2">创新创业</td>
                    <td rowspan="2">大学英语</td>
                    <td rowspan="2">大学语文</td>
                    <td rowspan="2">大学体育</td>
                    <td rowspan="2">概率论</td>

                    <td></td>
                    <td></td>
                </tr>
                <tr>

                    <td>第二节</td>




                    <td></td>
                    <td></td>
                </tr>
                <tr>

                    <td>第三节</td>

                    <td></td>
                    <td rowspan="2">毛概</td>
                    <td></td>
                    <td></td>
                    <td>概率论</td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>

                    <td>第四节</td>

                    <td></td>

                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
        </div>

        <div id="exam" class="tabcontent">
                <h4>考试信息暂无</h4>
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
</div>
</body>
</html>