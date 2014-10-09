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
				<td>Credit Card Number:</td>
				<td><form:input path="creditCardNumber" maxlength="16" /></td>
			</tr>
			<tr>
				<td>Card Issuer:</td>
				<td><form:select path="cardIssuer">
						<form:option value="Visa" label="Visa" />
						<form:option value="Master Card" label="Master Card" />
						<form:option value="Discover" label="Discover" />
						<form:option value="American Express" label="American Express" />
					</form:select></td>
			</tr>
			<tr>
				<td>Expiration Date:</td>
				<td><form:select path="expMonth">
						<form:option value="01" label="Jan" />
						<form:option value="02" label="Feb" />
						<form:option value="03" label="Mar" />
						<form:option value="04" label="Apr" />
						<form:option value="05" label="May" />
						<form:option value="06" label="Jun" />
						<form:option value="07" label="Jul" />
						<form:option value="08" label="Aug" />
						<form:option value="09" label="Sep" />
						<form:option value="10" label="Oct" />
						<form:option value="11" label="Nov" />
						<form:option value="12" label="Dec" />
					</form:select> <form:select path="expYear">
						<form:option value="13" label="2013" />
						<form:option value="14" label="2014" />
						<form:option value="15" label="2015" />
						<form:option value="16" label="2016" />
						<form:option value="17" label="2017" />
						<form:option value="18" label="2018" />
						<form:option value="19" label="2019" />
					</form:select></td>
			</tr>
			<tr>
				<td>Name on Card:</td>
				<td><form:input path="nameOnCard" /></td>
			</tr>
			<tr>
				<td>Charge amount:</td>
				<td>${payment.amount}</td>
			</tr>
		</table>
		<form:button name="_eventId_cancel" value="Cancel" type="submit">Cancel</form:button>
		<form:button name="_eventId_submitPayment" value="Submit Payment"
			type="submit">Submit Payment</form:button>
	</form:form>
</div>
<jsp:include page="../../global-includes/footer.jsp" />