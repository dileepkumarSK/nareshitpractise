package abstarct;

public class ScienceStudent extends StudentAbstact{
	
	private int physicsMarks,chemistryMarks,mathsMarks;

	
	
	public ScienceStudent(String studentName, String studentClass) {
		super(studentName, studentClass);
	}



	public ScienceStudent(int i, String studentClass, int physicsMarks, int chemistryMarks,
			int mathsMarks) {
		
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}
	
	public int  getPercentage( )
	{
		return ((chemistryMarks+mathsMarks+physicsMarks))/3;
	}
}
