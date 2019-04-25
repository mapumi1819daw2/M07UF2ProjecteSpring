<!-- chart.jsp-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <script language="javascript" src="jquery.min.js"></script>
    <script language="javascript" src="Chart.min.js"></script>
    <script type="text/javascript">

        $(function () {

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
                    type: 'line',
                    data: chartdata
                });
            }


            var ctx = $("#myCanvas");

            var temperatura = [20,22,25];
            var lat = [2.22, 3.33, 3.55];


           /* <c:forEach items="${dada}" var="d" varStatus="loop">
                temperatura.push("${dada.valor}");
                lat.push("${dada.lat}");

            </c:forEach>*/

            dibuixaGrafica(ctx, temperatura,  lat, "Temperatures");


        });

    </script>

    <style>
        canvas{
            width: 500px;
            height: 500px;
        }
    </style>
</head>
<body>

<canvas id="myCanvas"></canvas>


</body>
</html>