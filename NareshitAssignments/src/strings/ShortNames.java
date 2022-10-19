package strings;

public class ShortNames
{
	String shortNameofString(String s)
	{
		String shortname="";
		String shortNamesArry[]=s.split("\\s");
		for(int i=0;i<shortNamesArry.length;i++)
			shortname=shortname+shortNamesArry[i].charAt(0)+" ";
		return shortname.toUpperCase();
	}
	
	public static void main(String[] args)
	{
		
		
		System.out.println(new ShortNames().shortNameofString("Sanjeeva reddy nagar"));
	}

}
