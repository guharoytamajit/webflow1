package com.webflow.service;

import java.util.Calendar;
import java.util.Date;

import com.webflow.model.CreditCardPayment;
import com.webflow.model.ElectronicCheckPayment;
import com.webflow.model.Order;
import com.webflow.model.Payment;

import org.springframework.stereotype.Service;

@Service("paymentService")
public class PaymentService {
	public CreditCardPayment generateCreditCardPayment(Order order) {
		CreditCardPayment payment = new CreditCardPayment(order.getOrderTotal());
		order.setPayment(payment);
		return payment;
	}

	public ElectronicCheckPayment generateElectronicCheckPayment(Order order) {
		ElectronicCheckPayment eCheckPayment = new ElectronicCheckPayment(
				order.getOrderTotal());
		eCheckPayment.setPayableTo("JUG's Pizzeria");
		eCheckPayment.setDate(Calendar.getInstance());
		order.setPayment(eCheckPayment);
		return eCheckPayment;
	}
}
