package kishansirproject;

import java.util.Scanner;

public class VegatablesClass {
	
	Scanner sc=new Scanner(System.in);

	
	
	final int pricePotato=41;
	final int priceCarrots=60;
	final int priceBrinjal=35;
	final int priceBeetroot=44;
	final int priceDrumstick =20;
	final int priceMushroom=120;
	final int priceLadiesFinger=50;
    static int vegtablessum;	
    static int totalPotato,totalCarrots,totalBrinjal,totalBeetroot,totalDrumstick,totalMushroom,totalLadiesFinger;
    String Potato="Potato",Carrots="Carrots",Brinjal="Brinjal",Beetroot="Beetroot",Drumstick="Drumstick",Mushroom="Mushroom",LadiesFinger="LadiesFinger";
    int Potatocode=221,Carrotscode=222,Brinjalcode=223,Beetrootcode=224,Drumstickcode=225,Mushroomcode=226,LadiesFingercode=227;

	int display()
	{
			int choice;
			VegatablesClass vegatabletobj=new VegatablesClass();
			do {
				System.out.println("-------Here The List of VegiTables!!-----------");
				System.out.println();
				System.out.println("CODE\tVegitables\tPRICE(1-kg)");
				System.out.println("...................................");
				System.out.println("221\tPotato\t\t"+ pricePotato);
				System.out.println("222\tBrinjal\t\t"+priceBrinjal);
				System.out.println("223\tCarrots\t\t"+priceCarrots);
				System.out.println("224\tBeetroot\t"+priceBeetroot);
				System.out.println("225\tDrumstick\t"+priceDrumstick);
				System.out.println("226\tMushroom\t"+priceMushroom);
				System.out.println("227\tLadiesFinger\t"+priceLadiesFinger);
				System.out.println();
				System.out.println("please choose your product code :");
				vegatabletobj.vegatables_details(sc.nextInt());
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
					 vegatabletobj.display();
					 break;
				 }
			}while(choice==1);
			
		
			vegtablessum= totalPotato+totalCarrots+totalBrinjal+totalBeetroot+totalDrumstick+totalMushroom+totalLadiesFinger;
		return vegtablessum;
	}
	
	
	void vegitableBill()
	{
		
		OrgnaicStore mainobj=new OrgnaicStore(); 
		mainobj.itemsindividualbill(totalPotato, Potato, pricePotato);
		mainobj.itemsindividualbill(totalCarrots, Carrots, priceCarrots);
		mainobj.itemsindividualbill(totalBrinjal, Brinjal, priceBrinjal);
		mainobj.itemsindividualbill(totalBeetroot, Beetroot, priceBeetroot);
		mainobj.itemsindividualbill(totalDrumstick, Drumstick,priceDrumstick);
		mainobj.itemsindividualbill(totalMushroom, Mushroom, priceMushroom);
		mainobj.itemsindividualbill(totalLadiesFinger, LadiesFinger,priceLadiesFinger);
		
		
	
	}
	
	
	
	void vegitablemodificationlist()
	{
		OrgnaicStore mainobj=new OrgnaicStore();
		
		System.out.println("\tYour purchased Fruit List ");
		mainobj.modifingEligibleItems(Potatocode, totalPotato, Potato, pricePotato);
		mainobj.modifingEligibleItems(Carrotscode, totalCarrots, Carrots, priceCarrots);
		mainobj.modifingEligibleItems(Brinjalcode, totalBrinjal, Brinjal, priceBrinjal);
		mainobj.modifingEligibleItems(Beetrootcode, totalBeetroot, Beetroot, priceBeetroot);
		mainobj.modifingEligibleItems(Drumstickcode, totalDrumstick, Drumstick,priceDrumstick);
		mainobj.modifingEligibleItems(Mushroomcode, totalMushroom, Mushroom, priceMushroom);
		mainobj.modifingEligibleItems(LadiesFingercode, totalLadiesFinger, LadiesFinger,priceLadiesFinger);
		
		
	}
	
	void vegitablemodification()
	{
		OrgnaicStore mainobj=new OrgnaicStore();
		int choice,switcchoice;
		
		do 
		{   
			System.out.println("Enter the choice");
			switcchoice=sc.nextInt();
			switch(switcchoice)
			{
			case 221:
				{
					if(totalPotato>0)
					{
						totalPotato-=mainobj.modifingEligibleItemscount(totalPotato, Potato, pricePotato);
						break;
					}
				}
			case 222:
			{
				
				if(totalCarrots>0)
				{
					totalCarrots-=mainobj.modifingEligibleItemscount(totalCarrots, Carrots, priceCarrots);
					break;
				}
			}
			case 223:
			{
				if(totalBrinjal>0)
				{
					totalBrinjal-=mainobj.modifingEligibleItemscount(totalBrinjal, Brinjal, priceBrinjal);
					break;
				}
			}
			case 224:
			{
				if(totalBeetroot>0)
				{
					totalBeetroot-=mainobj.modifingEligibleItemscount(totalBeetroot, Beetroot, priceBeetroot);
					break;
				}
			}
			case 225:
			{
				if(totalDrumstick>0)
				{
					totalDrumstick-=mainobj.modifingEligibleItemscount(totalDrumstick, Drumstick,priceDrumstick);
					break;
				}
			}
			case 226:
			{
				if(totalMushroom>0)
				{
					totalMushroom-=mainobj.modifingEligibleItemscount(totalMushroom, Mushroom, priceMushroom);
					break;
				}
			}
			case 227:
			{
				if(totalLadiesFinger>0)
				{
					totalLadiesFinger-=mainobj.modifingEligibleItemscount(totalLadiesFinger, LadiesFinger,priceLadiesFinger);
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
	
	
	
	
	
	
	
	
	
	
	
	void vegatables_details(int code)
	{   
		int tkgs;
		OrgnaicStore  mainclassobj=new OrgnaicStore();
		
		
			
			switch(code)
			{
			case 221:
					{
						System.out.println("Potatoes are a good source of fiber\nwhich can help you lose weight by keeping you full longer \n\nHow many kgs you need");
						tkgs=sc.nextInt();
						totalPotato+=mainclassobj.Costing_Item(pricePotato, tkgs);
						break;
					}
			case 223:
						{
							System.out.println("Carrot juice is loaded with vitamin A and high in vitamins C and K\nIt also contains plant compounds called carotenoids, which act as antioxidants \n\nHow many kgs you need");
							tkgs=sc.nextInt();
							totalCarrots+=mainclassobj.Costing_Item(priceCarrots, tkgs);
							break;
						}
			case 222:
					{
						System.out.println("Brinjal contains high fibre content and has low calories,\nmaking it a must-add to any healthy diet \n\nHow many kgs you need");
						tkgs=sc.nextInt();
						totalBrinjal+=mainclassobj.Costing_Item(priceBrinjal, tkgs);
						break;
					}
			case 224:
					{
						System.out.println("Beetroot are rich in folate (vitamin B9) which helps cells grow and function \n\nHow many kgs you need");
						tkgs=sc.nextInt();
						totalBeetroot+=mainclassobj.Costing_Item(priceBeetroot, tkgs);
						break;
					}
			case 225:
					{
						System.out.println("Drumstick developing strong and healthy bone structure \n\nHow many kgs you need");
						tkgs=sc.nextInt();
						totalDrumstick+=mainclassobj.Costing_Item(priceDrumstick, tkgs);
						break;
					}
			case 226:
					{
						System.out.println("Mushroom  rich, low calorie source of fiber, protein, and antioxidants \n\n How many kgs you need");
						tkgs=sc.nextInt();
						totalMushroom+=mainclassobj.Costing_Item(priceMushroom, tkgs);
						break;
					}
			case 227 :
					{
						System.out.println("LadiesFinger  high fiber content and it prevents constipation due to its laxative property \n\nHow many kgs you need");
						tkgs=sc.nextInt();
						totalLadiesFinger+=mainclassobj.Costing_Item(priceLadiesFinger, tkgs);
						break;
					}
			default:System.out.println("Oops! Enter the code corectly\n");
			
			}
			
			 
	
		
		
	}

}
