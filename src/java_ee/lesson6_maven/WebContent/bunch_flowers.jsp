<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title>Title</title>
</head>
<body>

<jstl:forEach items="${requestScope.flowers }" var="flower">
	<br/>
	<p><img src="${flower.imagePath }" alt="flower"/></p>
	<p>${flower.name }</p>
	<p>${flower.price }</p>
	<p>${flower.lengthSteack }</p>
	<p>${flower.iceLevel }</p>
	
	<form method="post" action="controller?action=remove_flower">
		<input type="hidden" name="bunch_id" value="${requestScope.id }"/>
		<input type="hidden" name="name" value="${requestScope.name }"/>
		<input type="hidden" name="price" value="${requestScope.price }"/>
		<input type="hidden" name="lengthSteack" value="${requestScope.lengthSteack}"/>
		<input type="hidden" name="iceLevel" value="${requestScope.iceLevel }"/>
		<input type="submit" value="Remove Flower"/>
	</form>
</jstl:forEach>

</body>
</html>
