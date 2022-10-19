package test1;
/*
if the given number is an three digit number, retun 1 if the number is palindrome, else return 0. Example: if x = 232, return 1. if x = 345, return 0
if the given number is negative or zero, return -1
if the given number is not an three digit number, return -2*/
public class Problem_1 {
     int ispalin(int n)
     {
    	 int m=n,palin=0;
    	 while(n!=0)
    	 {
    		 palin=(palin*10)+n%10;
    		 n/=10;
    	 }
    	 if(m==0)
    	 {
    		 return -1;
    		 
    	 }
    	 else if(m<0) 
    	 {
    		 return -2;
    	 }
    	 else if(m==palin)
    	 {
    	   return 1;	 
    	 }
    	 else {
    		 return 0;
    	 }
    	 
     }
 	public static void main(String[] args) {
		System.out.println(new Problem_1().ispalin(1121));

	}

}
