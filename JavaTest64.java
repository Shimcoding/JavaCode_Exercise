
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiEvent;

public class JavaTest64 {

	public static void main(String[] args) {
		// 1.for 문을 통해 합계와 평균 구하기
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		int total = 0;
		float average = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		average = (float)total / (arr.length*arr[0].length);
		
		System.out.println("total="+total);
		System.out.println("average="+average);
		
		
		
		// 2. 배열 요소 중 가장 작은 수 구하기
//		int[][] arr = {
//		{ 5, 5, 5, 5, 5},
//		{10,10,10,10,10},
//		{20,20,20,20,20},
//		{30,30,30,30,1}
//		};
//		
//		int min = arr[0][0];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if(min>arr[i][j]) {
//					min = arr[i][j];
//				}
//			}
//		}
//		
//		System.out.println("min="+min);
		
		
	}
}
