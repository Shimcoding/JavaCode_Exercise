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
		
		// 1. num ���� �־����� ��
//		int num = 456;
//		System.out.println(num/100*100);
		
		
		
		// 2. num ���� ����ڷκ��� �Է� ���� ��	
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("�� �ڸ� ���� �Է�(q:����)>>");
//			String input = sc.nextLine().trim();
//			
//			if(input.equals("q")) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}
//			if(input.length()!=3) {
//				System.out.println("�� �ڸ� ���� �ƴմϴ�.");
//				continue;
//			} else {
//				int num = 0;
//				try {
//					num = Integer.parseInt(input);
//				} catch (Exception e) {
//					System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
//					continue;
//				}
//				System.out.println("��: "+num/100*100);
//			}
//			
//		}
		
		
		
		// 3.�� �ڸ� �� �̻��� ����ڷκ��� �Է��� ���� ��
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("�� �ڸ� ���� �Է�(q:����)>>");
//			String input = sc.nextLine().trim();
//			
//			if(input.equals("q")) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}
//			if(input.length()<2) {
//				System.out.println("�� �ڸ� �� �̻��� �ƴմϴ�.");
//				continue;
//			} else {
//				int num = 0;
//				try {
//					num = Integer.parseInt(input);
//				} catch (Exception e) {
//					System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
//					continue;
//				}
//				int numPow = (int)Math.pow(10,input.length()-1);
//				System.out.println("��: "+num/numPow*numPow);
//			}
//			
//		}
		
		
	}
}