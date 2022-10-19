package oops;

public class Trainer {

	int id,batchCount;  
	String name ; 
	double basicSalary ,HRAPer , DAPer,perkPerBatch;
	
	public Trainer() {
		super();
	}   


	public Trainer(int id, int batchCount, String name, double basicSalary, double hRAPer, double dAPer,
			double perkPerBatch) {
		super();
		this.id = id;
		this.batchCount = batchCount;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.perkPerBatch = perkPerBatch;
	}




	double calculateGrossSalary()
	{
		return basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch);
	}
}


