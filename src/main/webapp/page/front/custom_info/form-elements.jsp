<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <title>个人中心</title>

  
<link href="${pageContext.request.contextPath }/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection">
<link href="${pageContext.request.contextPath }/css/style2.css" type="text/css" rel="stylesheet" media="screen,projection">
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/index.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
    <!--materialize js-->
<script type="text/javascript" src="${pageContext.request.contextPath }/js/materialize.js"></script>
<script type="text/javascript"></script>
</head>

<body>

<div class="bg-img" style="position:absolute;z-index:-1;width:100%;height:100%;">

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
            <a class="navbar-brand" href="#">欢迎&ndash;${selectFrontCustom.customname }&ndash;进入</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <%-- <ul class="nav navbar-nav">
              <li class="active"><a href="${pageContext.request.contextPath }/front/custom/selectFrontCustom.action">个人中心</a></li>
             <!--  &lt;!&ndash;<li><a href="#about">笔记</a></li>
              <li><a href="#contact">网站推荐</a></li>&ndash;&gt; -->
            </ul> --%>

            <ul class="nav navbar-nav navbar-right">
                <!-- <li class="active"><a href="login.html">登录<span class="sr-only">(current)</span></a></li>
                <li><a href="registr.html">注册</a></li> -->
                <li><a href="${pageContext.request.contextPath }/front/custom/logoutCustom.action">退出登录</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<form action="${pageContext.request.contextPath }/front/custom/updateCustomSubmit.action?customid=${selectFrontCustom.customid}"
			id="formList"	method="post" enctype="multipart/form-data">
<div style="margin-left: 300px; margin-top: 40px;">
   <!--  <img src="img/tx.png" width="100" height="100"> -->
    <img src="upload/${selectFrontCustom.pic}" style="width:100px;height:100px;border-radius:100%" class="img1" />
    <input name="custompic" type="file" class="a" />
    <span style="margin-top: -15px;margin-left: 20px;font-size: 20px;color: #7c9eb2">${selectFrontCustom.customname }</span>
</div>
  <!-- START MAIN -->
  <div id="main" >
    <!-- START WRAPPER -->
    <div class="wrapper">

      <!-- START CONTENT -->
      <section id="content">
        <!--start container-->
        <div class="container">
          <div class="section">

            <div id="input-fields">
              	<label style="font-size: 20px;margin-left: -7px;">用户基本信息</label>
              <div class="row" style="margin-top: 30px;">
                <div class="col s12 m8 l9">
                  <div class="row">
                   
                      <div class="row" >
                        <div class="input-field col s6" style="margin-top: 40px;">
                          <input id="last_name" name="customname" value="${selectFrontCustom.customname }" type="text" class="validate" style="font-size: 14px;">
                          <label for="last_name" style="font-size: 15px;">用户名</label>
                        </div>
                          <div class="input-field col s6" style="margin-top: 40px;">
                              <input id="password" type="password" name="password" value="${selectFrontCustom.password }" class="validate" style="font-size: 14px;">
                              <label for="password" style="font-size: 15px;">密码</label>
                          </div>
                      </div>
                   
                  </div>
                </div>
              </div>
            </div>
            <div id="prefilling-text" class="section">
             <!--  <h4 class="header">用户个人信息</h4> -->
              <div class="row">
                <div class="col s12 m8 l9">
                  <div class="row">
                    <div class="input-field col s6" style="margin-top: 40px;">
                      <input placeholder ="请如实填写" id="first_name2" type="text" class="validate" name="name" value="${selectFrontCustom.name }" style="font-size: 14px;">
                      <label class="active" for="first_name2" style="font-size: 15px;">真实姓名</label>
                    </div>
                      <div class="col s12 m8 mm" style="margin-top:15px;">
                      		<label class="active" for="first_name2" style="font-size: 15px;">生日</label>
                          <input type="date" class="datepicker" name="birthday" value="<fmt:formatDate value="${selectFrontCustom.birthday}" pattern="yyyy-MM-dd" />" style="font-size: 14px;">
                      </div>
                  </div>
                </div>
              </div>
            </div>


            <!--Icon Prefixes-->
            <div id="icon-prefixes" class="section">
              <div class="row">
                <div class="col s12 m8 l9">
                  <div class="row">
                    <div class="input-field col s6" style="margin-top: 40px;">
                      <input placeholder ="请如实填写" id="first_name2" type="text" class="validate" name="customid" value="${selectFrontCustom.customid }" style="font-size: 14px;">
                      <label class="active" for="first_name2" style="font-size: 15px;">身份证号</label>
                    </div>
                      <%-- <div class="row">
                          <div class="col s6 m8 l9" style="float: inherit;margin-top: 40px;" >
                              <label class="active" for="first_name2"  style="font-size: 15px;" >性别</label>
                                   <!--  <span>
                                      <input name="sex" value="0" type="radio" id="test1" />
                                      <label for="test1" style="font-size: 14px;">男</label>
                                  </span>
                                  <span>
                                      <input name="sex" value="1" type="radio" id="test2" />
                                      <label for="test2" style="font-size: 14px;">女</label>
                                  </span>   -->
                          <span>
                            <c:if test="${selectFrontCustom.sex ==0 }">
							男 &nbsp;
							<input type="radio" value="0" name="sex" checked="checked"/>&nbsp;&nbsp;&nbsp;
							 女 &nbsp;
							<input type="radio" value="1" name="sex" /> 
							</c:if>
								</span>
								<span>
							<c:if test="${selectFrontCustom.sex ==1 }">
							男 &nbsp;
							<input type="radio" value="0" name="sex"/>
							女 &nbsp;
							<input type="radio" value="1" name="sex"  checked="checked"/>
							</c:if>
                            </span> 
                          </div> --%>
                        <div class="input-field col s6" style="margin-left: 438px;margin-top: -47px;">
                          <input id="icon_telephone" type="tel" class="validate" name="address" value="${selectFrontCustom.address }" style="font-size: 14px;">
                          <label for="icon_telephone" style="font-size: 15px;">住址</label>
                        </div>
                      </div>
                   
                  </div>
                </div>
              </div>
            </div>

              <div>
                <!--   <h4 class="header">用户通讯信息</h4> -->
                <div id="icon-prefixes" class="section">
              	<div class="row">
                <div class="col s12 m8 l9">
                  <div class="row">
                           <div class="input-field col s6" >
                                <input type="text" class="validate" name="phone" value="${selectFrontCustom.phone }" style="font-size: 14px;">
                                <label style="font-size: 15px;">电话号码</label>
                            </div>
                            <div class="input-field col s6" >
                                 <input type="text" class="validate" name="wechat" value="${selectFrontCustom.wechat }" style="font-size: 14px;">
                                  <label style="font-size: 15px;">微信号</label>
                            </div>
                     	</div>
                   </div>
              </div>
        </div>
        </div>
    </div>
    
  <!--end container-->
  </section>

</div>
  <!-- END WRAPPER -->
  </div>
  <!-- END MAIN -->
</from>
		<center>
			<input type="submit" value="确认修改" class="btn"  onclick="sex()"/>
			<input type="button" value="返回" onclick="javascript:history.back();" class="btn" />
		</center>
<footer class="footer navbar-inverse">
    <div class="container" style="margin-right: 300px;">
        <p class="text-muted">块数据</p>
    </div>
</footer>
<!--传值  -->
<script type="text/javascript">
		function sex() {
			var sexValue = document.getElementById("formList").sex;
			for (var i = 0; i < sexValue.length; i++) {
				if (sexValue[i].checked) {
					sex = sexValue[i].value;
				}
			}

		};
</script> 
<script>
$('.a').change(function(e) {//图片显示
    var _URL = window.URL || window.webkitURL;
    var file, img1;
    if ((file = this.files[0])) {
        img1 = new Image();
        img1.onload = function() {
            $('.img1').attr('src', this.src);
            console.log(this.width)
        };
        img1.src = _URL.createObjectURL(file);
    }
});

//判断是否修改过头像，如果修改过则显示修改后的头像，否则显示默认头像
 if(window.sessionStorage.getItem('userFace')){
	$("#userFace").attr("src",window.sessionStorage.getItem('userFace'));
}else{
	$("#userFace").attr("src","images/face.jpg");
};
/* document.all("sex")[0].checked=true;  */
</script>
</body>

</html>
