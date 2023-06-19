package entities;

public class SupplierRegistratio extends Registration {
 	
    protected String nameCompany;
    protected String userName;
    protected String email;
    protected String password;
	
    public SupplierRegistratio() {
		
    }

    public SupplierRegistratio(String nameCompany, String userName, String email, String password) {
        super(nameShipper, userName, email, password);
    	this.nameCompany = nameCompany;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
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
	
    @Override
    public void requestRegister(String nameCompany, String userName, String email, String password) {
        this.nameCompany = nameCompany;
        this.userName = userName;
        this.email = email;
        this.password = password;
        System.out.println("=========================================");
        System.out.println("Registration completed!");
        System.out.println("Name Company: " + getNameCompany());
        System.out.println("Username: " + this.userName);
        System.out.println("Email: " + this.email);
        System.out.println("Password: " + this.password);
        System.out.println("=========================================");
        System.out.println();
    }
    
    @Override
	public void autentication(String pass) {
    	   if(this.getPassword().equals(pass)) {
         	  System.out.println("Welcome, Supplier " + this.getNameCompany());
         	  System.out.println("Lets begin something!");
           } else {
         	  System.out.println("Autentication error, try again later!");
           }
    	  

		
    
     }
    
}

