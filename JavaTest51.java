
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class JavaTest51 {
	
	public static void main(String[] args){
		
		// 1.num 값이 주어졌을 때
//		int num = 24;
//		System.out.println("값:"+(num/10+1)*10-num);
		
		
		
		// 2.num의 값이 두 자리 이상인 수를 사용자로부터 입력을 받을 때
		// 맨 앞 자리의 1을 더하고 나머지 자리엔 0으로 채운다.
		// 예를 들어, 256이면 300이, 1958이면 2000이,999이면 1000 출력
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("두 자리 양수 이상인 수를 입력(q:종료)>>");
//			String input = sc.nextLine().trim();
//			
//			if(input.equals("q")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			if(input.length()<2) {
//				System.out.println("두 자리 양수 이상인 수가 아닙니다.");
//				continue;
//			} else {
//				int num = 0;
//				try {
//					num = Integer.parseInt(input);
//				} catch (Exception e) {
//					System.out.println("숫자로 변환할 수 없습니다.");
//					continue;
//				}
//				int numPow = (int)Math.pow(10, input.length()-1);
//				System.out.println("값: "+(num/numPow+1)*numPow);
//			}
//			
//		}	
		
		
		
		// 3. 1에 num 값을 사용자로부터 입력을 받는다.
		// 거기에 나온 수만큼 *을 찍는 프로그램
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("두 자리 양수를 입력(q:종료)>>");
//			String input = sc.nextLine().trim();
//			
//			if(input.equals("q")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			if(input.length()<2 || input.length()>2) {
//				System.out.println("두 자리 양수가 아닙니다.");
//				continue;
//			} else {
//				int num = 0;
//				try {
//					num = Integer.parseInt(input);
//				} catch (Exception e) {
//					System.out.println("숫자로 변환할 수 없습니다.");
//					continue;
//				}
//				int result = (num/10+1)*10-num;
//				
//				System.out.print("값:"+result+" ");
//				System.out.println(exStars(result,'*'));
//			}
//			
//		}	
	}

//	private static String exStars(int result, char star) {
//		char[] chArr = new char[result];
//		Arrays.fill(chArr, star);
//		String str = new String(chArr);
//		
//		return str;
//		
//	}

}