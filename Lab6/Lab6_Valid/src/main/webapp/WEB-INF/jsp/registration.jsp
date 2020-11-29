<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%--    <link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">--%>
<title>Registration</title>
</head>
<body>

<h1>Registration Form</h1><br />

<div id="global">
    <form:form modelAttribute="student" action="registration" method="post">
        <fieldset>
            <legend>Add an employee</legend>
            <p>
                <form:errors path="*" cssStyle="color : red;" />
            </p>
            <p>
                <label for="id">ID: </label>
                    <form:input path="id" id="id" />
                <div style="text-align: center;">
                    <form:errors path="id" cssStyle="color : red;" />
                </div>
            </p>
            <p>
                <label for="firstName">First Name: </label>
                    <form:input path="firstName" />
                <div style="text-align: center;">
                    <form:errors path="firstName" cssStyle="color : red;" />
                </div>
            </p>
            <p>
                <label for="lastName">Last Name: </label>
                    <form:input path="lastName" />
                <div style="text-align: center;">
                    <form:errors path="lastName" cssStyle="color : red;" />
                </div>
            </p>
            <p>
                <label for="email">Email: </label>
                    <form:input path="email" />
                <div style="text-align: center;">
                    <form:errors path="email" cssStyle="color : red;" />
                </div>
            </p>

            <p>
                <label for="gender">Gender: </label>
                    <form:select path="gender" >
                        <form:option value="" label="Select Gender"/>
                        <form:option value="Male" label="Male" />/
                        <form:option value="Female" label="Female"/>
                    </form:select>
                <div style="text-align: center;">
                    <form:errors path="gender" cssStyle="color : red;" />
                </div>
            </p>

            <p>
                <label for="birthday">Birthday: </label>
                <form:input path="birthday" id="birthday" />
                <div style="text-align: center;">
                    <form:errors path="birthday" cssStyle="color : red;" />
                </div>
            </p>


            <h4>Phone:</h4>
            <p>
                <label for="area">Area: </label>
                    <form:input path="phone.area" id="area" />
                <div style="text-align: center;">
                    <form:errors path="phone.area" cssStyle="color : red;" />
                </div>
            </p>
            <p>
                <label for="prefix"> Prefix: </label>
                    <form:input path="phone.prefix" id="prefix"/>
                <div style="text-align:center;">
                    <form:errors path="phone.prefix" cssStyle="color:red;"/>
                </div>
            </p>
            <p>
                <label for="number"> Prefix: </label>
                    <form:input path="phone.number" id="number"/>
                <div style="text-align:center;">
                    <form:errors path="phone.number" cssStyle="color:red;"/>
                </div>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5" value="Add Employee">
            </p>
        </fieldset>
    </form:form>
</div>
    
    
    
    
    
 
</body>
</html>