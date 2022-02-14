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
		// isTrue()로 equals()를 사용해서 모든 값이 같으면 true
		// 하나라도 다르면 false 반환과 몇 개의 값이 다른지 개수까지 출력
		isTrue(p1,p2);
		System.out.println();
		
		System.out.println(p3);
		System.out.println(p4);
		isTrue(p3,p4);
		
	}

	private static void isTrue(Point3D p1, Point3D p2) {
		System.out.println("p1==p2?"+p1.equals(p2));
		
		if(!p1.equals(p2)) {
			//같지 않은 개수 카운트
			int count = 0;
			//toString()으로 문자열로 바꾼 후 charAt()으로 문자가 같은지 다른지 검사
			for (int i = 0; i < p1.toString().length(); i++) {
				if(p1.toString().charAt(i)!=p2.toString().charAt(i))
					count++;
			}
			System.out.println(count+"개의 값이 다릅니다.");
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