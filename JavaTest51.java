
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
		
		// 1.num ���� �־����� ��
//		int num = 24;
//		System.out.println("��:"+(num/10+1)*10-num);
		
		
		
		// 2.num�� ���� �� �ڸ� �̻��� ���� ����ڷκ��� �Է��� ���� ��
		// �� �� �ڸ��� 1�� ���ϰ� ������ �ڸ��� 0���� ä���.
		// ���� ���, 256�̸� 300��, 1958�̸� 2000��,999�̸� 1000 ���
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("�� �ڸ� ��� �̻��� ���� �Է�(q:����)>>");
//			String input = sc.nextLine().trim();
//			
//			if(input.equals("q")) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}
//			if(input.length()<2) {
//				System.out.println("�� �ڸ� ��� �̻��� ���� �ƴմϴ�.");
//				continue;
//			} else {
//				int num = 0;
//				try {
//					num = Integer.parseInt(input);
//				} catch (Exception e) {
//					System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
//					continue;
//				}
//				int numPow = (int)Math.pow(10, input.length()-1);
//				System.out.println("��: "+(num/numPow+1)*numPow);
//			}
//			
//		}	
		
		
		
		// 3. 1�� num ���� ����ڷκ��� �Է��� �޴´�.
		// �ű⿡ ���� ����ŭ *�� ��� ���α׷�
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("�� �ڸ� ����� �Է�(q:����)>>");
//			String input = sc.nextLine().trim();
//			
//			if(input.equals("q")) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}
//			if(input.length()<2 || input.length()>2) {
//				System.out.println("�� �ڸ� ����� �ƴմϴ�.");
//				continue;
//			} else {
//				int num = 0;
//				try {
//					num = Integer.parseInt(input);
//				} catch (Exception e) {
//					System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
//					continue;
//				}
//				int result = (num/10+1)*10-num;
//				
//				System.out.print("��:"+result+" ");
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