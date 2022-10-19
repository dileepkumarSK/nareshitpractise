package oops;

public class Hostelfee extends Student1 
{
	

	public Hostelfee() {
		super();
	}


	public Hostelfee(double hostelFee) {
		super();
		this.hostelFee = hostelFee;
	}


	double hostelFee ;
	Hostelfee hobj=new Hostelfee();
	
	public String displayDetails()
	{//me=John Smith,studentId=123,examFee=100.0]
		return "Student ["+"Name "+hobj.name+" Studentid "+hobj.studentId+"Examfee "+hobj.examFee;
	}
}
