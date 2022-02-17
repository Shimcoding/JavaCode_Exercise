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

public class JavaTest98 {

	public static void main(String[] args) {
		// 1번
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
		System.out.println();
		
		
		// 2번
		System.out.println(contains1("12345523", "23"));
		System.out.println(contains1("12345", "67"));
		System.out.println();
		
		
		// 3번
		System.out.println(contains2("12345", "23"));
		System.out.println(contains2("12345", "67"));

	}

	private static boolean contains(String src, String target) {

	// 1.target이 src에 있으면 true 반환 없으면 false를 반환
		return src.indexOf(target) != -1 ? true : false;

	}

	private static String contains1(String src, String target) {
	// 2.target이 src에 있으면 그 부분만 빼고 나머지 부분을 출력
	// ex. src= "1234", target= "23" -> "14" 출력
	// 없으면 src 그대로를 출력
		String str = "";
		if(src.indexOf(target) != -1) {
			str = src.replaceAll(target, "");
			return str;
		} else
			return src;
	}
	
	private static String contains2(String src, String target) {
	// 3. 2번에서 target이 src에 없으면 
	// src와 합쳐서 출력
		String str = "";
		if(src.indexOf(target) != -1) {
			str = src.replaceAll(target, "");
			return str;
		} else {
			str += src + target;
			return str;
		}
	}
}