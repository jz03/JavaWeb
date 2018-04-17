<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Student Information</h2>
	<form:form method="POST" action="/helloWorldWeb/addStudent">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td><form:label path="id">id</form:label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td colspan="0"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>