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
                   <h3 style="margin-left: 300px">作业发布</h3>
                   <div class="col-md-8 col-md-offset-2" style="margin-top: 30px">
                       <form id="from">
                           <div class="form-group" style="display: none">
                               <input type="text" class="form-control" id="tea_no" name="teaNo">
                           </div>
                           <div class="form-group">
                               <label for="exampleInputEmail1">作业要求</label>
                               <input type="text" class="form-control" id="exampleInputEmail1" name="workRequest" placeholder="作业要求">
                           </div>
                           <div class="form-group">
                               <label for="exampleInputPassword1">截至时间</label>
                               <input type="text" class="form-control" id="exampleInputPassword1" name="workFindata" placeholder="text">
                           </div>
                           <div class="form-group">
                               <label for="exampleInputPassword1" >选择班级</label>
                               <select class="form-control" id="sel" name="classId">
                               </select>
                           </div>
                           <div class="form-group">
                               <label for="exampleInputPassword1" >选择课程</label>
                               <select class="form-control" id="banji" name="currId">
                               </select>
                           </div>
                       </form>
                       <button type="submit" class="btn btn-default" id="sub">发布</button>
                   </div>
               </div>
<script type="text/javascript">
    $(function () {
        $.ajax({
            url:"<%=request.getContextPath()%>/select",
            type:"GET",
            data:"id="+localStorage.getItem("no"),
            success:function (result) {
                $("#sel").empty();
                var str=result.extend.lasscurrs;
                $.each(str,function (index,str) {
                    $("<option value='"+str.aClass.classId+"'>"+str.aClass.className+"</option>").appendTo("#banji");
                    $("<option value='"+str.curriculum.currId+"'>"+str.curriculum.currName+"</option>").appendTo("#sel");
                })
            }
        })
    });

    /*$(document).on("#sub","click",function () {
        alert("你好");
    })*/
    $("#sub").click(function () {
        $("#tea_no").val(localStorage.getItem("no"));
        //alert($("#from").serialize());
        if($("#exampleInputEmail1").val()==null||$("#exampleInputEmail1").val()==""){
            alert("请填写完整数据");
            return false;
        }
        if($("#exampleInputPassword1").val()==null||$("#exampleInputPassword1").val()==""){
            alert("请填写完整数据");
            return false;
        }
        $.ajax({
            url:"<%=request.getContextPath()%>/workpublish_from",
            type:"POST",
            data:$("#from").serialize(),
            success:function (result) {
                if(result.code==100){
                    alert("发布失败");
                }
                else{
                    alert("发布成功");
                }
            }
                
        })
    })
    function get_cache(key){
        return localStorage.getItem(key);
    }
</script>
</body>
</html>
