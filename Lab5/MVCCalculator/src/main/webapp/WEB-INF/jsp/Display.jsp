<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">@import url(/WEB-INF/resources/css/main.css);</style>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
 
<div id="global">

<c:if test="${errors != null}">
     
     <p id="errors">
         Error(s)!
        <ul>
	        <c:forEach var="error" items="${errors}">
	            <li>${error}</li>
	        </c:forEach>
	    </ul>
 
     
 </c:if>

	<form:form modelAttribute="newCalculator" action="calculatorSave" method="post">
		<fieldset>
			<legend>Calculator</legend>
			<form:input id="add1" path="add1" size = "2" />+
			<form:input id="add2" path="add2" size = "2" />=
			<form:input id="sum" path="sum" size = "2" readonly="true"/>
			<br>
			<form:input id="mult1" path="mult1" size = "2" />*
			<form:input id="mult2" path="mult2" size = "2" />=
			<form:input id="product" path="product" size = "2" readonly="true"/>
			<br>
			<input type="submit" value="Submit" />
		</fieldset>
	</form:form>
<%--<form action="calculatorSave" method="post">--%>
<%--   <fieldset>--%>
<%--        <legend>Calculator</legend>--%>

<%--		<input name="add1" type="text" size = "2" value="${calculator.add1}"/>+--%>
<%--		<input name="add2" type="text" size = "2"  value="${calculator.add2}" />=--%>
<%--		<input name="sum" type="text" size = "4" value="${calculator.sum }" readonly />--%>
<%--		<br> --%>
<%--		<input name="mult1" type="text" size = "2" value="${calculator.mult1}" />*--%>
<%--		<input name="mult2" type="text" size = "2" value="${calculator.mult2}" />=--%>
<%--		<input name="product" type="text" size = "4" value="${calculator.product}"  readonly/>--%>
<%--		<br>--%>
<%--		<input type="submit" value="Submit" />--%>
<%--    </fieldset>   --%>
<%--</form>--%>
	</div>
</body>
</html>