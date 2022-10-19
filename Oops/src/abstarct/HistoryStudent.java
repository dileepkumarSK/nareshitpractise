package abstarct;

public class HistoryStudent extends StudentAbstact {

	private int historyMarks,civicsMarks;
	
	
	public HistoryStudent() {
		
	}
	
	public HistoryStudent(String studentName, String studentClass) {
		super(studentName, studentClass);
	}


	public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}


	@Override
	public int getPercentage() 
	{
		return ((civicsMarks+historyMarks))/3;
	}

}
