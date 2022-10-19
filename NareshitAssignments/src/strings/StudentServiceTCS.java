package strings;

public class StudentServiceTCS {

	public String[] getName(String [] a)
	{
		int sizeofarry=a.length;
		String namesOfStudents[]=new String[sizeofarry];
		String namesOfCites[]=new String[sizeofarry];
		String idsOfStudents[]=new String[sizeofarry];
		for(int i=0;i<a.length;i++)
		{ 
			int startindex=a[i].indexOf(',');
			int endindex=a[i].lastIndexOf(',');
			namesOfCites[i]=a[i].substring(endindex+1);
			idsOfStudents[i]=a[i].substring(0,startindex);
			namesOfStudents[i]=a[i].substring(startindex+1,endindex);
		}
		return idsOfStudents;
	}
	
	public String getStudents(String[] a,String name)
	{
		String stddet="";
		for(int i=0;i<a.length;i++)
		{
			int startindex=a[i].indexOf(',');
			int endindex=a[i].lastIndexOf(',');
			if(a[i].substring(startindex+1,endindex).equals(name))
			{
				
				stddet+=a[i];
				break;
				
			}
		}
		return stddet;
	}
}
