<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <head>
    <title>Starbuck's</title>
  </head>
  <body>
    <h2>Ask for advice about your favorite roast:</h2>
    <p/>
    <form action = "Advice" method="post">
      <select name="roast" >
        <c:forEach var="item" items = "${list}">
          <%--<option value="dark">Dark</option> --%>
          <option value="${item.value}" > ${item.key}</option>
        </c:forEach>
      </select>
      <br/><br/>
      <input type="submit" value = "Submit" />
    </form>
  </body>
</html>