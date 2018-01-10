<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>用户注册</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/registr.css" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
 function len6to16(self) {
            var allNext = $(self).nextAll();
            if (self.value.length < 6 || self.value.length > 19 ) {
                $(allNext[0]).show();
                $(allNext[2]).text('输入内容在6-19位之间');
            }else{
				$(allNext[0]).show();
				$(allNext[2]).hide();
			}
				
        }
        function passwordEQ() {
            var passwordSet = $(':password');
            var allNext = $(passwordSet[1]).nextAll();
            if (passwordSet[0].value != passwordSet[1].value) {
                $(allNext[0]).show();
                $(allNext[2]).text('两次密码不一致');
            }else{
				$(allNext[0]).show();
				$(allNext[2]).hide();
			}
        }
        $(function () {
            $(':button').click(function () {
                var textBoxSet = $('.regTextBox');
                var errorSet = $('.error');
                var tipsSet = $('.tops');

                for (var i = 0; i < textBoxSet.length; i++) {
                    if (textBoxSet[i].value == undefined || textBoxSet[i].value == '') {
                        $(errorSet[i]).show();
                        $(tipsSet[i]).text('请输入内容');
                    }else{
				$(allNext[0]).show();
				$(allNext[2]).hide();
			} 
                }
            });
        });
    </script>
    <style type="text/css">
        
    </style>
</head>

<body >
<div class="wrap">
    <div class="reg">
        <div class="main">
            <div class="form">
                <form id="formList" method="post"  onsubmit="return validate_form(this)" action="${pageContext.request.contextPath }/front/custom/registerFrontCustom.action" enctype="multipart/form-data">
                        <h3>注册</h3><br/>
                    <div class="list">
                        <div class="box"> 
                                                                                   
                            <input name="customid" type="text" class="regTextBox" onblur="len6to16(this)" placeholder="身份证号" />
                            <span class="icon"><img src="img/registr/telephone.png" /></span>
                            <b class="error">×</b>
                            <span class="tops"></span>
                        </div>
                    </div>
                    <div class="list">
                        <div class="box">                           
                            <input name="customname" type="text" class="regTextBox" placeholder="昵称/用户名" />
                            <span class="icon"><img src="img/registr/username.png" /></span>

                             <b class="error">×</b>
                            <span class="tops"></span>
                        </div>
                    </div>
                    <div class="list">
                        <div class="box">                            
                            <input name="password" type="password" class="regTextBox" onblur="len6to16(this)" placeholder="密码"  />
                            <span class="icon"><img src="img/registr/key.png" /></span>
                            <span class="error">×</span>
                            <span class="tops"></span>
                        </div>
                    </div>
                    <div class="list">
                        <div class="box">                            
                            <input type="password" class="regTextBox" onblur="passwordEQ()" placeholder="确认密码" />
                            <span class="icon"><img src="img/registr/key.png" /></span>
                            <b class="error">×</b>
                            <span class="tops"></span>
                        </div>
                    </div>
                     <div class="list">
                        <div class="box"> 
                                                                                   
                            <input name="phone" type="text" class="regTextBox" onblur="len6to16(this)" placeholder="手机号" />
                            <span class="icon"><img src="img/registr/telephone.png" /></span>
                            <b class="error">×</b>
                            <span class="tops"></span>
                        </div>
                    </div>
                    <input type="checkbox" checked="checked" style="margin-bottom:10px;" />同意
                    <a href="#" style="margin-bottom:10px;margin-left:-3px; text-decoration:none;">注册条款</a>
                    
                    	<div style="margin-left:150px;">
                   	 		<input type="submit" value="提交注册" onclick="sex()"  class="btn" id="button"/>
                   	 	</div >
                   	 			<a href="${pageContext.request.contextPath }/login2.jsp">已有账号，返回登录</a>
				<!--  <input type="reset" name="button" id="button" value="重置" class="btn" /> 
				<input type="button" value="返回" onclick="javascript:history.back();" class="btn" /> -->
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
