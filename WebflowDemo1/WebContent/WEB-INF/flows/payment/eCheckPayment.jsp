<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../../global-includes/header.jsp">
	<jsp:param value="Credit Card Payment" name="title" />
</jsp:include>
<div>
	<form:form commandName="payment">
		<table>
			<tr>
				<td>Routing Number:</td>
				<td><form:input path="routingNumber" maxlength="10" /></td>
			</tr>
			<tr>
				<td>Account Number:</td>
				<td><form:input path="accountNumber" maxlength="10" /></td>
			</tr>
			<tr>
				<td>Check Number:</td>
				<td><form:input path="checkNumber" maxlength="6" /></td>
			</tr>
			<tr>
				<td>Payable To:</td>
				<td>${payment.payableTo}</td>
			</tr>
			<tr>
				<td>Date:</td>
				<td>${payment.formattedDate}</td>
			</tr>
			<tr>
				<td>Signature:</td>
				<td><form:input path="signature" /></td>
			</tr>
			<tr>
				<td>Check amount:</td>
				<td>${payment.amount}</td>
			</tr>
		</table>
		<form:button name="_eventId_cancel" value="Cancel" type="submit">Cancel</form:button>
		<form:button name="_eventId_submitPayment" value="Submit Payment"
			type="submit">Submit Payment</form:button>
	</form:form>
</div>
<jsp:include page="../../global-includes/footer.jsp" />