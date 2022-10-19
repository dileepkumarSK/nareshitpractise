package arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 
{
	public void addElementsInArrayList()
	{
		ArrayList a=new ArrayList();
		ArrayList a2=new ArrayList();
		a.add(5);
		a.add(52);
		a.add(null);
		a.add(85);
		a.add("hihello");
		System.out.println(a.contains(null));
		a.add(2, "dileep");
		//a.remove(2);
		a.remove((Integer)52);
		//System.out.println(a);
		a.addAll(a2);
		Iterator r=a.iterator();
		while(r.hasNext())
		{
			
			System.out.print(r.next()+" ");
			
		}
		System.out.println();
		System.out.println();
		ListIterator lr=a.listIterator(a.size());
		
		while(lr.hasPrevious())
		{
			System.out.print(lr.previous()+" ");
		}
		
		System.out.println();
		
		/*for(int i=0;i<a.size();i++)
			System.out.print(a.get(i)+" ");
		System.out.println();*/
		
		a2.add(5);
		a2.add(77);
		a2.add(5);
		a2.add(25);
		
		
	}

	public static void main(String[] args) 
	{
		
			new ArrayList1().addElementsInArrayList();
	}

}
