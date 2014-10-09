<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../../global-includes/header.jsp">
	<jsp:param value="Order confirmation" name="title" />
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
				<td><form:button name="_eventId_changeOrder"
						value="Change Order" type="submit">Change Order</form:button></td>
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
				<td><form:button name="_eventId_changeAddress"
						value="Change Address" type="submit">Change Address</form:button>
			</tr>
			<tr>
				<td>Order total:</td><td colspan="2">${flow.order.orderTotal}</td>
			</tr>
		</table>
		<form:button name="_eventId_back" value="&lt; Back" type="submit">&lt; Back</form:button>
		<form:button name="_eventId_next" value="Next &gt;" type="submit">Next &gt;</form:button>
	</form:form>
</div>
<jsp:include page="../../global-includes/footer.jsp" />