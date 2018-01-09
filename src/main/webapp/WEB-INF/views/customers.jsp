<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Klienci</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Klienci</h1>
				<p>Oto lista klientów naszego sklepu</p>
			</div>
		</div>
	</section>

	<section class="container">
		<div class="row">
			<c:forEach items="${customers}" var="klient">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div class="caption">
						<!-- nazwa wpisana w var w pętli forEach.nazwa pola z klasy modelu-->
							<h3>Pani/Pan ${klient.name}</h3>
							<p>O nr id: ${klient.customerId}</p>
							<p>Zamieszkała: ${klient.address}</p>
							<p>Posiada obecnie jakieś niezrealizowane zamówienia: ${klient.noOfOrdersMade}</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>