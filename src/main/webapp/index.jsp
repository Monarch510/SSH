<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><h2>ssh test</h2></title>
</head>

<body>
姓名：<s:property value="user.name"></s:property>
性别：<s:property value="user.sex"></s:property>
年龄：<s:property value="user.age"></s:property>
电话：<s:property value="user.phone"></s:property>
</body>
</html>
