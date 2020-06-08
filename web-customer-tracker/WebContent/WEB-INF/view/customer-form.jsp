<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Save Customer</title>
	
	<link type="text/css" rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css"></link>
	
	<link type="text/css" rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"></link>

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
		
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
		
		<form:hidden path="id"/>
		
		<table>
			<tbody>
				<tr>
					<td><label>First Name</label></td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td><label>Last Name</label></td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Save" class="save"/></td>
				</tr>
			</tbody>
		</table>
		
		</form:form>
		
		<div class="clear; both;">
			<p>
				<a href="${pageContext.request.contextPath}/customer/list">Back To Customers</a>
			</p>
		</div>

	</div>

</body>
</html>