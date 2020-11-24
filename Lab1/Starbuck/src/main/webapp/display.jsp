<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <head>
    <title>Starbuck's</title>
  </head>
  <body>

    <form action = "Advice" method="get">
      <h2>Starbuck's "${param["roast"]}"</h2>
      <table>
        <c:forEach var="item" items="${advices}" varStatus="status">
          <c:choose>
            <c:when test="${(status.index)%2 == 0}">
              <tr style="background-color:cyan">
            </c:when>
            <c:otherwise>
              <tr style="background-color:yellow">
            </c:otherwise>
          </c:choose>
          <td>${item}</td>
          </tr>
        </c:forEach>
      </table>
    </form>
  </body>
</html>