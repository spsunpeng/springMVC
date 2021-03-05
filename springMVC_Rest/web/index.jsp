<%--
  Created by IntelliJ IDEA.
  User: sunpeng
  Date: 2021/2/19
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% pageContext.setAttribute("ctp", request.getContextPath());%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="${ctp}/user" method="post">
      <input type="submit" value="增加">
    </form>
    <%--post转put请求：未成功--%>
    <form action="${ctp}/user" method="post">
      <input name="_method" value="put" type="hidden">
      <input type="submit" value="修改">
    </form>
    <%--post转delete请求：未成功--%>
    <form action="${ctp}/user/1" method="post">
      <input name="_method" value="delete" type="hidden">
      <input type="submit" value="删除">
    </form>
    <a href="${ctp}/user">查询</a><br/>
  </body>
</html>
