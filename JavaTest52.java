
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class JavaTest52 {
	
	public static void main(String[] args){
		// 1. Math.round() 쓰지 않고 구하기
		// 'C = 5/9 ×(F - 32)'
//		int fahrenheit = 100;
//		float celcius = ((int)(5/9f * (fahrenheit-32)*1000+5)/10)/100.0f;
//		
//		System.out.println("Fahrenheit:"+fahrenheit);
//		System.out.println("Celcius:"+celcius);
		
		
		
		// 2. Math.round() 쓰고 구하기
//		int fahrenheit = 100;
//		float celcius = Math.round(5/9f * (fahrenheit-32)*100) /100f;
//		
//		System.out.println("Fahrenheit:"+fahrenheit);
//		System.out.println("Celcius:"+celcius);

		
		
		// 3.사용자로부터 화씨(Fahrenheit)를 입력 받고 섭씨(Celcius)구하기
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("(int형)수를 입력(q:종료)>>");
//			String input = sc.nextLine().trim();
//			
//			if(input.equals("q")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			if(input.length()<1) {
//				System.out.println("두 자리 수 이상인 수가 아닙니다.");
//				continue;
//			} else {
//				int num = 0;
//				try {
//					num = Integer.parseInt(input);
//					if(num<0) {
//						System.out.println("음수는 변환할 수 없습니다.");
//						continue;
//					}
//				} catch (Exception e) {
//					System.out.println("숫자로 변환할 수 없습니다.");
//					continue;
//				}
//				if(input.charAt(0) != '1') {
//					input = input.replaceFirst(input.charAt(0)+"","1");
//				}
//				System.out.println("섭씨 값: "+num);
//				System.out.println("화씨 값: "+Math.round(5/9f * (num-32)*100) /100f);
//			}
//			
//		}	
		
		
	}
}