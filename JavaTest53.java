
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class JavaTest53 {
	
	public static void main(String[] args){
		// 1. 변수 b를 통해 true로 나오게 하는 경우
//		char ch = 'z';
//		boolean b = ('A' <= ch && ch <='z') || ('0'<=ch && ch<='9');
//		System.out.println(b);
		
		
		
		// 2. 사용자로부터 입력을 받아서 영문자(대문자 또는 소문자)이거나
		// 숫자일 때만 변수 b의 값이 true가 되도록 하는 경우
//		Scanner sc = new Scanner(System.in);
//		System.out.print("영문자(대문자 또는 소문자)이거나 숫자를 입력하세요>>");
//		String input = sc.nextLine().trim();
//		boolean b = false;
//		
//		
//		if(input.length()<1) {
//			System.out.println("잘못 입력했습니다.");
//		} else {
//			if(input.length()==1 && ('A' <= input.charAt(0) && input.charAt(0) <='z'))
//				b = true;
//			else
//				for (int i = 0; i < input.length(); i++) {
//					if(!('0'<=input.charAt(i) && input.charAt(i)<='9')) {
//						System.out.println("잘못 입력했습니다.");
//						break;
//						
//					}
//					if(i == input.length()-1)
//						b = true;
//					
//				}
//		}
//		
//		System.out.println(b);
		
		
		
		// 3. 2번의 경우에서 영문자와 숫자를 같이 입력한 경우 
		// true로 출려한 다음, 영문자와 숫자를 분리시켜 각각 나열해서 출력
		// 단, 영문자만 입력했을 때는 false 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("영문자(대문자 또는 소문자)이거나 숫자를 입력하세요>>");
//		String input = sc.nextLine().trim();
//		boolean b = false;
//		
//		//한 글자도 입력을 안 한 경우
//		if(input.length()<1) {
//			System.out.println("잘못 입력했습니다.");
//		} 
//		//한 영문자 입력했을 경우
//		else if(input.length()==1 && ('A' <= input.charAt(0) && input.charAt(0) <='z')) {
//			b = true;
//		} 
//		//숫자로 변환되면 숫자로 인식 -> true
//		//숫자와 영문자 같이 있으면 따로 List 만들어서 각각 넣어서 출력 -> true
//		//단, 영문자만 있으면 -> false
//		else {
//			
//			try {
//				int num = Integer.valueOf(input);
//				b = true;
//			} catch (Exception e) {
//				
//				List<Integer> numList = new ArrayList<>();
//				List<Character> alphaList = new ArrayList<>();
//				
//				for (int i = 0; i < input.length(); i++) {
//					if('A' <= input.charAt(i) && input.charAt(i) <='z') {
//						alphaList.add(input.charAt(i));
//					}
//					else if('0'<=input.charAt(i) && input.charAt(i)<='9')
//						numList.add(Integer.valueOf(input.charAt(i)-48));
//					else {
//						System.out.println("잘못 입력했습니다.");
//						break;
//					}
//					
//					if(i==input.length()-1) {
//						if(numList.size() == 0) {
//							b = false;
//							break;
//						}
//						b = true;
//						
//						Iterator<Integer> numIt = numList.iterator();
//						System.out.print("숫자: ");
//						while(numIt.hasNext()) {
//							System.out.print(numIt.next());
//						}
//						
//						System.out.println();
//						Iterator<Character> alphaIt = alphaList.iterator();
//						System.out.print("영문자: ");
//						while(alphaIt.hasNext()) {
//							System.out.print(alphaIt.next());
//						}
//						System.out.println();
//					}
//				}
//				
//			}
//			
//			
//		}
//		//true 혹은 false 출력
//		System.out.println(b);
		
	}
}