package LAb;

public class MultiplesOfRound {
	int mul(int a,int b,int c) {
		if(a%10!=0) {
			a=((a/10)+1)*10;
		}
		
		if(b%10!=0) {
			b=((b/10)+1)*10;
		}
		
		if(c%10!=0) {
			c=((c/10)+1)*10;
		}
		return a+b+c;
	}

	public static void main(String[] args) {
		
	System.out.println(new MultiplesOfRound().mul(23, 34, 69));	
		
	}

}
