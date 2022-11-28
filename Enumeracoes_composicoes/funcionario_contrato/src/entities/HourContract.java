package entities;

import java.time.LocalDateTime;

public class HourContract {
	
	private LocalDateTime date;
	private Double valuePerHour; 
	private Integer hours; 
	
	public HourContract() {
	}

	public HourContract(LocalDateTime date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
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
	
	public double  totalValue() {
		return valuePerHour * hours;
	}
	
	

}
