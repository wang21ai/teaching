<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
  	<script type="text/javascript">
  		/* $(document).ready(function(){alert(123)}); */
  		$(document).ready(function(){
  			console.log($("li").length)}
  		);
  	</script>
  </head>
  
  <body>
	<ul id="ul" class="cul">
		<li>语文</li>
		<li>数学</li>
		<li>英语</li>
	</ul>
  </body>
</html>