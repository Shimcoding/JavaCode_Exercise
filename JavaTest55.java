
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


public class JavaTest55 {
	
	public static void main(String[] args){
		// 1.���� for�� �̿��ؼ� ���ϱ�
//		final int DICE_NUM = 6;
//		
//		for (int i = 1; i <= DICE_NUM ; i++) {
//			for (int j = 1; j <= DICE_NUM ; j++) {
//				if(i+j==6)
//					System.out.println("["+i+","+j+"]");
//			}
//		}
		
		
		
		// 2.���� for�� �̿��ؼ� ���ϱ�(�ߺ� ����)
//		final int DICE_NUM = 6;
//		
//		for (int i = 1; i <= DICE_NUM ; i++) {
//			for (int j = 1; j <= DICE_NUM ; j++) {
//				if(i+j==6) {
//					if(i>3)
//						break;
//					else
//						System.out.println("["+i+","+j+"]");
//				}
//			}
//		}
		
		
		
		// 3.�ֻ����� ���� ���� ���� �� ���� �� ���ϱ�
//		//ù ��° �ֻ��� �ּڰ� ���ϱ�
//		IntStream intStream = IntStream.rangeClosed(1, 6);
//		OptionalInt DiceMinInt1 = intStream.min();
//		
//		//�� ��° �ֻ��� �ּڰ� ���ϱ�
//		intStream = IntStream.rangeClosed(1, 6);
//		OptionalInt DiceMinInt2 = intStream.min();
//		
//		System.out.println("["+DiceMinInt1.getAsInt()+","+DiceMinInt2.getAsInt()+"]");
		
		
		
		// 4. 1~45���̿� ���� ���Ƿ� 6���� �Է� �ް� �ּڰ� ���ϱ�(�ߺ��� ��)
//		IntStream intStream = new Random().ints(1,46)
//								.distinct().limit(6);
//		OptionalInt optMin = intStream.min();
//		System.out.println("�ּڰ�: "+ optMin.getAsInt());
	}
}