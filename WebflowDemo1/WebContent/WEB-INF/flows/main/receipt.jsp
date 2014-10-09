<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../../global-includes/header.jsp">
	<jsp:param value="Receipt" name="title" />
</jsp:include>
<div>
	<form:form commandName="flow">
		<table>
			<tr>
				<td>Pizza order:</td>
				<td>Size: ${flow.order.pizza.size.label} <c:if
						test="${not empty  flow.order.pizza.toppings}">
						<br /> Toppings: <br />
						<c:forEach items="${flow.order.pizza.toppings}" var="topping">
						${topping}<br />
						</c:forEach>
					</c:if>
				</td>
			</tr>
			<tr>
				<td>Address:</td>
				<td>${flow.order.customer.address.addressLine1} <br /> <c:if
						test="${not empty flow.order.customer.address.addressLine2}">
					${flow.order.customer.address.addressLine2} <br />
					</c:if> <c:if test="${not empty flow.order.customer.address.addressLine3}">
					${flow.order.customer.address.addressLine3}
					</c:if> ${flow.order.customer.address.city} <br />
					${flow.order.customer.address.state} <br />
					${flow.order.customer.address.zip}
				</td>
			</tr>
			<tr>
				<td>Payment Info:</td>
				<td>${flow.order.payment.amount}<br />
					${flow.order.payment.paymentType.displayName}<br /> <c:choose>
						<c:when test="${flow.order.payment.paymentType == 'CREDIT_CARD'}">
						${flow.order.payment.creditCardNumberSecured}<br />
						${flow.order.payment.expMonth}/${flow.order.payment.expYear}<br /> 
						${flow.order.payment.cardIssuer}<br />
						${flow.order.payment.nameOnCard}<br />
						</c:when>
						<c:otherwise>
						${flow.order.payment.routingNumber}<br />
						${flow.order.payment.accountNumberSecured}<br />
						${flow.order.payment.formattedDate}<br /> 
						${flow.order.payment.checkNumber}<br />
						${flow.order.payment.signature}<br />
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</table>
		<form:button name="_eventId_home" value="Home" type="submit">Home</form:button>
	</form:form>
</div>
<jsp:include page="../../global-includes/footer.jsp" />