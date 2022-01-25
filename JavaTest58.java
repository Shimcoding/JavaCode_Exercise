
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


public class JavaTest58 {
	
	public static void main(String[] args){
		// 1.문자열로 변환하지 않고 숫자로 처리해서 구하는 경우
//		int num = 12345;
//		int sum = 0;
//		
//		while(num!=0) {
//			sum += num % 10;
//			num /= 10;
//		}
//		
//		System.out.println("sum="+sum);
		
		
		
		// 2.문자열로 변환해서 구하는 경우
//		int num = 12345;
//		int sum = 0;
//		
//		String str = String.valueOf(num);
//		for (int i = 0; i < str.length(); i++) {
//			sum += Integer.valueOf(str.charAt(i)-48);
//		}
//		
//		System.out.println("sum="+sum);
		
		
		
		// 3.문자열의 각 자리수에 대한 구구단 출력
		// 예를 들면, "12"이면 1은 구구단 출력x, 2는 2단 출력
//		int num = 12345;
//		String str = String.valueOf(num);
//		final int MAX_NUM = 9;
//		
//		// 구구단 구하기
//		for (int i = 0; i <str.length(); i++) {
//			if('1'<str.charAt(i)) {
//				System.out.println();
//				System.out.println(str.charAt(i)+"단");
//				System.out.println();
//				int danNum = Integer.valueOf(str.charAt(i))-48;
//				
//				for (int j = 1; j <= MAX_NUM ; j++) {
//					System.out.printf("%d*%d=%d%n",danNum,j,danNum*j);
//				}
//			}
//		}
		
		
	}
}





