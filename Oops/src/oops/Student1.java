package oops;

public class Student1 
{
	int  studentId ;
	String name;
	double examFee;



	public Student1() 
	{
		super();
	}


	

	public Student1(int studentId, String name, double examFee) 
	{
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}



	@Override
	public String toString() {
		return "studentId=" + studentId + " \n name=" + name + "\n examFee=" + examFee ;
	}
	
	String displayDetails()
	{
		return name+" "+studentId;
	}

	double examFee()
	{
		return examFee;
	}
	
}
