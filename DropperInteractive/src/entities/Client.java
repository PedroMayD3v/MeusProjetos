package entities;

import java.util.Date;


public class Client {

	private String name;
	private String email;
	private Date birthday;
	private String userName;
	private String password;
	private Double money;

	public Order order = new Order(name, email, null, money, null, null);

	public Client() {
		
	}
	public Client(String clientName, String clientEmail, Date sfd, String user, String pass, Order order) {	
	this.name = clientName;
	this.email = clientEmail;
	this.birthday = sfd;
	this.userName = user;
	this.password = pass;
	this.money = money;
	
	}
	
	public Client(String clientName, String clientEmail, Date sfd, String user, String pass, Double money, Order order) {
		this.name = clientName;
		this.email = clientEmail;
		this.birthday = sfd;
		this.userName = user;
		this.password = pass;
		this.money = money;
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}
	
	
	public Double getMoney() {
		return money = 2000.0;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
	
	

	@Override
	
	public String toString() {
		return "Client [name=" + name + ", email=" + email + ", birthday=" + birthday + ", userName=" + userName + "]";
	}


	}


	

	
	

