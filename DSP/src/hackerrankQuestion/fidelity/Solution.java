package hackerrankQuestion.fidelity;

import java.util.Scanner;

public class Solution
{

	// The following code is already present.
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int z1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int z2 = sc.nextInt();

		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);

		Point3D p3D1 = new Point3D(x1, y1, z1);
		Point3D p3D2 = new Point3D(x2, y2, z2);

		double twoDdistance = p1.distanceFrom(p2);
		double threeDdistance = p3D1.distanceFrom(p3D2);
		p1.printDistance(twoDdistance);
		p3D1.printDistance(threeDdistance);

	}

}

//we need to implement the following classes
class Point2D
{
	int x, y;

	public Point2D(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public double distanceFrom(Point2D p)
	{
		int subx = p.x - this.x;
		int suby = p.y - this.y;

		return Math.sqrt(((subx * subx) + (suby * suby)));
	}

	public void printDistance(double d)
	{
		System.out.println("2D distance=" + (int) Math.ceil(d));
	}
}

class Point3D extends Point2D
{
	int z;

	public Point3D(int x, int y, int z)
	{
		super(x, y);
		this.z = z;
	}

	public double distanceFrom(Point3D p)
	{
		int subx = p.x - this.x;
		int suby = p.y - this.y;
		int subz = p.z - this.z;

		return Math.sqrt(((subx * subx) + (suby * suby) + (subz * subz)));
	}

	public void printDistance(double d)
	{
		System.out.println("3D distance=" + (int) Math.ceil(d));
	}
}