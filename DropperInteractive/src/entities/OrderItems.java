package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItems {

	// Criando a lista de items e delegando somente a ela
	// A função de criar objetos de items para poder ser associado a outras classes

	private double price;
	private double quantity;
	private double total;
	private Client client;
	
	public OrderItems() {}

	public OrderItems(double price, double quantity, double total, Client client) {
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.client = client;
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItems(List<OrderItems> items) {
		for (OrderItems itens : items) {
			items.add(itens);
		}
	}

	public void removeItems(List<OrderItems> items) {
		for (OrderItems itens : items) {
			items.remove(itens);
		}
	}	
	
	public double Total() {
		return quantity * price;
	}


	@Override
	public String toString() {
		return "OrderItems [price=" + price + ", quantity=" + quantity + ", total=" + total +"]"; 
	}
}
