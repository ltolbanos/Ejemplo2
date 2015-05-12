<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <br>
    <jsp:include page="bar.jsp" />
    <h3>Personajes</h3>
    <c:forEach items="${model.personajes}" var="personaje">
      nombre:<i><c:out value="${personaje.nombre}"/></i> <br>
      arma:<c:out value="${personaje.arma.tipo}"/><br>
      raza:<c:out value="${personaje.raza}"/><br><hr><br>
      
    </c:forEach>
  </body>
</html>