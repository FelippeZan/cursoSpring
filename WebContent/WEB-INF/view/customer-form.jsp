<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Customer Form</title>
	<style>
		.error {color:red}
	</style>
</head>
<body>

	Fill out the form. Asterisk (*) means required.

	<br/> 

	<form:form action="processForm" modelAttribute="customer">
			Primeiro nome: <form:input path="primeiroNome" />
		
		<br/>
			
			Sobrenome (*): <form:input path="sobrenome" />
		<form:errors path="sobrenome" cssClass="error" />
		
		<br/>
		
		<input type="submit" value="Submit"/>



	</form:form>

</body>
</html>