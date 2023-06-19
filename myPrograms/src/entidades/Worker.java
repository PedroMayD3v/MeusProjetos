package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level; // Chamando a classe do tipo Enum
	private Double baseSalary;

	/* Criando associações de classes para composições e para chamar um objeto no main */
	private Departament departament;

	// Instanciação do tipo ArrayLisa da classe HourContract para revpresentar varios contratos/objetos
	// dentro de uma classe / = tem-muitos

	private List<HourContract> contracts = new ArrayList<>(); // Como vai ser criado mais de um contrato/objeto dentro é necessario criar uma lista e da lista
	                                                         //é necessario
																// declarar uma lista fora do construtor e sendo chamado dentro de uma calasse 'de atributos"
                                                              
	public Worker() {
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) { //Composição de um objeto do tipo Departament na Classe
		this.departament = departament;
	}

	public List<HourContract> getContracts() { //nao pode haver set para a  lista nao ser tocada, a lista começa vazia
		                                       
		return contracts;
	}
	
	//Metodo para array 
	//Manipula o array diretamente da classe worker
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removoContract(HourContract contract) {
		contracts.remove(contract);
	}

	//Instanciando uma função c parametros da classe work que serao "mexidos", percorrendo a lista, setando com get/set da classe/tipo calendar
	 public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance(); //Instnanciando um objeto do tipo Calendar
		//Abaixo eu instancio e seto um objeto tipo calendar percorrendo a lista hourcontract
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	}

