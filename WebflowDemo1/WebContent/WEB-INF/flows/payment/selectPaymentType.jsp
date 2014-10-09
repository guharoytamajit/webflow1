<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../../global-includes/header.jsp">
	<jsp:param value="Select Payment Type" name="title" />
</jsp:include>
<div>
	<form:form commandName="flow">
		<form:button name="_eventId_cancel" value="Cancel" type="submit">Cancel</form:button>
		<form:button name="_eventId_creditCard" value="Credit Card"
			type="submit">Credit Card</form:button>
		<form:button name="_eventId_check" value="Electronic Check"
			type="submit">Electronic Check</form:button>

	</form:form>
</div>
<jsp:include page="../../global-includes/footer.jsp" />