package kishansirproject;
import java.util.Scanner;
public class FruitsSection
{   	
	Scanner sc=new Scanner(System.in);
	
	final int priceMangoes=50;
	final int priceApples=100;
	final int priceBananans=25;
	final int pricePapaya =44;
	final int priceGrapes=60;
	final int priceOranges=50;
    static int fruitssum;
    static int totalmango,totalApples,totalBananans,totalPapaya,totalGrapes,totalOranges;
    String mango="mango",Apples="Apples",Bananans="Bananans",Papaya="Papaya",Grapes="Grapes",Oranges="Oranges";
    final int mangocode=125,Applescode=126,Banananscode=127,Papayacode=128,Grapescode=129,Orangescode=130;

	int display()
	{
			int choice;
			FruitsSection fruitobj=new FruitsSection();
			do {
				System.out.println("-------Here The List of Fruits!!----");
				System.out.println();
				System.out.println("CODE \t FRUITNAME \t PRICE(1-KG)");
				System.out.println("....................................");
				System.out.println("125  \t Mangoes   \t"+priceMangoes);
				System.out.println("126  \t Apples    \t"+priceApples);
				System.out.println("127  \t Bananans  \t"+priceBananans);
				System.out.println("128  \t Papaya \t"+pricePapaya);
				System.out.println("129  \t Grapes    \t"+priceGrapes);
				System.out.println("130  \t Oranges   \t"+priceOranges);
				System.out.println();
				System.out.println("please choose your product code :");
				fruitobj.fruits_details(sc.nextInt());
				System.out.println("if you want to continue with shopping press 1 Else 2 for main menu ");
				 choice=sc.nextInt();
				 if(choice==2)
				 {
					 new OrgnaicStore().storeperfomance();
					 break;
				 }
				 
				 else if(choice!=1)
				 {
					 System.out.println("enter the valid output");
					 fruitobj.display();
					 break;
				 }
			}while(choice==1);
			
			fruitssum=totalmango+totalApples+totalBananans+totalPapaya+totalGrapes+totalOranges;
		
		return fruitssum;
	}
	
	
	
	void friutBill()
	{
		OrgnaicStore mainobj=new OrgnaicStore(); 

		mainobj.itemsindividualbill(totalmango, mango, priceMangoes);
		mainobj.itemsindividualbill(totalApples, Apples, priceApples);
		mainobj.itemsindividualbill(totalBananans, Bananans, priceBananans);
		mainobj.itemsindividualbill(totalPapaya, Papaya,pricePapaya);
		mainobj.itemsindividualbill(totalGrapes, Grapes, priceGrapes);
		mainobj.itemsindividualbill(totalOranges, Oranges,priceOranges);
		
		
	
	}
	
	
	
	void fruitbillmodificationlist() 
	{
		OrgnaicStore mainobj=new OrgnaicStore();
		
		System.out.println("\tYour purchased Fruit List ");
		mainobj.modifingEligibleItems(mangocode, totalmango, mango,priceMangoes);
		mainobj.modifingEligibleItems(Applescode, totalApples, Apples, priceApples);
		mainobj.modifingEligibleItems(Banananscode, totalBananans, Bananans, priceBananans);
		mainobj.modifingEligibleItems(Papayacode, totalPapaya, Papaya, pricePapaya);
		mainobj.modifingEligibleItems(Grapescode, totalGrapes, Grapes, priceGrapes);
		mainobj.modifingEligibleItems(Orangescode, totalOranges, Oranges, priceOranges);
		
	}
	void fruitbillmodification()
	{
		OrgnaicStore mainobj=new OrgnaicStore();
		int choice,switcchoice;
		
		
		do 
		{   
			System.out.println("Enter the choice");
			switcchoice=sc.nextInt();
			switch(switcchoice)
			{
			case 125:
				{
					if(totalmango>0)
					{
						totalmango-=mainobj.modifingEligibleItemscount(totalmango, mango, priceMangoes);
						break;
					}
				}
			case 126:
			{
				
				if(totalApples>0)
				{
					totalApples-=mainobj.modifingEligibleItemscount(totalApples, Apples, priceApples);
					break;
				}
			}
			case 127:
			{
				if(totalBananans>0)
				{
					totalBananans-=mainobj.modifingEligibleItemscount(totalBananans, Bananans, priceBananans);
					break;
				}
			}
			case 128:
			{
				if(totalPapaya>0)
				{
					totalPapaya-=mainobj.modifingEligibleItemscount(totalPapaya, Papaya,pricePapaya);
					break;
				}
			}
			case 129:
			{
				if(totalGrapes>0)
				{
					totalGrapes-=mainobj.modifingEligibleItemscount(totalGrapes, Grapes, priceGrapes);
					break;
				}
			}
			case 130:
			{
				if(totalOranges>0)
				{
					totalOranges-=mainobj.modifingEligibleItemscount(totalOranges, Oranges,priceOranges);
					break;
				}
			}
		}
			
			System.out.println("continue 1 OR press any Digit to the back");
			choice=sc.nextInt();
	}while(choice==1);
		
		if(choice!=1)
			return;
		
	}
	
	
	void fruits_details(int code)
	{   
		int tkgs;
		OrgnaicStore  mainclassobj=new OrgnaicStore();
		
		
			
			switch(code)
			{  
			case 125:
					{
						System.out.println("Mangoes is great source of magnesium and potassium \nit is a good choice \n\nHow many kgs you need");
						tkgs=sc.nextInt();
						totalmango+=mainclassobj.Costing_Item(priceMangoes, tkgs);
						
						break;
					}
			case 126:
						{
							System.out.println("Apples are an incredibly nutritious fruit that offers multiple health benefits \n\nHow many kgs you need");
							tkgs=sc.nextInt();
							totalApples+=mainclassobj.Costing_Item(priceApples, tkgs);
							break;
						}
			case 127:
					{
						System.out.println("Bananas contain a number of vitamins and minerals\n \nHow many dozens you need");
						tkgs=sc.nextInt();
						totalBananans+=mainclassobj.Costing_Item(priceBananans, tkgs);
						break;
					}
			case 128:
					{
						System.out.println("Papayas contain high levels of antioxidants vitamin A, vitamin C, and vitamin E\nDiets high in antioxidants may reduce the risk of heart disease\n\nHow many kgs you need");
						tkgs=sc.nextInt();
						totalPapaya+=mainclassobj.Costing_Item(pricePapaya, tkgs);
						break;
					}
			case 129:
					{
						System.out.println("Grapefruit is a citrus fruit with a flavor that can range from bittersweet to sour.\nIt contains a range of essential vitamins and minerals \n\nHow many kgs you need");
						tkgs=sc.nextInt();
						totalGrapes+=mainclassobj.Costing_Item(priceGrapes, tkgs);
						break;
					}
			case 130:
					{
						System.out.println("Orange! The vitamin C in oranges helps your body in lots of ways\nProtects your cells from damage\n\nHow many kgs you need");
						tkgs=sc.nextInt();
						totalOranges+=mainclassobj.Costing_Item(priceOranges, tkgs);
						break;
					}
			default:System.out.println("Oops! Enter the code corectly \n");
			}
			
			 
	
		
		
	}
	
	
	
	
	
	

}
