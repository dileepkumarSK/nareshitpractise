package ioStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Datastreams {

	void streams() throws IOException
	{
		//
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("A:/java/iostrems/datastrex.txt"));
		//dos.writeChars("hi dileep succuss is imp");
		dos.writeInt(4580);
	
		DataInputStream doi=new DataInputStream(new FileInputStream("A:/java/iostrems/datastrex.txt"));
		
		//System.out.println(doi.readLine());
		System.out.println(doi.readInt());
		
		doi.close();	dos.close();
		
	}
	
	public static void main(String[] args) throws IOException
	{
		new Datastreams().streams();
	}
}
