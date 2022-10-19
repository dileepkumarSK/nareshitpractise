package may102022;

public class BollentrueORfalse {
	 protected boolean countBoolean(boolean m1,boolean m2,boolean m3)
	{
		if(m1=true &&m2==true && m3==true)
		{
			return true;
		}
		else if(m1=true &&m2==true && m3==false)
		{
			return true;
		}
		else if(m1=true &&m2==false && m3==false)
		{
			return false;
		}
		else 
		{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(new BollentrueORfalse().countBoolean(true, true, false));
				
					
	}

}
