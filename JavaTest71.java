
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

public class JavaTest71 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
				, {50, 50, 50}
				};

		// 1. �־��� 2���� �迭�� �����ͺ��� ���ο� ���η� 1�� 
		// �� ū �迭�� �����ؼ� �迭�� ��� ���� ������ ��ҿ� �� ���� ���� ������ �����ϰ� ���
//		int[][] result = new int[score.length+1][score[0].length+1];
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				result[i][j] = score[i][j];
//				result[i][score[i].length] += result[i][j];
//				result[score.length][j] += result[i][j];
//				result[score.length][score[i].length] += result[i][j];
//			}
//		}
//		
//		for (int i = 0; i < result.length; i++) {
//			for (int j = 0; j < result[i].length; j++) {
//				System.out.printf("%4d",result[i][j]);
//			}
//			System.out.println();
//		}
		
		
		
		// 2. ����ڷκ��� �Է� ���� ���� �迭�� ����� 
		// 1�� ���� �迭 �����
//		Scanner sc = new Scanner(System.in);
//		int[][] arr = new int[score.length+1][score[0].length+1];
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[0].length; j++) {
//				System.out.printf("[%d][%d]:",i,j);
//				arr[i][j] = sc.nextInt();
//				arr[i][score[i].length] += arr[i][j];
//				arr[score.length][j] += arr[i][j];
//				arr[score.length][score[i].length] += arr[i][j];
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//		for (int j = 0; j < arr[i].length; j++) {
//			System.out.printf("%4d",arr[i][j]);
//		}
//		System.out.println();
//	}
	}	
}		