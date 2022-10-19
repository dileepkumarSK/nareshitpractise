package strings;

public class TcsMockQuestion
{

	public static void main(String[] args) 
	{
		
		
		System.out.println("Name: Sk Dileep Kumar\nBatch: 4"
				+ "\nGroup: 2\n");
		System.out.println();
		
		
		
		EmployeeServices es=new EmployeeServices();
		String listofemp[]=es.getString("101,dileep"
				+ "|102,ranjith|130,Jeshna|105,kalyan");
		System.out.println("LIst OF Employees");
		for(String m:listofemp)
		{
			System.out.println(m);
		}
		System.out.println();
		System.out.println("LIst OF names OF emploees");
		String namesofemp[]=es.getNames(listofemp);
		for(String k:namesofemp)
			System.out.println(k);
		
		
		System.out.println();
		System.out.println("LIst OF ids OF emploees");
		String idsofemps[]=es.getid(listofemp);
		for(String k:idsofemps)
			System.out.println(k);
	
	}

}
