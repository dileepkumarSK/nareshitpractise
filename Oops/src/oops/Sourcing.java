package oops;

public class Sourcing {

	
	int id,enrollmentTarget,enrollmentReached;  String name ; double basicSalary , HRAPer , DAPer,perkPerEnrollment;
	
	
	public Sourcing() {
		super();
	}


	Sourcing(double basicSalary , double HRAPer ,double DAPer,int enrollmentReached,int enrollmentTarget,double perkPerEnrollment)
	{
		this.basicSalary=basicSalary;
		this.HRAPer=HRAPer; 
		this.DAPer=DAPer;
		this.enrollmentReached=enrollmentReached;
		this.enrollmentTarget=enrollmentTarget;
		this.perkPerEnrollment=perkPerEnrollment;
	}
	
	
	double calculateGrossSalary()
	{
		return basicSalary+HRAPer+DAPer+((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment;
	}
	
}
