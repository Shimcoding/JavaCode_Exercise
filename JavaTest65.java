
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
		// 1. �־��� �迭�� for ���� �̿��ؼ�
		// Math.random()���� ���� ���ϱ�
//		int[] ballArr = {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		
//		// ballArr�迭�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
//		for (int i = 0; i < ballArr.length; i++) {
//			int j = (int)(Math.random()*ballArr.length);
//			int tmp = 0;
//			
//			tmp = ballArr[j];
//			ballArr[j] = ballArr[0];
//			ballArr[0] = tmp;
//		}
//		
//		// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
//		System.arraycopy(ballArr, 0, ball3, 0, ball3.length);
//		
//		for (int i = 0; i < ball3.length; i++) {
//			System.out.print(ball3[i]);
//		}
		
		
		
		// 2. Stream�� �̿��ؼ� ���ϱ�
//		int[] ball3 = new int[3];
//		
//		//��Ʈ�� ����
//		IntStream lotto = new Random().ints(1,10)
//						.distinct().limit(3);
//		
//		//�迭�� ��ȯ
//		ball3 = lotto.toArray();
//		
//		//������ �� �� �� ���
//		for (int i = 0; i < ball3.length; i++) {
//		System.out.print(ball3[i]);
//		}
		
		
		
		// 3.list�� set�� ���� ���������� ������������ ���ĵ� 
		// ������ �� �� �� ���� ���ϱ�
		
		//TreeSet���� �������� ����
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
//		//NavigableSet���� �������� ����
//		NavigableSet<Integer> decendingSet = set.descendingSet();
//		
//		for (Integer d : decendingSet) {
//			System.out.print(d);
//		}
	}
}
