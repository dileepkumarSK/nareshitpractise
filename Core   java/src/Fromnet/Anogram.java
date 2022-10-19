package Fromnet;

public class Anogram {

	boolean anogram(String line,String line1) {
		int h=0;
		for(int i=0;i<line.length();i++) 
		{
			for(int j=0;j<line.length();j++) 
			{
				if(line.charAt(i)==line1.charAt(j)) 
				{
					
				}
				else {
					h=1;
					break;
				}
				
				if(line1.charAt(i)==line.charAt(j)) 
				{
					
				}
				else
				{
					h=1;
				
					break;
					
				}
				
			}
			
		}
		if(h==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(new Anogram().anogram("dileep", "ildeep"));
	}

}
