package may302022;

public class CalculatedGrade {
	
	int stdid;
	String name;
	int marks;
	
	
	CalculatedGrade(int stdid,String name,int marks)
	{
		this.stdid=stdid;
		this.name=name;
		this.marks=marks;
		
	}

	
	private char calculateGrade()
	{
		if(marks>=90 && marks<=100)
			return 'A';
		else if(marks>81)
			return 'B';
		else if(marks>71)
			return 'c';
		else if(marks>61)
			return 'd';
		else 
			return 'e';
		
	}
	
	void display()
	{
		System.out.println("ST ID :"+stdid);
		System.out.println("NAME :"+name);
		System.out.println("MARKS :"+marks);
		System.out.println("Grade :"+this.calculateGrade());
		
	}
	public static void main(String[] args) 
	{
		new CalculatedGrade(125,"Dileep kumar sk",98).display();

	}

}
