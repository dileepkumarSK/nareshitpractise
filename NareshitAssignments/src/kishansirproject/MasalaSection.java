package kishansirproject;

import java.util.Scanner;

public class MasalaSection 
{


	Scanner sc=new Scanner(System.in);

	
	
	final int priceChickenmasala=25;
	final int priceGarammasala=45;
	final int priceRasammasala=10;
	final int priceMuttonmasala=32;
	final int priceFishmasala=26;
	static int masalasum=0;	
	static int totalChickenmasala,totalGarammasala,totalRasammasala,totalMuttonmasala,totalFishmasala;
	String Chickenmasala="Chickenmasala",Garammasala="Garammasala",Rasammasala="Rasammasala",Muttonmasala="Muttonmasala",Fishmasala="Fishmasala";
	final int Chickenmasalacode=421,Garammasalacode=422,Rasammasalacode=423,Muttonmasalacode=424,Fishmasalacode=425;
	
	int display()
	{
			int choice;
			MasalaSection MasalaSectionobj=new MasalaSection();
			do {
				System.out.println("-------Here The List of MASALA(Spicyy-yy)!!-------");
				System.out.println();
				System.out.println("CODE\tMASALA\t\t\tPRICE");
				System.out.println("...................................");
				System.out.println("421\tChickenmasala\t\t"+priceChickenmasala);
				System.out.println("422\tGarammasala\t\t"+priceGarammasala);
				System.out.println("423\tRasammasala\t\t"+priceRasammasala);
				System.out.println("424\tMuttonmasala\t\t"+priceMuttonmasala);
				System.out.println("425\tFishmasala\t\t"+priceFishmasala);
				System.out.println();
				System.out.println("please choose your product code :");
				MasalaSectionobj.MasalaSection_details(sc.nextInt());
				System.out.println("if you want to continue with shopping press 1 2 for main menu");
				 choice=sc.nextInt();
				 if(choice==2)
				 {
					 new OrgnaicStore().storeperfomance();
					 break;
				 }
				 
				 else if(choice!=1)
				 {
					 System.out.println("enter the valid output");
					 MasalaSectionobj.display();
					 break;
				 }
			}while(choice==1);
			
			masalasum=totalChickenmasala+totalGarammasala+totalRasammasala+totalMuttonmasala+totalFishmasala;
		
		return masalasum;
	}
	
	
	

	void masalaBill()
	{
		
			
		OrgnaicStore mainobj=new OrgnaicStore(); 
		mainobj.itemsindividualbill(totalChickenmasala, Chickenmasala, priceChickenmasala);
		mainobj.itemsindividualbill(totalGarammasala, Garammasala, priceGarammasala);
		mainobj.itemsindividualbill(totalRasammasala,Rasammasala, priceRasammasala);
		mainobj.itemsindividualbill(totalMuttonmasala, Muttonmasala, priceMuttonmasala);
		mainobj.itemsindividualbill(totalFishmasala, Fishmasala,priceFishmasala);
		
		
		
	
	}
	
	
	void masalamodificationlist()
	{
		OrgnaicStore mainobj=new OrgnaicStore();
		
		
		System.out.println("\t Your purchased Fruit List ");
		mainobj.modifingEligibleItems(Chickenmasalacode, totalChickenmasala, Chickenmasala, priceChickenmasala);
		mainobj.modifingEligibleItems(Garammasalacode,totalGarammasala, Garammasala, priceGarammasala);
		mainobj.modifingEligibleItems(Rasammasalacode, totalRasammasala,Rasammasala, priceRasammasala);
		mainobj.modifingEligibleItems(Muttonmasalacode, totalMuttonmasala, Muttonmasala, priceMuttonmasala);
		mainobj.modifingEligibleItems(Fishmasalacode, totalFishmasala, Fishmasala,priceFishmasala);
	}
	
	void masalamodification()
	{
		OrgnaicStore mainobj=new OrgnaicStore();
		int choice,switcchoice;
		
		
		
		do 
		{   
			System.out.println("Enter the choice");
			switcchoice=sc.nextInt();
			switch(switcchoice)
			{
			case 421:
				{
					if(totalChickenmasala>0)
					{
						totalChickenmasala-=mainobj.modifingEligibleItemscount(totalChickenmasala, Chickenmasala, priceChickenmasala);
						break;
					}
				}
			case 422:
			{
				
				if(totalGarammasala>0)
				{
					totalGarammasala-=mainobj.modifingEligibleItemscount(totalGarammasala, Garammasala, priceGarammasala);
					break;
				}
			}
			case 423:
			{
				if(totalRasammasala>0)
				{
					totalRasammasala-=mainobj.modifingEligibleItemscount(totalRasammasala,Rasammasala, priceRasammasala);
					break;
				}
			}
			case 424:
			{
				if(totalMuttonmasala>0)
				{
					totalMuttonmasala-=mainobj.modifingEligibleItemscount(totalMuttonmasala, Muttonmasala, priceMuttonmasala);
					break;
				}
			}
			case 425:
			{
				if(totalFishmasala>0)
				{
					totalFishmasala-=mainobj.modifingEligibleItemscount(totalFishmasala, Fishmasala,priceFishmasala);
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

	
	
	
	
	
	void MasalaSection_details(int code)
	{   
		int tkgs;
		OrgnaicStore  mainclassobj=new OrgnaicStore();
		
		
			
			switch(code)
			{
			case 421:
					{
						System.out.println("Chickenmasala \n\nHow many packets you need");
						tkgs=sc.nextInt();
						totalChickenmasala+=mainclassobj.Costing_Item(priceChickenmasala, tkgs);
						break;
					}
			case 422:
						{
							System.out.println("Garammasala Garam..Garam..\n\nHow many packets you need");
							tkgs=sc.nextInt();
							totalGarammasala+=mainclassobj.Costing_Item(priceGarammasala, tkgs);
							break;
						}
			case 423:
					{
						System.out.println("Taste! Rasammasala \n\nHow many packets you need");
						tkgs=sc.nextInt();
						totalRasammasala+=mainclassobj.Costing_Item(priceRasammasala, tkgs);
						break;
					}
			case 424:
					{
						System.out.println("Spicyy!  Muttonmasala \n\nHow many packets you need");
						tkgs=sc.nextInt();
						totalMuttonmasala+=mainclassobj.Costing_Item(priceMuttonmasala, tkgs);
						break;
					}
			case 425:
					{
						System.out.println("Oh!.......Fishmasala \n\nHow many packets you need");
						tkgs=sc.nextInt();
						totalFishmasala+=mainclassobj.Costing_Item(priceFishmasala, tkgs);
						break;
					}
			
			default:System.out.println("Oops! Enter the code corectly \n");
			
			}
			
			 
	
		
		
	}

}
