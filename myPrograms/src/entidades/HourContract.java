package entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class HourContract {

	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
		
	}

   public HourContract(Date contractDate, Double valuePerHour, Integer hours) {
	this.date = contractDate;
	this.valuePerHour = valuePerHour;
	this.hours = hours;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Double getValuePerHour() {
	return valuePerHour;
}

public void setValuePerHour(Double valuePerHour) {
	this.valuePerHour = valuePerHour;
}

public Integer getHours() {
	return hours;
}

public void setHours(Integer hours) {
	this.hours = hours;
}

//Essa classe delega a função totalvalue pois totalvalue faz parte da classe HourCONTRACT
//responsavel por definir as horas e horas trabalhada
public double totalValue() {
	return valuePerHour * hours;
}

}