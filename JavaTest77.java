
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
		
		// 1. for문을 이용해서 랜덤으로 섞기
//		int[] result = shuffle(original);
//		System.out.println(java.util.Arrays.toString(result));
		
		
		
		// 2. Stream을 통해 랜덤으로 섞기
		// 배열 요소에 최솟값, 최댓값 구하기
//		Arrays.sort(original);
//		
//		// 최솟값과 최댓값을 매개변수로 shuffle1 메서드 만들기 
//		int[] result1 = shuffle1(original[0],original[original.length-1],original.length);
//		System.out.println(Arrays.toString(result1));
		
		
		
		// 3. original 배열 안에 있는 수 중 한 수를 입력 받아
		// 그 수만큼 크기의 배열을 만든 후 랜덤하게 수를 배열에 저장
		// 거기서 첫 번째 요소에 있는 수를 맞추는 프로그램
		System.out.print("위 숫자 중 하나를 입력>>");
		String input = sc.nextLine().trim();
		
		// 유효성 검사
		if(!isCheck(input)) {
			System.out.println("잘못 입력해서 프로그램을 종료합니다.");
		} else {
			// 입력된 값 만큼의 배열 생성과 랜덤 값 넣기
			int num = Integer.valueOf(input);
			int[] inputArr = shuffle2(original,num);
			
			// 첫 번째 요소 맞추기
			select(inputArr);
		}
	}

	private static void select(int[] inputArr) {
		while(true) {
			System.out.print("첫 번째 요소의 값은? ");
			if(inputArr[0]==sc.nextInt()) {
				System.out.println("정답입니다!");
				System.out.println(Arrays.toString(inputArr));
				break;
			} System.out.println("틀렸습니다.");
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

	// 최솟값과 최댓값을 받아 IntStream을 통해 섞어서 배열로 만들기
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