import java.util.Arrays;
import java.util.Iterator;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest93 {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);
		Point3D p3 = new Point3D(2,2,2);
		Point3D p4 = new Point3D(1,1,1);
		
		System.out.println(p1);
		System.out.println(p2);
		// isTrue()�� equals()�� ����ؼ� ��� ���� ������ true
		// �ϳ��� �ٸ��� false ��ȯ�� �� ���� ���� �ٸ��� �������� ���
		isTrue(p1,p2);
		System.out.println();
		
		System.out.println(p3);
		System.out.println(p4);
		isTrue(p3,p4);
		
	}

	private static void isTrue(Point3D p1, Point3D p2) {
		System.out.println("p1==p2?"+p1.equals(p2));
		
		if(!p1.equals(p2)) {
			//���� ���� ���� ī��Ʈ
			int count = 0;
			//toString()���� ���ڿ��� �ٲ� �� charAt()���� ���ڰ� ������ �ٸ��� �˻�
			for (int i = 0; i < p1.toString().length(); i++) {
				if(p1.toString().charAt(i)!=p2.toString().charAt(i))
					count++;
			}
			System.out.println(count+"���� ���� �ٸ��ϴ�.");
		}
	}
}

class Point3D{
	private int x,y,z;
	
	Point3D() {
		this(randomNum(),randomNum(),randomNum());
	}

	private static int randomNum() {
		return (int)(Math.random()*9)+1;
	}

	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public boolean equals(Object obj) {
		Point3D p = (Point3D)obj;
		return x==p.x && y==p.y && z==p.z;
	}
	
	@Override
	public String toString() {
		return "["+x+","+y+","+z+"]";
	}
	
}