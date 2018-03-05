package Capitulo3.CaseProblems.ejercicio2;

public class Rental {

	public final static Integer minperhour = 60;
	public final static Integer hourlyRental = 40;
	private String contractNnumber; 
	private Integer numberOfHours;
	private Integer numberOfMinutesOverAnHour;
	private Integer price;
	
	
	public String getContractNnumber() {
		return contractNnumber;
	}

	public Integer getNumberOfHours() {
		return numberOfHours;
	}

	public Integer getNumberOfMinutesOverAnHour() {
		return numberOfMinutesOverAnHour;
	}

	public Integer getPrice() {
		return price;
	}

	public void setContractNnumber(String contractNnumber) {
		this.contractNnumber = contractNnumber;
	}
	
	public void setHoursAndMinutes(Integer minutos ) {
		this.numberOfHours = (int)(minutos / 60) ;
		this.numberOfMinutesOverAnHour =(minutos % 60) ;
		this.price = (this.numberOfHours * 40) + this.numberOfMinutesOverAnHour; 
	}

	@Override
	public String toString() {
		return "Rental [contractNnumber= " + contractNnumber + ", numberOfHours= " + numberOfHours
				+ ", numberOfMinutesOverAnHour= " + numberOfMinutesOverAnHour +" pricePerHour= $40"+ ", Precio total=" + price + "]";
	}
	

}
