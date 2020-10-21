import java.io.*;

public class TestCylinder
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double rad,height;
		
		System.out.print("enter radius and height ::");
		rad = Double.parseDouble(br.readLine());
		height = Double.parseDouble(br.readLine());
		
		Cylinder cyl = new Cylinder(rad, height);
		
		cyl.getVolume();
	}
}