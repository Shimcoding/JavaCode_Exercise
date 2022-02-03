
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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

public class JavaTest72 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 1. words의 배열에 각각의 요소를 toCharArray()를 통해
		// char형 question 배열을 만들고 섞은 다음
		// words의 요소와 같은 이름을 맞추면 "맞았습니다" 출력
		// 틀리면 "틀렸습니다" 출력
//		String[] words = { "television", "computer", "mouse", "phone" };
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < words.length; i++) {
//			char[] question = words[i].toCharArray();
//			
//			for (int j = 0; j < question.length; j++) {
//				int random = (int)(Math.random()*question.length);
//				char tmp = question[random];
//				question[random] = question[0];
//				question[0] = tmp;
//			}
//			String str = new String(question);
//			
//			System.out.print(str+"의 정답을 입력>>");
//			String input = sc.nextLine().trim();
//			
//			if(words[i].equals(input)) {
//				System.out.println("정답입니다!");
//			} else {
//				// 틀리게 입력 한 경우도 포함
//				System.out.println("틀렸습니다.");
//			}
//		}
		
		
		
		// 2.정답 배열을 하나 만든 후 사용자로부터 입력 받고 싶은 만큼
		// 정답 배열에 채우고 섞은 다음 맞추기
//		System.out.print("몇 개의 문자를 입력하나요>>");
//		String wordsNum = sc.nextLine().trim();
//		
//		// 공백 입력시 프로그램 종료
//		if(wordsNum.equals("") || wordsNum==null) {
//			System.out.println("프로그램이 종료됩니다.");
//			System.exit(0);
//		}
//		
//		// 숫자를 입력했는지 검사
//		int num = checkNum(wordsNum);
//		
//		String[] words = new String[num];
//		
//		inputWords(words);
//		
//		// 섞을 배열 생성
//		String[] shuffle = new String[words.length];
//		System.arraycopy(words, 0, shuffle, 0, words.length);
//		
//		// words에 있는 요소들을 shuffle에 섞은 걸로 넣기 
//		shuffleWords(shuffle);
//		
//		//정답을 맞췄는지 아닌지 출력
//		answer(shuffle,words);
	}

	private static int checkNum(String wordsNum) {
		boolean check = true;
		for (int i = 0; i < wordsNum.length(); i++) {
			if(!('1'<=wordsNum.charAt(i) && wordsNum.charAt(i)<='9')){
				check = false;
				break;
			}
		}
		
		return check == true ? Integer.valueOf(wordsNum) : 0;
	}

	private static void answer(String[] shuffle,String[] words) {
		for (int i = 0; i < shuffle.length; i++) {
			System.out.print(shuffle[i]+"의 정답은>>");
			String answer = sc.nextLine().trim();
			if(words[i].equals(answer))
				System.out.println("정답입니다.");
			else
				System.out.println("틀렸습니다.");
		}
	}

	private static void shuffleWords(String[] shuffle) {
		for (int j = 0; j < shuffle.length; j++) {
			char[] question = shuffle[j].toCharArray();
			
			for (int i = 0; i < question.length; i++) {
				int random = (int)(Math.random()*question.length);
				char tmp = question[random];
				question[random] = question[0];
				question[0] = tmp;
			}
			
			shuffle[j] = new String(question);
		}
	}

	private static void inputWords(String[] words) {
		for (int i = 0; i < words.length; i++) {
			System.out.print((i+1)+"번째 문자 입력:");
			words[i] = sc.nextLine().trim();
			// 유효성 확인
			if(words[i].length()<2) {
				System.out.println("2글자 이상인 문자를 입력하세요.");
				i--;
			} else {
				for (int j = 0; j < words[i].length(); j++) {
					if(!('A'<=words[i].charAt(j) && words[i].charAt(j) <='z')) {
						System.out.println("알파벳이 아닌 다른 문자가 들어가 있습니다. 다시 입력하세요.");
						i--;
						break;
					}
				}
			}
		}
	}	
}		