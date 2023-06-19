package entities;

public class Products {
	
		private String nameProduct;
		private Double productPrice;
		protected Registration register;
		protected SupplierRegistratio supp;
		protected Order order;
		protected Double initialMoney = 3500.00;
		
		public Products() {
			
		}
		public Products(String namePrdouct, Double productPrice) {
			this.nameProduct = nameProduct;
			this.productPrice = productPrice;
		}

		public String getNameProduct() {
			return nameProduct;
		}

		public void setNameProduct(String nameProduct) {
			this.nameProduct = nameProduct;
		}

		public Double getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(Double productPrice) {
			this.productPrice = productPrice;
		}

		public Registration getRegister() {
			return register;
		}

		public void setRegister(Registration register) {
			this.register = register;
		}

		public SupplierRegistratio getSupp() {
			return supp;
		}

		public void setSupp(SupplierRegistratio supp) {
			this.supp = supp;
		}

		public Double initialMoney() {
			return initialMoney = 3500.00;
		}
		
		public Double descountedMoney() {
			return initialMoney -= getProductPrice();
		}
		
		public String productsTag() {
			return "Products: " + this.nameProduct + ", Products Price: " + productPrice;
		}
	}