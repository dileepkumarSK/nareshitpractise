package ioStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		ObjectInputStream ooi=new ObjectInputStream(new FileInputStream("A:/java/iostrems/objcets.ser"));
		ClassA k=(ClassA) ooi.readObject();
		k.methodA();
		ClassB b=(ClassB) ooi.readObject();
		b.methodB();
		
		
		
	}

}
