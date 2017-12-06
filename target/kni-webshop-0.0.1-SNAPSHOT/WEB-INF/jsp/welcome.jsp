<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- tag do oznaczenia resources w folderze WebContent -->

<html>
<head>
<title>WEBSHOP</title>

<style type="text/css">
/* STYLE CSS */
</style>

<spring:url value="/resources/cascadestyles.css" var="styleCSS" />
<!-- zmienna o nazwie styleCSS, ze sciezka do folderu resources -->

<spring:url value="/resources/javascript.js" var="javascriptJS" />
<!-- zmienna o nazwie javascriptJS, ze sciezka do folderu resources -->

<spring:url value="/resources/example_img.jpg" var="img" />

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<!-- ładowanie biblioteki do uruchomienia metody z pliku javascriptJS -->

<link href="${styleCSS}" rel="stylesheet" />
<script src="${javascriptJS}"></script>



</head>
<body>
<!--  	gittest -->
 	${message}
 	<img src="${img}" alt="OBRAZEK" width="200" height="100"/>
 	
 	<h2>Styl zaladowany z pliku resources/cascadestyles.css</h2>
 
		<div id="jsmessage"></div>
 	
	<br>
	<br>
	<div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align:center;">
 
		Podstrona welcome.jsp
		
	</div>
</body>
</html>