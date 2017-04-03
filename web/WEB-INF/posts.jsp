<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yevgeniy
  Date: 02.04.2017
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guestbook posts</title>
</head>
<body>
    <table border="1">
        <c:forEach items="${requestScope.posts}" var="post">
        <tr>
            <td>${post.id}</td>
            <td>${post.txt}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
