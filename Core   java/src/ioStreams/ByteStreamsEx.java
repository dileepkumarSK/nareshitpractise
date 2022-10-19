package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteStreamsEx {
	void streams() throws IOException
	{
		FileOutputStream fo=new FileOutputStream("A:/java/iostrems/newimg.JPG");
		FileInputStream fi=new FileInputStream("A:/java/iostrems/panCard.JPG");
		int i;
		
		while((i=fi.read())!=-1)
		{
			fo.write((byte)i);
		}
		
	
	}
	
	public static void main(String[] args) throws IOException
	{
		new ByteStreamsEx().streams();
	}
}
