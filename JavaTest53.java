
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
		// 1. ���� b�� ���� true�� ������ �ϴ� ���
//		char ch = 'z';
//		boolean b = ('A' <= ch && ch <='z') || ('0'<=ch && ch<='9');
//		System.out.println(b);
		
		
		
		// 2. ����ڷκ��� �Է��� �޾Ƽ� ������(�빮�� �Ǵ� �ҹ���)�̰ų�
		// ������ ���� ���� b�� ���� true�� �ǵ��� �ϴ� ���
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������(�빮�� �Ǵ� �ҹ���)�̰ų� ���ڸ� �Է��ϼ���>>");
//		String input = sc.nextLine().trim();
//		boolean b = false;
//		
//		
//		if(input.length()<1) {
//			System.out.println("�߸� �Է��߽��ϴ�.");
//		} else {
//			if(input.length()==1 && ('A' <= input.charAt(0) && input.charAt(0) <='z'))
//				b = true;
//			else
//				for (int i = 0; i < input.length(); i++) {
//					if(!('0'<=input.charAt(i) && input.charAt(i)<='9')) {
//						System.out.println("�߸� �Է��߽��ϴ�.");
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
		
		
		
		// 3. 2���� ��쿡�� �����ڿ� ���ڸ� ���� �Է��� ��� 
		// true�� ����� ����, �����ڿ� ���ڸ� �и����� ���� �����ؼ� ���
		// ��, �����ڸ� �Է����� ���� false ���
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������(�빮�� �Ǵ� �ҹ���)�̰ų� ���ڸ� �Է��ϼ���>>");
//		String input = sc.nextLine().trim();
//		boolean b = false;
//		
//		//�� ���ڵ� �Է��� �� �� ���
//		if(input.length()<1) {
//			System.out.println("�߸� �Է��߽��ϴ�.");
//		} 
//		//�� ������ �Է����� ���
//		else if(input.length()==1 && ('A' <= input.charAt(0) && input.charAt(0) <='z')) {
//			b = true;
//		} 
//		//���ڷ� ��ȯ�Ǹ� ���ڷ� �ν� -> true
//		//���ڿ� ������ ���� ������ ���� List ���� ���� �־ ��� -> true
//		//��, �����ڸ� ������ -> false
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
//						System.out.println("�߸� �Է��߽��ϴ�.");
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
//						System.out.print("����: ");
//						while(numIt.hasNext()) {
//							System.out.print(numIt.next());
//						}
//						
//						System.out.println();
//						Iterator<Character> alphaIt = alphaList.iterator();
//						System.out.print("������: ");
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
//		//true Ȥ�� false ���
//		System.out.println(b);
		
	}
}