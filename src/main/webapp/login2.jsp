<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="${pageContext.request.contextPath }/assets/css/bootstrap.min.css" rel="stylesheet" />
	<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/font-awesome.min.css" />
	<!--[if IE 7]>
	<link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
	<![endif]-->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/ace.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/ace-rtl.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/ace-skins.min.css" />
	<!--[if lte IE 8]>
	<link rel="stylesheet" href="assets/css/ace-ie.min.css" />
	<![endif]-->
	<script src="${pageContext.request.contextPath }/assets/js/ace-extra.min.js"></script>
	<!--[if lt IE 9]>
	<script src="assets/js/html5shiv.js"></script>
	<script src="assets/js/respond.min.js"></script>
	<![endif]-->
	<script src="${pageContext.request.contextPath }/js/jquery-1.9.1.min.js"></script>
	<script src="${pageContext.request.contextPath }/assets/layer/layer.js" type="text/javascript"></script>
	<title>登录</title>
</head>

<body class="login-layout">
<div class="loginbody">
	<div class="login-container">
		<div class="space-6"></div>
		<div class="position-relative">
			<div id="login-box" class="login-box widget-box no-border visible">
				<div class="widget-body">
					<div class="widget-main">
						<h4 class="header blue lighter bigger">
							<!-- <i class="icon-coffee green"></i> -->
							用户登录
						</h4>
						<form action="${pageContext.request.contextPath }/front/custom/login.action" class="am-form" method="post" data-am-validator>
							<fieldset>
								<label class="block clearfix">
											<span class="block input-icon input-icon-right">
												<input type="text" class="form-control" placeholder="用户名"  name="customname">
												<i class="icon-user"></i>
											</span>
								</label>
								<label class="block clearfix">
											<span class="block input-icon input-icon-right">
												<input type="password" class="form-control" placeholder="密码" name="password">
												<i class="icon-lock"></i>
											</span>
								</label>
								<div class="space"></div>

								<!-- <div class="clearfix">
									 <label class="inline">
										<input type="checkbox" class="ace">
										<span class="lbl">保存密码</span>
									</label> 
								</div> -->
								<div class="clearfix">
									<button type="submit" style="margin-left: 170px;" class="width-20 pull-left btn btn-sm btn-primary" id="login_btn">
										登录
									</button>
										<a href="${pageContext.request.contextPath }/page/front/custom_info/customRegister.jsp">点我注册呗</a>
								</div>
								<div class="space-4"></div>
							</fieldset>

						</form>
					</div><!-- /widget-main -->
					<div class="toolbar clearfix">
					</div>
				</div><!-- /widget-body -->
			</div><!-- /login-box -->
		</div><!-- /position-relative -->
	</div>
</div>
</body>
</html>
<script>
    $('#login_btn').on('click', function(){
        var num=0;
        var str="";
        $("input[type$='text']").each(function(n){
            if($(this).val()=="")
            {

                layer.alert(str+=""+$(this).attr("name")+"不能为空！\r\n",{
                    title: '提示框',
                    icon:0,
                });
                num++;
                return false;
            }
        });
        if(num>0){  return false;}
        else{
            layer.alert('登陆成功！',{
                title: '提示框',
                icon:1,
            });
            location.href="index.html";
            layer.close(index);
        }

    })

</script>