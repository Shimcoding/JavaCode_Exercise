
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
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

public class JavaTest79 {
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		
		// 주어진 int형 배열의 값 중에서 제일 큰 값을 반환
		// 만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환
		System.out.println("최댓값 :"+max(data)); 
		System.out.println("최댓값 :"+max(null)); 
		System.out.println("최댓값 :"+max(new int[]{})); // 0 최대값 크기가 인 배열
		System.out.println("최댓값 :"+max(new int[]{11,15,12,25,30,11,15})); // 0 최대값 크기가 인 배열
	}

	private static int max(int[] data) {
		// 1. for 문을 통해서 제일 큰 값 반환하기
		
		// (공통)null이나 크기가 0이면 -999999 반환
		if(data==null || data.length < 1)
			return -999999;
//		
//		int maxNum = data[0];
//		
//		for (int i = 1; i < data.length; i++) {
//			if(maxNum < data[i])
//				maxNum = data[i];
//		}
//		return maxNum;
		
		
		
		// 2. sort를 이용해서 제일 큰 값 반환하기
//		Arrays.sort(data);
//		
//		return data[data.length-1];
		
		
		
		// 3. 등록된 배열 요소를 중복 제거해서 
		// 가장 작은 값과 큰 값을 더해서 출력
		Set<Integer> set = new TreeSet<>();
		for(Integer i : data) {
			set.add(i);
		}
		
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(data));
		return (Integer)arr[0]+(Integer)arr[arr.length-1];
		
	}
}