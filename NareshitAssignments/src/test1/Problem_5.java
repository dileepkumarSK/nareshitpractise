package test1;

public class Problem_5 {

	String getNaturalNumbers(int x,int y)
	{
		 if(x<0 || y<0) 
		 {
			 return "-2";
		 }
		 else if(x==0 || y==0)
		 {
		   return "-1";	 
		 }
		 else 
		 {
			String cha= new Problem_5().m(x, y);
			return cha;
		 }
	}
	String ch="";
	String m(int x,int y) {

		
		 if(x>y)
		 {
			
			if(x!=y)
			{
				ch = ch+x+" "; 
				m(x+1, y);
			}
		 }
		 else
		 {
			 
				if(x!=y)
				{
					ch = ch+x+" "; 
				 m(x+1, y);
				} 
		 }
		 return ch;
	}
	public static void main(String[] args) {
		System.out.println(new Problem_5().getNaturalNumbers(1, 5));

	}

}
