<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../../global-includes/header.jsp">
	<jsp:param value="Enter your address" name="title" />
</jsp:include>
<div>
	<form:form commandName="flow.order.customer.address">
		<table>
			<tr>
				<td align="right">Address Line1:</td>
				<td><form:input path="addressLine1" /></td>
			</tr>
			<tr>
				<td align="right">Address Line2:</td>
				<td><form:input path="addressLine2" /></td>
			</tr>
			<tr>
				<td align="right">Address Line3:</td>
				<td><form:input path="addressLine3" /></td>
			</tr>
			<tr>
				<td align="right">City:</td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td align="right">State:</td>
				<td><form:select path="state">
						<form:options items="${stateCodeList}" />
					</form:select></td>
			</tr>
			<tr>
				<td align="right">Zip Code:</td>
				<td><form:input path="zip.zip" size="5" maxlength="5" />-<form:input
						path="zip.zip4" size="4" maxlength="4" /></td>
			</tr>
		</table>
		<form:button name="_eventId_back" value="&lt; Back" type="submit">&lt; Back</form:button>
		<form:button name="_eventId_next" value="Next &gt;" type="submit">Next &gt;</form:button>
	</form:form>
</div>
<jsp:include page="../../global-includes/footer.jsp" />