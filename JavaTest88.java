import java.util.Arrays;

// ���� Ŭ���� �����
class Outer{
	class Inner{
		int iv = 100;
		class InnerChild{
			int iv1 = 200;
		}
	}
}

public class JavaTest88 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println("Inner�� iv="+inner.iv);
		
		Outer.Inner.InnerChild inner1 = inner.new InnerChild();
		System.out.println("InnerChild�� iv="+inner1.iv1);
		
	}
}

