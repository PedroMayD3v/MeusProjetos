package entities;

import java.time.LocalDateTime;
import java.util.Date;

public final class Order {
	
	protected LocalDateTime d02 = LocalDateTime.now();
	protected Products prod;
	protected Double subTotal;
	protected Registration reg;
	protected String prodName;
	
	public Order(Products prod) {
		this.prod = prod;
		this.prodName = prod.getNameProduct(); // Atualiza o nome do produto
	}
	

	public Registration getReg() {
		return reg;
	}


	public void setReg(Registration reg) {
		this.reg = reg;
	}


	public Products getProd() {
		return prod;
	}

	public void setProd(Products prod) {
		this.prod = prod;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	
	@Override
	public String toString() {
	    return prod.productsTag() + " Horario do pedido: " + d02;
	}

}
