<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib prefix='fn' uri='http://java.sun.com/jsp/jstl/functions' %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<link rel="stylesheet" type="text/css" href="resources/mystyle.css">

<TITLE>Output Some Numbers</TITLE></HEAD>
<BODY BGCOLOR="#FDF5E6">
<H2>And the results are:</H2>
     
<c:set var="item" value="${num}"/>
    <c:choose>
    <c:when test="${item gt  firstNum }">
    <span class="gt"><c:out  value="The number ${num} is greater than ${secondNum}"/></span>
    </c:when>
    <c:when test="${item eq  thirdNum }">
    <span class="eq"><c:out value="The number ${num} is equal to ${thirdNum}"/></span>
    </c:when>
    <c:when test="${item lt  secondNum }">
    <span class="lt"><c:out value="The number ${num} is less than ${secondNum}"/></span>
    </c:when>
    <c:otherwise>
    <c:out value="The number ${num}"/>
    <p>
    	<span class="gt"><c:out value="is NOT greater than ${secondNum}"/></span>
	</p>
    <p>
   	 	<span class="lt"><c:out value="is NOT less than ${firstNum}"/> </span>
	</p>
    <p>
    	<span class="eq"><c:out value="is NOT equal to ${thirdNum}"/></span>
 	</p>
    </c:otherwise>
    </c:choose>
   

    <form action='<c:url value="/" />' method="get">
           <input id="submit" type="submit"  
                value="Try Again">
	</form>

    
    </body>
</html>