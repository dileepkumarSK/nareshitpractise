package labpractice;

public class Calender 
{

	//final int hundred=5,twohundred=3,threehundred=1,fourhundred=0;
	final int January =0,feb=31,March =59,april=90,
			May=120,June=151,July=181,August=212,
			September=243,October=273,November=304,December=334;
	
	
	static int day;
	int lessyear,leapyeardays,normalyeardays;
	
	int dayFindout(int days,int month,int year)
	{
		
		if(days<1||days>31)
		{
			System.out.println("date not valid");
		}
		
		else
		{
			if((((year-1)%400)/100)==1)
			{ 
				System.out.println("hi");
				day+=5;
			}
			else if((((year-1)%400)/100)==2)
			{
				day+=3;
			}
			else if((((year-1)%400)/100)==3) //1996 1600 + 396
			{
				day+=1;
			}
			
			System.out.println("after year "+day);
			
			lessyear=((year%400)%100)-1;
			if(lessyear==0)
			{
				day+=month+days;
			}
			else 
			{
				
			System.out.println("less "+lessyear);
			
			leapyeardays=(lessyear/4);
			
			day+=leapyeardays*2;
			
			System.out.println("leap "+day);
			normalyeardays=(lessyear-leapyeardays);
			
			System.out.println("normal "+normalyeardays);
			day=day+normalyeardays;
			
			System.out.println(day+" days");
			
			day+=month+days;
			
			System.out.println("days after months" +day);
			
			
		}
	}
		
		return day%7; 
	}

public static void main(String[] args) {
	
	
	int m=new Calender().dayFindout(6, new Calender().September ,2001);
	switch(m)
	{
	case 0:
		System.out.println("Sunday");break;
	case 1:System.out.println("Monday");break;
	case 2:System.out.println("Tuseday");break;
	case 3:System.out.println("Wensday");break;
	case 4:System.out.println("Thusrday");break;
	case 5:System.out.println("friday");break;
	case 6:System.out.println("Saturday");break;
	
	}
	
}	
	
	
	
}
