<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>论坛</title>
     <link rel="stylesheet" href="${pageContext.request.contextPath }/css/style1.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/comment.css">
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/index.css" rel="stylesheet">
</head>
<body>
<!--
    此评论textarea文本框部分使用的https://github.com/alexdunphy/flexText此插件
-->
<form action="${pageContext.request.contextPath }/front/message/insertFrontMassage.action"  method="post" >
<div class="bg-img" style="position:absolute;z-index:-1;width:100%;height:100%;" enctype="multipart/form-data">

</div>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">欢迎&ndash;${custom.customname }&ndash;进入</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="${pageContext.request.contextPath }/front/custom/selectFrontCustom.action">个人中心</a></li>
             <!--  &lt;!&ndash;<li><a href="#about">笔记</a></li>
              <li><a href="#contact">网站推荐</a></li>&ndash;&gt; -->
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <!-- <li class="active"><a href="login.html">登录<span class="sr-only">(current)</span></a></li>
                <li><a href="registr.html">注册</a></li> -->
                <li><a href="${pageContext.request.contextPath }/front/custom/logoutCustom.action">退出登录</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div style="margin-left: 300px; ">
    <img src="upload/${custom.pic}" width="120" height="120" style="margin-top: 20px;">
    <span style="margin-top: -15px;margin-left: 20px;font-size: 20px;color: #7c9eb2">${custom.customname }</span>
</div>

<div class="commentAll">
    <!--评论区域 begin-->
    <div class="reviewArea clearfix">
        <textarea class="content comment-input" name="content" placeholder="请编辑您要发布的内容&hellip;" onkeyup="keyUP(this)"></textarea>
        <button class="plBtn" type="submit">发布</button>
    </div>
    <input name="customid" style="display: none;" readonly type="text" value="${selectFrontCustom.customid }" class="dfinput" />
    </form>
    <!--评论区域 end-->
    <!--回复区域 begin-->
    <div class="comment-show">
    	<c:forEach items="${selectMessage.listMessage}" var="listMessage">
        <div class="comment-show-con clearfix">
            <div class="comment-show-con-img pull-left"><img src="img/header-img-comment_03.png" alt=""></div>
            <div class="comment-show-con-list pull-left clearfix">
                <div class="pl-text clearfix">
                    <a href="#" class="comment-size-name">${custom.customname }: </a>
                    <span class="my-pl-con">&nbsp; ${listMessage.content }</span>
                </div>
                <div class="date-dz">
                    <span class="date-dz-left pull-left comment-time"><fmt:formatDate value="${listMessage.messageTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
                    <div class="date-dz-right pull-right comment-pl-block">
                       <a
						href="${pageContext.request.contextPath }/front/message/deleteMessage.action?messageid=${listMessage.messageid }"
						class="removeBlock">删除
						</a>
                        <a href="javascript:;" class="date-dz-pl pl-hf hf-con-block pull-left">回复</a>
                        <span class="pull-left date-dz-line">|</span>
                        <a href="javascript:;" class="date-dz-z pull-left"><i class="date-dz-z-click-red"></i>赞 (<i class="z-num">666</i>)</a>
                    </div>
                </div>
                <div class="hf-list-con"></div>
            </div>
        </div>
         </c:forEach>
    </div>
    <!--回复区域 end-->
</div>

<footer class="footer navbar-inverse">
    <div class="container">
        <p class="text-muted">块数据</p>
    </div>
</footer>

<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.12.0.min.js"></script>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.flexText.js"></script> --%>
<!--textarea高度自适应-->
<script type="text/javascript">
    $(function () {
        $('.content').flexText();
    });
</script>
<!--textarea限制字数-->
<script type="text/javascript">
    function keyUP(t){
        var len = $(t).val().length;
        if(len > 139){
            $(t).val($(t).val().substring(0,140));
        }
    }
</script>
<!--点击评论创建评论条-->
<script type="text/javascript">
    $('.commentAll').on('click','.plBtn',function(){
        var myDate = new Date();
        //获取当前年
        var year=myDate.getFullYear();
        //获取当前月
        var month=myDate.getMonth()+1;
        //获取当前日
        var date=myDate.getDate();
        var h=myDate.getHours();       //获取当前小时数(0-23)
        var m=myDate.getMinutes();     //获取当前分钟数(0-59)
        if(m<10) m = '0' + m;
        var s=myDate.getSeconds();
        if(s<10) s = '0' + s;
        var now=year+'-'+month+"-"+date+" "+h+':'+m+":"+s;
        //获取输入内容
        var oSize = $(this).siblings('.flex-text-wrap').find('.comment-input').val();
        console.log(oSize);
        //动态创建评论模块
        oHtml = '<div class="comment-show-con clearfix">' +
            '<div class="comment-show-con-img pull-left">' +
                '<img src="img/header-img-comment_03.png" alt="">' +
            '</div> ' +
            '<div class="comment-show-con-list pull-left clearfix">' +
                '<div class="pl-text clearfix"> ' +
                    '<a href="#" class="comment-size-name">David Beckham : </a>' +
                    '<span class="my-pl-con">&nbsp;'+ oSize +'</span>' +
                ' </div> ' +
                '<div class="date-dz">' +
                   ' <span class="date-dz-left pull-left comment-time">'+now+'</span>' +
                   ' <div class="date-dz-right pull-right comment-pl-block">' +
                         '<a href="javascript:;" class="removeBlock">删除</a>' +
                         ' <a href="javascript:;" class="date-dz-pl pl-hf hf-con-block pull-left">回复</a>' +
                        ' <span class="pull-left date-dz-line">|</span> ' +
                        '<a href="javascript:;" class="date-dz-z pull-left">' +
                        '<i class="date-dz-z-click-red"></i>赞 (<i class="z-num">666</i>)</a>' +
                  ' </div>' +
                ' </div>' +
                '<div class="hf-list-con"></div>' +
              '</div> ' +
            '</div>';
        if(oSize.replace(/(^\s*)|(\s*$)/g, "") != ''){
            $(this).parents('.reviewArea ').siblings('.comment-show').prepend(oHtml);
            $(this).siblings('.flex-text-wrap').find('.comment-input').prop('value','').siblings('pre').find('span').text('');
        }
    });
</script>
<!--点击回复动态创建回复块-->
<script type="text/javascript">
    $('.comment-show').on('click','.pl-hf',function(){
        //获取回复人的名字
        var fhName = $(this).parents('.date-dz-right').parents('.date-dz').siblings('.pl-text').find('.comment-size-name').html();
        //回复@
        var fhN = '回复@'+fhName;
        //var oInput = $(this).parents('.date-dz-right').parents('.date-dz').siblings('.hf-con');
        var fhHtml = '<div class="hf-con pull-left"> <textarea class="content comment-input hf-input" placeholder="" onkeyup="keyUP(this)"></textarea> <a href="javascript:;" class="hf-pl">评论</a></div>';
        //显示回复
        if($(this).is('.hf-con-block')){
            $(this).parents('.date-dz-right').parents('.date-dz').append(fhHtml);
            $(this).removeClass('hf-con-block');
            $('.content').flexText();
            $(this).parents('.date-dz-right').siblings('.hf-con').find('.pre').css('padding','6px 15px');
            //console.log($(this).parents('.date-dz-right').siblings('.hf-con').find('.pre'))
            //input框自动聚焦
            $(this).parents('.date-dz-right').siblings('.hf-con').find('.hf-input').val('').focus().val(fhN);
        }else {
            $(this).addClass('hf-con-block');
            $(this).parents('.date-dz-right').siblings('.hf-con').remove();
        }
    });
</script>
<!--评论回复块创建-->
<script type="text/javascript">
    $('.comment-show').on('click','.hf-pl',function(){
        var oThis = $(this);
        var myDate = new Date();
        //获取当前年
        var year=myDate.getFullYear();
        //获取当前月
        var month=myDate.getMonth()+1;
        //获取当前日
        var date=myDate.getDate();
        var h=myDate.getHours();       //获取当前小时数(0-23)
        var m=myDate.getMinutes();     //获取当前分钟数(0-59)
        if(m<10) m = '0' + m;
        var s=myDate.getSeconds();
        if(s<10) s = '0' + s;
        var now=year+'-'+month+"-"+date+" "+h+':'+m+":"+s;
        //获取输入内容
        var oHfVal = $(this).siblings('.flex-text-wrap').find('.hf-input').val();
        console.log(oHfVal)
        var oHfName = $(this).parents('.hf-con').parents('.date-dz').siblings('.pl-text').find('.comment-size-name').html();
        var oAllVal = '回复@'+oHfName;
        if(oHfVal.replace(/^ +| +$/g,'') == '' || oHfVal == oAllVal){

        }else {
            $.getJSON("json/pl.json",function(data){
                var oAt = '';
                var oHf = '';
                $.each(data,function(n,v){
                    delete v.hfContent;
                    delete v.atName;
                    var arr;
                    var ohfNameArr;
                    if(oHfVal.indexOf("@") == -1){
                        data['atName'] = '';
                        data['hfContent'] = oHfVal;
                    }else {
                        arr = oHfVal.split(':');
                        ohfNameArr = arr[0].split('@');
                        data['hfContent'] = arr[1];
                        data['atName'] = ohfNameArr[1];
                    }

                    if(data.atName == ''){
                        oAt = data.hfContent;
                    }else {
                        oAt = '回复<a href="#" class="atName">@'+data.atName+'</a> : '+data.hfContent;
                    }
                    oHf = data.hfName;
                });

                var oHtml = '<div class="all-pl-con"><div class="pl-text hfpl-text clearfix"><a href="#" class="comment-size-name">我的名字 : </a><span class="my-pl-con">'+oAt+'</span></div><div class="date-dz"> <span class="date-dz-left pull-left comment-time">'+now+'</span> <div class="date-dz-right pull-right comment-pl-block"> <a href="javascript:;" class="removeBlock">删除</a> <a href="javascript:;" class="date-dz-pl pl-hf hf-con-block pull-left">回复</a> <span class="pull-left date-dz-line">|</span> <a href="javascript:;" class="date-dz-z pull-left"><i class="date-dz-z-click-red"></i>赞 (<i class="z-num">666</i>)</a> </div> </div></div>';
                oThis.parents('.hf-con').parents('.comment-show-con-list').find('.hf-list-con').css('display','block').prepend(oHtml) && oThis.parents('.hf-con').siblings('.date-dz-right').find('.pl-hf').addClass('hf-con-block') && oThis.parents('.hf-con').remove();
            });
        }
    });
</script>
<!--删除评论块-->
<script type="text/javascript">
    $('.commentAll').on('click','.removeBlock',function(){
        var oT = $(this).parents('.date-dz-right').parents('.date-dz').parents('.all-pl-con');
        if(oT.siblings('.all-pl-con').length >= 1){
            oT.remove();
        }else {
            $(this).parents('.date-dz-right').parents('.date-dz').parents('.all-pl-con').parents('.hf-list-con').css('display','none')
            oT.remove();
        }
        $(this).parents('.date-dz-right').parents('.date-dz').parents('.comment-show-con-list').parents('.comment-show-con').remove();

    })
</script>
<!--点赞-->
<script type="text/javascript">
    $('.comment-show').on('click','.date-dz-z',function(){
        var zNum = $(this).find('.z-num').html();
        if($(this).is('.date-dz-z-click')){
            zNum--;
            $(this).removeClass('date-dz-z-click red');
            $(this).find('.z-num').html(zNum);
            $(this).find('.date-dz-z-click-red').removeClass('red');
        }else {
            zNum++;
            $(this).addClass('date-dz-z-click');
            $(this).find('.z-num').html(zNum);
            $(this).find('.date-dz-z-click-red').addClass('red');
        }
    })
</script>
</body>
</html>