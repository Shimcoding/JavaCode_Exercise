
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

public class JavaTest61 {

	public static void main(String[] args) {
		// 1. 1~100사이의 임의의 값을 얻어서 answer에 저장.
//		int answer = (int)(Math.random()*100)+1;
//		int input = 0; // 사용자입력을 저장할 공간
//		int count = 0; // 시도횟수를 세기위한 변수
//		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		do {
//		count++;
//		System.out.print("1과 100사이의 값을 입력 :"); 
//		input = sc.nextInt(); // input . 입력받은 값을 변수 에 저장한다
//		if(input>answer) {
//			System.out.println("더 작은 수를 입력하세요.");
//		} else if(input<answer) {
//			System.out.println("더 큰 수를 입력하세요.");
//		} else {
//			System.out.println("맞췄습니다.");
//			System.out.println("시도 횟수는 "+count+"번입니다.");
//			break;
//		}
//		} while(true); // 무한반복문

		// 2. 자리수가 일치하는지 알려주면서 숫자를 맞추는 프로그램
		// 예를 들어, answer=20이면 input으로 25를 주고 십의 자리가 일치하니까
		// "십의 자리의 수는 일치합니다." 이런 식으로 출력
//		int answer = (int)(Math.random()*100)+1;
//		int input = 0; // 사용자입력을 저장할 공간
//		int count = 0; // 시도횟수를 세기위한 변수
//		
//		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		do {
//		count++;
//		System.out.print("1과 100사이의 값을 입력 :"); 
//		input = sc.nextInt(); // input . 입력받은 값을 변수 에 저장한다
//		if(input>answer) {
//			System.out.println("더 작은 수를 입력하세요.");
//			isNumCheck(answer,input);
//			
//		} else if(input<answer) {
//			System.out.println("더 큰 수를 입력하세요.");
//			isNumCheck(answer,input);
//		} else {
//			System.out.println("맞췄습니다.");
//			System.out.println("시도 횟수는 "+count+"번입니다.");
//			break;
//		}
//		} 

		// 3. 숫자가 아닌 다른 문자가 들어 올 경우 프로그램 종료
		// 숫자만을 입력해서 맞추는 프로그램
//		int answer = (int) (Math.random() * 100) + 1;
//		int input = 0; // 사용자입력을 저장할 공간
//		int count = 0; // 시도횟수를 세기위한 변수
//
//		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		do {
//			count++;
//			System.out.print("1과 100사이의 값을 입력 :");
//			try {
//				input = sc.nextInt(); // input . 입력받은 값을 변수 에 저장한다
//			} catch (Exception e) {
//				//숫자를 입력하지 않으면 강제 종료
//				System.out.println("숫자를 입력하지 않아 강제 종료합니다.");
//				System.exit(0);
//			}
//			if (input > answer) {
//				System.out.println("더 작은 수를 입력하세요.");
//				isNumCheck(answer, input);
//
//			} else if (input < answer) {
//				System.out.println("더 큰 수를 입력하세요.");
//				isNumCheck(answer, input);
//			} else {
//				System.out.println("맞췄습니다.");
//				System.out.println("시도 횟수는 " + count + "번입니다.");
//				break;
//			}
//		} while (true);
	}

//	private static void isNumCheck(int answer, int input) {
//		if (answer / 10 == input / 10)
//			System.out.println("십의 자리수는 일치합니다.");
//		else
//			System.out.println("십의 자리수가 일치하지 않습니다.");
//		if (answer % 10 == input % 10)
//			System.out.println("일의 자리수는 일치합니다.");
//		else
//			System.out.println("일의 자리수가 일치하지 않습니다.");
//	}

}
