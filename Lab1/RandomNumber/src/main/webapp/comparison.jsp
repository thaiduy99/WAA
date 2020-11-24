<html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib prefix='fn' uri='http://java.sun.com/jsp/jstl/functions' %>
<%@ page isELIgnored="false" %>
<head>
    <link rel="stylesheet" type="text/css" href="resources/mystyle.css">
</head>
<body>
<h2>The random numbers are: </h2>
<c:set var="ctrnum" value='${requestScope["num"]}' />
<c:set var="first" value='${requestScope["first"]}' />
<c:set var="second" value='${requestScope["second"]}' />
<c:set var="third" value='${requestScope["third"]}' />

<c:out value="${ctrnum}"></c:out>
<c:out value="${first}"></c:out>
<c:out value="${second}"></c:out>
<c:out value="${third}"></c:out>

<h2>The comparison results are: </h2>

<c:choose>
    <c:when test="${ctrnum > first}">
        <span class="gt"><c:out value="The number ${first} is less than ${num}" ></c:out></span>
    </c:when>
    <c:when test="${ctrnum < second}">
        <span class="lt"><c:out value="The number ${second} is greater than ${num}" ></c:out> </span>
    </c:when>
    <c:when test="${ctrnum == third}">
        <span class="eq"><c:out value="The number ${third} is equal to the number ${num}" ></c:out> </span>
    </c:when>
    <c:otherwise>
        <h3> <c:out value="All comparion are fail" ></c:out>
        </h3>
    </c:otherwise>
</c:choose>

<form action='<c:url value="RandomServlet" />' method="get">
    <input id="submit" type="submit"
           value="Try Again">
</form>
</body>
</html>
