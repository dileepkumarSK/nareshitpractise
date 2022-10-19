package pattrens;

public class Alphbets1 {

	void pattren1(char x)
	{
		for(char i='A';i<=x;i++) 
		{
			for(char j=i;j>='A';j--) 
				
			{  if(j<=i)
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("===================================");
	}
	
	void pattren2(int x)
	{
		char m=65;
		for(int i=1;i<=x;i++)
		{ char temp=m;
			for(int j=1;j<=x;j++)
			{
				if(j<=x-(i-1))
				System.out.print(temp++ +" ");
			}
			System.out.println();
		}
		System.out.println("===================================");
	}

	void pattren3(int x)
	{
		char m=65;
		for(int i=1;i<=x;i++)
		{ char temp=m;
			for(int j=1;j<=x;j++)
			{
				if(j<=x-(i-1))
				System.out.print(temp++ +" ");
			}
			m++;
			System.out.println();
		}
		System.out.println("===================================");
	}

	void pattren4(int x,char mx)
	{ 
		char m=mx;
		for(int i=1;i<=x;i++)
		{ char temp=m;
			for(int j=1;j<=x;j++)
			{
				if(j<=i)
				System.out.print(temp-- +" ");
			}
			
			System.out.println();
		}
		System.out.println("===================================");
	}
	
	void pattren5(int x,char mx)
	{ 
		char m=mx;
		for(int i=1;i<=x;i++)
		{ char temp=m;
			for(int j=1;j<=x;j++)
			{
				if(j<=x-(i-1))
				System.out.print(temp-- +" ");
			}
			
			System.out.println();
		}
		System.out.println("===================================");
	}
	
	void pattren6(int x,char mx)
	{ 
		char m=mx;
		for(int i=1;i<=x;i++)
		{ char temp=m;
			for(int j=1;j<=x;j++)
			{
				if(j<=x-(i-1))
				System.out.print(temp-- +" ");
			}
			m--;
			System.out.println();
		}
		System.out.println("===================================");
	}
	
	
	public static void main(String[] args) {
		
		Alphbets1 patrenobj=new Alphbets1();
		patrenobj.pattren1('E');
		patrenobj.pattren2(5);
		patrenobj.pattren3(5);
		patrenobj.pattren4(5,'E');
		patrenobj.pattren5(5,'E');
		patrenobj.pattren6(5,'E');
	}

}
