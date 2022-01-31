
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

	static int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
	static int[] coin = {5, 5, 5, 5}; // 동전의 단위
	
	public static void main(String[] args) {
		// 1. 거슬러 줄 금액을 사용자로부터 입력 받아 계산한다(1원 짜리는 못 넣게 한다.)
		// 단, 보유한 동전의 개수로 거스름 돈을 지불할 수 없으면
		// '거스름 돈이 부족합니다.' 출력하게 한다.
		// 거스름 돈을 지불할 수 있으면 지불한 만큼 가진 돈에서 빼고
		// 남은 동전의 개수를 화면에 출력(해당 문제는 기존의 풀이 방법과 다르게 풀었습니다.)
		
//		Scanner sc = new Scanner(System.in);
//		
//		int total = 0;
//		for (int i = 0; i < coinUnit.length; i++) {
//			total += coinUnit[i] * coin[i];
//		}
//		
//		while(true) {
//			//거슬러 줄 금액을 입력
//			System.out.print("거슬러 줄 금액을 입력(단, 보유한 금액보다 적게 입력하세요.)>>");
//			String input = sc.nextLine().trim();
//			int price = 0;
//			try {
//				price = Integer.valueOf(input);
//			} catch (Exception e) {
//				System.out.println("잘못된 금액을 적었습니다.");
//				continue;
//			}
//			
//			if(input.length()<2) {
//				System.out.println("입력할 금액은 최소 10원입니다.");
//			} else if(price%10!=0) {
//				System.out.println("1원 짜리는 입력할 수 없습니다.");
//			} else if(price<0) {
//				System.out.println("금액은 음수가 될 수 없습니다.");
//			} else if(price>=total) {
//				System.out.println("보유한 금액보다 같거나 많은 금액을 입력해서 거스름 돈이 부족합니다.");
//			} else {
//				//입력한 금액과 그 금액에 해당하는 거스름 돈 출력
//				printCurrentMoney(price);
//				//거스름 돈을 출력하고 남은 동전의 개수 출력
//				printAfterMoney();
//				break;
//			}
//		}
	}

//	private static void printAfterMoney() {
//		System.out.println("=남은 동전의 개수=");
//		for (int i = 0; i < coin.length; i++) {
//			System.out.printf("%d원: %d%n", coinUnit[i],coin[i]);
//		}
//	}
//
//	private static void printCurrentMoney(int price) {
//		System.out.println("money="+price);
//		for (int i = 0; i < coin.length; i++) {
//			if(price/coinUnit[i] >= coin[i]) {
//				System.out.printf("%d원: %d%n",coinUnit[i],coin[i]);
//				price -= coinUnit[i]*coin[i];
//				coin[i] = 0;
//				
//			}else {
//				System.out.printf("%d원: %d%n",coinUnit[i],price/coinUnit[i]);
//				coin[i] -= price/coinUnit[i];
//				price -= coinUnit[i]*(price/coinUnit[i]);
//			}
//		}
//	}
}
