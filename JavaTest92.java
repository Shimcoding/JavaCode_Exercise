import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest92 {

	public static void main(String[] args) {
		SutdaCard1 c1 = new SutdaCard1(3,true);
		SutdaCard1 c2 = new SutdaCard1(3,true);
		SutdaCard1 c3 = new SutdaCard1(3,true);
		SutdaCard1 c4 = new SutdaCard1(3,false);
	
		// equals()를 재정의해서 num과 isKwang 값이 모두 같으면 true 반환 아니면 false 반환
		// toString()를 재정의해서 isKwanag이 true면 "K"를 붙이고 아니면 ""를 붙인다.
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2) : "+c1.equals(c2));
		System.out.println();
		
		System.out.println("c3="+c3);
		System.out.println("c4="+c4);
		System.out.println("c3.equals(c4) : "+c3.equals(c4));
	}
}

class SutdaCard1{
	private int num;
	private boolean isKwang;
	
	SutdaCard1() {
		this(1,true);
	}

	public SutdaCard1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(SutdaCard1 obj) {
		return num == obj.num && isKwang==obj.isKwang;
	}
	
	@Override
	public String toString() {
		return isKwang == true ? num+"K" : num+"";
	}
}