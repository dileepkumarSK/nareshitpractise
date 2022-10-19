package LAb;

public class EvenNumberPrint {

	void getEvenNumbers(int x,int y){
		if(x<y) {
			for(int i=x;i<=y;i++) {
				if(i%2==0) {
					System.out.print(i+" ");
				}
			}
		}
		
		
	}


	public static void main(String[] args) {
	
		new EvenNumberPrint().getEvenNumbers(10, 20);
		

}
}