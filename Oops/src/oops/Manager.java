package oops;

public class Manager {

	int id;  
	String name ; 
	double basicSalary;
	double HRAPer ;
	double DAPer;
	double projectAllowance;
	

	public Manager() {
		super();
	}
	
   public Manager(int id, String name, double basicSalary, double hRAPer, double dAPer, double projectAllowance) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}



	double calculateGrossSalary()
	{
		return basicSalary + HRAPer + DAPer+projectAllowance;//225000
	}
}


