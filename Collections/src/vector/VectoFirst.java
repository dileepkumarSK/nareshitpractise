package vector;

import java.util.Enumeration;
import java.util.Vector;


class Names{
	Names()
	{}
	int id;String name;
	Names(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override	public String toString() {
		return "Names [id=" + id + ", name=" + name + "]";
	}
	
}


public class VectoFirst extends Names
{
 
	Vector vectorMethod()
	{
		Names n1=new Names(101,"dileep");
		Vector obv=new Vector();
		obv.add(n1);
		obv.add(new Names(102,"Ranjith"));
		obv.add(new Names(103,"Shyam"));
		obv.add(new Names(104,"Ankit"));
		obv.add(new Names(105,"LAxmi"));
		
		return obv;
		
	}
	public static void main(String[] args) 
	{
		
		new VectoFirst().vectorMethod();
	}

}
