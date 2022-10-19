package june_20;

public class MyThread extends Thread {
	public void run() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		MyThread obj=new MyThread();
		Thread t1=new Thread(obj);
		t1.start();
		
		Thread t2=new Thread(obj);
		t2.start();
		Thread t3=new Thread(obj);
		t3.start();

	}

}
