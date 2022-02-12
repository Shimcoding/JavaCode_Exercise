import java.util.Arrays;

// 내부 클래스 만들기
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
		System.out.println("Inner의 iv="+inner.iv);
		
		Outer.Inner.InnerChild inner1 = inner.new InnerChild();
		System.out.println("InnerChild의 iv="+inner1.iv1);
		
	}
}

