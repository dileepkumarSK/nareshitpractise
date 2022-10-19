package strings;

public class EmployeeServices 
{

	String[] getString(String s)
	{
		String getlist[]=s.split("\\|");
		return getlist;
	}
	
	String[] getNames(String m[])
	{
		String enames[]=new String[m.length];
		for(int i=0;i<m.length;i++)
		{
			int x=m[i].indexOf(",");
			String name=m[i].substring(x+1);
			enames[i]=name;
		}
				
		
		return enames;
	}

	
	
	
	String[] getid(String m[])
	{
		String empids[]=new String[m.length];
		for(int i=0;i<m.length;i++)
		{
			int x=m[i].indexOf(",");
			String name=m[i].substring(0,x);
			empids[i]=name;
		}
				
		
		return empids;
	}
}
