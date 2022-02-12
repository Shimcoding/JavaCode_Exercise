import java.util.Arrays;

public class JavaTest89 {

	public static void main(String[] args) {
		// 각각의 value 값 얻어 내기 
		Outer1 outer = new Outer1();
		Outer1.Inner inner = outer.new Inner();
		inner.method1();
	}
}

class Outer1{
	int value = 10;
	
	class Inner{
		int value = 20;
		void method1() {
			int value = 30;
			
			// value = 30;
			System.out.println(value);
			// value = 20;
			System.out.println(this.value);
			// value = 10;
			System.out.println(Outer1.this.value);
		}
	}
}
