
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
		// 1.���� ch�� ����� ���ڰ� �빮���� ��� �ҹ��ڷ� �ٲٱ�
//		char ch = 'A';
//		char lowerCase = ('A'<=ch && ch<='Z') ? ((char)(ch+32)) : ch;
//		
//		System.out.println("ch:"+ch);
//		System.out.println("ch to lowerCase:"+lowerCase);
		
		
		
		// 2.����ڷκ��� �� �����ڸ� �Է� �޾Ƽ�, �ҹ��ڷ� �Է� ������ �빮�ڷ�
		// �빮�ڸ� �Է� ������ �ҹ��ڷ� �ٲٱ�
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� ������ �Է�>>");
//		String input = sc.nextLine().trim();
//		
//		if(input.length()!= 1)
//			System.out.println("�� �����ڸ� �Է��ϼ���.");
//		else {
//			//�빮�ڸ� �ҹ��ڷ�
//			if('A' <= input.charAt(0) && input.charAt(0) <='Z') {
//				System.out.println("to lowerCase : "+(char)(input.charAt(0)+32));
//			} 
//			//�ҹ��ڸ� �빮�ڷ�
//			else if('a' <= input.charAt(0) && input.charAt(0) <='z') {
//				System.out.println("to upperCase : "+(char)(input.charAt(0)-32));
//			} else {
//				System.out.println("�߸� �Է��߽��ϴ�.");
//			}
//		}
		
		
		
		// 3.��ǻ�Ͱ� ���Ƿ� ���� �����ڸ� ���߸� ������ ����(��ҹ��� ���� x)
		// �� ������ �̰������ ���
//		char comAlpha = (char)((int)(Math.random()*26)+65);
//		int count = 0;
//		int stopCount = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("��ǻ�Ͱ� �Է��� �� �����ڴ�?(3�� �߸� �Է��ϸ� ���� ����)");
//			String input = sc.nextLine();
//			
//			// ��ǻ�Ͱ� �Է��� ������ ���߱�
//			if(input.length()== 1 && ('A' <= input.charAt(0) && input.charAt(0) <='Z') || ('a' <= input.charAt(0) && input.charAt(0) <='z')) {
//				count++;
//				if(input.charAt(0)==comAlpha || input.charAt(0)==(char)(comAlpha+32))
//					break;
//				else {
//					System.out.println("������ �� �߽��ϴ�.");
//				}
//					
//			}
//			// �߸� �Է��� ���
//			else {
//				stopCount++;
//				System.out.println(stopCount+"�� �߸� �Է��߽��ϴ�.");
//				if(stopCount==3) {
//					System.out.println("3�� �߸� �Է������Ƿ� ���α׷��� �����մϴ�.");
//					System.exit(0);
//				}
//			}
//		}
//		System.out.println(count+"���� ������ϴ�!!");
		
	}
}