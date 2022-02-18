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

public class JavaTest100 {

	public static void main(String[] args) {
		//주어진 문자열에서 금지된 문자들을 제거하여 반환
		//delChar()의 첫 번째 매개변수가 주어진 문자열, 두 번째 금지된 문자들 
		System.out.println("(1!2@3^4~5)"+" -> "
				+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
				System.out.println("(1 2 3 4\t5)"+" -> "
				+ delChar("(1 2 3 4\t5)"," \t"));
	}

	private static String delChar(String src, String delCh) {
		// 1.2중 for문으로 구하기
		
		StringBuilder sb = new StringBuilder(src.length());
		for (int i = 0; i < src.length(); i++) {
			for (int j = 0; j < delCh.length(); j++) {
				if(src.charAt(i)==delCh.charAt(j))
					break;
				if(j==delCh.length()-1)
					sb.append(src.charAt(i));
			}
		}
		
		return sb.toString();
	}
}