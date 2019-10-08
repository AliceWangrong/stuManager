<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script  src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <link href="static/css/student/foder.css" rel="stylesheet">
</head>
      <style>
          #zuo{
              height: 100%;
              width: 30%;
              float: left;
          }
          #tsxt{
              height: 100%;
              width: 70%;
              float: left;
          }
      </style>
      <body style="margin-top: 50px">
      <div id="zuo">
          <div class="tree" id="a">
              <button id="all">展开全部</button>
          </div>
      </div>
           <div id="fail"></div>
      <div id="tsxt"></div>


      <script type="text/javascript">
          $(document).on("click","#a_",function () {

              var path=$(this).attr("path");
              $.ajax({
                      url:"<%=request.getContextPath()%>/Showfail",
                      type:"POST",
                      data: "path="+path,
                      success:function (result) {
                          var text=$("<pre>"+result.extend.bf+"</pre>");
                          $("#tsxt").empty();
                          text.appendTo("#tsxt");
                      }

              })
          });
          $(document).on("click",".tree li.parent > a",function () {
              $( this ).parent().parent().toggleClass( 'active' );
              $( this ).parent().children( 'ul' ).slideToggle( 'fast' );
          });
          $(document).on("click","#all",function () {
              $( '.tree li' ).each( function() {
                  $( this ).toggleClass( 'active' );
                  $( this ).children( 'ul' ).slideToggle( 'fast' );
              });
          });
           $(function () {
               $.ajax({
                   url:"<%=request.getContextPath()%>/failname?url="+${url},
                   type:"GET",
                   dataType: 'json',
                   success:function (result) {
                       show(result);
                   }
               });
           });
          function show(result) {
              var data=result.extend.tree;  //遍历结点位置
              var xiao=0;
              var i=0;
              var j=0;
              var a="Key"+i+"_"+j;
              var bool=data.map.hasOwnProperty(a);
              for(i=0;bool;){
                  for(;bool;){
                      if(data.map[a].fatherKey==null){
                          $("<ul>\n" +
                              "                  <li id="+a+"><a  id='a_' "+"path="+data.map[a].path+">"+data.map[a].name+"</a>\n" +
                              "                  </li>\n" +
                              "              </ul>").appendTo("#a");
                      }
                      else {
                          $("<ul>\n" +
                              "                  <li id="+a+"><a id='a_' "+"path="+data.map[a].path+">"+data.map[a].name+"</a>\n" +
                              "                  </li>\n" +
                              "              </ul>").appendTo("#"+data.map[a].fatherKey);
                      }
                      j++;
                      var a="Key"+i+"_"+j;
                      var bool=data.map.hasOwnProperty(a);
                  }
                  i++;
                  j=0;
                  var a="Key"+i+"_"+j;
                  var bool=data.map.hasOwnProperty(a);
               }
              $(".tree li").each( function() {
                  if( $( this ).children( 'ul' ).length > 0 ) {
                      $(this).addClass('parent');
                  }
              })
          }
      </script>


</body>
</html>
