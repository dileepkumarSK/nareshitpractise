package abstarct;

public abstract class StudentAbstact 
{

	protected String studentName,studentClass; 
	protected static int totalNoOfStudents;
	
	

	public StudentAbstact(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents++;
	}

	
	
	public StudentAbstact() {
		super();
	}



	public abstract int  getPercentage( );
	
	public static int getTotalNoStudents( )
	{
		return 1;
	}
}
