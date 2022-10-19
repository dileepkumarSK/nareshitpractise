package oops;

public class Tester 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee(01,"arunesh",50000,10000,20000);
		 TaxUtil u=new TaxUtil();
		System.out.println(u.CalculateTax(e));
		Manager m=new Manager(001,"prashant",200000,10000,5000,10000);
        System.out.println(u.CalculateTax(m));
	}
}
