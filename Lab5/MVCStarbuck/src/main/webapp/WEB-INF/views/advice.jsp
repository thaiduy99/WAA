<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
<title>Starbuck's</title>
</head>
<body>
<h2>Hello ${user.name}! <a href="signout"> Signout</a>
</h2>
<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action = "showadvice" method="post">
<select name="roastKey"  >
			<option value="-">  --Select Roast-- </option>
	  		<c:forEach var="roast" items="${roasts}">
	    		<option value="${roast.key}" > ${roast.value}</option>
			</c:forEach>

</select>

<p>
	<input type="submit" value = "Submit"/><span></span>
</p>
</form>

</body>
</html>