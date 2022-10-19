
package LAb;
import java.util.*;

public class NumberPattern {
int k=1;
	int patren(int n) {
		if(n<0) {
			return -1;
		}
		else if(n==0) {
			return -2;
		}
		else {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print(k*j+" ");
				}
			}
			k++;
			System.out.println();
		}
		return 0;
	}
		}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=s.nextInt();
new NumberPattern().patren(n);
s.close();
	}

}
