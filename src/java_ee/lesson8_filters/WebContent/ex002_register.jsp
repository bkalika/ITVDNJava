<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="controller?action=register">
    <p><input type="text" name="name" size="10"/></p>
    <p><input type="password" name="password" size="10"/></p>
    <p>
        <select size="3" name="admin">
            <option value="true">Admin</option>
            <option value="false">User</option>
        </select>
    </p>
    <p><input type="submit" value="Register" /></p>
    <p></p>
</form>
</body>
</html>
