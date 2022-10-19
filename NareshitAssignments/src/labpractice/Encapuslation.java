package labpractice;



class StudDet
{
	private int roolno;
	private String name;
	
	public void getRoolno(int r)
	{
		roolno=r; 
		
	
	}
	
	public void getNAmeofstudent(String c)
	{
		
		name=c;

	}
	
	public int showRoolno()
	{
		return roolno;
	}
	public String showName()
	{
		return name;
	}

}

public class Encapuslation  {

	public static void main(String[] args) {
		StudDet stdobj= new StudDet();
		
		stdobj.getRoolno(15);
		stdobj.getNAmeofstudent("DIleep KUMAR SK");
		System.out.println(stdobj.showRoolno());
		System.out.println(stdobj.showName()); 
	
	
		

	}

}
