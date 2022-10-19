package oops;

public class TaxUtil {
	 
	public double CalculateTax(Employee e) {
		double salary=e.calculateGrossSalary();//80000
		 if(salary>30000) {
			  return salary*0.20;//16000
		 }
		 else
		 {
			  return salary*0.05;
		 }
	}

public double CalculateTax(Manager m) {
		double salary=m.calculateGrossSalary();
		 if(salary>30000) {
			  return salary*0.20;//16000
		 }
		 else
		 {
			  return salary*0.05;
		 }
	}

/*public double CalculateTax(Trainer t) {
	
}
public double CalculateTax(Sourcing s) {
	
}*/


}
