
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
		// 1. ������ �����ڸ� �̿��ؼ� ���ϱ�
//		int number = 12321;
//		int tmp = number;
//		int i = 1;
//		
//		int result = 0; // ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
//		while (tmp != 0) {
//			
//			result += tmp%10*i;
//			tmp /=10; 
//			i *=10;
//		}
//		if (number == result)
//			System.out.println(number + "�� ȸ�����Դϴ�.");
//		else
//			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
	
		
		
		// 2. String������ �ٲ㼭 ���ϱ�
//		int number = 12321;
//		String str = String.valueOf(number);
//		StringBuffer sb = new StringBuffer();
//		
//		for (int i = str.length()-1; i >= 0; i--) {
//			sb.append(str.charAt(i));
//		}
//
//		if(str.equals(sb.toString())) {
//			System.out.println(number+"�� ȸ�����Դϴ�.");
//		} else {
//			System.out.println(number+"�� ȸ������ �ƴմϴ�.");
//		}
		
		
		
		// 3.����ڷκ��� ���� �Է� �޴µ�
		// Ȧ�� �ڸ����� �ƴϸ� �ٽ� �Է� �ް�
		// ���ڰ� �Էµǵ� �ٽ� �Է� �޾Ƽ� ȸ�������� ���ϱ�
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("Ȧ�� �ڸ��� ���� �Է�:");
//			String input = sc.nextLine().trim();
//			if(input.length()%2!=1) {
//				System.out.println("Ȧ�� �ڸ��� ���� �ƴմϴ�.");
//			} else {
//				try {
//					int num = Integer.valueOf(input);
//				} catch (Exception e) {
//					System.out.println("���ڰ� �ƴմϴ�.");
//					continue;
//				}
//				StringBuffer sb = new StringBuffer();
//				for (int i = input.length()-1; i >= 0; i--) {
//					sb.append(input.charAt(i));
//				}
//				if(input.equals(sb.toString().trim())) {
//					System.out.println(input+"�� ȸ�����Դϴ�.");
//					break;
//				}else {
//					System.out.println(input+"�� ȸ������ �ƴմϴ�.");
//					break;
//				}
//				
//			}
//		}
	}
}
