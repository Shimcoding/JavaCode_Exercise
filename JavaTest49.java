import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest49 {
	
	public static void main(String[] args){
		
		// 1. num 값이 주어졌을 때
//		int num = 456;
//		System.out.println(num/100*100);
		
		
		
		// 2. num 값을 사용자로부터 입력 받을 때	
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("세 자리 수를 입력(q:종료)>>");
//			String input = sc.nextLine().trim();
//			
//			if(input.equals("q")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			if(input.length()!=3) {
//				System.out.println("세 자리 수가 아닙니다.");
//				continue;
//			} else {
//				int num = 0;
//				try {
//					num = Integer.parseInt(input);
//				} catch (Exception e) {
//					System.out.println("숫자로 변환할 수 없습니다.");
//					continue;
//				}
//				System.out.println("값: "+num/100*100);
//			}
//			
//		}
		
		
		
		// 3.두 자리 수 이상을 사용자로부터 입력을 받을 때
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("두 자리 수를 입력(q:종료)>>");
//			String input = sc.nextLine().trim();
//			
//			if(input.equals("q")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			if(input.length()<2) {
//				System.out.println("두 자리 수 이상이 아닙니다.");
//				continue;
//			} else {
//				int num = 0;
//				try {
//					num = Integer.parseInt(input);
//				} catch (Exception e) {
//					System.out.println("숫자로 변환할 수 없습니다.");
//					continue;
//				}
//				int numPow = (int)Math.pow(10,input.length()-1);
//				System.out.println("값: "+num/numPow*numPow);
//			}
//			
//		}
		
		
	}
}