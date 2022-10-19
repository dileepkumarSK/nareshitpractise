package circlepackage;

public class Cylender extends Circle
{
	 double height;
	/* 
	2. Create a default constructor that assigns default values to instance variables.
	3. Create parameterized constructor that accepts radius, height.
	4. Create below methods,

		Method name: getVolume
		Return type: double
	
		This method should return the volume of the cylender.
		Return -1 if height is negative.
*/
	 
	


	public Cylender() 
	{
		
	}


	public Cylender(double radius, double height) {
		super(radius);
		this.height = height;
	}
	

	 double getVolume()
	 {
		 if((3.14*this.height*super.radius)<0)
			 return -1;
		 else
			 return 3.14*this.height*super.radius ;
	 }
	
}
