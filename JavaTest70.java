
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiEvent;

public class JavaTest70 {

	public static void main(String[] args) {
		// 1. ���ĺ��� ���ڸ� �Ʒ��� �־��� ��ȣǥ�� ��ȣȭ�ϴ� ���α׷�
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
					    // 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
//		String src = "abc123";
//		String result = "";
//		
//		for (int i = 0; i < src.length(); i++) {
//			char ch = src.charAt(i);
//			
//			if('0'<=ch && ch<='9') {
//				result += numCode[ch-48];
//			} else {
//				result += abcCode[ch-'a'];
//			}
//		}
//		
//		System.out.println("src:"+src);
//		System.out.println("result:"+result);
		
		
		
		// 2.����ڷκ��� �Է� ���� ���ĺ��� ���ڸ� ��ȣȭ
//		Scanner sc = new Scanner(System.in);
//		
//		// ��ȿ�� �˻�
//		while(true) {
//			System.out.print("���� �Է�(q �Ǵ� Q �Է� �� ����)>>");
//			String input = sc.nextLine().trim();
//			if(input.equalsIgnoreCase("q")) {
//				System.out.println("�����մϴ�.");
//				break;
//			}
//			if(!isInput(input)) {
//				System.out.println("�ٽ� �Է��ϼ���.");
//				continue;
//			}
//			
//			String result = inputChange(input,abcCode,numCode);
//			System.out.println(result);
//		}
		
	}

	private static String inputChange(String input, char[] abcCode, char[] numCode) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if('0'<=ch && ch<='9') {
				result += numCode[ch-48];
			} else {
				result += abcCode[ch-'a'];
			}
		}
		
		return result;
	}

	private static boolean isInput(String input) {
		if(input.length()<1) {
			System.out.println("�� ���� �̻� �Է��ϼ���.");
			return false;
		} 
			return true;
	}

}
