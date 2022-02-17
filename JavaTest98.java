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
		// 1��
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
		System.out.println();
		
		
		// 2��
		System.out.println(contains1("12345523", "23"));
		System.out.println(contains1("12345", "67"));
		System.out.println();
		
		
		// 3��
		System.out.println(contains2("12345", "23"));
		System.out.println(contains2("12345", "67"));

	}

	private static boolean contains(String src, String target) {

	// 1.target�� src�� ������ true ��ȯ ������ false�� ��ȯ
		return src.indexOf(target) != -1 ? true : false;

	}

	private static String contains1(String src, String target) {
	// 2.target�� src�� ������ �� �κи� ���� ������ �κ��� ���
	// ex. src= "1234", target= "23" -> "14" ���
	// ������ src �״�θ� ���
		String str = "";
		if(src.indexOf(target) != -1) {
			str = src.replaceAll(target, "");
			return str;
		} else
			return src;
	}
	
	private static String contains2(String src, String target) {
	// 3. 2������ target�� src�� ������ 
	// src�� ���ļ� ���
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