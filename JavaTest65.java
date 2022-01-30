
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
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

public class JavaTest65 {

	public static void main(String[] args) {
		// 1. 주어진 배열에 for 문을 이용해서
		// Math.random()으로 값을 구하기
//		int[] ballArr = {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		
//		// ballArr배열의 임의의 요소를 골라서 위치를 바꾼다.
//		for (int i = 0; i < ballArr.length; i++) {
//			int j = (int)(Math.random()*ballArr.length);
//			int tmp = 0;
//			
//			tmp = ballArr[j];
//			ballArr[j] = ballArr[0];
//			ballArr[0] = tmp;
//		}
//		
//		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
//		System.arraycopy(ballArr, 0, ball3, 0, ball3.length);
//		
//		for (int i = 0; i < ball3.length; i++) {
//			System.out.print(ball3[i]);
//		}
		
		
		
		// 2. Stream을 이용해서 구하기
//		int[] ball3 = new int[3];
//		
//		//스트림 생성
//		IntStream lotto = new Random().ints(1,10)
//						.distinct().limit(3);
//		
//		//배열로 전환
//		ball3 = lotto.toArray();
//		
//		//임의의 수 세 개 출력
//		for (int i = 0; i < ball3.length; i++) {
//		System.out.print(ball3[i]);
//		}
		
		
		
		// 3.list와 set을 통해 오름차순과 내림차순으로 정렬된 
		// 임의의 수 세 개 각각 구하기
		
		//TreeSet으로 오름차순 정렬
//		TreeSet<Integer> set = new TreeSet<>();
//		final int MAX_SIZE = 3;
//		
//		while(set.size() != MAX_SIZE) {
//			set.add((int)(Math.random()*9)+1);
//		}
//		
//		for (Integer i : set) {
//			System.out.print(i);
//		}
//		System.out.println();
//		
//		//NavigableSet으로 내림차순 정렬
//		NavigableSet<Integer> decendingSet = set.descendingSet();
//		
//		for (Integer d : decendingSet) {
//			System.out.print(d);
//		}
	}
}
