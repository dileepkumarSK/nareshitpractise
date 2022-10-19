package kishansirproject;

import java.util.Scanner;

public class CosmeticsSection 
{

	Scanner sc=new Scanner(System.in);

	
	
	final int pricePowder=125;
	final int priceHairoil=45;
	final int priceBodypurfume=105;
	final int priceLipstick=32;
	final int priceFaceWash =70;
	static int Cosmeticssum=0;	
	static int totalPowder,totalHairoil,totalBodypurfume,totalLipstick,totalFaceWash;

	String Powder="Powder",Hairoil="Hairoil",Bodypurfume="Bodypurfume",Lipstick="Lipstick",FaceWash="FaceWash";
	
	final int Powdercode=321,Hairoilcode=322,Bodypurfumecode=323,Lipstickcode=324,FaceWashcode=325;
	
	int display()
	{
			int choice;
			CosmeticsSection CosmeticsSectionobj=new CosmeticsSection();
			do {
				System.out.println("-------Here The List of Cosmetics!!-------");
				System.out.println();
				System.out.println("CODE\tCosmetics\tPRICE");
				System.out.println("...................................");
				System.out.println("321\tPowder\t\t"+pricePowder);
				System.out.println("322\tHiarOil\t\t"+priceHairoil);
				System.out.println("323\tBodyPurfume\t"+priceBodypurfume);
				System.out.println("324\tLipStick\t"+priceLipstick);
				System.out.println("325\tFAceWash\t"+priceFaceWash);
				System.out.println();
				System.out.println("please choose your product code :");
				CosmeticsSectionobj.CosmeticsSectionobj_details(sc.nextInt());
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
					 CosmeticsSectionobj.display();
					 break;
				 }
			}while(choice==1);
			
			Cosmeticssum=totalPowder+totalHairoil+totalBodypurfume+totalLipstick+totalFaceWash;
		
		return Cosmeticssum;
	}
	
	
	void cosmeticBill()
	{
		
			
	
		OrgnaicStore mainobj=new OrgnaicStore(); 
		mainobj.itemsindividualbill(totalPowder, Powder, pricePowder);
		mainobj.itemsindividualbill(totalHairoil, Hairoil, priceHairoil);
		mainobj.itemsindividualbill(totalBodypurfume,Bodypurfume, priceBodypurfume);
		mainobj.itemsindividualbill(totalLipstick, Lipstick, priceLipstick);
		mainobj.itemsindividualbill(totalFaceWash, FaceWash,priceFaceWash);
		
		
		
	
	}
	
	
	
	void cosmeticmodificationlist()
	{
		OrgnaicStore mainobj=new OrgnaicStore();
		
		
		System.out.println("\t Your purchased Fruit List ");
		mainobj.modifingEligibleItems(Powdercode, totalPowder, Powder, pricePowder);
		mainobj.modifingEligibleItems(Hairoilcode,totalHairoil,Hairoil, priceHairoil);
		mainobj.modifingEligibleItems(Bodypurfumecode, totalBodypurfume,Bodypurfume, priceBodypurfume);
		mainobj.modifingEligibleItems(Lipstickcode, totalLipstick, Lipstick, priceLipstick);
		mainobj.modifingEligibleItems(FaceWashcode, totalFaceWash, FaceWash,priceFaceWash);
	}
	void cosmeticmodification()
	{
		OrgnaicStore mainobj=new OrgnaicStore();
		int choice,switcchoice;
		
	
		
		
		do 
		{   
			System.out.println("Enter the choice");
			switcchoice=sc.nextInt();
			switch(switcchoice)
			{
			case 321:
				{
					if(totalPowder>0)
					{
						totalPowder-=mainobj.modifingEligibleItemscount(totalPowder, Powder, pricePowder);
						break;
					}
				}
			case 322:
			{
				
				if(totalHairoil>0)
				{
					totalHairoil-=mainobj.modifingEligibleItemscount(totalHairoil, Hairoil, priceHairoil);
					break;
				}
			}
			case 323:
			{
				if(totalBodypurfume>0)
				{
					totalBodypurfume-=mainobj.modifingEligibleItemscount(totalBodypurfume,Bodypurfume, priceBodypurfume);
					break;
				}
			}
			case 324:
			{
				if(totalLipstick>0)
				{
					totalLipstick-=mainobj.modifingEligibleItemscount(totalLipstick, Lipstick, priceLipstick);
					break;
				}
			}
			case 325:
			{
				if(totalFaceWash>0)
				{
					totalFaceWash-=mainobj.modifingEligibleItemscount(totalFaceWash, FaceWash,priceFaceWash);
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

	
	
	
	
	
	
	void CosmeticsSectionobj_details(int code)
	{   
		int tkgs;
		OrgnaicStore  mainclassobj=new OrgnaicStore();
		
		
			
			switch(code)
			{
			case 321:
					{
						System.out.println("Powder! absorbs moisture well and helps cut down on friction \n\nHow many you need");
						tkgs=sc.nextInt();
						totalPowder+=mainclassobj.Costing_Item(pricePowder, tkgs);
						break;
					}
			case 322:
						{
							System.out.println("protecting hair from regular wear and tear With Hair oil \n\nHow many  you need");
							tkgs=sc.nextInt();
							totalHairoil+=mainclassobj.Costing_Item(priceHairoil, tkgs);
							break;
						}
			case 323:
					{
						System.out.println("keeps you smelling fresh all day with Body-Purfume choice \n\nHow many  you need");
						tkgs=sc.nextInt();
						totalBodypurfume+=mainclassobj.Costing_Item(priceBodypurfume, tkgs);
						break;
					}
			case 324:
					{
						System.out.println("Lipstick your lips and brightens your smile \n\nHow many  you need");
						tkgs=sc.nextInt();
						totalLipstick+=mainclassobj.Costing_Item(priceLipstick, tkgs);
						break;
					}
			case 325:
					{
						System.out.println("facial cleansing is the removal of dirt, oil\nother unwanted debris with FaceWash \n\nHow many  you need");
						tkgs=sc.nextInt();
						totalFaceWash+=mainclassobj.Costing_Item(priceFaceWash, tkgs);
						break;
					}
			
			default:System.out.println("Oops! Enter the code corectly\n");
			
			}
			
			 
	
		
		
	}
}
