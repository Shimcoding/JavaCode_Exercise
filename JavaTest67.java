
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
		// 1.나눗셈 연산자와 나머지 연산자 사용해서 구하기
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		
//		System.out.println("money="+money);
//		for (int i = 0; i < coinUnit.length; i++) {
//			System.out.printf("%d원: %d%n",coinUnit[i], money/coinUnit[i]);
//			money %= coinUnit[i];
//		}
		
		// 2. 1에서 동전을 거슬러 받았고
		// 그 돈으로 사용자가 입력한 가격에 해당하는 물건을
		// 구입한 나머지 돈을 각 동전 단위로 나타내시오
		// 단. 입력한 돈이 현재의 돈보다 많은 경우 다시 입력하게 한다.
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		
//		// 뒤에 계산을 위해서 money1 변수에 money 값 넣기
//		int money1 = money;
//		
//		System.out.println("money="+money);
//		for (int i = 0; i < coinUnit.length; i++) {
//			System.out.printf("%d원: %d%n",coinUnit[i], money/coinUnit[i]);
//			money %= coinUnit[i];
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			try {
//				System.out.print("물건의 가격>>");
//				String input = sc.nextLine().trim();
//				int price= Integer.valueOf(input);
//				
//				if(0<price && price<money1) {
//					money1 -= price;
//					System.out.println("money="+money1);
//					for (int i = 0; i < coinUnit.length; i++) {
//						System.out.printf("%d원: %d%n",coinUnit[i], money1/coinUnit[i]);
//						money1 %= coinUnit[i];
//					}
//					break;
//				} else {
//					// price가 0보다 작거나 price가 money1보다 클 때 다시 입력
//					System.out.println("입력하신 가격이 높거나 잘못된 가격을 입력했습니다.");
//				}
//			} catch (Exception e) {
//				//문자로 입력했을 때 예외처리
//				System.out.println("잘못된 가격을 입력했습니다.");
//				continue;
//			}
//		}
		
		
		// 3.주어진 금액을 가능한 한 많은 수의 동전으로 거슬러 주기
		// 단, 10원짜리와 50원짜리는 20개까지 사용 가능. 나머진 제한 없음.
		// 그리고 거슬르지 못 한 돈이 있으면 출력
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		final int MAX_COIN = 20;
//		
//		System.out.println("money="+money);
//		for (int i = coinUnit.length-1; i >= 0; i--) {
//			if(i>=coinUnit.length-2 && money/coinUnit[i]>MAX_COIN) {
//				System.out.printf("%d원: %d%n",coinUnit[i], MAX_COIN);
//				money -= coinUnit[i]*MAX_COIN;
//			}else {
//				System.out.printf("%d원: %d%n",coinUnit[i], money/coinUnit[i]);
//				money %= coinUnit[i];
//			}
//		}
//		
//		if(money!=0) {
//			System.out.println("거스르지 못 한 돈="+money);
//		}
	}
}
