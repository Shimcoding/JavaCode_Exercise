
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

public class JavaTest66 {

	static int[] coinUnit = {500, 100, 50, 10 }; // ������ ����
	static int[] coin = {5, 5, 5, 5}; // ������ ����
	
	public static void main(String[] args) {
		// 1. �Ž��� �� �ݾ��� ����ڷκ��� �Է� �޾� ����Ѵ�(1�� ¥���� �� �ְ� �Ѵ�.)
		// ��, ������ ������ ������ �Ž��� ���� ������ �� ������
		// '�Ž��� ���� �����մϴ�.' ����ϰ� �Ѵ�.
		// �Ž��� ���� ������ �� ������ ������ ��ŭ ���� ������ ����
		// ���� ������ ������ ȭ�鿡 ���(�ش� ������ ������ Ǯ�� ����� �ٸ��� Ǯ�����ϴ�.)
		
//		Scanner sc = new Scanner(System.in);
//		
//		int total = 0;
//		for (int i = 0; i < coinUnit.length; i++) {
//			total += coinUnit[i] * coin[i];
//		}
//		
//		while(true) {
//			//�Ž��� �� �ݾ��� �Է�
//			System.out.print("�Ž��� �� �ݾ��� �Է�(��, ������ �ݾ׺��� ���� �Է��ϼ���.)>>");
//			String input = sc.nextLine().trim();
//			int price = 0;
//			try {
//				price = Integer.valueOf(input);
//			} catch (Exception e) {
//				System.out.println("�߸��� �ݾ��� �������ϴ�.");
//				continue;
//			}
//			
//			if(input.length()<2) {
//				System.out.println("�Է��� �ݾ��� �ּ� 10���Դϴ�.");
//			} else if(price%10!=0) {
//				System.out.println("1�� ¥���� �Է��� �� �����ϴ�.");
//			} else if(price<0) {
//				System.out.println("�ݾ��� ������ �� �� �����ϴ�.");
//			} else if(price>=total) {
//				System.out.println("������ �ݾ׺��� ���ų� ���� �ݾ��� �Է��ؼ� �Ž��� ���� �����մϴ�.");
//			} else {
//				//�Է��� �ݾװ� �� �ݾ׿� �ش��ϴ� �Ž��� �� ���
//				printCurrentMoney(price);
//				//�Ž��� ���� ����ϰ� ���� ������ ���� ���
//				printAfterMoney();
//				break;
//			}
//		}
	}

//	private static void printAfterMoney() {
//		System.out.println("=���� ������ ����=");
//		for (int i = 0; i < coin.length; i++) {
//			System.out.printf("%d��: %d%n", coinUnit[i],coin[i]);
//		}
//	}
//
//	private static void printCurrentMoney(int price) {
//		System.out.println("money="+price);
//		for (int i = 0; i < coin.length; i++) {
//			if(price/coinUnit[i] >= coin[i]) {
//				System.out.printf("%d��: %d%n",coinUnit[i],coin[i]);
//				price -= coinUnit[i]*coin[i];
//				coin[i] = 0;
//				
//			}else {
//				System.out.printf("%d��: %d%n",coinUnit[i],price/coinUnit[i]);
//				coin[i] -= price/coinUnit[i];
//				price -= coinUnit[i]*(price/coinUnit[i]);
//			}
//		}
//	}
}
