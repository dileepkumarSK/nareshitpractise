package pattrens;

public class NumberPattren {
	
	int cou=1;
	void pattren1(int x)
	{
		System.out.println("pattren no:" + cou++);
		int m=1;
		for(int i=1;i<=5;i++)
		{   
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				System.out.print(m++ +" ");
			}
			
			System.out.println();
		}
		System.out.println("===================================");
	}
	

		
		
		void pattren2(int x)
		{
			System.out.println("pattren no:" + cou++);
			for(int i=1;i<=x;i++)
			{
				for(int j=i;j>=1;j--)
				{
					if(j<=i)
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.println("===================================");
		}
		
		void pattren3(int x)
		{
			System.out.println("pattren no:" + cou++);
			for(int i=1;i<=x;i++)
			{
				for(int j=1;j<=x;j++)
				{
					if(j<=x-(i-1))
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.println("===================================");
		}
		
		void pattren4(int x)
		{
			System.out.println("pattren no:" + cou++);
			int m=1,temp;
			for(int i=1;i<=x;i++)
			{   temp=m;
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
		
		
		void pattren5(int x)
		{
			System.out.println("pattren no:" + cou++);
			for(int i=x;i>=1;i--)
			{   
				for(int j=x;j>=1;j--)
				{
					if(j<=i)
					System.out.print(j +" ");
				}
				
				System.out.println();
			}
			System.out.println("===================================");
		}
		
		void pattren6(int x)
		{
			System.out.println("pattren no:" + cou++);
			int m=x;
			for(int i=1;i<=x;i++)
			{   
				for(int j=1;j<=x;j++)
				{
					if(j<=i)
					System.out.print(m-- +" ");
				}
				m=x;
				System.out.println();
			}
			System.out.println("===================================");
		}
		
		void pattren7(int x)
		{
			System.out.println("pattren no:" + cou++);
			int m=x;
			for(int i=1;i<=5;i++)
			{   
				for(int j=1;j<=5;j++)
				{
					if(j<=x-(i-1))
					System.out.print(m-- +" ");
				}
				m=x;
				System.out.println();
			}
			System.out.println("===================================");
		}
		
		void pattren8(int x)
		{
			System.out.println("pattren no:" + cou++);
			for(int i=1;i<=x;i++)
			{   
				for(int j=1;j<=x;j++)
				{
					if(j<=i)
					{
						if(j%2==0)
						{
							System.out.print(0+" ");
						}
						else
						{
							System.out.print(1+" ");
						}
					}
				}
				
				System.out.println();
			}
			System.out.println("===================================");
		}
		


	public static void main(String[] args) {
		
		 NumberPattren npobj=new  NumberPattren();
		 npobj.pattren1(5);
		 npobj.pattren2(5);
		 npobj.pattren3(5);
		 npobj.pattren4(5);
		 npobj.pattren5(5);
		 npobj.pattren6(5);
		 npobj.pattren7(5);
		
		 npobj.pattren8(5);
	}

}
