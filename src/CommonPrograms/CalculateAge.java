package CommonPrograms;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
public static int calculateAge(LocalDate date) {
	int years = Period.between(date, LocalDate.now()).getYears();
	return years;
	
}
public static void main(String[] args) {
	System.out.println("Enter DOB");
	LocalDate date = LocalDate.parse("2000-01-21");
	System.out.println("Date of birth is: " +date);
	int calculateAge = calculateAge(date);
	System.out.println("Age is: " + calculateAge);
}
}
