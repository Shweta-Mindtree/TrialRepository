<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="order" required="true" type="de.hybris.platform.commercefacades.order.data.AbstractOrderData" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>

<%@ attribute name="containerCSS" required="false" type="java.lang.String" %>


<table id="orderTotals">
	<thead>
		<tr>
			<td><spring:theme code="text.account.order.orderTotals" text="Order Totals"/></td>
			<td></td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><spring:theme code="text.account.order.subtotal" text="Subtotal:"/></td>
			<td><format:price priceData="${order.subTotal}"/></td>
		</tr>
		<c:if test="${order.totalDiscounts.value > 0}">
			<tr class="savings">
				<td><spring:theme code="text.account.order.savings" text="Savings:"/></td>
				<td><format:price priceData="${order.totalDiscounts}"/></td>
			</tr>
		</c:if>
		
		<tr>
			<td><spring:theme code="text.account.order.delivery" text="Delivery:"/></td>
			<td><format:price priceData="${order.deliveryCost}" displayFreeForZero="true"/></td>
		</tr>

	</tbody>
	<tfoot>
		<tr>
			<td><spring:theme code="text.account.order.total" text="Total:"/></td>
			<td><format:price priceData="${order.totalPrice}"/></td>
		</tr>
	</tfoot>
	
</table>
