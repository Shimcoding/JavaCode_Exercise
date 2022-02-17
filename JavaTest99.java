import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest99 {

	public static void main(String[] args) {
		
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
		System.out.println();
		
	}
	
	// �־��� ���� �ݿø��Ͽ� �Ҽ��� ���� n�ڸ��� ���� ��ȯ�Ѵ�.
	// Math Ŭ���� ���
	private static double round(double d, int n) {
		
		return Math.round(d*Math.pow(10, n)) / Math.pow(10, n) ;
	}
	
}