package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumerated.entities.OrderStatus;

public class Order extends Client {

	private String ProductName;
	private String ProductType;
	private Integer quantity;
	private Double price;

	private Date moment;
	OrderStatus stauts;
	OrderItems items = new OrderItems();
	Client client = new Client();
	

	public Order(String productName, String productType, Integer quantity, Double price, Client client,
			OrderStatus stauts) {
		ProductName = productName;
		ProductType = productType;
		this.quantity = quantity;
		this.price = price;
		this.moment = moment;
		this.client = client;
		this.stauts = stauts;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductType() {
		return ProductType;
	}

	public void setProductType(String productType) {
		ProductType = productType;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
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

	public double subTotal1(int quantity, double price) {
		return quantity * price;

	}

	public String notaFiscal() {
		return "===========NOTA FISCAL========== " + "\n" + getProductName() + ", Tipo de Produto " + getProductType() + "\n"
				+ "Quantidades que foram compradas = " + getQuantity() + ", Preço = " + getPrice() + "\n" + "COMPRADO NA DATA: "
				+ getMoment() + ", Dados do cliente = " + getUserName() + "" + "\n" + getEmail() + ", "
				+ getName() + getProductName();

	}

}
