package arrays;
import java.util.Scanner;
public class IncreamentUserinputvalues {

	
	
	public static void main(String[] args) {
	
		
		int i,n,a[];
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n values");
		n=s.nextInt();
		a = new int[20];
		for(i=0;i<n;i++) 
		{
			
			
			a[i]=s.nextInt()+2;
		}

		
		for(i=0;i<n;i++) 
		{
			
			System.out.print(a[i]+" , ");
		
		}
	}

}
