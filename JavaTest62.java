
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

public class JavaTest62 {

	public static void main(String[] args) {
		// 1. 나머지 연산자를 이용해서 구하기
//		int number = 12321;
//		int tmp = number;
//		int i = 1;
//		
//		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
//		while (tmp != 0) {
//			
//			result += tmp%10*i;
//			tmp /=10; 
//			i *=10;
//		}
//		if (number == result)
//			System.out.println(number + "는 회문수입니다.");
//		else
//			System.out.println(number + "는 회문수가 아닙니다.");
	
		
		
		// 2. String형으로 바꿔서 구하기
//		int number = 12321;
//		String str = String.valueOf(number);
//		StringBuffer sb = new StringBuffer();
//		
//		for (int i = str.length()-1; i >= 0; i--) {
//			sb.append(str.charAt(i));
//		}
//
//		if(str.equals(sb.toString())) {
//			System.out.println(number+"는 회문수입니다.");
//		} else {
//			System.out.println(number+"는 회문수가 아닙니다.");
//		}
		
		
		
		// 3.사용자로부터 수를 입력 받는데
		// 홀수 자리수가 아니면 다시 입력 받고
		// 문자가 입력되도 다시 입력 받아서 회문수인지 구하기
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("홀수 자리인 수를 입력:");
//			String input = sc.nextLine().trim();
//			if(input.length()%2!=1) {
//				System.out.println("홀수 자리인 수가 아닙니다.");
//			} else {
//				try {
//					int num = Integer.valueOf(input);
//				} catch (Exception e) {
//					System.out.println("숫자가 아닙니다.");
//					continue;
//				}
//				StringBuffer sb = new StringBuffer();
//				for (int i = input.length()-1; i >= 0; i--) {
//					sb.append(input.charAt(i));
//				}
//				if(input.equals(sb.toString().trim())) {
//					System.out.println(input+"은 회문수입니다.");
//					break;
//				}else {
//					System.out.println(input+"은 회문수가 아닙니다.");
//					break;
//				}
//				
//			}
//		}
	}
}
