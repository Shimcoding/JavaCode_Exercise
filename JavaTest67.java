
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

public class JavaTest67 {

	public static void main(String[] args) {
		// 1.������ �����ڿ� ������ ������ ����ؼ� ���ϱ�
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		
//		System.out.println("money="+money);
//		for (int i = 0; i < coinUnit.length; i++) {
//			System.out.printf("%d��: %d%n",coinUnit[i], money/coinUnit[i]);
//			money %= coinUnit[i];
//		}
		
		// 2. 1���� ������ �Ž��� �޾Ұ�
		// �� ������ ����ڰ� �Է��� ���ݿ� �ش��ϴ� ������
		// ������ ������ ���� �� ���� ������ ��Ÿ���ÿ�
		// ��. �Է��� ���� ������ ������ ���� ��� �ٽ� �Է��ϰ� �Ѵ�.
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		
//		// �ڿ� ����� ���ؼ� money1 ������ money �� �ֱ�
//		int money1 = money;
//		
//		System.out.println("money="+money);
//		for (int i = 0; i < coinUnit.length; i++) {
//			System.out.printf("%d��: %d%n",coinUnit[i], money/coinUnit[i]);
//			money %= coinUnit[i];
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			try {
//				System.out.print("������ ����>>");
//				String input = sc.nextLine().trim();
//				int price= Integer.valueOf(input);
//				
//				if(0<price && price<money1) {
//					money1 -= price;
//					System.out.println("money="+money1);
//					for (int i = 0; i < coinUnit.length; i++) {
//						System.out.printf("%d��: %d%n",coinUnit[i], money1/coinUnit[i]);
//						money1 %= coinUnit[i];
//					}
//					break;
//				} else {
//					// price�� 0���� �۰ų� price�� money1���� Ŭ �� �ٽ� �Է�
//					System.out.println("�Է��Ͻ� ������ ���ų� �߸��� ������ �Է��߽��ϴ�.");
//				}
//			} catch (Exception e) {
//				//���ڷ� �Է����� �� ����ó��
//				System.out.println("�߸��� ������ �Է��߽��ϴ�.");
//				continue;
//			}
//		}
		
		
		// 3.�־��� �ݾ��� ������ �� ���� ���� �������� �Ž��� �ֱ�
		// ��, 10��¥���� 50��¥���� 20������ ��� ����. ������ ���� ����.
		// �׸��� �Ž����� �� �� ���� ������ ���
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		final int MAX_COIN = 20;
//		
//		System.out.println("money="+money);
//		for (int i = coinUnit.length-1; i >= 0; i--) {
//			if(i>=coinUnit.length-2 && money/coinUnit[i]>MAX_COIN) {
//				System.out.printf("%d��: %d%n",coinUnit[i], MAX_COIN);
//				money -= coinUnit[i]*MAX_COIN;
//			}else {
//				System.out.printf("%d��: %d%n",coinUnit[i], money/coinUnit[i]);
//				money %= coinUnit[i];
//			}
//		}
//		
//		if(money!=0) {
//			System.out.println("�Ž����� �� �� ��="+money);
//		}
	}
}
