package ioStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

class ClassA  implements Serializable
{
	void methodA()
	{
		System.out.println("A");
	}
}
class ClassB implements Serializable
{
	void methodB()
	{
		System.out.println("hi b");
	}
}
class ClassD implements Serializable
{
	void methodD()
	{
		System.out.println("hi D");
	}
} 
class ClassC implements Serializable
{
	void methodC()
	{
		System.out.println("hi C");
	}
}
public class ObjectStreamExample
{

	void obectstmethod() throws IOException
	{
		ObjectOutputStream  oos=new  ObjectOutputStream(new FileOutputStream("A:/java/iostrems/objcets.ser"));
		oos.writeObject(new ClassA());
		oos.writeObject(new ClassB());
		oos.writeObject(new ClassC());
		oos.writeObject(new ClassD());
		oos.close();
		
		
	}
	public static void main(String[] args) throws IOException
	{
	new ObjectStreamExample().obectstmethod(); 
	}
	

}
