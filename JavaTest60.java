
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
		// 1.�ݺ����� charAt() �̿��ؼ� �Ǻ��ϱ�
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
//			System.out.println(value + "�� �����Դϴ�.");
//		} else {
//			System.out.println(value + "�� ���ڰ� �ƴմϴ�.");
//		}
		
		
		
		// 2.Integer.valueOf() ����ؼ� �Ǻ��ϱ�
//		String value = "12o34";
//		
//		try {
//			Integer.valueOf(value);
//			System.out.println(value+"�� �����Դϴ�.");
//		} catch (Exception e) {
//			System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
//		}finally {
//			System.out.println("���α׷��� �����մϴ�.");
//		}

		
		
		// 3.5�ڸ� ���ڸ� �Է��� ������ �� ������ ���α׷�
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("���ڸ� �Է��ϼ���>>");
//			String input = sc.nextLine().trim();
//			
//			if(input.length()!=5) {
//				System.out.println("5�ڸ��� �ƴմϴ�.");
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
//					System.out.println(input+"�� 5�ڸ� �����Դϴ�.");
//					break;
//				}else {
//					System.out.println("���ڰ� �ƴմϴ�.");
//				}
//			}
//		}
	}
}
