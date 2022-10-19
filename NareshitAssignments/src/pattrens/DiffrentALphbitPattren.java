package pattrens;

public class DiffrentALphbitPattren {
	
	
	void forwardandreverse()
	{
		char c='A';
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=14;j++)
			{
				if( j>=i&& j<=14-(i-1))
				{
					if( j>=8)
						System.out.print(--c +" ");
						else
						System.out.print(c++ +" ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			c='A';
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		DiffrentALphbitPattren dobj=new DiffrentALphbitPattren();
		dobj.forwardandreverse();
	}

}
