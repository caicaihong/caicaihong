<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  
  <form action="" method = post name =form>
  <p>请输入长方体的长度：<input type = "text" name ="length">
  <p>请输入长方体的宽度：<input type = "text" name ="width">
   <p>请输入长方体的高度：<input type = "text" name ="height">
  <input type = "submit" value="送出" name = submit>
  </form>
	<%
     String a = request.getParameter("length"),
            b = request.getParameter("width"),
            c = request.getParameter("height");
     double length=0,width=0,height=0;
      %>

	<%
     if(a == null){
     a = "0";
     b = "0";
     c = "0";
     }
      %>

	<%
     try{length = Double.valueOf(a).doubleValue();
         width = Double.valueOf(b).doubleValue();
         height = Double.valueOf(c).doubleValue();
         out.print("长方体面积为："+length*width*height);
     }
    catch(NumberFormatException e){
    out.print("<br>"+"请输入数字字符");
    }
     
    
      %>
</body>
</html>
