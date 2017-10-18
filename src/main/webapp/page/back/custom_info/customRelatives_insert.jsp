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

<title>My JSP 'custom_insert.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<script type="text/javascript" src="js/Region.js"></script>
</head>

<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li>
				<a href="#">首页</a>
			</li>
			<li>
				<a href="#">客户管理</a>
			</li>
			<li>
				<a href="#">添加客户亲属</a>
			</li>
		</ul>
	</div>

	<div class="formbody">

		<div class="formtitle">
			<span>添加客户亲属</span>
		</div>

		<form id="formList" name="reg_testdate"
			action="${pageContext.request.contextPath }/back/custom/insertRelatives.action" method="post"
			enctype="multipart/form-data">

			<ul class="forminfo">
				<li>
					<label>
						亲属姓名<b>*</b>
					</label>
					<input name="name" type="text" class="dfinput" />
					<i>亲属真实姓名</i>
				</li>
				<li>
					<label>
						电话1<b>*</b>
					</label>
					<input name="phone1" type="text" class="dfinput" />

				</li>
				<li>
					<label>
						电话2
					</label>
					<input name="phone2" type="text" class="dfinput" />
				</li>
				<li>
					<label>
						基本信息<b>*</b>
					</label>
					<input name="info" type="text" class="dfinput" />
				</li>
				<li>
					<label>
						微 信<b></b>
					</label>
					<input name="wechat" type="text" class="dfinput" />
				</li>
			</ul>
			<center>
				<input type="submit" value="提交" onclick="sex()" class="btn" />
				<input type="button" value="返回" onclick="javascript:history.back();" class="btn" />
			</center>
		</form>
	</div>


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
</body>

</html>
