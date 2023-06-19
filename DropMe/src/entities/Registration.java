package entities;

import java.util.ArrayList;
import java.util.List;

public class Registration {

	protected static String nameShipper;
	protected static String userName;
	protected static String email;
	protected static String password;
	protected static SupplierRegistratio supplier; // Sempre que compor objetos lembrar de criar os gets e sets
	protected Double initialMoney = 3500.00;
	protected Products prod;
	protected static List<Registration> list = new ArrayList<>();

	public Registration() {

	}

	public Registration(String nameShipper, String userName, String email, String password) {
		this.nameShipper = nameShipper;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return nameShipper;
	}

	public void setName(String nameShipper) {
		this.nameShipper = nameShipper;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public SupplierRegistratio getSupplier() {
		return Registration.supplier;
	}

	public void setSupplier(SupplierRegistratio supplier) {
		Registration.supplier = supplier;
	}

	public void requestRegister(String nameShipper, String userName, String email, String password) {
		System.out.println("=========================================");
		System.out.println("Registration completed!");
		System.out.println("Name: " + nameShipper);
		System.out.println("Username: " + userName);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
		System.out.println("=========================================");
		System.out.println();

	}

	public static void addRegistration(Registration registration) {
		list.add(registration);
	}
	
	public static void removeRegistration(Registration registration) {
		list.remove(registration);
	}
	

	public static List<Registration> getList() {
		return list;
	}

	public static void setList(List<Registration> list) {
		Registration.list = list;
	}

	public void autentication(String pass) {
		if (this.getPassword().equals(pass)) {
			System.out.println("Welcome, " + this.getUserName());
			System.out.println("Lets begin something");
		} else {
			System.out.println("Autentication error, try again later!");
		}

	}

	@Override
	public String toString() {
		return "Registration [initialMoney=" + initialMoney + ", prod=" + prod + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword()
				+ "]";
	}

	public static void setList(int i, Registration shipper1) {
		// TODO Auto-generated method stub
		
	}

}
