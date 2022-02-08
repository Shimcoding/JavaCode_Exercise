
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
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

import javax.jws.Oneway;
import javax.print.attribute.standard.OrientationRequested;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiEvent;

import ch4.For3;

public class JavaTest81 {
	
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for(SutdaCard3 s : deck.cards) {
			System.out.print(s+",");
		}
	}
}

class SutdaDeck{
	// 1. CARD_NUM을 주어진 상태에서 deck에 1~10까지 값을 넣고
	// 처음 1,3,8에는 K을 붙여서 출력
//	final int CARD_NUM = 20;
	
	
	// 2. CARD_NUM을 사용자로부터 입력 받아 deck 정렬하기
	Scanner sc = new Scanner(System.in);
	// 유효성 검사를 통해 CARD_NUM에 넣기(잘못된 값 입력 시 1넣기)
	final int CARD_NUM = Integer.valueOf(inputNum(sc.nextLine())); 
	
	SutdaCard3[] cards = new SutdaCard3[CARD_NUM];
	
	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			if((i+1)>=10) {
				if((i+1)%10==0) {
					cards[i] = new SutdaCard3(10, false);
				}else {
					cards[i] = new SutdaCard3((i+1)%10, false);
				}
			} else {
				if((i+1)==1 || (i+1)==3 || (i+1)==8) {
					cards[i] = new SutdaCard3((i+1)%10, true);
				}else {
					cards[i] = new SutdaCard3((i+1)%10, false);
				}
			}
		}
	}

	// 유효성 검사
	private String inputNum(String input) {
		if("".equals(input) || input == null)
			return "1";
		return input;
	}
}

class SutdaCard3{
	int num;
	boolean isKwang;
	
	SutdaCard3() {
		this(1,true);
	}

	public SutdaCard3(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
}