<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../../global-includes/header.jsp">
	<jsp:param value="Customer Details" name="title" />
</jsp:include>
<div>
	<form:form commandName="flow.order.customer.name">
		<table>
			<tr>
				<td align="right">First Name:</td>
				<td><form:input path="fName" /></td>
			</tr>
						<tr>
				<td align="right">Last Name:</td>
				<td><form:input path="lName" /></td>
			</tr>
					</table>
		<form:button name="_eventId_back" value="&lt; Back" type="submit">&lt; Back</form:button>
		<form:button name="_eventId_next" value="Next &gt;" type="submit">Next &gt;</form:button>
	</form:form>
</div>
<jsp:include page="../../global-includes/footer.jsp" />