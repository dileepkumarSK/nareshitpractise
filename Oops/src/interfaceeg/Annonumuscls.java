package interfaceeg;

public class Annonumuscls 
{
	 int av=20;
	
	  class x{
		int iv;
		
		void inner()
		{
			System.out.println("hi inner class"+ av);
			
			
		}
		
		class z{
			void m3()
			{
				System.out.println("hi m3");
			}
			 public class aa{
				
			} 
			
			class kk extends aa{
				
			}
			
		}
		
		
		
		
	}
	
	  public void m4()
		{
			x xo= new x();
			xo.inner();
		}
	  
	  
	public static void main(String[] args) {
		Annonumuscls xo= new Annonumuscls(); 
		xo.m4();
		
	}

	
	
}
