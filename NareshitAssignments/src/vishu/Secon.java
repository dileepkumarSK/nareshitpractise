package vishu;

public class Secon {

	
	int Stringmeth(String aa)
	{
		
		String s[]=aa.split(" ");// ab-c  AB-C
		
		int finalSum=0;
		for(int i=0;i<s.length;i++)
		{
			int sum=0,c=0;
			String temp=s[i];
			
			for(int j=0;j<temp.length();j++)
			{
				
					if(temp.charAt(j)>='A'&&temp.charAt(j)<='Z')
					{
						int x=temp.charAt(j);
						sum=sum+(x-64);
						++c;
					}
					
					else if(temp.charAt(j)>='a'&&temp.charAt(j)<='z')
					{
							int x=temp.charAt(j);
							sum=sum+(x-96);
					}
					else
					{
						++c;
					}
			}
			if(c==temp.length())
			{
				finalSum=finalSum+(sum)*2;
			}
			else
			{
				finalSum+=sum;
			}
			
		}
		return finalSum;	
	}
	
	public static void main(String[] args) {
		System.out.println(new Secon().Stringmeth("ab-c  AB-C"));
	}
}
