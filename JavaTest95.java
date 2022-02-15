import java.util.Arrays;
import java.util.Iterator;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest95 {

	public static void main(String[] args) {
		printGraph(new int[]{3,7,1,4},'*');

	}

	private static void printGraph(int[] arr, char c) {
		// 1.Arrays.fill()로 숫자만큼 별 넣기
		for (int i = 0; i < arr.length; i++) {
			char[] chArr = new char[arr[i]];
			Arrays.fill(chArr, c);
			String str = new String(chArr);
			
			System.out.println(str+arr[i]);
		}
		
		
		
		// 2.for문으로만 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				System.out.print(c);
			}
			System.out.println(arr[i]);
		}
		
	}
}