
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

public class JavaTest60 {

	public static void main(String[] args) {
		// 1.반복문과 charAt() 이용해서 판별하기
//		String value = "12o34";
//		char ch = ' ';
//		boolean isNumber = true;
//
//		for (int i = 0; i < value.length(); i++) {
//			if(!('0'<=value.charAt(i) && value.charAt(i)<='9')) {
//				isNumber = false;
//				break;
//			}
//		}
//		if (isNumber) {
//			System.out.println(value + "는 숫자입니다.");
//		} else {
//			System.out.println(value + "는 숫자가 아닙니다.");
//		}
		
		
		
		// 2.Integer.valueOf() 사용해서 판별하기
//		String value = "12o34";
//		
//		try {
//			Integer.valueOf(value);
//			System.out.println(value+"는 숫자입니다.");
//		} catch (Exception e) {
//			System.out.println(value+"는 숫자가 아닙니다.");
//		}finally {
//			System.out.println("프로그램을 종료합니다.");
//		}

		
		
		// 3.5자리 숫자를 입력할 때까지 안 끝내는 프로그램
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("숫자를 입력하세요>>");
//			String input = sc.nextLine().trim();
//			
//			if(input.length()!=5) {
//				System.out.println("5자리가 아닙니다.");
//				continue;
//			} else {
//				boolean check = true;
//				for (int i = 0; i < input.length(); i++) {
//					if(!('0'<=input.charAt(i) && input.charAt(i)<='9')) {
//						check = false;
//						break;
//					}
//				}
//				
//				if(check) {
//					System.out.println(input+"은 5자리 숫자입니다.");
//					break;
//				}else {
//					System.out.println("숫자가 아닙니다.");
//				}
//			}
//		}
	}
}
