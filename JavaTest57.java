
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


public class JavaTest57 {
	
	public static void main(String[] args){
		// 1.charAt(int i)을 사용하는 경우
//		String str = "12345";
//		int sum = 0;
//		
//		for (int i = 0; i < str.length(); i++) {
//			sum += Integer.valueOf(str.charAt(i)-48);
//		}
//		
//		System.out.println("sum="+sum);
		
		
		
		// 2.처음부터 숫자로 변환 후 구하는 경우
//		String str = "12345";
//		int sum = 0;
//		
//		// String을 int로 변환
//		int num = Integer.valueOf(str);
//		
//		// 나머지 연산자로 합을 구한다.
//		do {
//			sum += num%10;
//			num /= 10;
//		} while (num!= 0);
//		
//		System.out.println("sum="+sum);
		
		
		
		// 3.주어진 문자열(숫자)에 맨 앞자리와 맨 끝자리의 수만 더하는 경우
//		String str = "12345";
//		int sum = 0;
//		
//		sum = Integer.valueOf(str.charAt(0)-48)+Integer.valueOf(str.charAt(str.length()-1)-48);
//		System.out.println("sum="+sum);
		
		
		
		// 4.주어진 문자열(숫자)에 홀수 번째 따로 짝수 번째 
		// 더해서 각각 합계 구하는 경우
//		String str = "12345";
//		int sum1 = 0, sum2 = 0;
//		
//		for (int i = 0; i < str.length(); i++) {
//			if((i+1) % 2 != 0 )
//				sum1 += Integer.valueOf(str.charAt(i))-48;
//			else
//				sum2 += Integer.valueOf(str.charAt(i))-48;
//		}
//		
//		System.out.println("홀수 번째 합: "+ sum1);
//		System.out.println("짝수 번째 합: "+ sum2);
		
		
		
		// 5.주어진 문자열(숫자)에 각 자리에 있는 숫자가 3의 배수인 경우만
		// 더해서 합계를 구하는 경우
//		String str = "12345";
//		int sum=0;
//		
//		// 각 자리의 수를 넣은 배열 생성
//		Integer[] arr = new Integer[str.length()];
//		
//		// 배열에 넣기
//		for (int i = 0; i < str.length(); i++) {
//			arr[i] = Integer.valueOf(str.charAt(i)-48);
//		}
//		
//		// 3의 배수를 뽑아내기 위한 스트림 생성, reduce로 합을 계산
//		Stream<Integer> intStream = Stream.of(arr);
//		sum = intStream.filter(x->x%3==0).reduce(0,(a,b)->a+b);
//		System.out.println("합계: "+ sum);
	}
}





