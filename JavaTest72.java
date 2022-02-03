
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
		// 1. words�� �迭�� ������ ��Ҹ� toCharArray()�� ����
		// char�� question �迭�� ����� ���� ����
		// words�� ��ҿ� ���� �̸��� ���߸� "�¾ҽ��ϴ�" ���
		// Ʋ���� "Ʋ�Ƚ��ϴ�" ���
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
//			System.out.print(str+"�� ������ �Է�>>");
//			String input = sc.nextLine().trim();
//			
//			if(words[i].equals(input)) {
//				System.out.println("�����Դϴ�!");
//			} else {
//				// Ʋ���� �Է� �� ��쵵 ����
//				System.out.println("Ʋ�Ƚ��ϴ�.");
//			}
//		}
		
		
		
		// 2.���� �迭�� �ϳ� ���� �� ����ڷκ��� �Է� �ް� ���� ��ŭ
		// ���� �迭�� ä��� ���� ���� ���߱�
//		System.out.print("�� ���� ���ڸ� �Է��ϳ���>>");
//		String wordsNum = sc.nextLine().trim();
//		
//		// ���� �Է½� ���α׷� ����
//		if(wordsNum.equals("") || wordsNum==null) {
//			System.out.println("���α׷��� ����˴ϴ�.");
//			System.exit(0);
//		}
//		
//		// ���ڸ� �Է��ߴ��� �˻�
//		int num = checkNum(wordsNum);
//		
//		String[] words = new String[num];
//		
//		inputWords(words);
//		
//		// ���� �迭 ����
//		String[] shuffle = new String[words.length];
//		System.arraycopy(words, 0, shuffle, 0, words.length);
//		
//		// words�� �ִ� ��ҵ��� shuffle�� ���� �ɷ� �ֱ� 
//		shuffleWords(shuffle);
//		
//		//������ ������� �ƴ��� ���
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
			System.out.print(shuffle[i]+"�� ������>>");
			String answer = sc.nextLine().trim();
			if(words[i].equals(answer))
				System.out.println("�����Դϴ�.");
			else
				System.out.println("Ʋ�Ƚ��ϴ�.");
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
			System.out.print((i+1)+"��° ���� �Է�:");
			words[i] = sc.nextLine().trim();
			// ��ȿ�� Ȯ��
			if(words[i].length()<2) {
				System.out.println("2���� �̻��� ���ڸ� �Է��ϼ���.");
				i--;
			} else {
				for (int j = 0; j < words[i].length(); j++) {
					if(!('A'<=words[i].charAt(j) && words[i].charAt(j) <='z')) {
						System.out.println("���ĺ��� �ƴ� �ٸ� ���ڰ� �� �ֽ��ϴ�. �ٽ� �Է��ϼ���.");
						i--;
						break;
					}
				}
			}
		}
	}	
}		