package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import entities.Products;
import entities.Registration;
import entities.SupplierRegistratio;
import entities.enumerated.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Products prod = new Products();
		List<Products> lista = new ArrayList<>();
		List<Registration> list = new ArrayList<>();

		System.out.println("(DropME - Connecting Clients to Clients)");
		System.out.println("=========================================");
		System.out.println();
		System.out.println("Welcome, first we need registrate you in or aplication");
		System.out.println();
		System.out.println("You are a Supplier or a DropShipper?");
		System.out.println("1. Register as a Supplier");
		System.out.println("2. Register as a DropShipper");
		System.out.println();
		System.out.println("=========================================");
		System.out.print("Enter Option: ");
		char option = sc.next().charAt(0);
		System.out.println("=========================================");

		// PARTE DE CRIAÇÃO DE CONTA//

		if (option == '1') {

			System.out.print("Enter company name: ");
			String companyName = sc.next();
			System.out.print("Enter name: ");
			String name = sc.next();
			System.out.print("Enter email: ");
			String email = sc.next();
			System.out.print("Enter password: ");
			String password = sc.next();
			Registration.addRegistration(new SupplierRegistratio(companyName, name, email, password));

		} else if (option == '2') {

			System.out.print("Enter name: ");
			String nameShipper = sc.next();
			System.out.print("Enter UserName: ");
			String userName = sc.next();
			System.out.print("Enter email: ");
			String emailShipper = sc.next();
			sc.nextLine();
			System.out.print("Enter password: ");
			String password2 = sc.next();
			Registration shipper1 = new Registration(nameShipper, userName, emailShipper, password2);
			shipper1.requestRegister(nameShipper, userName, emailShipper, password2);
			Registration.addRegistration(shipper1);

		} else {

			System.out.println("INVALID OPTION! EXITING");
		}

		// AUTENTICAÇÃO DE LOGIN
		System.out.println("=======================================");
		System.out.println();
		System.out.println("Great, looks you have a account here now.");
		System.out.println("If you have a account lets sign in");
		System.out.println();
		System.out.println("========================================");
		System.out.println();

		System.out.println("Do you want login as 1. Supplier or 2. DroppShipper");
		System.out.print("Enter option: ");
		char type = sc.next().charAt(0);
		sc.nextLine();

		if (type == '1') {
			for (Registration reg : list) {
				if (reg instanceof SupplierRegistratio) {
					SupplierRegistratio supp = (SupplierRegistratio) reg;
					System.out.print("Enter your UserName: ");
					String user = sc.next();
					System.out.print("Enter password: ");
					String pass = sc.next();
					supp.autentication(pass); // TIVE QUE FAZER O DOWNCASTING
				}
			}
		}

		else if (type == '2') {
			for (Registration reg : list) {
				System.out.print("Enter your UserName: ");
				String user2 = sc.next();
				System.out.print("Enter passowrd: ");
				String pass2 = sc.next();
				reg.autentication(pass2);

			}

			// COMEÇO DE PRODUCTS

			System.out.println("======================================================");
			System.out.println("Great, I will show you some products, hope you enjoy");
			System.out.println();
			System.out.println("======================================================");
			System.out.println();
			System.out.println(" 1 - APPLE WATCH - 200$");
			System.out.println(" 2 - MACBOOK AIR - 3000$");
			System.out.println(" 3 - SAMSUMG GALAXY A25 - 380$");
			System.out.println();
			System.out.println("You have in you wallet: " + prod.initialMoney());

			System.out.println();
			System.out.print("Type the name of the product: ");
			String nameProduct = sc.next();
			sc.nextLine();
			System.out.print("Type the price of the product: ");
			double priceProduct = sc.nextDouble();
			Products products = new Products(nameProduct, priceProduct);
			lista.add(products);
			products.setNameProduct(nameProduct);
			products.setProductPrice(priceProduct);
		
			System.out.println();
			System.out.print("Do you have sure, you wante buy this product? Y/N ");
			char choice = sc.next().charAt(0);
			System.out.println();
			System.out.println("Status of the buy: " + OrderStatus.PENDING);

			if (choice == 'Y') {
				System.out.println("You buy the product: ");
				for (Products prd : lista) {
					System.out.println("Product name: " + prd.getNameProduct());
					System.out.println("Product price: " + prd.getProductPrice());
					System.out.println("Status of the buy: " + OrderStatus.PROCESSING);
					System.out.println();
					System.out.println(OrderStatus.ACCEPTED);
				}

			} else {
				System.out.println("Canceled buy: " + OrderStatus.CANCELED);
			}

			Order ord = new Order(products);

			System.out.println("Okay, seems like you buy in your Market");
			System.out.println("=================================");
			System.out.println(ord);
			System.out.println("buy again? Y/N");
			char ch = sc.next().charAt(0);

			if (ch == 'Y') {

				System.out.print("Enter name: ");
				String nameShipper2 = sc.next();
				System.out.print("Enter UserName: ");
				String userName2 = sc.next();
				System.out.print("Enter email: ");
				String emailShipper2 = sc.next();
				sc.nextLine();
				System.out.print("Enter password: ");
				String password3 = sc.next();
				Registration.addRegistration(new Registration(nameShipper2, userName2, emailShipper2, password3));
			}

			System.out.println(Registration.getList());
			for (Registration reg : list) {
				System.out.println(reg);

			}
		}

	}
}