package Circle;

public class circle
{
	float radius;
	
	circle(float radius)
	{
		this.radius = radius;
	}
	
	float circlearea()
	{
		float area = (float)(3.14*radius*radius);
		return area;
	}
	
}

 class sector extends circle
{
	float radians;
	
	sector(float radius,float radians)
	{
		super(radius);
		this.radians = radians;
	}
	
	float sectorarea()
	{
		float area = (float)(0.5 *radius*radius*radians);
		return area;
	}
}
 
 class segment extends circle
{
	float length;
	
	segment(float radius,float length)
	{
		super(radius);
		this.length = length;
	}
	
	float segmentarea()
	{
		float area = (float)(((radius*radius)*Math.acos((radius - length)/radius))-((radius-length)*Math.sqrt(((2*radius*length)-(length*length)))));
		return area;
	}
}

