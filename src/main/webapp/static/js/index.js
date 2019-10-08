$(function(){
    $(function(){
        var max=$('#max').width();
        var left=$('.nav_left').width();
        var hmax=$('#max').height();
        $('.nav_top').width(max-left-1);
        $('.foot').width(max-left-1);
        $('.nav_top_body').height(hmax-124);
    });
    $(window).resize(function () {          //当浏览器大小变化时
        var max=$('#max').width();
        var left=$('.nav_left').width();
        var hmax=$('#max').height();
        $('.nav_top').width(max-left-1);
        $('.foot').width(max-left-1);
        $('.nav_top_body').height(hmax-124);
    });
    $(document).ready(function(){
        $("ul.expmenu li > div.header").click(function(){
            var arrow = $(this).find("span.arrow");
            if(arrow.hasClass("up")){
                arrow.removeClass("up");
                arrow.addClass("down");
            }else if(arrow.hasClass("down")){
                arrow.removeClass("down");
                arrow.addClass("up");
            }
            $(this).parent().find("ul.menu").slideToggle();
        });
    });
});