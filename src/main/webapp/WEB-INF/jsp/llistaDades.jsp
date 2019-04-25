<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="daw" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html lang="ca">
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container" >

<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">nom</th>
        <th scope="col">cognom</th>
        <th scope="col">volum</th>
        <th scope="col">acció</th>
    </tr>
    </thead>
    <tbody>


    <!--<c:forEach items="${dades}" var="dada" varStatus="loop">
    <tr>
        <th scope="row">${loop.index}</th>
        <td>${dada.valor}</td>
        <td>${dada.lat}</td>
        <td>${dada.longitud}
        </td>
        <-td><a class="btn btn-primary" href="/esborrarClient?id=${client.id}">esborra</a>
            <c:if test="${client.volumCompres<1000}">
                <a class="btn btn-danger" href="#">contactar</a>
            </c:if>
        </-td>
    </tr>
    </c:forEach>-->

    <%@ page contentType="text/html" %>

    <html>
    <!--<body bgcolor="white">
    suma de 2+3: <daw:etiqueta  primer="2" segon="3" /> <br />
    suma de 1+1: <daw:etiqueta primer="1" segon="1" />
    </body>-->
    </html>

    </tbody>
</table>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>

</html>