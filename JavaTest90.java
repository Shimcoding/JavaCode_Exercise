import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest90 {

	public static void main(String[] args) {
		// 1. 1~100 ������ ������ ���� �� answer�� �����Ѵ�.
//		int answer = (int)(Math.random()*100)+1;
		int input = 0; //����� �Է�
		int count = 0; //�õ�Ƚ���� ���� ���� ����
		
		
		
		// 2.IntStream�� �̿��ؼ� ���� �� ���ؼ� answer�� �ֱ�
		IntStream randomInt = new Random().ints(1,101).limit(1);
		int answer = randomInt.sum(); // ������ �ϳ��� ���� �����ؼ� �� �� �ϳ��� ����
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			Scanner sc = new Scanner(System.in);
			
			try {
				input = sc.nextInt();
				
				// 1~100 ������ ���� �Է��ߴ��� ��ȿ�� �˻�
				if(!isCheck(input))
					throw new Exception();
				
				if(answer>input) {
					System.out.println("�� ū ���� �Է��ϼ���.");
				} else if(answer < input){
					System.out.println("�� ���� ���� �Է��ϼ���.");
				} else {
					System.out.println("������ϴ�.");
					System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");
					break;
				}
			} catch (Exception e) {
				System.out.println("��ȿ���� �ʴ� ���Դϴ�.");
				continue;
			}
			
		} while (true);
	}

	private static boolean isCheck(int input) {
		return 0<input && input <101;
	}
}