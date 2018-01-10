<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<link rel="stylesheet" href="${pageContext.request.contextPath }/page/front/website/assets/css/amazeui.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/page/front/website/assets/css/common.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/page/front/website/assets/css/index.min.css" />
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/page/front/website/assets/js/amazeui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath }/page/front/website/assets/js/common.js" charset="utf-8"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrapValidator.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrapValidator.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/layer/skin//layer.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/layer/layer.min.js"></script>
    <style>
        body{
            style="padding-right: 0!important;"
             style="background-color:#3B9CC9"
            font-family: "microsoft yahei";
            /*min-width: 800px;*/
        }
        img{
            width: 100%;
            /*height: 462px;*/
        }
        .navbar{
            /*margin-bottom: -10px;*/
        }
        #myppt{
            margin-top: -20px;

        }
        #to_top{
			width:60px; 
			height:60px;
			padding:20px 0 0 0;
			font:14px/20px arial;
			text-align:center;
			background:transparent url(images/topUp.jpg);
			cursor:pointer;
			color:#fff;
			z-index:1000;
		}
		#to_newsletter{
			width:60px;
			height:60px;
			padding:20px 0 0 0;
			font:14px/20px arial;
			text-align:center;
			background:transparent url(images/newsletter.jpg);
			cursor:pointer;
			color:#fff;
			z-index:1000;
		}
    </style>
</head>
<body  style="padding-right: 0!important;position:relative;">
	<!-- 返回顶部按钮 -->
	<div style="height:130px;width:60px;position: fixed;left:0;bottom:9.6%;z-index:100;">
		<div id="to_newsletter" data-toggle="modal" data-target="#newsletter"></div>
		<div id="to_top"></div>
	</div>
	<!--留言模态框 开始  -->
	<div class="modal fade" id="newsletter" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog modal-xs">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	                <h4 class="modal-title" id="myModalLabel">请您留言</h4>
	            </div>
		        <form id="LeaveCommentsForm" action="${pageContext.request.contextPath }/front/leaveComments/save.action" method="get" class="form-horizontal" data-bv-message="This value is not valid"
                      data-bv-feedbackicons-valid="glyphicon glyphicon-ok"
                      data-bv-feedbackicons-invalid="glyphicon glyphicon-remove"
                      data-bv-feedbackicons-validating="glyphicon glyphicon-refresh">   
		            <div class="modal-body">
		            	<div class="tab-content">
                            <div class="tab-pane active" id="info-tab">
                                <div class="form-group">
                                    <label class="col-lg-3 control-label">留言内容</label>
                                    <div class="col-lg-7">
                                        <textarea name="comments" cols="90" rows="5" class="form-control" id="textarea" style="resize:none;" placeholder="请在此输入留言内容，我们会尽快与您联系。（必填）" data-bv-notempty data-bv-notempty-message="留言不能为空"></textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-lg-3 control-label">姓名</label>
                                    <div class="col-lg-7">
                                        <input type="text" name="name" placeholder="姓名" class="form-control" data-bv-notempty data-bv-notempty-message="姓名不能为空"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-lg-3 control-label">电话</label>
                                    <div class="col-lg-7">
                                       <input type="text" name="phone" placeholder="电话号码(必填)" class="form-control" data-bv-notempty data-bv-notempty-message="电话不能为空" data-bv-regexp="true" data-bv-regexp-regexp="[0-9]{11}" data-bv-regexp-message="电话号码格式不正确"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-lg-3 control-label">邮箱</label>
                                    <div class="col-lg-7">
                                        <input type="text" name="email" placeholder="邮箱" class="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-lg-3 control-label">地址</label>
                                    <div class="col-lg-7">
                                       	<input type="text" name="address" placeholder="地址" class="form-control"/>
                                    </div>
                                </div>
                            </div>
                        </div>
		            </div>
		            <div class="modal-footer">
		                <button id="commentsBtn" type="button" class="btn btn-primary sub">提交</button>
		                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		            </div>
	            </form>
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal -->
	</div>
	<!-- 留言模态框 结束 -->
	
	
	<div class="layout">
		<!--===========layout-header================-->
		<div class="layout-header am-hide-sm-only">
			<!--topbar start-->
			<div class="topbar">
				<div class="container">
					<div class="am-g">
						<div class="am-u-md-3">
							<div class="topbar-left" style="padding-top:5px;width: 700px;">
								<span style="margin-top:-20px;">您处于</span>
								<select style="color:black;margin-top:-5px;height:30px;" name="city" id="fcity">
									<option value="1">全国</option>
								</select>
							</div>
						</div>
						<c:choose>
							<c:when test="${not empty custom}">
								<div class="am-u-md-9">
									<div class="topbar-right am-text-right am-fr">
										您好
										<span>${sessionScope.custom.name }</span>
										 <a style="text-decoration:none;" href="${pageContext.request.contextPath }/front/custom/findCustomRelativesResultMap.action" class="tablelink">个人中心</a> 
										<span id="aLoginOut" style="font-size:14px;cursor: pointer;">退出</span>
									</div>
								</div>
							</c:when>
							<c:otherwise>
								<div class="am-u-md-9">
									<div class="topbar-right am-text-right am-fr" >
										<ul  style="margin-bottom: 2px;list-style:none;">
       										 <li style="margin-bottom: 3px;float:right;"><a data-toggle="modal" data-target="#register" href="" style="height: 34px;margin-top: -3px;"> 注册</a></li>
       										 <li style="margin-bottom: 3px;float:right;"><a data-toggle="modal" data-target="#login" href="" style="height: 34px;margin-top: -3px;">登录</a></li>
    									</ul>
									</div>
								</div>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</div>
			<!--topbar end-->
			
	 
    <!-- 注册窗口开始 -->
    <div id="register" class="modal fade" tabindex="-1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button class="close" data-dismiss="modal">
                        <span>&times;</span>
                    </button>
                    <h4 class="modal-title">注册</h4>
                </div>
                <div class="modal-body">
                    <form id="registerForm" class="form-group" action="${pageContext.request.contextPath }/front/custom/registerCustom.action" method="post" name="form1">
                             <div class="input-group" style="margin-left: 130px"  >
                                <span class="input-group-addon" style="background-color: #59BCDB">&nbsp;&nbsp; 
                            	&nbsp;&nbsp;&nbsp;ID&nbsp;&nbsp;&nbsp;&nbsp;
                            	</span>
                                <input class="form-control" id="customid" onblur="idyanzheng()" name="customid" type="text" style="width:70%"  placeholder="身份证号">
                            </div><br/>
                            <div class="input-group" style="margin-left: 130px">
                                <span class="input-group-addon" style="background-color: #59BCDB">&nbsp; 
                            	 &nbsp;姓&nbsp;&nbsp; 名&nbsp;
                            	</span>
                                <input class="form-control" id="name" onblur="nameyanzheng()" name="name" type="text" style="width:70%"  placeholder="请填写中文名">
                            </div><br/>
                             <div class="input-group" style="margin-left: 130px">
                                <span class="input-group-addon" style="background-color: #59BCDB;height: 34px;">&nbsp; 
                            	 &nbsp;性&nbsp;&nbsp; 别&nbsp;
                            	</span>&nbsp;
                                		男 &nbsp;
								<input type="radio" value="0" name="sex"  /> &nbsp;
										女&nbsp;
								<input type="radio" value="1" name="sex" />
                            </div><br/>
                            <div class="input-group" style="margin-left: 130px">
                                <span class="input-group-addon" style="background-color: #59BCDB">&nbsp;&nbsp; 
                            	 用户名
                            	</span>
                                <input class="form-control" id="customname" onblur="customnameyanzheng()" name="customname" type="text" style="width:70%"  placeholder="2-12位字符">
                            </div><br/>
                           <div class="input-group" style="margin-left: 130px">
                                <span class="input-group-addon" style="background-color: #59BCDB">&nbsp;
                                	&nbsp;密&nbsp;&nbsp;码&nbsp;&nbsp;
                                </span>
                                <input class="form-control" id="password" onblur="passwordyanzheng()" type="password" name="password" style="width:70%"  placeholder="密码长度为6-16位字符">
                            </div>
                            <br/>
                            <div class="input-group" style="margin-left: 130px">
                                <span class="input-group-addon" style="background-color: #59BCDB">
                              	  确认密码
                              	 </span>
                                <input class="form-control" type="password" id="password1" name="password2" onkeyup="validate()"  style="width:70%" placeholder="请再次输入密码">
                            <span id="tishi"></span>
                            </div>
                            <br/>
                           <div class="input-group" style="margin-left: 130px">
                                <span class="input-group-addon" style="background-color: #59BCDB">&nbsp;
                               		&nbsp;手机号&nbsp;
                               	 </span>
                                <input class="form-control" id="phone" onblur="upperCase()" name="phone" type="text" style="width:70%" placeholder="请输入11位手机号">
                            </div><br/>
                            <center>
                            <div>
                                <button class="btn btn-primary" id="regBtn" type="button">提交</button>
                                <button class="btn btn-danger" data-dismiss="modal">取消</button>
                                <!-- 	<button class="btn btn-danger" type="reset" >重置</button> -->
                            </div></center>
                            <a id="forwardA" href="" data-toggle="modal"  data-dismiss="modal" data-target="#login">已有账号？点我登录</a>
                    </form>
                </div>
            </div>
        </div>
    </div>
 <!-- 注册结束 -->   
<!-- 登录窗口开始 -->
    <div id="login" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-body">
                    <button class="close" data-dismiss="modal">
                        <span>&times;</span>
                    </button>
                </div>
                <div class="modal-title">
                    <h1 class="text-center">登录</h1>
                </div>
                <div class="modal-body">
                    <form id="loginForm"  class="form-group" action="${pageContext.request.contextPath }/front/custom/login.action" method="post">
                            <div class="input-group" style="margin-left: 150px">
                            	<span class="input-group-addon" style="background-color: #59BCDB">
                            	<i class="am-icon-user" style="width: 14px;"></i>
                            	</span>
                             	<input class="form-control" id="loginCustomname" name="customname" style="width:60%"  type="text" placeholder="用户名" >
                            </div><br/>
                            <div class="input-group" style="margin-left: 150px">
                             	<span class="input-group-addon" style="background-color: #59BCDB">
									<i class="am-icon-key"> </i>
								</span>
                                <input class="form-control" id="loginPassword" style="width:60%" type="password" name="password" placeholder="密码">
                            </div><br/>
                            <center>
                            <div >
                                <button id="loginBtn" class="btn btn-primary" type="button">登录</button>
                                <button class="btn btn-danger" data-dismiss="modal">取消</button>
                            </div>
                            </center>
                            <a href="" data-toggle="modal" data-dismiss="modal" data-target="#register">还没有账号？点我注册</a>
                    </form>
                </div>
            </div>
        </div>
    </div>

<!-- 登录窗口结束 -->		
		
			<!-- 模态框（Modal）查看个人资料 -->
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			    <div class="modal-dialog modal-lg">
			        <div class="modal-content" style="width:100%;height:100%;background:url(images/login-bg.jpg);position:relative}">
			            <div class="modal-header">
			                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
			                <h4 class="modal-title" id="myModalLabel">个人资料</h4>
			            </div>
			            <form action="${pageContext.request.contextPath }/front/custom/updateCustomSubmit.action" method="post"
			             enctype="multipart/form-data" method="post" name="reg_testdate" onsubmit="return validate_form(this)">
						    <div style="height: 130px;margin-left: 50px;margin-top: 5px;">
						    <%-- <img src="upload/${customUpdate.pic}" style="width:130px;height:130px;border-radius:100%" class="img1" id="userFace"/> --%> 
							<input name="custompic" type="file" class="a" >
						    </div><br/>
                           
                            <ul style="float:left;margin-left:50px;background-color: black;width: 250px;height: 357px;">
                            <li style="margin-top: 1px;"><font color="white">个人中心</font></li>
                            <li style="margin-top: 50px;"><font color="white">安全设置</font></li>
                            <li style="margin-top: 50px;"><font color="white">修改密码</font></li>
                            <li style="margin-top: 50px;"><font color="white">我的资产</font></li>
                            <li style="margin-top: 50px;"><font color="white">我的小窝</font></li>
                            </ul>
                       		<center>
						    <table class="table table-hover" style="width: 410px;margin-top: 19px;">
						    	<tr >
						    		<td style="text-align:right;">用户ID</td>
						    		<td><input type="text"  name="customid" value="${customUpdate.customid}" class="dfinput" disabled/></td>
						    	</tr>
						    	<tr >
						    		<td style="text-align:right;">姓名</td>
						    		<td><input name="name" type="text" class="dfinput" value="${customUpdate.name }" disabled/></td>
						    	</tr>
						    	<tr>
						    		<td style="text-align:right;">性别</td>
						    	
						    	</tr>
						    	<tr >
						    		<td style="text-align:right;">用户名</td>
						    		<td><input name="customname" type="text" class="dfinput" value="${customUpdate.customname }" disabled/></td>
						    	</tr>
						    	<tr >
						    		<td style="text-align:right;">密码</td>
						    		<td><input name="password" type="password" class="dfinput" value="${customUpdate.password }" /></td>
						    	</tr>
						    	<tr >
						    		<td style="text-align:right;">出生日期</td>
						    		<td><input name="birthday" type="text" class="demo-input" value="${customUpdate.birthday }"  id="test1"></td>
						    	</tr>
						    	<tr >
						    		<td style="text-align:right;">家庭住址</td>
						    		<td><input name="address" type="text" class="dfinput" value="${customUpdate.password }" /></td>
						    	</tr>
						    	<tr >
						    		<td style="text-align:right;">手机号</td>
						    		<td><input name="phone" type="text" class="dfinput" value="${customUpdate.password }" /></td>
						    	</tr>
						    	<tr >
						    		<td style="text-align:right;">微信</td>
						    		<td><input name="wechat" type="text" class="dfinput" value="${customUpdate.password }" /></td>
						    	</tr>
						    </table>
						    </center>
						    
				            <div class="modal-footer">
				                <button id="submitBtn" type="button" class="btn btn-primary sub">完善资料</button>
				                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				            </div>
			            </form>
			        </div><!-- /.modal-content -->
			    </div><!-- /.modal -->
			</div>
	<!-- 查看个人资料结束 -->
			<div class="header-box">
				<!--nav start-->
				<div class="nav-contain">
					<div class="nav-inner">
						<ul class="am-nav am-nav-pills am-nav-justify">
							<li class="">
								<a href="${pageContext.request.contextPath }/page/front/custom_main.jsp">首页</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath}/front/livebroadcast/livebroadcastList.action">直播</a>
								<!-- sub-menu start-->
								<ul class="sub-menu">
									<li class="menu-item">
										<a href="${pageContext.request.contextPath}/front/livebroadcast/livebroadcastList.action">观看直播</a>
									</li>					
								</ul>
								<!-- sub-menu end-->
							</li>
							<li>
								<a href="${pageContext.request.contextPath }/front/course/courseList.action">课程</a>
								<!-- sub-menu start-->
								<ul class="sub-menu">
									<li class="menu-item">
										<a href="${pageContext.request.contextPath }/front/course/courseList.action">看课</a>
									</li>
									<li class="menu-item">
										<a href="${pageContext.request.contextPath }/front/course/selectCourseList.action">查看选课</a>
									</li>
									<li class="menu-item">
										<a href="${pageContext.request.contextPath }/front/linecourse/lineCourseList.action">线下课程报名</a>
									</li>
								</ul>
								<!-- sub-menu end-->
							</li>
							<li>
								<a href="page/front/shop/index.jsp">商城</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath }/page/front/healthRecords/healthRecords_font_main.jsp">健康管理</a>
								<!-- sub-menu start-->
								<!-- <ul class="sub-menu">
									<li class="menu-item">
										<a href="html/product2.html">健康检测</a>
									</li>
									<li class="menu-item">
										<a href="html/product3.html">个人健康评估</a>
									</li>
								</ul> -->
								<!-- sub-menu end-->
							</li>
							<li>
								<a href="${pageContext.request.contextPath }/page/front/healthyProject/healthyProject.jsp">保健养生</a>
								<!-- 保健-menu start-->
								<ul class="sub-menu">
									<li class="menu-item">
										<a href="${pageContext.request.contextPath }/front/healthyProject/healthyProjectList.action">保健项目列表</a>
									</li>
									<li class="menu-item">
										<a href="${pageContext.request.contextPath }/front/healthyProject/myReserveHealthyProject.action">我报名的项目</a>
									</li>
								</ul>
								<!-- 保健-menu end-->
							</li>
							<li>
								<a href="${pageContext.request.contextPath }/page/front/activety/activety_list.jsp">社区活动</a>
								<!-- 活动  开始-->
								<ul class="sub-menu">
									<li class="menu-item">
										<a href="${pageContext.request.contextPath }/page/front/activety/activety_allCity_list.jsp">全国活动</a>
									</li>
									<li class="menu-item">
										<a href="${pageContext.request.contextPath }/page/front/activety/activety_enroll_list.jsp">报名的活动</a>
									</li>
								</ul>
								<!-- 活动  结束-->
							</li>
							<li>
								<a href="${pageContext.request.contextPath }/page/front/about.jsp">联系我们</a>
							</li>
						</ul>
					</div>
				</div>
				<!--nav end-->
			</div>
		</div>
		
	</div>
</body>
<script type="text/javascript">
$("#fcity").change(function(){
	var id=$(this).val();
	$.ajax({
		type:"get",
		url:"${pageContext.request.contextPath }/front/custom/setSessionCity.action",
		data:"cityid="+id,
		success:function(data){
			location=location;
		}
	});
});
</script>
<script type="text/javascript">
$(function(){
	var citySelect=$("#fcity");
	var chooseCity;
	var city;
	$.ajax({
		type:"get",
		url:"${pageContext.request.contextPath}/front/city/getSessionCustomCity.action",
		success:function(data){
			chooseCity=data.chooseCityId;
			city=data.cityid;
		}
	});
	$.ajax({
		type:"get",
		url:"${pageContext.request.contextPath}/front/city/findAllCity.action",
		success:function(data){
			var cloneOption=$("option:first");
			for(var item in data){
				/* if(item==0){
					continue;
				} */
				cloneOption=cloneOption.clone();
				cloneOption.show();
				cloneOption.val(data[item].cityid);
				cloneOption.text(data[item].name);
				citySelect.append(cloneOption);
			}
			$("#fcity").val(${sessionScope.customChooseCity});
		}
	});
});
</script>
<script src="${pageContext.request.contextPath }/js/laydate.js"></script>
<script>
lay('#version').html('-v'+ laydate.v);

//执行一个laydate实例
laydate.render({
  elem: '#test1' //指定元素
});
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
document.all("sex")[0].checked=true;  
</script>
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


<script type="text/javascript">
var flag=true;
function upperCase(){
	var phone = document.getElementById('phone').value;

	if(!(/^1[34578]\d{9}$/.test(phone))){ 
	    alert("手机号码有误，请重填!");  
	    flag= false;
	    return false; 
	}
	flag= true;
	return true;
};
function idyanzheng(){
	var customid =document.getElementById('customid').value;
	if(customid==null||customid==""){
		alert("身份证号码不能为空");
		flag= false;
		return false;
	}
	if(!(/(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/.test(customid))){
		 alert("身份证号码有误，请重填!"); 
		 flag= false;
		 return false;
	}
	$.ajax({
		type:"get",
		url:"${pageContext.request.contextPath }/front/custom/checkCustomid.action",
		data:"customid="+customid
	}).done(function(data){
		if(data=="1"){
			alert("该身份证已经存在!\n");
			$("#customid").val("");
			flag= false;
			return false;
		}
	});
	flag= true;
	return true;
}; 
function nameyanzheng(){
	var name =document.getElementById('name').value;
	if(name==null||name==""){
		alert("姓名不能为空");
		flag= false;
		return false;
	}
	if(!(/^[\u4E00-\u9FA5\uf900-\ufa2d]{1,12}$/.test(name))){
		 alert("请填写中文名!"); 
		 flag= false;
		 return false;
	}
	flag= true;
	return true;
};
function customnameyanzheng(){
	var customname =document.getElementById('customname').value;
	if(customname==null||customname==""){
		alert("用户名不能为空");
		flag= false;
		return false;
	}
	if(!(/^[\u4E00-\u9FA5\uf900-\ufa2d\w\.\s]{2,12}$/.test(customname))){
		 alert("请填写用户名2-12位字符!"); 
		 flag= false;
		 return false;
	}
	$.ajax({
		type:"get",
		url:"${pageContext.request.contextPath }/front/custom/checkCustomname.action",
		data:"customname="+customname,
		success:function(data){
			if(data=="1"){
				alert("此用户名已经存在\n请更换");
				$("#customname").val();
				flag= false;
				return false;
			}
		}
	});
	flag= true;
	return true;
};
function passwordyanzheng(){
	var password =document.getElementById('password').value;
	if(password==null||password==""){
		alert("密码不能为空");
		flag= false;
		return false;
	}
	if(!(/^[\w\W]{6,16}$/.test(password))){
		 alert("密码长度为6-16位字符!"); 
		 flag= false;
		 return false;
	}
	flag= true;
	return true;
};

function validate() {
    var pwd1 = document.getElementById("password").value;
    var pwd2 = document.getElementById("password1").value;
    if(pwd1==null||pwd2==null||pwd1==""||pwd2==""){
		alert("密码不能为空");
		flag= false;
		return false;
	}
    if(pwd1 == pwd2){
        document.getElementById("tishi").innerHTML="<font color='green'>两次密码相同</font>";
        return true;
        //document.getElementById("button").disabled = false;
     }else {
        document.getElementById("tishi").innerHTML="<font color='red'>密码不相同</font>";
        flag= false;
        return false;
       //document.getElementById("button").disabled = true;
     }
};

$("#regBtn").click(function(){
	
	if(!idyanzheng()){
		flag=false;
		return ;
	} 
	if(!nameyanzheng()){
		flag=false;
		return ;
	}
	if(!customnameyanzheng()){
		flag=false;
		return ;
	}
	if(!passwordyanzheng()){
		flag=false;
		return ;
	}
	if(!validate()){
		flag=false;
		return ;
	}
	if(flag){
		console.info(flag+"我要提交咯");
		var registerForm=$("#registerForm").serialize();
		$.ajax({
			type:"post",
			url:"${pageContext.request.contextPath }/front/custom/registerCustom.action",
			data:registerForm,
			success:function(data){
				alert("注册成功");
				$("#forwardA").click();
				$("#register").modal("hide");
				$("#login").modal("show");
			}
		});
	} else{
		flag=true;
	}
});
</script>
<!-- 时间 -->
<script src="${pageContext.request.contextPath }/js/laydate.js"></script>
<script>
lay('#version').html('-v'+ laydate.v);

//执行一个laydate实例
laydate.render({
  elem: '#starttime' //指定元素
});

lay('#version').html('-v'+ laydate.v);

//执行一个laydate实例
laydate.render({
elem: '#overtime' //指定元素
});
</script>

<!--js验证  -->
<script type="text/javascript">

</script>
<script type="text/javascript">
/**
 * 页面加载判断滚动条高度是否为0,隐藏;
 */
$(function(){
	if($(document).scrollTop()==0){
		$("#to_top").hide();
	};
});
/**
 * 滚动条高度为0,返回顶部按钮消失
 */
$(window).scroll(function(){
	//获得当前滚动条高度
	var scrolltop=$(this).scrollTop();
	if(scrolltop==0){
		$("#to_top").hide();
	} else{
		$("#to_top").show();
	}
});
/**
 * 返回顶部
 */
$("#to_top").click(function(){
	javascript:scroll(0,0);
});
</script>
<script type="text/javascript">
$(document).ready(function() {
	var form=$('#LeaveCommentsForm');
    form.bootstrapValidator({
        excluded: [':disabled'],
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            phone: {
                validators: {
                    notEmpty: {
                        message: '不能为空'
                    }
                }
            },
         comments: {
             validators: {
                 notEmpty: {
                     message: '留言不能为空'
                 }
             }
         }
        }
    });
    $("#commentsBtn").click(function(){
    	//进行表单验证
        var bv = form.data('bootstrapValidator');
        bv.validate();
        if (bv.isValid()) {
        	console.log(form.serialize());
        	$.ajax({
        		type:"post",
        		url:"${pageContext.request.contextPath }/front/leaveComments/save.action",
        		data:$("#LeaveCommentsForm").serialize(),
        		success:function(data){
        			alert("留言成功"+data);
        			$("#newsletter").modal("hide");
        			window.location.reload();
        		}
        	});
        }
    });
});
</script>

<!--登录空验证  -->
<script type="text/javascript">
$('#loginBtn').click(function(){
	var customname=$('#loginCustomname').val();
	var password=$('#loginPassword').val();
	customname=encodeURI(encodeURI(customname));
	$.ajax({
		type:'get',
		url:'${pageContext.request.contextPath }/front/custom/login.action',
		data:"customname="+customname+"&password="+password,
		success:function(data){
			if(data=='0'){
				//layer.msg("用户名或密码错误");
				$('#loginForm')[0].reset();
				alert("用户名或密码错误");
			}else{
				alert("登录成功");
				location=location;
			}
		}
	});
	
});
</script>
<script type="text/javascript">
$('#aLoginOut').click(function(){
	$.ajax({
		type:"get",
		url:"${pageContext.request.contextPath }/front/custom/logout.action",
		success:function(data){
			alert("安全退出");
			location=location;
		}
	});
	return false;
});
</script>
</html>
