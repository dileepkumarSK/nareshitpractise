package kishansirproject;

import java.util.Scanner;


public class OrgnaicStore 
{
	Scanner sc=new Scanner(System.in);
	  int total;
	static int fruittotalcost;
	static int vegatablestotalcost;
	static int cosmeticstotalcost;
	static int masalatotalcost;
	 int discount;
	
	void display()
	{
		System.out.println("    Available products in the store");
		
		System.out.println("\t 1) Fruits");
		System.out.println("\t 2) Vegetables");
		System.out.println("\t 3) Cosmetics");
		System.out.println("\t 4) Masala Powders");
		
	}
	
	
	
	
	int Costing_Item(int price,int tkgs)
	{
		
		return price*tkgs;
	}
	
	
	void modifingEligibleItems(int code,int total,String name,int price)
	{
		if(total>0)
		{
			System.out.println(" \t"+code +"\t"+name+"\t"+ total/price);
			
		}
	}
	
	
	int modifingEligibleItemscount(int total,String name,int price)
	{
		int items,choice=0,insdiechoice=0,amount=0;
		if(total>0)
		{
			do 
			{
				System.out.println("\t"+name+" how many items you want delete");
				items=sc.nextInt();
				if(items>total/price)
				{ 
				System.out.println("items more than you purchased press 1 to re-enter OR press any Other Digit to back");
				choice=sc.nextInt();
				}
				else {
					System.out.println("you eneterd items :  "+items);
					System.out.println("Press 1 for Confirm OR any other Digit to Exit ");
					insdiechoice=sc.nextInt();
					if(insdiechoice==1)
					{
						amount=items*price;
						
						break;
						
					}
					else
					{
						amount=0;
						
					}
						
						
				}
				
				if(choice!=1)
				{
					
					return amount;
				}
			}while(choice==1);
			
				
		}
		
		return amount;	
	}
	
	
	void storeperfomance()
	{
		OrgnaicStore orobj=new OrgnaicStore();
		int x;
		
		
			orobj.display();
			
				System.out.println("Please enter your choice  else enter 0 For bill  ?");
				 x=sc.nextInt();
			
				 while(x<0 || x>4)
				 {
					 System.out.println("enter the correct Choice");
					 x=sc.nextInt();
				 };
				 if(x==0)
						return;
			switch(x)
			{
			   	case 1: 
			   		fruittotalcost=new FruitsSection().display();
			   		
			   		return;
			   	
			   	case 2:
			   		vegatablestotalcost=new VegatablesClass().display();
			   	
			   		return;
			   	case 3:
			   		cosmeticstotalcost=new CosmeticsSection().display();
			   		
			   		return;
			   	case 4:
			   		masalatotalcost=new MasalaSection().display();
			   		return;
			   		default:break;
				
			}
			
			 
				
		
					
	}
	
	
	
	
	void itemsindividualbill(int totalitemamount,String itemname,int itemprice)
	{
		if(totalitemamount>0)
		{ 
			
		
			
			System.out.format("%20s %3d %5d %5d",itemname, totalitemamount/itemprice, itemprice, totalitemamount);
			System.out.println();
		}
	}
	
	
	




	void modification()
	{
		int x;
		do 
		{
			 new OrgnaicStore().display();
			 
			 
			 
				
				
					
						System.out.println("Please enter your choice  else enter 0 For bill  ?");
						 x=sc.nextInt();
					
						 while(x<0 || x>4)
						 {
							 System.out.println("enter the correct Choice");
							 x=sc.nextInt();
						 };
						 if(x==0)
						 {
							 return; 
						 }
								
					switch(x)
					{
					   	case 1: 
					   		System.out.println("\tItemcode\t name\t items");
					   		new FruitsSection().fruitbillmodificationlist();
					   		new FruitsSection().fruitbillmodification();
					   		
					   		break;
					   	
					   	case 2:
					   		System.out.println("\tItemcode\t name\t items");
					   		new VegatablesClass().vegitablemodificationlist();
					   		new VegatablesClass().vegitablemodification();
					   	
					   		break;
					   	case 3:
					   		System.out.println("\tItemcode\t name\t items");
					   		new CosmeticsSection().cosmeticmodificationlist();
					   		new CosmeticsSection().cosmeticmodification();
					   		
					   		break;
					   	case 4:
					   		System.out.println("\tItemcode\t name\t items");
					   		new MasalaSection().masalamodificationlist();
					   		new MasalaSection().masalamodification();
					   		
					   		break;
					   		default:break;
			 
			
						}
					}while(x==1);
		
		
	}
	
	
	
	
	void billpaper()
	{
		System.out.println("\n");
		System.out.println("   ======= Welcome to Organic Store =========");
		System.out.println();
		
		if(fruittotalcost>0) 
		{ 
			new FruitsSection().friutBill();
			System.out.println("\t-----------------------------------");
			System.out.println("\tFriuts     Total Cost : "+fruittotalcost);
			System.out.println();
		}
		
		if(vegatablestotalcost>0)
		{
			new VegatablesClass().vegitableBill();
			System.out.println("\t-----------------------------------");
			System.out.println("\tVegitables Total Cost : "+vegatablestotalcost);
			System.out.println();
			
			
		}
		
		if(cosmeticstotalcost>0) 
		{
			new CosmeticsSection().cosmeticBill();
			System.out.println("\t-----------------------------------");
			System.out.println("\tCostmetics Total Cost : "+cosmeticstotalcost);
			System.out.println();
		}
		
		
		if(masalatotalcost>0)
		{
			new MasalaSection().masalaBill();
			System.out.println("\t-----------------------------------");
			System.out.println("\tMasala     Total Cost : "+masalatotalcost);
		}
		
		
		total=fruittotalcost+vegatablestotalcost+cosmeticstotalcost+masalatotalcost;
		
		if(total>=500)
		{
		    discount=(total*5)/100;
		    System.out.println();
			System.out.println("\tDisuont applicable(5%) : -"+discount);
			System.out.println("\t-----------------------------------\n");
			System.out.println("\t           Total bill : "+ (total-discount));
			System.out.println("\t-----------------------------------\n");
		}
		else 
		{
			System.out.println("\t-----------------------------------\n");
			System.out.println(" \t           Total bill : "+ total);
			System.out.println("\t-----------------------------------\n");
		}
			
			
		
		System.out.println("     Thank you for shopping you saved "+discount+" Rs     \n");
		System.out.println("\t---------- JAVA IS AWESOME ----------");
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		int x;
	
		System.out.println();
		System.out.println("========== Welcome to Organic Store =========");
		System.out.println();
		OrgnaicStore mainref=new OrgnaicStore();
		mainref.storeperfomance();
		
		mainref.billpaper();
			System.out.println();
			System.out.println("Do you want confirm bill if it is yes press any digit OR press 2 for modification ");
			 x=new OrgnaicStore().sc.nextInt();
		if(x!=2)
			mainref.billpaper();
		else
		{
			
			mainref.modification();
		}
		mainref.billpaper();
		System.out.println();
		System.out.println("Thank you for shopping");
		 
			fruittotalcost=0;
			vegatablestotalcost=0;
			cosmeticstotalcost=0;
			masalatotalcost=0;
		
		
		
		main(args);
		
	}
		
}
