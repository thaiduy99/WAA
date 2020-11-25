<%--
  Created by IntelliJ IDEA.
  User: Thai Nguyen
  Date: 11/24/2020
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" type="text/css" href="resources/mystyle.css">
    <meta charset="ISO-8859-1">
</head>
<body>

<form action="calculator" method="post">
    <fieldset>
        <legend>Calculator</legend>

        <input name="add1" type="text" size = "2" value="${calculator.add1}"/>+
        <input name="add2" type="text" size = "2"  value="${calculator.add2}" />=
        <input name="sum" type="text" size = "4" value="${calculator.sum }" readonly />
        <br>
        <input name="mult1" type="text" size = "2" value="${calculator.mult1}" />*
        <input name="mult2" type="text" size = "2" value="${calculator.mult2}" />=
        <input name="product" type="text" size = "4" value="${calculator.product}"   readonly/>
        <br>
        <input type="submit" value="Submit" />
    </fieldset>
</form>

</body>
</html>