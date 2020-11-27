 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<div id="global">
<form:form modelAttribute ="newProduct" action="product" method="post">
    <fieldset>
        <legend>Add a product</legend>
        <p>
            <label for="category"><spring:message code="product.category" />
            </label>
<%--            <form:select id="category" path="category.id" items="${categories}"--%>
<%--                         itemLabel="name" itemValue="id" />--%>
            <form:select id="category" path="category" items="${categories}"
                         itemLabel="name" itemValue="id" />
        </p>
         
        <p>
            <label for="name"><spring:message code="product.name"/></label>
            <form:input id="name" path="name" tabindex="1"/>
        </p>
        <p>
            <label for="description"><spring:message code="product.description"/></label>
            <form:input id="description" path="description" tabindex="2"/>
        </p>
        <p>
            <label for="price"><spring:message code="product.price"/> </label>
            <form:input id="price" path="price" tabindex="3"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" 
                value="Add Product">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
