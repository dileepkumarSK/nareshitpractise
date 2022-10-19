package vector;


import java.util.Vector;

public class Test
{

	public static void main(String[] args)
	{
		VectoFirst vob= new VectoFirst();
	
		Vector vcopy= vob.vectorMethod();
		
		Names n=(Names)vcopy.get(0);
	    System.out.println(n.id);
	   System.out.println(n.name);
	}

}