
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
		// 1.charAt(int i)�� ����ϴ� ���
//		String str = "12345";
//		int sum = 0;
//		
//		for (int i = 0; i < str.length(); i++) {
//			sum += Integer.valueOf(str.charAt(i)-48);
//		}
//		
//		System.out.println("sum="+sum);
		
		
		
		// 2.ó������ ���ڷ� ��ȯ �� ���ϴ� ���
//		String str = "12345";
//		int sum = 0;
//		
//		// String�� int�� ��ȯ
//		int num = Integer.valueOf(str);
//		
//		// ������ �����ڷ� ���� ���Ѵ�.
//		do {
//			sum += num%10;
//			num /= 10;
//		} while (num!= 0);
//		
//		System.out.println("sum="+sum);
		
		
		
		// 3.�־��� ���ڿ�(����)�� �� ���ڸ��� �� ���ڸ��� ���� ���ϴ� ���
//		String str = "12345";
//		int sum = 0;
//		
//		sum = Integer.valueOf(str.charAt(0)-48)+Integer.valueOf(str.charAt(str.length()-1)-48);
//		System.out.println("sum="+sum);
		
		
		
		// 4.�־��� ���ڿ�(����)�� Ȧ�� ��° ���� ¦�� ��° 
		// ���ؼ� ���� �հ� ���ϴ� ���
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
//		System.out.println("Ȧ�� ��° ��: "+ sum1);
//		System.out.println("¦�� ��° ��: "+ sum2);
		
		
		
		// 5.�־��� ���ڿ�(����)�� �� �ڸ��� �ִ� ���ڰ� 3�� ����� ��츸
		// ���ؼ� �հ踦 ���ϴ� ���
//		String str = "12345";
//		int sum=0;
//		
//		// �� �ڸ��� ���� ���� �迭 ����
//		Integer[] arr = new Integer[str.length()];
//		
//		// �迭�� �ֱ�
//		for (int i = 0; i < str.length(); i++) {
//			arr[i] = Integer.valueOf(str.charAt(i)-48);
//		}
//		
//		// 3�� ����� �̾Ƴ��� ���� ��Ʈ�� ����, reduce�� ���� ���
//		Stream<Integer> intStream = Stream.of(arr);
//		sum = intStream.filter(x->x%3==0).reduce(0,(a,b)->a+b);
//		System.out.println("�հ�: "+ sum);
	}
}





