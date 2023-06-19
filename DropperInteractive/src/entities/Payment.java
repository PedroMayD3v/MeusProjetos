package entities;

import java.util.Date;

import application.Program;
import enumerated.entities.OrderStatus;

public class Payment {

	private static final String user = null;
	private OrderStatus orderStatus;
	private String confirmation;
	private Client client;
	private Order order;

	public Payment(OrderStatus orderStatus, String confirmation, Client client) {
		this.orderStatus = orderStatus;
		this.confirmation = confirmation;
		this.client = client;
	}

	public Payment() {}

	public OrderStatus confirmPaym() {
	   return orderStatus.CONFIRMADO;
	 }
	
	public OrderStatus failed() {
		return orderStatus.FALHA_NA_COMPRA;
	}

	
	
	

}
