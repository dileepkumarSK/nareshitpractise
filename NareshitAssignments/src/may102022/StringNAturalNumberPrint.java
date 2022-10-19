package may102022;

public class StringNAturalNumberPrint {
	  String getNumbersInRange(int x,int y)
	  {
		  
		  if(x<0 || y<0) {
			  return "-1";  
		  }
		  else if(x==y) {
			  return "-2" ;
		  }
		  else if(x>y)
		  {
			  return "-3"; 
		  }
		  else if(x-y==1)
		  {
			  return "-4";  
		  }
		  else
		  {
			  String ch="";
			  for(int i=x+1;i<y;i++)
			  {
				 ch=ch+i+" "; 
			  }
			  return ch;
		  }
		  
	  }
	
	public static void main(String[] args) {
	System.out.println(new StringNAturalNumberPrint().getNumbersInRange(5, 15));
	System.out.println(new BollentrueORfalse().countBoolean(true, true, false));
	}

}
