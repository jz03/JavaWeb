<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring Landing Page</title>
</head>
<body>
	<h2>Spring Landing Pag</h2>
	<p>Click below button to get a simple HTML page</p>
	<form:form method="GET" action="/helloWorldWeb/staticPage">
		<table>
			<tr>
				<td><input type="submit" value="Get HTML Page" /></td>
			</tr>
		</table>
	</form:form>
	<form:form method="GET" action="/helloWorldWeb/redirect">
		<table>
			<tr>
				<td><input type="submit" value="Get JSP Page" /></td>
			</tr>
		</table>
	</form:form>
	<form:form method="GET" action="/helloWorldWeb/studentPag">
		<table>
			<tr>
				<td><input type="submit" value="Get student Page" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>