
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

import javax.sound.midi.MidiEvent;


public class JavaTest56 {
	
	public static void main(String[] args){
		// 1.Math.random() �̿��ؼ� ���ϱ�
//		int value = (int)(Math.random()*5)+1;
//		System.out.println("value:"+value);
		
		
		
		// 2.1~45�� ������ ���� 6�� ���ؼ� �ζ� ��ȣ ���ϱ�
//		IntStream intStream = new Random().ints(1,46)
//				      		 .distinct().limit(6).sorted();
//		intStream.forEach(System.out::println);
		
		
		
		// 3.2�� �������� 2�� 3�� ����� ����
		// ������ �� 6�� ���ϱ�(�ߺ� x, ��������)
//		Set<Integer> set = new TreeSet<>();
//		while(set.size()!=6) {
//			set.add((int)(Math.random()*45)+1);
//		}
//		System.out.println("���Ƿ� ���� ���: " + set);
//		
//		// 2�� 3�� ��� ����
//		set.removeIf(x->x%2==0 || x%3==0);
//		System.out.println("2�� 3�� ����� ������ ���:");
//		if(set.isEmpty())
//			System.out.println("��� ���� �����ϴ�.");
//		else
//			set.forEach(System.out::println);
		
	}
}