package Fromnet;

public class PalindromeString {
    
	boolean palindrome(String s)
	{
	   char strnchar[]=s.toCharArray();
	   int k=0,m=0;
	   for(int i=s.length()-1;i>=0;i--)
	   {
		   if(strnchar[k++]!=strnchar[i]){
			   {
				  m=1;
				  break;
			   }
		   }
	   }
		if(m==1)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(new PalindromeString().palindrome("hikk") );
	}

}
