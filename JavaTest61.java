
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

public class JavaTest61 {

	public static void main(String[] args) {
		// 1. 1~100������ ������ ���� �� answer�� ����.
//		int answer = (int)(Math.random()*100)+1;
//		int input = 0; // ������Է��� ������ ����
//		int count = 0; // �õ�Ƚ���� �������� ����
//		// Scanner ȭ������ ���� ������Է��� �ޱ� ���ؼ� Ŭ���� ���
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		do {
//		count++;
//		System.out.print("1�� 100������ ���� �Է� :"); 
//		input = sc.nextInt(); // input . �Է¹��� ���� ���� �� �����Ѵ�
//		if(input>answer) {
//			System.out.println("�� ���� ���� �Է��ϼ���.");
//		} else if(input<answer) {
//			System.out.println("�� ū ���� �Է��ϼ���.");
//		} else {
//			System.out.println("������ϴ�.");
//			System.out.println("�õ� Ƚ���� "+count+"���Դϴ�.");
//			break;
//		}
//		} while(true); // ���ѹݺ���

		// 2. �ڸ����� ��ġ�ϴ��� �˷��ָ鼭 ���ڸ� ���ߴ� ���α׷�
		// ���� ���, answer=20�̸� input���� 25�� �ְ� ���� �ڸ��� ��ġ�ϴϱ�
		// "���� �ڸ��� ���� ��ġ�մϴ�." �̷� ������ ���
//		int answer = (int)(Math.random()*100)+1;
//		int input = 0; // ������Է��� ������ ����
//		int count = 0; // �õ�Ƚ���� �������� ����
//		
//		// Scanner ȭ������ ���� ������Է��� �ޱ� ���ؼ� Ŭ���� ���
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		do {
//		count++;
//		System.out.print("1�� 100������ ���� �Է� :"); 
//		input = sc.nextInt(); // input . �Է¹��� ���� ���� �� �����Ѵ�
//		if(input>answer) {
//			System.out.println("�� ���� ���� �Է��ϼ���.");
//			isNumCheck(answer,input);
//			
//		} else if(input<answer) {
//			System.out.println("�� ū ���� �Է��ϼ���.");
//			isNumCheck(answer,input);
//		} else {
//			System.out.println("������ϴ�.");
//			System.out.println("�õ� Ƚ���� "+count+"���Դϴ�.");
//			break;
//		}
//		} 

		// 3. ���ڰ� �ƴ� �ٸ� ���ڰ� ��� �� ��� ���α׷� ����
		// ���ڸ��� �Է��ؼ� ���ߴ� ���α׷�
//		int answer = (int) (Math.random() * 100) + 1;
//		int input = 0; // ������Է��� ������ ����
//		int count = 0; // �õ�Ƚ���� �������� ����
//
//		// Scanner ȭ������ ���� ������Է��� �ޱ� ���ؼ� Ŭ���� ���
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		do {
//			count++;
//			System.out.print("1�� 100������ ���� �Է� :");
//			try {
//				input = sc.nextInt(); // input . �Է¹��� ���� ���� �� �����Ѵ�
//			} catch (Exception e) {
//				//���ڸ� �Է����� ������ ���� ����
//				System.out.println("���ڸ� �Է����� �ʾ� ���� �����մϴ�.");
//				System.exit(0);
//			}
//			if (input > answer) {
//				System.out.println("�� ���� ���� �Է��ϼ���.");
//				isNumCheck(answer, input);
//
//			} else if (input < answer) {
//				System.out.println("�� ū ���� �Է��ϼ���.");
//				isNumCheck(answer, input);
//			} else {
//				System.out.println("������ϴ�.");
//				System.out.println("�õ� Ƚ���� " + count + "���Դϴ�.");
//				break;
//			}
//		} while (true);
	}

//	private static void isNumCheck(int answer, int input) {
//		if (answer / 10 == input / 10)
//			System.out.println("���� �ڸ����� ��ġ�մϴ�.");
//		else
//			System.out.println("���� �ڸ����� ��ġ���� �ʽ��ϴ�.");
//		if (answer % 10 == input % 10)
//			System.out.println("���� �ڸ����� ��ġ�մϴ�.");
//		else
//			System.out.println("���� �ڸ����� ��ġ���� �ʽ��ϴ�.");
//	}

}
