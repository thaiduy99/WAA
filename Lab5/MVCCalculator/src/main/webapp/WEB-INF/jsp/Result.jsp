<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="forr" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">@import url(resources/css/main.css);</style>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RESULTS</title>
</head>
<body>
 
<div id="global">
 
<h2>Results</h2>
<h3>${greeting}</h3>
<form >
		<input name="add1" type="text" size = "2" readonly value="${calculator.add1}"/>+
		<input name="add2" type="text" size = "2" readonly value="${calculator.add2}"/>=
		<input name="sum" type="text" size = "4"  readonly value="${calculator.sum}"/>
		<br>
		<input name="add3" type="text" size = "2" readonly   value="${calculator.mult1}"/>*
		<input name="add4" type="text" size = "2" readonly   value="${calculator.mult2}"/>=
		<input name="product" type="text" size = "4" readonly value="${calculator.product}"/>
		<br>
		 <button type=button onclick=window.location.href="calculator">Try Again</button>
</form>
<%--	<form:form modelAttribute="calculator" action="calculator" method="post">--%>

<%--		<form:input id="add1" path="add1" size = "2" />--%>
<%--		<form:input id="add2"  path="add2" size = "2" />--%>
<%--		<form:input id="sum" path="sum" size = "2" readonly = "true"/>--%>
<%--		<br>--%>
<%--		<form:input id="mult1"  path="mult1" size = "2" />--%>
<%--		<form:input id="mult2"  path="mult2" size = "2" />--%>
<%--		<form:input id="product"  path="product" size = "2" readonly = "true"/>--%>
<%--		<br>--%>
<%--		<button type=button onclick=window.location.href="calculator">Try Again</button>--%>
<%--	</form:form>--%>
</div>
</body>
</html>