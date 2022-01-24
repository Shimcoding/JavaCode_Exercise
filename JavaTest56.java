
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
		// 1.Math.random() 이용해서 구하기
//		int value = (int)(Math.random()*5)+1;
//		System.out.println("value:"+value);
		
		
		
		// 2.1~45에 임의의 수를 6개 구해서 로또 번호 구하기
//		IntStream intStream = new Random().ints(1,46)
//				      		 .distinct().limit(6).sorted();
//		intStream.forEach(System.out::println);
		
		
		
		// 3.2번 문제에서 2와 3의 배수를 제거
		// 임의의 수 6개 구하기(중복 x, 오름차순)
//		Set<Integer> set = new TreeSet<>();
//		while(set.size()!=6) {
//			set.add((int)(Math.random()*45)+1);
//		}
//		System.out.println("임의로 받은 결과: " + set);
//		
//		// 2와 3의 배수 제거
//		set.removeIf(x->x%2==0 || x%3==0);
//		System.out.println("2와 3의 배수를 제거한 결과:");
//		if(set.isEmpty())
//			System.out.println("결과 값이 없습니다.");
//		else
//			set.forEach(System.out::println);
		
	}
}