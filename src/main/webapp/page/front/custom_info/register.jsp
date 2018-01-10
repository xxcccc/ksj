<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html> 
<head>
<base href="<%=basePath%>">

<title>客户注册</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="js/Region.js"></script>
<script type="text/javascript">
<script type="text/javascript" src="js/user.js"></script>

<script type="text/javascript" src="js/custom/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/custom/Validform_v5.3.2_min.js"></script>
<body >
	
	<div class="formbody1" style="background-color: #E8F2FE;">

		<div class="formtitle">
			<span>注册</span>
		</div>
		
		<form:form id="formList" name="reg_testdate" onsubmit="return validate_form(this)"
			action="${pageContext.request.contextPath }/front/custom/registerFrontCustom.action"
			 method="post" enctype="multipart/form-data" class="registerform">
			
			<ul class="forminfo">
			<li >
					<label >
						身份证号(ID)<b>*</b>
					</label >
						<input name="customid" type="text" class="dfinput" placeholder="请输入本人身份证号" datatype="idcard" nullmsg="请填写身份证号码！" errormsg="您填写的身份证号码不对！"/>
					</li>
				<li >
					<label >
						用户名<b>*</b>
					</label>
					<input name="customname" id="customname" type="text" class="dfinput" placeholder="请输入用户名（2-16个字符）" datatype="s2-16" errormsg="用户名为2-16位字符!" nullmsg="请填写用户名"/>
					
				</li>
				<li >
					<label >
						用户密码<b>*</b>
					</label>
					<input name="password" type="password" value=""  class="dfinput" placeholder="请输入密码(6-16位)" datatype="*6-16"  nullmsg="请设置密码！" errormsg="密码范围在6~16位之间！"/>
				</li>
				<!-- <li >
					<label >
						确认密码<b>*</b>
					</label>
					<div >
					<input name="password2" type="password" value=""  class="dfinput" placeholder="请确认密码" datatype="*" recheck="password" nullmsg="请再输入一次密码！" errormsg="您两次输入的账号密码不一致！"/>
					</div>
				</li> -->
				<li>
					<label>
						手机号<b>*</b>
					</label>
					<input name="phone" type="text" class="dfinput" placeholder="请输入11位手机号码" datatype="m" nullmsg="请输入您的手机号！"/>
				</li>
			</ul>
			<center>
				<input type="submit" value="提交" onclick="sex()"  class="btn" />
				 <input type="reset" name="button" id="button" value="重置" class="btn" /> 
				<input type="button" value="返回" onclick="javascript:history.back();" class="btn" />
			</center>
			
		</form:form>
		</div>

</body>
</html>
