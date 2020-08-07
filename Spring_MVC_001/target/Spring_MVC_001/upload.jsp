<%--
  Created by IntelliJ IDEA.
  User: 邱林海
  Date: 2020/8/7
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/file/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="img"><br>
        <input type="submit" value="上传">
    </form>

</body>
</html>
