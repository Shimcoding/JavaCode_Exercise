
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
		// 1. for 문을 이용해서 출력
//		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
//		int[] counter = new int[4];
//		
//		// 개수 counter 배열에 넣기
//		for (int i = 0; i < answer.length; i++) {
//			counter[answer[i]-1]++;
//		}
//		
//		// 개수 나타내기
//		for (int j = 0; j < counter.length; j++) {
//			System.out.print(counter[j]);
//			
//			// 개수만큼 *출력
//			for (int k = 0; k < counter[j]; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		// 2.Arrays.fill() 사용해서 구하기
//		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
//		int[] counter = new int[4];
//		
//		// 개수 counter 배열에 넣기
//		for (int i = 0; i < answer.length; i++) {
//			counter[answer[i]-1]++;
//		}
//		
//		// 개수와 별 출력하기
//		printCounter(counter, '*');
		
		
		
		// 3. 10개까지 1~9 사이 임의의 수를 넣은 다음
		// 해당 숫자와 별의 개수 구하기
		// ex. 7:***
//		IntStream lotto = new Random().ints(1,10)
//						.limit(10);
//		int[] arr = lotto.toArray();
//		// 숫자와 *의 개수를 넣을 map 생성
//		Map<Integer, Integer> map = new HashMap<>();
//		
//		// 키에는 나온 숫자, 값에는 나온 숫자의 개수 넣기
//		for (int i = 0; i < arr.length; i++) {
//			Integer value = map.get(arr[i]);
//			if(!map.containsKey(arr[i])) {
//				map.put(arr[i], new Integer(1));
//			} else {
//				map.put(arr[i], new Integer(value+1));
//			}
//		}
//
//		// 임의로 나온 10개의 숫자 출력
//		System.out.println(Arrays.toString(arr));
//		
//		// map에 있는 거 읽고 출력하기
//		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
//		
//		while(it.hasNext()) {
//			Entry<Integer, Integer> entry =it.next();
//			System.out.println(entry.getKey()+":"+printCounter(entry.getValue(), '*'));
//		}
	}

	// 3번 문제에서 사용
//	private static String printCounter(Integer value, char c) {
//		String str = "";
//		for (int i = 0; i < value; i++) {
//			str+=c;
//		}
//		return str;
//	}
//
//	// 2번 문제에서 사용
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
