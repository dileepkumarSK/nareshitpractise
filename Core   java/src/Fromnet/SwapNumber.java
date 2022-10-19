package Fromnet;

public class SwapNumber {

	void Swap(int x,int y)
	{
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("x = "+x+ " y = "+y);
	}
	void swapwithouttemp(int x,int y)
	{
		x=x+y;//5 4
		y=x-y;
		x=x-y;
		System.out.println("x = "+x+" y = "+y);
	}
	public static void main(String[] args) {
		SwapNumber swa=new SwapNumber();
		swa.Swap(54, 35);
		swa.swapwithouttemp(47, 36);
	}

}
