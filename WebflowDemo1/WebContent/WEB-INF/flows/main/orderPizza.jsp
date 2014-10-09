<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../../global-includes/header.jsp">
	<jsp:param value="Pizza Menu" name="title" />
</jsp:include>
<div>
	<form:form commandName="flow.order">
		<table>
			<tr>
				<td>Sizes:<br /> <c:forEach items="${pizzaSizes}"
						var="pizzaSize">
						<form:radiobutton path="pizza.size"
							label="${pizzaSize.label} ${pizzaSize.money}"
							value="${pizzaSize}" />
						&nbsp;&nbsp;&nbsp;
					</c:forEach></td>
			</tr>
			<tr>
				<td>Toppings ($0.50 each):<br /> <form:checkboxes
						items="${toppings}" path="pizza.toppings" />
				</td>
			</tr>
		</table>
		<form:button name="_eventId_back" value="&lt; Back" type="submit">&lt; Back</form:button>
		<form:button name="_eventId_next" value="Next &gt;" type="submit">Next &gt;</form:button>
	</form:form>
</div>
<jsp:include page="../../global-includes/footer.jsp" />