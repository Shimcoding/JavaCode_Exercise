
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

public class JavaTest68 {

	public static void main(String[] args) {
		// 1. for ���� �̿��ؼ� ���
//		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
//		int[] counter = new int[4];
//		
//		// ���� counter �迭�� �ֱ�
//		for (int i = 0; i < answer.length; i++) {
//			counter[answer[i]-1]++;
//		}
//		
//		// ���� ��Ÿ����
//		for (int j = 0; j < counter.length; j++) {
//			System.out.print(counter[j]);
//			
//			// ������ŭ *���
//			for (int k = 0; k < counter[j]; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		// 2.Arrays.fill() ����ؼ� ���ϱ�
//		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
//		int[] counter = new int[4];
//		
//		// ���� counter �迭�� �ֱ�
//		for (int i = 0; i < answer.length; i++) {
//			counter[answer[i]-1]++;
//		}
//		
//		// ������ �� ����ϱ�
//		printCounter(counter, '*');
		
		
		
		// 3. 10������ 1~9 ���� ������ ���� ���� ����
		// �ش� ���ڿ� ���� ���� ���ϱ�
		// ex. 7:***
//		IntStream lotto = new Random().ints(1,10)
//						.limit(10);
//		int[] arr = lotto.toArray();
//		// ���ڿ� *�� ������ ���� map ����
//		Map<Integer, Integer> map = new HashMap<>();
//		
//		// Ű���� ���� ����, ������ ���� ������ ���� �ֱ�
//		for (int i = 0; i < arr.length; i++) {
//			Integer value = map.get(arr[i]);
//			if(!map.containsKey(arr[i])) {
//				map.put(arr[i], new Integer(1));
//			} else {
//				map.put(arr[i], new Integer(value+1));
//			}
//		}
//
//		// ���Ƿ� ���� 10���� ���� ���
//		System.out.println(Arrays.toString(arr));
//		
//		// map�� �ִ� �� �а� ����ϱ�
//		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
//		
//		while(it.hasNext()) {
//			Entry<Integer, Integer> entry =it.next();
//			System.out.println(entry.getKey()+":"+printCounter(entry.getValue(), '*'));
//		}
	}

	// 3�� �������� ���
//	private static String printCounter(Integer value, char c) {
//		String str = "";
//		for (int i = 0; i < value; i++) {
//			str+=c;
//		}
//		return str;
//	}
//
//	// 2�� �������� ���
//	private static void printCounter(int[] counter, char c) {
//		for (int i = 0; i < counter.length; i++) {
//			char[] chArr = new char[counter[i]];
//			System.out.print(counter[i]);
//			
//			Arrays.fill(chArr, c);
//			for (char c1 : chArr) {
//				System.out.print(c1);
//			}
//			System.out.println();
//		}
//	}


}
