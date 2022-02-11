import java.util.Arrays;

public class JavaTest87 {

	public static void main(String[] args) {
		// �� ������ Ŭ������ �ϼ��ؼ� ������ ���� ���ϱ�
		// ������ ���ϴ� �޼���� calcArea()���� ���� �޼���� abstract �س���.
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("������ ��:"+sumArea(arr));
		
	}

	private static double sumArea(Shape[] arr) {
		double sum = 0;
		for(Shape cal : arr) {
			sum += cal.calcArea();
		}
		
		return sum;
	}
}

abstract class Shape{
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}

	public Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); //������ ������ ���

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
	
}

class Circle extends Shape{
	double r;

	Circle() {
		this(1);
	}
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	double calcArea() {
		return Math.PI*r*r;
	}
}

class Rectangle extends Shape{
	double width;
	double height;
	
	Rectangle() {
		this(1,1);
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}



	@Override
	double calcArea() {
		return width*height;
	}
	
	boolean isSquare() {
		return width==height ? true : false;
	}
}

class Point{
	int x;
	int y;
	
	Point() {
		this(0,0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "["+x+","+y+"]";
	}
	
}