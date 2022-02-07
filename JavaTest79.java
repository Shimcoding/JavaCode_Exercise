
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
		
		// �־��� int�� �迭�� �� �߿��� ���� ū ���� ��ȯ
		// ���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�� ���, -999999�� ��ȯ
		System.out.println("�ִ� :"+max(data)); 
		System.out.println("�ִ� :"+max(null)); 
		System.out.println("�ִ� :"+max(new int[]{})); // 0 �ִ밪 ũ�Ⱑ �� �迭
		System.out.println("�ִ� :"+max(new int[]{11,15,12,25,30,11,15})); // 0 �ִ밪 ũ�Ⱑ �� �迭
	}

	private static int max(int[] data) {
		// 1. for ���� ���ؼ� ���� ū �� ��ȯ�ϱ�
		
		// (����)null�̳� ũ�Ⱑ 0�̸� -999999 ��ȯ
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
		
		
		
		// 2. sort�� �̿��ؼ� ���� ū �� ��ȯ�ϱ�
//		Arrays.sort(data);
//		
//		return data[data.length-1];
		
		
		
		// 3. ��ϵ� �迭 ��Ҹ� �ߺ� �����ؼ� 
		// ���� ���� ���� ū ���� ���ؼ� ���
		Set<Integer> set = new TreeSet<>();
		for(Integer i : data) {
			set.add(i);
		}
		
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(data));
		return (Integer)arr[0]+(Integer)arr[arr.length-1];
		
	}
}