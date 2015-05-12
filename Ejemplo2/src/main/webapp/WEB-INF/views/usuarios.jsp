<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <br>
    <jsp:include page="bar.jsp" />
    <h3>Usuarios</h3>
    <c:forEach items="${model.usuarios}" var="usuario">
      <b>nick: </b><i><c:out value="${usuario.nick}"/></i> <br>
      <b>nombre: </b><c:out value="${usuario.nombre}"/><br>
      <b>apellidos: </b><c:out value="${usuario.apellidos}"/><br><br>
     <a href="personajesUsuario.htm?nick=${usuario.nick}"> Ver personajes de este usuario </a>
     <hr><br><br>
    </c:forEach>
  </body>
</html>