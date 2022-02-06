
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

import javax.print.attribute.standard.OrientationRequested;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiEvent;

public class JavaTest77 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		
		// 1. for���� �̿��ؼ� �������� ����
//		int[] result = shuffle(original);
//		System.out.println(java.util.Arrays.toString(result));
		
		
		
		// 2. Stream�� ���� �������� ����
		// �迭 ��ҿ� �ּڰ�, �ִ� ���ϱ�
//		Arrays.sort(original);
//		
//		// �ּڰ��� �ִ��� �Ű������� shuffle1 �޼��� ����� 
//		int[] result1 = shuffle1(original[0],original[original.length-1],original.length);
//		System.out.println(Arrays.toString(result1));
		
		
		
		// 3. original �迭 �ȿ� �ִ� �� �� �� ���� �Է� �޾�
		// �� ����ŭ ũ���� �迭�� ���� �� �����ϰ� ���� �迭�� ����
		// �ű⼭ ù ��° ��ҿ� �ִ� ���� ���ߴ� ���α׷�
		System.out.print("�� ���� �� �ϳ��� �Է�>>");
		String input = sc.nextLine().trim();
		
		// ��ȿ�� �˻�
		if(!isCheck(input)) {
			System.out.println("�߸� �Է��ؼ� ���α׷��� �����մϴ�.");
		} else {
			// �Էµ� �� ��ŭ�� �迭 ������ ���� �� �ֱ�
			int num = Integer.valueOf(input);
			int[] inputArr = shuffle2(original,num);
			
			// ù ��° ��� ���߱�
			select(inputArr);
		}
	}

	private static void select(int[] inputArr) {
		while(true) {
			System.out.print("ù ��° ����� ����? ");
			if(inputArr[0]==sc.nextInt()) {
				System.out.println("�����Դϴ�!");
				System.out.println(Arrays.toString(inputArr));
				break;
			} System.out.println("Ʋ�Ƚ��ϴ�.");
		}
	}

	private static int[] shuffle2(int[] original, int num) {
		IntStream lotto = new Random().ints(original[0],original[original.length-1]+1).distinct()
		  		  .limit(num);
		return lotto.toArray();
	}

	private static boolean isCheck(String input) {
		if(input.length()<1 && input.length()>1)
			return false;
		if(!('0'<input.charAt(0) && input.charAt(0)<='9'))
			return false;
		return true;
	}

	// �ּڰ��� �ִ��� �޾� IntStream�� ���� ��� �迭�� �����
	private static int[] shuffle1(int min, int max, int length) {
		IntStream lotto = new Random().ints(min,max+1).distinct()
				  		  .limit(length);
		return lotto.toArray();
	}

	private static int[] shuffle(int[] original) {
		
		for (int i = 0; i < original.length*2; i++) {
			int num = (int)(Math.random()*original.length);
			int tmp = original[num];
			original[num] = original[0];
			original[0] = tmp;
		}
		return	original;
	}
}