package linkedlist;

import java.util.LinkedList;

public class LinkedList1
{
	void linkedlistmethod()
	{
		LinkedList ll=new LinkedList();
		ll.add(450);
		ll.add(45);
		ll.add(455);
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
		
	}
	
	public static void main(String[] args)
	{

		new LinkedList1().linkedlistmethod();
	}

}
