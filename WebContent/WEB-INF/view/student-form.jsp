<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
		
		 	First name: <form:input path="primeiroNome" />
		<br />
		 	Sobrenome: <form:input path="sobrenome" />
		<br />
		 	Country:
		 	<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br />
		 	Favorite Language:
		 	<br />

		<form:radiobuttons path="favoriteLanguage"
			items="${student.languagesOptions}" />

		<br />
		 	
		 	Operating Systems:
		 	
		 	<br />
		 	
		 	Linux <form:checkbox path="operatingSystems" value="Linux" />
		 	
		 	Windows <form:checkbox path="operatingSystems" value="Windows" />
		 	
		 	Mac OS <form:checkbox path="operatingSystems" value="MacOS" />

		<br />

		<input type="submit" value="Submit" />

	</form:form>

</body>

</html>