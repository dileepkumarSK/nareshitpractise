package ioStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ChartcterStreams 
{
 
	void charstrem() throws IOException
	{
		
		FileWriter fw=new FileWriter("A:/java/iostrems/charstrmeg.txt");
		FileReader fr=new FileReader("A:/java/iostrems/charstrmeg.txt");
				fw.write("hdgfdfhjdfjhfgjhdf");
				System.out.println(" excuted successfully");
				fw.close();
		int i;		
				System.out.println();
	while(( i=fr.read())!=-1)
	{
		System.out.print((char)i);
	}
		fr.close();
	}
	
	public static void main(String[] args)  throws  IOException
	{
		new ChartcterStreams().charstrem();

	}

}
