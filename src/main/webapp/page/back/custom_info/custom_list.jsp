<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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

<title>My JSP 'user_list.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$(".click").click(function() {
			$(".tip").fadeIn(200);
		});

		$(".tiptop a").click(function() {
			$(".tip").fadeOut(200);
		});

		$(".sure").click(function() {
			$(".tip").fadeOut(100);
		});

		$(".cancel").click(function() {
			$(".tip").fadeOut(100);
		});

	});
</script>

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
				<a href="#">客户列表</a>
			</li>
		</ul>
	</div>

	<div class="rightinfo">

		<div class="tools">

			<ul class="toolbar">
				<li>
					<a href="${pageContext.request.contextPath }/page/back/custom/custom_insert.jsp"> 
						<span>
							<img src="images/t01.png" />
						</span>添加
					</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath }/page/user/custom_update.jsp?id="> <span>
							<img src="images/t02.png" />
						</span>修改
					</a>
				</li>
				<li>
					<span>
						<img src="images/t03.png" />
					</span>
					删除
				</li>
				<!-- <li>
					<span>
						<img src="images/t04.png" />
					</span>
					统计
				</li> -->
			</ul>
			
			<ul class="toolbar1">
				<li>
					<form action="${pageContext.request.contextPath }/back/custom/customList.action" method=post>
						<span>
							<select style="height: 23px;width: 50px;" name="searchType">
								<option value="id">ID</option>
								<option value="name">姓名</option>
							</select>
						</span>
						<span>
							<input type="text" name="searchValue" value="" style="height:23px;" />
						</span>
						<span>
							<button type="submit" style="height: 23px;width: 40px;">搜索</button>
						</span>
					</form>
				</li>
			</ul>

		</div>

		<table class="tablelist">
			<thead>
				<tr>
					<th><input name="" type="checkbox" value="" /></th>
					<th>ID<i class="sort"><img src="images/px.gif" /></i></th>
					<th>姓名</th>
					<th>性别</th>
					<th>手机号</th>
					<th>出生日期</th>
					<th>微信</th>
					<th>积分</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${customList }" var="custom">
					<tr>
						<td>
							<input id="" class="raido" type="checkbox" name="" value="${custom.customid }" />
						</td>
						<td>
							<span>${custom.customid }</span>
						</td>
						<td>
							<span>${custom.name }</span>
						</td>
						<td>
							<c:if test="${custom.sex ==0 }">
								<span>男</span>
							</c:if>
							<c:if test="${custom.sex ==1 }">
								<span>女</span>
							</c:if>
						</td>
						<td>
							<span>${custom.phone }</span>
						</td>
						<td>
							<span>1980-01-01</span>
						</td>
						<td>
							<span>${custom.wechat }</span>
						</td>
						<td>
							<span>${custom.integral }</span>
						</td>
						<td>
							<a
								href="${pageContext.request.contextPath }/back/user/custom_info.action?customid=${custom.customid }"
								class="tablelink">查看详情</a> <a
								href="${pageContext.request.contextPath }/back/custom/custom_update.action?customid=${custom.customid }"
								class="tablelink">修改</a> <a
								href="${pageContext.request.contextPath }/back/user/custom_delete.action?customid=${custom.customid }"
								class="tablelink"> 删除</a>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

		<div class="pagin">
			<div class="message">
				共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页
			</div>
			<ul class="paginList">
				<li class="paginItem">
					<a href="javascript:;"><span class="pagepre"></span></a>
				</li>
				<li class="paginItem">
					<a href="javascript:;">1</a>
				</li>
				<li class="paginItem current">
					<a href="javascript:;">2</a>
				</li>
				<li class="paginItem">
					<a href="javascript:;">3</a>
				</li>
				<li class="paginItem">
					<a href="javascript:;">4</a>
				</li>
				<li class="paginItem">
					<a href="javascript:;">5</a>
				</li>
				<li class="paginItem more">
					<a href="javascript:;">...</a>
				</li>
				<li class="paginItem">
					<a href="javascript:;">10</a>
				</li>
				<li class="paginItem">
					<a href="javascript:;"><span class="pagenxt"></span></a>
				</li>
			</ul>
		</div>

		<div class="tip">
			<div class="tiptop">
				<span>提示信息</span>
				<a></a>
			</div>

			<div class="tipinfo">
				<span>
					<img src="images/ticon.png" />
				</span>
				<div class="tipright">
					<p>是否确认对信息的修改 ？</p>
					<cite>如果是请点击确定按钮 ，否则请点取消。</cite>
				</div>
			</div>

			<div class="tipbtn">
				<input name="" type="button" class="sure" value="确定" />
				&nbsp;
				<input name="" type="button" class="cancel" value="取消" />
			</div>

		</div>

	</div>

	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>
</body>
</html>
