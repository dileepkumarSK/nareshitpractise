package medplus;


import java.util.Scanner;
public class FruitsPuchase {

	 static int amuont;
	 
	 
	void  purchase(String fruitname,int friut)
	{ 
		
		int noofitems=amuont/friut;
		System.out.println(fruitname +":"+noofitems );
		
		amuont=amuont%friut;
		System.out.println(amuont);
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 final int dragonFriut=100;
		 final int kiwiFriut=50;
		 final int AppleFriut=25;
		 final int pineappleFriut=12;
		 final int mangoFriut=6;
		 final int grapeFriut=1;
		 
		 System.out.println("Enter the amount How much Do you Have IN your Hands");
		 amuont=s.nextInt();		 
		 FruitsPuchase fruitobj=new FruitsPuchase();
		 
		 fruitobj.purchase( "dragonFriut", dragonFriut);
		 fruitobj.purchase( "kiwiFriut", kiwiFriut);
		 fruitobj.purchase( "AppleFriut", AppleFriut);
		 fruitobj.purchase( "pineappleFriut", pineappleFriut);
		 fruitobj.purchase( "mangoFriut", mangoFriut);
		 fruitobj.purchase( "grapeFriut", grapeFriut);
		 s.close();
		 
	}

}
