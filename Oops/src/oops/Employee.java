package oops;
class Employee
{
	int id;
	String name;
	double basicSalary ;
	double HRAPer;
	double DAPer;

	public Employee() {
		id=0;
		name="none";
		basicSalary=0.0;
		HRAPer=0.0;
		DAPer=0.0;
		
	}
	


	public Employee(int id, String name, double basicSalary, double hRAPer, double dAPer) {
		super();
		this.id = id;//01
		this.name = name;//arunesh
		this.basicSalary = basicSalary;//50000
		HRAPer = hRAPer;
		DAPer = dAPer;
	}


	public double calculateGrossSalary()
	{
		return basicSalary + HRAPer + DAPer;//80000
	}
	
}

