<!-- chart.jsp-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="daw" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0"></script>



    <script type="text/javascript">

        $(function () {

            var ctx = document.getElementById("myCanvas").getContext("2d");

            function dibuixaGrafica(ctx, creat, fila, nom) {
                var chartdata = {
                    labels: creat,
                    datasets: [{
                        label: nom,
                        backgroundColor: 'rgba(200, 200, 200, 0.75)',
                        borderColor: 'rgba(200, 200, 200, 0.75)',
                        hoverBackgroundColor: 'rgba(200, 200, 200, 1)',
                        hoverBorderColor: 'rgba(200, 200, 200, 1)',
                        data: fila
                    }]
                };



                var barGraph = new Chart(ctx, {
                    type: 'bar',
                    data: chartdata
                });
            }




            var temperatura = [];
            var lat = [];


            <c:forEach items="${dades}" var="dada" varStatus="loop">
                temperatura.push("${dada.valor}");
                lat.push("${dada.lat}");

            </c:forEach>

            dibuixaGrafica(ctx, temperatura,  lat, "Temperatures");


        });

    </script>


</head>
<body>
<daw:nom  nom="Marc Purgimon" />
<daw:Curs  curs="2n DAW" />
<daw:titol  titol="Gràfic de temperatures" />

<canvas id="myCanvas" width="400" height="400" ></canvas>


</body>
</html>