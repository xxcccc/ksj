<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Item_List.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <table class="tablelist">
			<thead>
				<tr>
					<th><input name="" type="checkbox" value="" /></th>
					<th>ID<i class="sort"><img src="images/px.gif" /></i></th>
					<th>名字</th>
					<th>类别</th>
					<th>等级</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${itemList }" var="items">
					<tr>
						<td>
							<input id="" class="raido" type="checkbox" name="customid"  />
						</td>
						<td>
							<span>${items.name }</span>
						</td>
						<td>
							<span>${items.itemtype.type }</span>
						</td>
						
						<td>
							<span>${items.itemlevel.level }</span>
						</td>
						
						
					</tr>
				</c:forEach>

			</tbody>
		</table>
  </body>
</html>
