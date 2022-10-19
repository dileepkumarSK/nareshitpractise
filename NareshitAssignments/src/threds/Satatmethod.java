package threds;

public class Satatmethod implements Runnable 
{
	public void run()
	{
		System.out.println("Hi hello How are you");
		System.out.println("this is second thread");
		System.out.println();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		Satatmethod st=new Satatmethod();
		Thread t1=new Thread(st);
		t1.start();
		//t1.run();
		t1.yield();;
		t1.setName("Dileep Kumar");
		System.out.println(t1.getName());
		System.out.println("hello dileep how are you");
		System.out.println();
		
 
	}

}

