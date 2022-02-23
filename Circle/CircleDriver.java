package Circle;
import java.util.*;

class circledriver
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter the radius of circle");
		float radius = sc .nextFloat();
		
		circle circle = new circle(radius);
		
		System.out.println(" enter the radians of circle");
		float radians = sc .nextFloat();
		
		sector sector = new sector (radius ,radians);
		
		System.out.println(" enter the length of segment");
		float length = sc .nextFloat();
		
		segment segment = new segment(radius ,length);
		
		System.out.println(" The area of circle is"+circle.circlearea());
		System.out.println(" The area of sector is"+sector.sectorarea());
		System.out.println(" The area of segment is"+segment.segmentarea());
		
		
	}
}
