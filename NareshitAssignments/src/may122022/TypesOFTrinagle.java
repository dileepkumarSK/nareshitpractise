package may122022;

public class TypesOFTrinagle {
    String findTriangle(int a1,int a2,int a3)
    {
    	if(a1+a2+a3!=180)
    	{
    		return "sum of angles should be equal to 360";
    	}
        else if(a1==0||a2==0||a3==0)
    	{
    		return "-1";
    	}
    	else if(a1<0||a2<0||a3<0)
    	{
    		return "-2";
    	}
    	else if(a1+a2!=2*a3||a1+a3!=2*a2||a2+a3!=2*a1)
    	{
    		return "-3";
    	}
    	else 
    	{
    		if(a1==a2||a1==a3||a2==a3)
    		{
    			return "EQUILATERAL triangle";
    		}
    		else if((a1+a2==a3)||a2+a3==a1||a3+a1==a2)
    		{
    			return "ISOSCELES tringle";
    		}
    		else
    		{
    			return "SCALENE  tringle";	
    		}
    	 
    	}
    }
	public static void main(String[] args) {
		 
     System.out.println(new TypesOFTrinagle().findTriangle(120,120 ,120));
	}

}
