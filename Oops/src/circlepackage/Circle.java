package circlepackage;

public class Circle 
{

	 double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}
	
	double getArea()
	{
		if((3.14*radius*radius)<0)
			return -1;
		else
			return 3.14*radius*radius;
	}
	 
	 
}
