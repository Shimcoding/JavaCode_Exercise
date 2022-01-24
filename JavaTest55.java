
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
		// 1.이중 for문 이용해서 구하기
//		final int DICE_NUM = 6;
//		
//		for (int i = 1; i <= DICE_NUM ; i++) {
//			for (int j = 1; j <= DICE_NUM ; j++) {
//				if(i+j==6)
//					System.out.println("["+i+","+j+"]");
//			}
//		}
		
		
		
		// 2.이중 for문 이용해서 구하기(중복 제거)
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
		
		
		
		// 3.주사위의 합이 가장 작은 두 눈의 수 구하기
//		//첫 번째 주사위 최솟값 구하기
//		IntStream intStream = IntStream.rangeClosed(1, 6);
//		OptionalInt DiceMinInt1 = intStream.min();
//		
//		//두 번째 주사위 최솟값 구하기
//		intStream = IntStream.rangeClosed(1, 6);
//		OptionalInt DiceMinInt2 = intStream.min();
//		
//		System.out.println("["+DiceMinInt1.getAsInt()+","+DiceMinInt2.getAsInt()+"]");
		
		
		
		// 4. 1~45사이에 수를 임의로 6개를 입력 받고 최솟값 구하기(중복된 수)
//		IntStream intStream = new Random().ints(1,46)
//								.distinct().limit(6);
//		OptionalInt optMin = intStream.min();
//		System.out.println("최솟값: "+ optMin.getAsInt());
	}
}