
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class JavaTest54 {
	
	public static void main(String[] args){
		// 1.문자 ch에 저장된 문자가 대문자인 경우 소문자로 바꾸기
//		char ch = 'A';
//		char lowerCase = ('A'<=ch && ch<='Z') ? ((char)(ch+32)) : ch;
//		
//		System.out.println("ch:"+ch);
//		System.out.println("ch to lowerCase:"+lowerCase);
		
		
		
		// 2.사용자로부터 한 영문자를 입력 받아서, 소문자로 입력 받으면 대문자로
		// 대문자를 입력 받으면 소문자로 바꾸기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("한 영문자 입력>>");
//		String input = sc.nextLine().trim();
//		
//		if(input.length()!= 1)
//			System.out.println("한 영문자만 입력하세요.");
//		else {
//			//대문자를 소문자로
//			if('A' <= input.charAt(0) && input.charAt(0) <='Z') {
//				System.out.println("to lowerCase : "+(char)(input.charAt(0)+32));
//			} 
//			//소문자를 대문자로
//			else if('a' <= input.charAt(0) && input.charAt(0) <='z') {
//				System.out.println("to upperCase : "+(char)(input.charAt(0)-32));
//			} else {
//				System.out.println("잘못 입력했습니다.");
//			}
//		}
		
		
		
		// 3.컴퓨터가 임의로 정한 영문자를 맞추면 끝나는 게임(대소문자 구별 x)
		// 몇 번만에 이겼는지도 출력
//		char comAlpha = (char)((int)(Math.random()*26)+65);
//		int count = 0;
//		int stopCount = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("컴퓨터가 입력한 한 영문자는?(3번 잘못 입력하면 강제 종료)");
//			String input = sc.nextLine();
//			
//			// 컴퓨터가 입력한 영문자 맞추기
//			if(input.length()== 1 && ('A' <= input.charAt(0) && input.charAt(0) <='Z') || ('a' <= input.charAt(0) && input.charAt(0) <='z')) {
//				count++;
//				if(input.charAt(0)==comAlpha || input.charAt(0)==(char)(comAlpha+32))
//					break;
//				else {
//					System.out.println("맞추지 못 했습니다.");
//				}
//					
//			}
//			// 잘못 입력한 경우
//			else {
//				stopCount++;
//				System.out.println(stopCount+"번 잘못 입력했습니다.");
//				if(stopCount==3) {
//					System.out.println("3번 잘못 입력했으므로 프로그램을 종료합니다.");
//					System.exit(0);
//				}
//			}
//		}
//		System.out.println(count+"만에 맞췄습니다!!");
		
	}
}