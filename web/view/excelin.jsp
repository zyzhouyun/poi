<%--
  Created by IntelliJ IDEA.
  User: hr
  Date: 2019/8/5
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Excel导入</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/stuexcel/studentExcelIn" enctype="multipart/form-data" method="post">
    <input type="file" name="excelFile">
    <input type="submit" value="导入">
</form>

</body>
</html>
