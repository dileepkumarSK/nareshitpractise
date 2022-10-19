package oops;

public class Batsman 
{

	String name;
	int runs,matches;
	float batting_avg;
	
	Batsman(String name,int runs,int matches)
	{
		this.name=name;
		this.runs=runs;
		this.matches=matches;
	}
	
	void computeBattingAverage()
	{
		if(runs<0 || matches<0)
		{
			System.out.println("Error");
		}
		else if(runs>0&&matches==0)
		{
			System.out.println("Error");
		}
		else
		{
			batting_avg=(float)runs/matches;
			System.out.println("Name: "+name+"\nBatting_Avg :"+ batting_avg);
		}
	}
	
	void getStatistics()
	{
		if(runs<0|| matches<0)
		{
			System.out.println("Error");
		}
		else if(runs>0&&matches==0)
		{
			System.out.println("Error");
		}
		else
		{
			System.out.println("Name: "+name+"\nRuns: "+runs+"\nMatches : "+matches);
		}
	}
	
	public static void main(String[] args) 
	{
		
		Batsman bobj=new Batsman("Dileep",5244,30);
		bobj.computeBattingAverage();
		System.out.println();
		bobj.getStatistics();
	}

}
